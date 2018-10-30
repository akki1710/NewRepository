package Apollo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.main;

/**
 * Servlet implementation class Verification
 */
@WebServlet("/Verification")
public class Verification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Verification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		/*String date = ap.getDob();
		String city = ap.getCity();*/
		AddressSubElement addressSubElem = new AddressSubElement();
		int SACCode;
		int  age=0 ;
		if(age!=0)
			{
		session.setAttribute("age", age);
        
        if(age>=18)
        {
        	SACCode=2;	
        }
        else
        {
        	SACCode=3;
        }
			}
		
		 main m= new main();
		//String state_one_code =m.state("");
		//String city_code =m.town(city);
		addressSubElem.setStateCode("010");
		System.out.println("StateCode :");
		addressSubElem.setTownCode("778");
		System.out.println( "towncode");
		Address Addr = new Address();
		Addr.setAddress(addressSubElem);

		Partner part = new Partner();
		part.setPartnerCode("13961");
		part.setPassword("master123");
		part.setUserName("policymaster");

		ProductSubElement productSubElem = new ProductSubElement();
		//productSubElem.setClientcode("PolicyHolder");
		productSubElem.setProductCode("11121");
		productSubElem.setProductGroup("1");
		productSubElem.setProductLine("9");
		productSubElem.setProductType("1");
		productSubElem.setProductVersion("1");
		productSubElem.setSACCode("1");
		productSubElem.setSumAssured("500000");
		
		ProductSubElement productSubElem1 = new ProductSubElement();
		productSubElem1.setProductCode("11121");
		productSubElem1.setProductGroup("1");
		productSubElem1.setProductLine("9");
		productSubElem1.setProductType("1");
		productSubElem1.setProductVersion("1");
		productSubElem1.setSACCode("2");
		productSubElem1.setSumAssured("0");
		
		ProductSubElement productSubElem2 = new ProductSubElement();
		productSubElem2.setProductCode("11121");
		productSubElem2.setProductGroup("1");
		productSubElem2.setProductLine("9");
		productSubElem2.setProductType("1");
		productSubElem2.setProductVersion("1");
		productSubElem2.setSACCode("3");
		productSubElem2.setSumAssured("0");
		
		Product prod = new Product();
		/*prod.setProduct(productSubElem);
		prod.setProduct(productSubElem1);*/
		//prod.getPse().add(productSubElem);
		prod.setProduct(productSubElem1);
		
		Product prod1 = new Product();
		prod1.setProduct(productSubElem);
		
		Product prod2 = new Product();
		prod2.setProduct(productSubElem2);

