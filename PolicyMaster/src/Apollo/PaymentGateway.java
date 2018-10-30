package Apollo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * Servlet implementation class PaymentGateway
 */
@WebServlet("/PaymentGateway")
public class PaymentGateway extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentGateway() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void dopost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		
		PGDetail pgdet=new PGDetail();
		pgdet.setIPAddress("127.0.0.1");
		pgdet.setMerchantRefNo("AlphaNumeric");
		pgdet.setProposalId("B115845518");
		pgdet.setReturnUrl("http://192.168.10.61:8080/PolicyMaster");
		pgdet.setUDF1("UDF1");
		pgdet.setUDF2("UDF2");
		pgdet.setUDF3("UDF3");
		pgdet.setUDF4("UDF4");
		pgdet.setUDF5("UDF5");
		
		Partner part=new Partner();
		part.setPartnerCode("13961");
		part.setPassword("master123");
		part.setUserName("policymaster");
		
		paymentGatewayServiceRequest pgsr=new paymentGatewayServiceRequest();
		pgsr.setPGDetail(pgdet);
		pgsr.setPartner(part);
		
		PaymentDetails paymentdet=new PaymentDetails();
		paymentdet.setPaymentGatewayServiceRequest(pgsr);
		
		Document document;
	    try {
	   	 document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
				
	   	 document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
				Marshaller marshaller = JAXBContext.newInstance(PaymentDetails.class).createMarshaller();
				marshaller.marshal(paymentdet, document); 
	        
	        SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
	        
	           soapMessage.getSOAPPart().getEnvelope().removeNamespaceDeclaration("SOAP-ENV");
	           
	           String myNamespace = "b2b";
			    String myNamespaceURI = "http://www.apollomunichinsurance.com/B2BService";
			    String myNamespace1 = "pay";
			    String myNamespaceURI1 = "http://schemas.datacontract.org/2004/07/PaymentGatewayServiceLibrary";
			    
			  
			    String myNamespace2 = "ser";
			    String myNamespaceURI2 = "http://schemas.datacontract.org/2004/07/ServiceObjects";
			    
			    soapMessage.getSOAPPart().getEnvelope().addNamespaceDeclaration(myNamespace, myNamespaceURI);
			    soapMessage.getSOAPPart().getEnvelope().addNamespaceDeclaration(myNamespace1, myNamespaceURI1);
			    soapMessage.getSOAPPart().getEnvelope().addNamespaceDeclaration(myNamespace2, myNamespaceURI2);
			    soapMessage.getSOAPPart().getEnvelope().setPrefix("soapenv");
	            soapMessage.getSOAPHeader().setPrefix("soapenv"); 
			    soapMessage.getSOAPBody().setPrefix("soapenv"); 
				soapMessage.getSOAPBody().addDocument(document);
				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				soapMessage.writeTo(outputStream);
	         HttpClient client1 = HttpClientBuilder.create().build();
	         HttpPost post = new HttpPost("http://b2buat.apollomunichinsurance.com/PaymentGatewayHttpService.svc");
	         String output = new String(outputStream.toByteArray());
	         StringEntity userEntity = new StringEntity(output);
	          post.setEntity(userEntity);
	          post.setHeader("Accept-Encoding", "gzip,deflate");
	          post.setHeader("Content-Type", "text/xml; charset=UTF-8");
	          post.setHeader("SOAPAction", "http://www.apollomunichinsurance.com/B2BService/IPaymentGatewayService/PaymentDetails");
	          HttpResponse response1=client1.execute(post);
	          String res_xml = EntityUtils.toString(response1.getEntity());
	          InputSource is = new InputSource(new StringReader(res_xml));
	          System.out.println(output);
	          System.out.println("\n");
	 		 //System.out.println(response1);
	  		 System.out.println(res_xml);
	  		 
	  		try {

				String xpath_PaymentUrl = "//PaymentUrl/text[]";
				String xpath_PaymentId ="//PaymentId/text[1]";
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(is);
				XPathFactory xPathfactory = XPathFactory.newInstance();
				XPath xpath = xPathfactory.newXPath();
				XPathExpression xpath_expression_PaymentUrl = xpath.compile(xpath_PaymentUrl);
				XPathExpression xpath_expression_PaymentId = xpath.compile(xpath_PaymentId);
				NodeList PaymentUrlNodes = (NodeList) xpath_expression_PaymentUrl.evaluate(doc, XPathConstants.NODESET);
				NodeList PaymentIdNodes = (NodeList) xpath_expression_PaymentId.evaluate(doc, XPathConstants.NODESET);
				for (int i = 0; i < PaymentUrlNodes.getLength(); i++) {
					System.out.println("PaymentUrl: " + PaymentUrlNodes.item(i).getNodeValue());
					String PaymentUrl = PaymentUrlNodes.item(i).getNodeValue();
					
				}
				for (int i = 0; i < PaymentIdNodes.getLength(); i++) {
					System.out.println("PaymentId: " + PaymentIdNodes.item(i).getNodeValue());
					String  PaymentId = PaymentIdNodes.item(i).getNodeValue();
					
					
					System.out.println(PaymentId);
				
				pw.close();
			}
			}catch (Exception e) {
				e.printStackTrace();
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();

		}catch (SOAPException e) {
			e.printStackTrace();

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		return;
	}
	
}
