package com;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPElement;
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

import study.db.Db;

/**
 * Servlet implementation class ShPaDe
 */
@WebServlet("/ShPaDe")
public class ShPaDe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShPaDe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pw = response.getWriter();  
		 HttpSession session=request.getSession();
		 
		 Shri_Res shrires1=(Shri_Res) session.getAttribute("shrires1");
		 
		 String ProposalNo=shrires1.getPROPOSAL_NO();

		 String FullName=(String) session.getAttribute("Fullname");
		 String Email=(String) session.getAttribute("Email");
		 String Mobile=(String) session.getAttribute("Mobile");
		 
		 PaymentPojo pp=new PaymentPojo();
		 pp.setProposalNo(ProposalNo);
		 pp.setTransactionNumber("");
		 pp.setCardNumber("");
		 pp.setCardholderName("");
		 pp.setCardType("");
		 pp.setCardValidUpTo("");
		 pp.setBankName("");
		 pp.setBranchName("");
		 pp.setPaymentType("CC");
		 pp.setTransactionDate("");
		 
		 HttpClient client = HttpClientBuilder.create().build();
			
			Document document;
			try {
				document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
				Marshaller marshaller = JAXBContext.newInstance(PaymentPojo.class).createMarshaller();
				marshaller.marshal(pp, document);
				
				SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
				soapMessage.getSOAPPart().getEnvelope().removeNamespaceDeclaration("SOAP-ENV");
				String myNamespace = "tem";
			    String myNamespaceURI = "http://tempuri.org/";
			    soapMessage.getSOAPPart().getEnvelope().addNamespaceDeclaration(myNamespace, myNamespaceURI);
			    
			    SOAPElement AuthHeader=soapMessage.getSOAPHeader().addChildElement("AuthHeader",myNamespace);
				SOAPElement Username=AuthHeader.addChildElement("Username",myNamespace);
				Username.addTextNode("POLICYMASTER");
				SOAPElement Password=AuthHeader.addChildElement("Password",myNamespace);
				Password.addTextNode("PM@123"); 
			   
				soapMessage.getSOAPPart().getEnvelope().setPrefix("soapenv");
				soapMessage.getSOAPHeader().setPrefix("soapenv");		
			    soapMessage.getSOAPBody().setPrefix("soapenv");
			    
				SOAPBodyElement abc = (SOAPBodyElement) soapMessage.getSOAPBody().addBodyElement(soapMessage.getSOAPPart().getEnvelope().createName("PolicyApprove",myNamespace,myNamespaceURI));
				
				SOAPBodyElement def = soapMessage.getSOAPBody().addDocument(document);	
			   	abc.addChildElement(def);
				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				soapMessage.writeTo(outputStream);			
				
				
				String output = new String(outputStream.toByteArray());
				HttpPost post = new HttpPost("http://119.226.131.2/ShriramService/ShriramService.asmx");
				StringEntity userEntity = new StringEntity(output);
				post.setEntity(userEntity);
				post.setHeader("Accept-Encoding", "gzip,deflate");
				post.setHeader("Content-Type", "text/xml; charset=UTF-8");
				//post.setHeader("Content-Type", "application/soap+xml; charset=UTF-8;action=http://tempuri.org/GetQuot");
				post.setHeader("SOAPAction", "http://tempuri.org/PolicyApprove");
				 HttpResponse response1=client.execute(post);
				 String res_xml = EntityUtils.toString(response1.getEntity());
				
				 /* pw.println(output);
				 pw.println("\n");
				 pw.println(res_xml);*/
				 System.out.println(output);
				 System.out.println(res_xml);
				 
				 
				 
				 Document document1 = parseXmlFile(res_xml);
				 NodeList nodeLst = document1.getElementsByTagName("Err_Desc");
				 NodeList nodeLst1=document1.getElementsByTagName("ApprovePolNo");
				 NodeList nodeLst2=document1.getElementsByTagName("ApprovePolSysId");
				 String Err_Desc = nodeLst.item(0).getTextContent();
				 String ApprovePolNo= nodeLst1.item(0).getTextContent();
				 String ApprovePolSysId= nodeLst2.item(0).getTextContent();
				 
				 session.setAttribute("ApprovePolNo", ApprovePolNo);
				 session.setAttribute("ApprovePolSysId", ApprovePolSysId);
				 
				 System.out.println(ApprovePolNo);
				 System.out.println(ApprovePolSysId);
				 System.out.println(Mobile);
				 
				 String TotalPremium=shrires1.getTotalPremium();
				 String policy=(String) session.getAttribute("policy");
				 Connection con = Db.myGetConnection();
				 if(Mobile!=null) {
					String s="insert into final_details(ProposalNo, ApprovePolNo, ApprovePolSysId,TotalPremium,PolicyName,FullName,Email,Mobile) values(?,?,?,?,?,?,?,?)";
					PreparedStatement stmt = con.prepareStatement(s);
					stmt.setString(1, ProposalNo);
					stmt.setString(2, ApprovePolNo);
					stmt.setString(3, ApprovePolSysId);
					stmt.setString(4, TotalPremium);
					stmt.setString(5, policy);
					stmt.setString(6, FullName);
					stmt.setString(7, Email);
					stmt.setString(8, Mobile);
					 stmt.executeUpdate();
					 stmt.close();
				 }
				 con.close();
				 response.sendRedirect("ReturnUrl");
				
				 pw.close(); 
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			if(session!=null) {
				session.removeAttribute("shrires1");
				session.removeAttribute("Fullname");
				session.removeAttribute("Email");
				session.removeAttribute("Mobile");
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
			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// TODO Auto-generated method stub
				doGet(request, response);
			}

}