Dependants dependants = new Dependants();
		
		List<ClientSubElement> clientList = new ArrayList<>();
		ClientSubElement clientSub= new ClientSubElement();
		clientSub.setAge("25");
		clientSub.setClientCode("member 1");
		clientSub.setProduct(prod);
		
		ClientSubElement clientSub1= new ClientSubElement();
		clientSub1.setAge("6");
		clientSub1.setClientCode("member 2");
		clientSub1.setProduct(prod2);
		
		
		clientList.add(clientSub);
		clientList.add(clientSub1);
		
		dependants.setClientSubElement(clientList);
		
		
		Client cli = new Client();
		cli.setAge("26");
		cli.setDependants(dependants);
		cli.setProduct(prod1);
		
		
		cli.setClientCode("PolicyHolder");
		//cli.setOccuptionCode("303601");
		cli.setAddress(Addr);
		//cli.setProduct(prod);

		Clients clis = new Clients();
		clis.setClient(cli);
		
		
		

		PremiumCalculatorRequest premiumCalculatorReq = new PremiumCalculatorRequest();
		premiumCalculatorReq.setClients(clis);
		premiumCalculatorReq.setPartner(part);

		ComputePremium ComputePrem = new ComputePremium();
		ComputePrem.setPremiumCalculatorRequest(premiumCalculatorReq);

		// String xmlString = "";
		Document document;
		try {
			document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

			document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			Marshaller marshaller = JAXBContext.newInstance(ComputePremium.class).createMarshaller();
			marshaller.marshal(ComputePrem, document);

			SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();

			soapMessage.getSOAPPart().getEnvelope().removeNamespaceDeclaration("SOAP-ENV");

			String myNamespace = "b2b";
			String myNamespaceURI = "http://www.apollomunichinsurance.com/B2BService";

			String myNamespace1 = "prem";
			String myNamespaceURI1 = "http://schemas.datacontract.org/2004/07/PremiumCalculatorLibrary";

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
			HttpPost post = new HttpPost("http://b2buat.apollomunichinsurance.com/PremiumCaculatorHttpService.svc");
			String output = new String(outputStream.toByteArray());
			StringEntity userEntity = new StringEntity(output);
			post.setEntity(userEntity);
			post.setHeader("Accept-Encoding", "gzip,deflate");
			post.setHeader("Content-Type", "text/xml; charset=UTF-8");
			post.setHeader("SOAPAction",
					"http://www.apollomunichinsurance.com/B2BService/IPremimumCalculatorService/ComputePremium");
			HttpResponse response1 = client1.execute(post);
			String res_xml = EntityUtils.toString(response1.getEntity());
			InputSource is = new InputSource(new StringReader(res_xml));
			System.out.println(output);
			System.out.println("\n");
			// System.out.println(response1);
			System.out.println(res_xml);

			try {

				String xpath_TotalPremium = "//TotalPremium/text()";
				String xpath_BasePremiumAmount = "//BasePremiumAmount[1]//text()";
				String xpath_GrossPremiumAmount = "//GrossPremiumAmount[1]//text()";
				String xpath_TaxAmount = "//TaxAmount[1]//text()";
    			String xpath_DiscountAmount = "//DiscountAmount[1]//text()";
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(is);
				XPathFactory xPathfactory = XPathFactory.newInstance();
				XPath xpath = xPathfactory.newXPath();
				XPathExpression xpath_expression_TotalPremium = xpath.compile(xpath_TotalPremium);
				XPathExpression xpath_expression_BasePremiumAmount = xpath.compile(xpath_BasePremiumAmount);
				XPathExpression xpath_expression_GrossPremiumAmount = xpath.compile(xpath_GrossPremiumAmount);
				XPathExpression xpath_expression_TaxAmount = xpath.compile(xpath_TaxAmount);
    			XPathExpression xpath_expression_DiscountAmount = xpath.compile(xpath_DiscountAmount);
				NodeList BasePremiumNodes = (NodeList)xpath_expression_BasePremiumAmount.evaluate(doc, XPathConstants.NODESET);
				NodeList TotalPremiumNodes = (NodeList) xpath_expression_TotalPremium.evaluate(doc,XPathConstants.NODESET);
				NodeList GrossPremiumNodes = (NodeList) xpath_expression_GrossPremiumAmount.evaluate(doc,XPathConstants.NODESET);
				NodeList DiscountNodes = (NodeList)xpath_expression_DiscountAmount.evaluate(doc, XPathConstants.NODESET);
				NodeList TaxNodes = (NodeList)xpath_expression_TaxAmount.evaluate(doc, XPathConstants.NODESET);
    			
				for (int i = 0; i < TotalPremiumNodes.getLength(); i++) {

					System.out.println("TotalPremium: " + TotalPremiumNodes.item(i).getNodeValue());
					
					String TotalPremium = TotalPremiumNodes.item(i).getNodeValue();
					System.out.println("TotalPremium");
					session.setAttribute("TotalPremium", TotalPremium);

					String s1[] = TotalPremium.split("\\.");
					String tp = s1[0];

					Integer a = Integer.parseInt(tp);
					Integer b1 = a / 12;
					String b2 = String.valueOf(b1);
					System.out.println(b2);
					session.setAttribute("b2", b2);
					// String b2=(String) session.getAttribute("b2");
					pw.close();
					// response.sendRedirect("healthquotes");

				}
				for (int i = 0; i < BasePremiumNodes.getLength(); i++) {
	    			System.out.println("BasePremium: " + BasePremiumNodes.item(i).getNodeValue());
	    			String  BasePremium = BasePremiumNodes.item(i).getNodeValue();
	    			System.out.println("BasePremium");
	    			 session.setAttribute("BasePremium", BasePremium);
	    		}
					
					for (int i = 0; i < GrossPremiumNodes.getLength(); i++) {
	    			
	    			System.out.println("GrossPremium: " + GrossPremiumNodes.item(i).getNodeValue());
	    			String GrossPremium = GrossPremiumNodes.item(i).getNodeValue();
		    			System.out.println("GrossPremium");
	    		}
					for (int i = 0; i < DiscountNodes .getLength(); i++) {
	        			
	        			System.out.println("DiscountAmount: " + DiscountNodes .item(i).getNodeValue());
	        			 String DiscountAmount = DiscountNodes.item(i).getNodeValue();
		    			System.out.println("DiscountAmount");
	        		}
	    			for (int i = 0; i < TaxNodes .getLength(); i++) {
	        			
	        			System.out.println("TaxAmount: " + TaxNodes.item(i).getNodeValue());
	        		 String TaxAmount = TaxNodes.item(i).getNodeValue();
		    			System.out.println("TaxAmount");
	        			
	        		}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (SOAPException e) {
			e.printStackTrace();

		} catch (NullPointerException e) {
			e.printStackTrace();

		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {

		}
		
		
	}
}