package study.religare;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.apollo_proposal_pojo;

import Apollo.apollo;
import study.db.Db;

/**
 * Servlet implementation class Rel_Pol_Status
 */
@WebServlet("/Rel_Pol_Status")
public class Rel_Pol_Status extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Rel_Pol_Status() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pw = response.getWriter();
		 HttpSession session=request.getSession(); 
		 String rel_proposal_num=(String) session.getAttribute("rel_proposal_num");
		 String rel_premium=(String) session.getAttribute("rel_premium");
		 String firstName=(String) session.getAttribute("firstName");
		 String lastName=(String) session.getAttribute("lastName");
		 String FullName=firstName+" "+lastName;
		 String Email=(String) session.getAttribute("email");
		 String Mobile=(String) session.getAttribute("phoneno");
		 
		 intSetPolicyStatusIO intSetPolicyStatusIO=new intSetPolicyStatusIO();
		 intSetPolicyStatusIO.setProposalNum(rel_proposal_num);
		 
		 getPolicyStatus getPolicyStatus=new getPolicyStatus();
		 getPolicyStatus.setIntSetPolicyStatusIO(intSetPolicyStatusIO);
		 
		 try {
				Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
				Marshaller marshaller = JAXBContext.newInstance(getPolicyStatus.class).createMarshaller();
				marshaller.marshal(getPolicyStatus, document);
				
				SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
				soapMessage.getSOAPPart().getEnvelope().removeNamespaceDeclaration("SOAP-ENV");
				soapMessage.getSOAPHeader().setPrefix("soap");
				soapMessage.getSOAPBody().setPrefix("soap");
				soapMessage.getSOAPPart().getEnvelope().setPrefix("soap");
				
				String myNamespace = "rel";
			    String myNamespaceURI = "http://relinterface.insurance.symbiosys.c2lbiz.com";
			    String myNamespace1 = "xsd";
			    String myNamespaceURI1 = "http://intf.insurance.symbiosys.c2lbiz.com/xsd";
			    soapMessage.getSOAPPart().getEnvelope().addNamespaceDeclaration(myNamespace, myNamespaceURI);
			    soapMessage.getSOAPPart().getEnvelope().addNamespaceDeclaration(myNamespace1, myNamespaceURI1);
			    soapMessage.getSOAPBody().addDocument(document);
			    
			    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				soapMessage.writeTo(outputStream);
				
				HttpClient client = HttpClientBuilder.create().build();
				String output = new String(outputStream.toByteArray());
				System.out.println(output);
				HttpPost post = new HttpPost("https://apiuat.religarehealthinsurance.com/relinterface/services/RelSymbiosysServices.RelSymbiosysServicesHttpSoap12Endpoint/");
				StringEntity userEntity = new StringEntity(output);
				post.setEntity(userEntity);
				
				HttpResponse response1=client.execute(post);
				 String res_xml = EntityUtils.toString(response1.getEntity());
				 System.out.println("\n");
				 System.out.println(res_xml);
				 
				 Document document1 = parseXmlFile(res_xml);
				 NodeList nodeLst = document1.getElementsByTagName("policy-num");
				 String policy_num = nodeLst.item(0).getTextContent();
				 System.out.println(policy_num);
				 session.setAttribute("policy_num", policy_num);
				 
				 Integer uid=(Integer) session.getAttribute("uid");
				 String uname=(String) session.getAttribute("uname");
				 String health_policy=(String) session.getAttribute("health_policy");
				 System.out.println("rel_proposal_num: "+rel_proposal_num);
				 System.out.println("rel_premium: "+rel_premium);
				 System.out.println("health_policy: "+health_policy);
				 
				 Connection con = Db.myGetConnection();
				 if(uid!=null) {
					 String s="insert into final_details(UID,Uname,ProposalNo, ApprovePolNo,TotalPremium,PolicyName,FullName,Email,Mobile) values(?,?,?,?,?,?,?,?,?)";
						PreparedStatement stmt = con.prepareStatement(s);
						stmt.setInt(1, uid);
						stmt.setString(2, uname);
						stmt.setString(3, rel_proposal_num);
						stmt.setString(4, policy_num);
						stmt.setString(5, rel_premium);
						stmt.setString(6, health_policy);
						stmt.setString(7, FullName);
						stmt.setString(8, Email);
						stmt.setString(9, Mobile);
					 stmt.executeUpdate();
					 stmt.close();
				 }
				 else {
					 String s="insert into shri_final_details(ProposalNo, ApprovePolNo,TotalPremium,PolicyName,FullName,Email,Mobile) values(?,?,?,?,?,?,?)";
						PreparedStatement stmt = con.prepareStatement(s);
						stmt.setString(1, rel_proposal_num);
						stmt.setString(2, policy_num);
						stmt.setString(3, rel_premium);
						stmt.setString(4, health_policy);
						stmt.setString(5, FullName);
						stmt.setString(6, Email);
						stmt.setString(7, Mobile);
						 stmt.executeUpdate();
						 stmt.close();
				 }
				 response.sendRedirect("rel_return.jsp");
				
					
					
				 pw.close();
				 con.close();
				
				
		 } catch (ParserConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SOAPException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		 if(session!=null) {
			 session.removeAttribute("health_policy");
			 session.removeAttribute("rel_premium");
			 session.removeAttribute("firstName");
			 session.removeAttribute("lastName");
			 session.removeAttribute("email");
			 session.removeAttribute("phoneno");
		 }
	}
	private static Document parseXmlFile(String in) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource is = new InputSource(new StringReader(in));
			return db.parse(is);
			} catch (ParserConfigurationException e) {
			throw new RuntimeException(e);
			} catch (SAXException e) {
			throw new RuntimeException(e);
			} catch (IOException e) {
			throw new RuntimeException(e);
			}
			}

}
