package com;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

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

/**
 * Servlet implementation class ShPaDe1
 */
@WebServlet("/ShPaDe1")
public class ShPaDe1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShPaDe1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pw = response.getWriter(); 
		HttpSession session=request.getSession();	
		String strPolSysId=(String) session.getAttribute("ApprovePolSysId");
		PolicyUrlPojo puj=new PolicyUrlPojo();
		puj.setStrPolSysId(strPolSysId);
		
		HttpClient client = HttpClientBuilder.create().build();
		
		Document document;
		try {
			document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			Marshaller marshaller = JAXBContext.newInstance(PolicyUrlPojo.class).createMarshaller();
			marshaller.marshal(puj, document);
			
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
			soapMessage.getSOAPBody().addDocument(document);
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			soapMessage.writeTo(outputStream);
			
			//HttpClient client = HttpClientBuilder.create().build();
			String output = new String(outputStream.toByteArray());
			HttpPost post = new HttpPost("http://119.226.131.2/ShriramService/ShriramService.asmx");
			StringEntity userEntity = new StringEntity(output);
			post.setEntity(userEntity);
			post.setHeader("Accept-Encoding", "gzip,deflate");
			post.setHeader("Content-Type", "text/xml; charset=UTF-8");
			//post.setHeader("Content-Type", "application/soap+xml; charset=UTF-8;action=http://tempuri.org/GetQuot");
			post.setHeader("SOAPAction", "http://tempuri.org/PolicyScheduleURL");
			 HttpResponse response1=client.execute(post);
			 String res_xml = EntityUtils.toString(response1.getEntity());
			 
			 Document document3 = parseXmlFile(res_xml);
			 NodeList nodeLst = document3.getElementsByTagName("PolicyScheduleURLResult");
			
			 String PolicyScheduleURLResult = nodeLst.item(0).getTextContent();
			 
			 
			 session.setAttribute("PolicyScheduleURLResult", PolicyScheduleURLResult);
			 
			 response.sendRedirect("ReturnUrl1.jsp");
			 pw.close(); 
			 if(session!=null) {
				 session.removeAttribute("ApprovePolSysId");
				 session.removeAttribute("ApprovePolNo");
			 }
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
