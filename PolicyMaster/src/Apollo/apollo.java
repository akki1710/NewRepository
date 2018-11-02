package Apollo;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.stream.StreamSource;
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
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.apollo_proposal_pojo;
import com.main;

/**
 * Servlet implementation class apollo
 */
@WebServlet("/apollo")
public class apollo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final NodeList VerifyTransactionNodes = null;
	private static String TotalPremium;
	private static String FloaterTotalPremium;
	private static String BasePremium;
	private static String BasePremiumfloater;
	private static String DiscountAmount;
	private static String GrossPremiumfloater;
	private static String TaxAmount;
	private static String DiscountAmountfloater;
	private static String GrossPremium;
	private static String TaxAmountfloater;
	private static String PaymentId;
	private static String VerifyTransactionResult;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public apollo() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response){

	}

	public static void apollo_premium(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter pw = response.getWriter();

		HttpSession session = request.getSession();
		String members=(String) session.getAttribute("members");
		apollo_proposal_pojo ap = (apollo_proposal_pojo) session.getAttribute("ap");
		String date = ap.getDob();
		String city = ap.getCity();
		String sumassured=ap.getSumassured();
		AddressSubElement addressSubElem = new AddressSubElement();
		/*
		 * addressSubElem.setAddressLine1("emerald appartment");
		 * addressSubElem.setAddressLine2("ramprastha green");
		 * addressSubElem.setAddressLine3("vaishali");
		 * addressSubElem.setCountryCode("IN"); addressSubElem.setDistrict("ghaziabad");
		 * addressSubElem.setPinCode("201010");
		 */
		/* String state_one_code = (String) session.getAttribute("state_one_code");
		 String city_code =(String) session.getAttribute("city_code");*/
		main m= new main();
		String state_one_code =m.State(city);
		String city_code =m.town(city);
		addressSubElem.setStateCode(state_one_code);
		System.out.println("StateCode :"+state_one_code);
		addressSubElem.setTownCode(city_code);
		System.out.println( "towncode"+city_code );
		Address Addr = new Address();
		Addr.setAddress(addressSubElem);

		Partner part = new Partner();
		part.setPartnerCode("13961");
		part.setPassword("master123");
		part.setUserName("policymaster");
		
		Map<String,String> hm=m.religareMembers(members);
		
		boolean bool=members.contains("spouse");
        boolean bool1=members.contains("son");
        boolean bool2=members.contains("son1");
        boolean bool3=members.contains("son2");
        boolean bool4=members.contains("daughter");
        boolean bool5=members.contains("daughter1");
        boolean bool6=members.contains("daughter2");
        boolean bool7=members.contains("father");
        boolean bool8=members.contains("mother");
        boolean bool9=members.contains("father-in-law");
        boolean bool10=members.contains("mother-in-law");
        boolean bool11=members.contains("grandfather");
        boolean bool12=members.contains("grandmother");

		ProductSubElement productSubElem = new ProductSubElement();
		productSubElem.setClientCode("PolicyHolder");
		
			productSubElem.setProductCode("11119");
			productSubElem.setSACCode("1");
			productSubElem.setProductGroup("1");
			productSubElem.setProductLine("9");
			productSubElem.setProductType("1");
			productSubElem.setProductVersion("1");
			productSubElem.setSumAssured(sumassured);
			
		
		ProductSubElement productSubElem1 = new ProductSubElement();
		ProductSubElement productSubElem2 = new ProductSubElement();
		
		productSubElem1.setProductCode("11119");
		productSubElem1.setProductGroup("1");
		productSubElem1.setProductLine("9");
		productSubElem1.setProductType("1");
		productSubElem1.setProductVersion("1");
		productSubElem1.setSACCode("2");
		productSubElem1.setSumAssured(sumassured);
		
		
		if(bool1==true) {
			productSubElem2.setProductCode("11119");
			productSubElem2.setProductGroup("1");
			productSubElem2.setProductLine("9");
			productSubElem2.setProductType("1");
			productSubElem2.setProductVersion("1");
			productSubElem2.setSACCode("3");
			productSubElem2.setSumAssured(sumassured);
		}
		Product prod = new Product();
		prod.setProduct(productSubElem);
		
		Product prod1 = new Product();
		prod1.setProduct(productSubElem1);
		
		Product prod2 = new Product();
		prod2.setProduct(productSubElem2);
		
		
		Dependants dependants = new Dependants();

		List<ClientSubElement> clientList = new ArrayList<>();
		ClientSubElement clientSub= new ClientSubElement();
		if(bool==true) {
			
			clientSub.setAge(hm.get("age_spouse"));
			clientSub.setClientCode("member 1");
			clientSub.setProduct(prod1);
			/*clientSub.setFirstName("");
			clientSub.setLastName("");
			clientSub.setSalutation("");*/
		}
			ClientSubElement clientSub1= new ClientSubElement();
			if(bool1==true) {
				clientSub1.setAge(hm.get("age_son"));
				clientSub1.setClientCode("member 2");
				/*clientSub1.setFirstName("");
				clientSub1.setLastName("");
				clientSub1.setSalutation("");*/
				clientSub1.setProduct(prod2);
			
			}
			ClientSubElement clientSub2= new ClientSubElement();
			if(bool2==true) {
				clientSub2.setAge(hm.get("age_son"));
				clientSub2.setClientCode("member 3");
				/*clientSub2.setFirstName("");
				clientSub2.setLastName("");
				clientSub2.setSalutation("");*/
				clientSub2.setProduct(prod2);
			}
			ClientSubElement clientSub3= new ClientSubElement();
			if(bool3==true) {
				clientSub3.setAge(hm.get("age_son"));
				clientSub3.setClientCode("member 4");
				/*clientSub3.setFirstName("");
				clientSub3.setLastName("");
				clientSub3.setSalutation("");*/
				clientSub3.setProduct(prod2);
			}
			ClientSubElement clientSub4= new ClientSubElement();
			if(bool4==true) {
				clientSub4.setAge(hm.get("age_daughter"));
				clientSub4.setClientCode("member 5");
				
				/*clientSub4.setFirstName("");
				clientSub4.setLastName("");
				clientSub4.setSalutation("");*/
				clientSub4.setProduct(prod2);
			}
			ClientSubElement clientSub5= new ClientSubElement();
			if(bool5==true) {
				clientSub5.setAge(hm.get("age_daughter"));
				clientSub5.setClientCode("member 6");
				/*clientSub5.setFirstName("");
				clientSub5.setLastName("");
				clientSub5.setSalutation("");*/
				clientSub5.setProduct(prod2);
			}
			ClientSubElement clientSub6= new ClientSubElement();
			if(bool6==true) {
				clientSub6.setAge(hm.get("age_daughter"));
				clientSub6.setClientCode("member 7");
				/*clientSub6.setFirstName("");
				clientSub6.setLastName("");
				clientSub6.setSalutation("");*/
				clientSub6.setProduct(prod2);
			}
			ClientSubElement clientSub7= new ClientSubElement();
			if(bool7==true) {
				clientSub7.setAge("55");
				clientSub7.setClientCode("member 8");
				/*clientSub7.setFirstName("");
				clientSub7.setLastName("");
				clientSub7.setSalutation("");*/
				clientSub7.setProduct(prod1);
			}
			ClientSubElement clientSub8= new ClientSubElement();
			if(bool8==true) {
				clientSub8.setAge("55");
				clientSub8.setClientCode("member 9");
				/*clientSub8.setFirstName("");
				clientSub8.setLastName("");
				clientSub8.setSalutation("");*/
				clientSub8.setProduct(prod1);
			}
			ClientSubElement clientSub9= new ClientSubElement();
			if(bool9==true) {
				clientSub9.setAge("55");
				clientSub9.setClientCode("member 10");
				/*clientSub9.setFirstName("");
				clientSub9.setLastName("");
				clientSub9.setSalutation("");*/
				clientSub9.setProduct(prod1);
			}
			ClientSubElement clientSub10= new ClientSubElement();
			if(bool10==true) {
				clientSub10.setAge("55");
				clientSub10.setClientCode("member 11");
				/*clientSub10.setFirstName("");
				clientSub10.setLastName("");
				clientSub10.setSalutation("");*/
				clientSub10.setProduct(prod1);
			}
			ClientSubElement clientSub11= new ClientSubElement();
			if(bool11==true) {
				clientSub11.setAge("55");
				clientSub11.setClientCode("member 12");
				/*clientSub11.setFirstName("");
				clientSub11.setLastName("");
				clientSub11.setSalutation("");*/
				clientSub11.setProduct(prod1);
			}
			ClientSubElement clientSub12= new ClientSubElement();
			if(bool12==true) {
				clientSub12.setAge("55");
				clientSub12.setClientCode("member 13");
				/*clientSub12.setFirstName("");
				clientSub12.setLastName("");
				clientSub12.setSalutation("");*/
				clientSub12.setProduct(prod);
			}
			if(bool==true) {
			clientList.add(clientSub);
			}
			if(bool1==true) {
			clientList.add(clientSub1);
			}
			if(bool2==true) {
			clientList.add(clientSub2);
			}
			if(bool3==true) {
				clientList.add(clientSub3);
				}
			if(bool4==true) {
				clientList.add(clientSub4);
				}
			if(bool5==true) {
				clientList.add(clientSub5);
				}
			if(bool6==true) {
				clientList.add(clientSub6);
				}
			if(bool7==true) {
				clientList.add(clientSub7);
				}
			if(bool8==true) {
				clientList.add(clientSub8);
				}
			if(bool9==true) {
				clientList.add(clientSub9);
				}
			if(bool10==true) {
				clientList.add(clientSub10);
				}
			if(bool11==true) {
				clientList.add(clientSub11);
				}
			if(bool12==true) {
				clientList.add(clientSub12);
				}
			
			dependants.setClientSubElement(clientList);
		
		

		Client cli = new Client();
		cli.setAge(hm.get("age_self"));
		cli.setClientCode("PolicyHolder");
		//cli.setOccuptionCode("303601");
		cli.setAddress(Addr);
		cli.setProduct(prod);
		if(bool==true || bool7==true) {
		cli.setDependants(dependants);
		}

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
			System.out.println("self all request: "+output);
			System.out.println("\n");
			// System.out.println(response1);
			System.out.println("self all response: "+res_xml);


				String xpath_TotalPremium = "//TotalPremium/text()";
				String xpath_BasePremiumAmount = "//BasePremiumAmount[1]//text()";
				String xpath_GrossPremiumAmount = "//GrossPremiumAmount[1]//text()";
				String xpath_TaxAmount = "//TaxAmount[1]//text()";
    			String xpath_DiscountAmount = "//DiscountAmount[1]//text()";
				Document doc = parseXmlFile(res_xml);
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
	    			 BasePremium = BasePremiumNodes.item(i).getNodeValue();
	    			System.out.println("BasePremium");
	    			session.setAttribute("BasePremium", BasePremium);
	    		}
					
					for (int i = 0; i < GrossPremiumNodes.getLength(); i++) {
	    			
	    			System.out.println("GrossPremium: " + GrossPremiumNodes.item(i).getNodeValue());
	    			GrossPremium = GrossPremiumNodes.item(i).getNodeValue();
		    			System.out.println("GrossPremium");
	    		}
					for (int i = 0; i < DiscountNodes .getLength(); i++) {
	        			
	        			System.out.println("DiscountAmount: " + DiscountNodes .item(i).getNodeValue());
	        			DiscountAmount = DiscountNodes.item(i).getNodeValue();
		    			System.out.println("DiscountAmount");
	        		}
	    			for (int i = 0; i < TaxNodes .getLength(); i++) {
	        			
	        			System.out.println("TaxAmount: " + TaxNodes.item(i).getNodeValue());
	        			TaxAmount = TaxNodes.item(i).getNodeValue();
		    			System.out.println("TaxAmount");
	        			
	        		}
	    			
			} catch (Exception e) {
				e.printStackTrace();
			}

	}

	public static void apollo_proposal(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		String members=(String) session.getAttribute("members");
		apollo_proposal_pojo ap = (apollo_proposal_pojo) session.getAttribute("ap");
		apollo_proposal_pojo app = (apollo_proposal_pojo) session.getAttribute("app");
		
		String sumassured=ap.getSumassured();
		String fullname = app.getFullname();
		String spousefullname=app.getSpouse_fullname();
		String sonfullname=app.getSon_fullname();
		String son1fullname=app.getSon1_fullname();
		String son2fullname=app.getSon2_fullname();
		String daughterfullname=app.getDaughter_fullname();
		String daughter1fullname=app.getDaughter1_fullname();
		String daughter2fullname=app.getDaughter2_fullname();
		String salutation = app.getSalutation();
		String spousesalutation=app.getSpouse_salutation();
		String sonsalutation=app.getSon_salutation();
		String son1salutation=app.getSon1_salutation();
		String son2salutation=app.getSon2_salutation();
		String daughtersalutation=app.getDaughter_salutation();
		String daughter1salutation=app.getDaughter1_salutation();
		String daughter2salutation=app.getDaughter2_salutation();
		String fatherdob=app.getFatherdob();
		String fatherfullname=app.getFatherfullname();
		//String father
		String motherdob=app.getMotherdob();
		String Father_in_law=app.getFather_in_lawdob();
		String mother_in_law=app.getMother_in_lawdob();
		String dob = app.getDob();
		String spousedob=app.getSpouse_dob();
		String sondob=app.getSon_dob();
		String son1dob=app.getSon1_dob();
		String son2dob=app.getSon2_dob();
		String daughterdob=app.getDaughter_dob();
		String daughter1dob=app.getDaughter_dob();
		String daughter2dob=app.getDaughter_dob();
		String occupation = app.getOccupation();
		String height = app.getHeight();
		String height1 = app.getHeight1();
		String weight = app.getWeight();
		String mobile = app.getMobile();
		String email = app.getEmail();
		String address = app.getAddress();
		String city = app.getCity();
		String state = app.getState();
		String pincode = app.getPincode();
		String nomname = app.getNomname();
		String nomaddress = app.getNomaddress();
		String nompincode = app.getNompincode();
		String nomsalutation=app.getNomsalutation();
		String nomrelation=app.getNomrelation();
		String nomdob=app.getNomdob();
		
		String s = fullname;
		String s1[] = s.split("\\s");
		System.out.println(s1[0]);
		System.out.println(s1[1]);

		Partner part = new Partner();
		part.setPartnerCode("13961");
		part.setPassword("master123");
		part.setUserName("policymaster");

		AddressSubElement addressSubElem = new AddressSubElement();
		
		main m = new main();
		 String state_code =m.State(city);
		 String city_code =m.town(city);
		 
		 // String occupation_code = m.occupation(occupation);
		  String relationship_code =m.nomineerelation(nomrelation);
		 
		 addressSubElem.setStateCode(state_code);
			System.out.println("StateCode :"+state_code);
			addressSubElem.setTownCode(city_code);
			System.out.println("townCode :"+city_code);
		 
		addressSubElem.setAddressLine1(address);
		addressSubElem.setAddressLine2("");
		addressSubElem.setAddressLine3("");
		addressSubElem.setCountryCode("IN");
		addressSubElem.setDistrict("");
		addressSubElem.setPinCode(pincode);
		addressSubElem.setStateCode(state_code);
		addressSubElem.setTownCode(city_code);


		Address Addr = new Address();
		Addr.setAddress(addressSubElem);
		Map<String,String> hm=m.religareMembers(members);
		
		boolean bool=members.contains("spouse");
        boolean bool1=members.contains("son");
        boolean bool2=members.contains("son1");
        boolean bool3=members.contains("son2");
        boolean bool4=members.contains("daughter");
        boolean bool5=members.contains("daughter1");
        boolean bool6=members.contains("daughter2");
        boolean bool7=members.contains("father");
        boolean bool8=members.contains("mother");
        boolean bool9=members.contains("father-in-law");
        boolean bool10=members.contains("mother-in-law");
        boolean bool11=members.contains("grandfather");
        boolean bool12=members.contains("grandmother");

		ProductSubElement productSubElem = new ProductSubElement();
		ProductSubElement productSubElem1 = new ProductSubElement();
		ProductSubElement productSubElem2 = new ProductSubElement();
		
		productSubElem.setBasePremiumAmount(BasePremium);
		productSubElem.setClientCode("PolicyHolder");
		 productSubElem.setDiscountAmount(DiscountAmount);
		 productSubElem.setGrossPremiumAmount(GrossPremium);
		 //productSubElem.setLoadingAmount("11006");
		// productSubElem.setPaidBy("1");
		 
		
		 productSubElem.setProductCode("11119");
			
		productSubElem.setProductGroup("1");
		productSubElem.setProductLine("9");
		productSubElem.setProductType("1");
		productSubElem.setProductVersion("1");
		productSubElem.setSACCode("1");
		productSubElem.setSumAssured(sumassured);
		 productSubElem.setTaxAmount(TaxAmount);
		 
		 
		
			
		 //productSubElem.setLoadingAmount("11006");
		// productSubElem.setPaidBy("1");
		productSubElem1.setBasePremiumAmount(BasePremium);
		 productSubElem1.setDiscountAmount(DiscountAmount);
		 productSubElem1.setGrossPremiumAmount(GrossPremium);
		productSubElem1.setProductCode("11119");
		productSubElem1.setProductGroup("1");
		productSubElem1.setProductLine("9");
		productSubElem1.setProductType("1");
		productSubElem1.setProductVersion("1");
		productSubElem1.setSACCode("2");
		productSubElem1.setSumAssured(sumassured);
		 productSubElem1.setTaxAmount(TaxAmount);
		
		 
		
		 if(bool1==true) {
			productSubElem2.setBasePremiumAmount(BasePremium);
			 productSubElem2.setDiscountAmount(DiscountAmount);
			 productSubElem2.setGrossPremiumAmount(GrossPremium);
			productSubElem2.setProductCode("11119");
			productSubElem2.setProductGroup("1");
			productSubElem2.setProductLine("9");
			productSubElem2.setProductType("1");
			productSubElem2.setProductVersion("1");
			productSubElem2.setSACCode("3");
			
			
			productSubElem2.setSumAssured(sumassured);
			 productSubElem2.setTaxAmount(TaxAmount);
		 }
	Product prod = new Product();
	prod.setProduct(productSubElem);
	
	Product prod1 = new Product();
	prod1.setProduct(productSubElem1);
	
	Product prod2 = new Product();
	prod2.setProduct(productSubElem2);
	
		 
		

		
		LifeStyleHabits lifeStyle = new LifeStyleHabits();
		

		ContactSubElement contactSubElem = new ContactSubElement();
		contactSubElem.setNumber(mobile);
		contactSubElem.setType("7");

		ContactNumber contactNum = new ContactNumber();
		contactNum.setContactNumber(contactSubElem);

		ContactInformation contactInform = new ContactInformation();
		contactInform.setContactNumber(contactNum);
		contactInform.setEmail(email);
 
		  String salu[]= m.Titleapollo(salutation) ;
		  String saluta =salu[0];
		 String gencode = salu[1];
		 
		 String salu1[]=m.Titleapollo(nomsalutation);
		 String saluta1=salu1[0];
		 String nomgencode=salu1[1];
		System.out.println("salutation: "+saluta);
		System.out.println("nomsalutation: "+nomsalutation);
		System.out.println("gendercode: "+gencode);
		
		Dependants dependants = new Dependants();
		List<ClientSubElement> clientList = new ArrayList<>();
		ClientSubElement clientSub= new ClientSubElement();
		if(bool==true) {
		
		String s5[] = spousefullname.split("\\s");
		clientSub.setAge(hm.get("age_spouse"));
		clientSub.setClientCode("member 1");
		clientSub.setFirstName(s5[0]);
		
		clientSub.setLastName(s5[1]);
		clientSub.setTitleCode(saluta);
		clientSub.setBirthDate(spousedob);
		clientSub.setNationalityCode("IN");
		clientSub.setOccuptionCode("false");
		clientSub.setRelationshipCode(relationship_code);
		clientSub.setMaritalStatusCode("1");
		clientSub.setProduct(prod1);
			
		}
		
	ClientSubElement clientSub1= new ClientSubElement();
	if(bool1==true) {
		String s6[] = sonfullname.split("\\s");
		clientSub1.setAge(hm.get("age_son"));
		clientSub1.setClientCode("member 2");
		clientSub1.setBirthDate(sondob);
		clientSub1.setFirstName(s6[0]);
		clientSub1.setLastName(s6[1]);
		clientSub1.setTitleCode(saluta);
		clientSub1.setNationalityCode("IN");
		clientSub1.setOccuptionCode("false");
		clientSub1.setRelationshipCode("20");
		clientSub1.setMaritalStatusCode("2");
		clientSub1.setProduct(prod2);
		
	}
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate today = LocalDate.now();
	
	ClientSubElement clientSub2= new ClientSubElement();
	if(bool2==true) {
		LocalDate localDate = LocalDate.parse(son1dob, dateTimeFormatter);
		Period p = Period.between(localDate, today);
		
		String s6[] = son1fullname.split("\\s");
		clientSub2.setAge(String.format("%d", p.getYears()));
		clientSub2.setBirthDate(son1dob);
		clientSub2.setClientCode("member 3");
		clientSub2.setFirstName(s6[0]);
		clientSub2.setLastName(s6[1]);
		clientSub2.setTitleCode("MR");
		clientSub2.setNationalityCode("IN");
		clientSub2.setOccuptionCode("false");
		clientSub2.setRelationshipCode("20");
		clientSub2.setMaritalStatusCode("2");
		clientSub2.setProduct(prod2);
	}
	ClientSubElement clientSub3= new ClientSubElement();
	if(bool3==true) {
		LocalDate localDate = LocalDate.parse(son2dob, dateTimeFormatter);
		Period p = Period.between(localDate, today);
		
		String s6[] = son2fullname.split("\\s");
		clientSub3.setAge(String.format("%d", p.getYears()));
		clientSub3.setClientCode("member 4");
		clientSub3.setBirthDate(son2dob);
		clientSub3.setFirstName(s6[0]);
		clientSub3.setLastName(s6[1]);
		clientSub3.setTitleCode("MR");
		clientSub3.setNationalityCode("IN");
		clientSub3.setOccuptionCode("false");
		clientSub3.setRelationshipCode("20");
		clientSub3.setMaritalStatusCode("2");
		clientSub3.setProduct(prod2);
	}
		ClientSubElement clientSub4= new ClientSubElement();
		if(bool4==true) {
			String s6[] = daughterfullname.split("\\s");
			
			clientSub4.setAge(hm.get("age_daughter"));
			clientSub4.setClientCode("member 3");
			clientSub4.setBirthDate(daughterdob);
			clientSub4.setNationalityCode("IN");
			clientSub4.setFirstName(s6[0]);
			clientSub4.setLastName(s6[1]);
			clientSub4.setOccuptionCode("false");
			clientSub4.setRelationshipCode("17");
			clientSub4.setMaritalStatusCode("2");
			clientSub4.setProduct(prod2);
			clientSub4.setTitleCode("MISS");
		}
		
		ClientSubElement clientSub5= new ClientSubElement();
		if(bool5==true) {
			LocalDate localDate = LocalDate.parse(daughter1dob, dateTimeFormatter);
			Period p = Period.between(localDate, today);
			
			String s6[] = daughter1fullname.split("\\s");
			clientSub5.setAge(String.format("%d", p.getYears()));
			clientSub5.setBirthDate(daughter1dob);
			clientSub5.setClientCode("member 6");
			clientSub5.setNationalityCode("IN");
			clientSub5.setFirstName(s6[0]);
			clientSub5.setLastName(s6[1]);
			clientSub5.setTitleCode(saluta);
			clientSub5.setOccuptionCode("false");
			clientSub5.setRelationshipCode("17");
			clientSub5.setMaritalStatusCode("2");
			clientSub5.setProduct(prod2);
		}
		
	
		ClientSubElement clientSub6= new ClientSubElement();
		if(bool6==true) {
			LocalDate localDate = LocalDate.parse(daughter2dob, dateTimeFormatter);
			Period p = Period.between(localDate, today);
			
			String s6[] = daughter2fullname.split("\\s");
			clientSub6.setAge(String.format("%d", p.getYears()));
			clientSub6.setClientCode("member 7");
			clientSub6.setBirthDate(daughter2dob);
			clientSub6.setNationalityCode("IN");
			clientSub6.setFirstName(s6[0]);
			clientSub6.setLastName(s6[1]);
			clientSub6.setTitleCode("MISS");
			clientSub6.setOccuptionCode("false");
			clientSub6.setRelationshipCode("17");
			clientSub6.setMaritalStatusCode("2");
			clientSub6.setProduct(prod2);
		}
		ClientSubElement clientSub7= new ClientSubElement();
		if(bool7==true) {
			clientSub7.setAge("65");
			clientSub7.setClientCode("member 8");
			clientSub7.setBirthDate(fatherdob);
			clientSub7.setNationalityCode("IN");
			clientSub7.setFirstName("ram");
			clientSub7.setLastName("singh");
			clientSub7.setTitleCode("MR");
			clientSub7.setOccuptionCode("false");
			clientSub7.setRelationshipCode("4");
			clientSub7.setMaritalStatusCode("1");
			clientSub7.setProduct(prod1);
		}
		ClientSubElement clientSub8= new ClientSubElement();
		if(bool8==true) {
			clientSub8.setAge("64");
			clientSub8.setClientCode("member 9");
			clientSub8.setBirthDate("1982-12-06");
			clientSub8.setNationalityCode("IN");
			clientSub8.setFirstName("omwati");
			clientSub8.setLastName("singh");
			clientSub8.setTitleCode("MRS");
			clientSub8.setOccuptionCode("false");
			clientSub8.setRelationshipCode("5");
			clientSub8.setMaritalStatusCode("1");
			clientSub8.setProduct(prod1);
		}
		ClientSubElement clientSub9= new ClientSubElement();
		if(bool9==true) {
			clientSub9.setAge("66");
			clientSub9.setClientCode("member 10");
			clientSub9.setBirthDate("1982-12-06");
			clientSub9.setNationalityCode("IN");
			clientSub9.setFirstName("rajveer");
			clientSub9.setLastName("singh");
			clientSub9.setTitleCode("MR");
			clientSub9.setOccuptionCode("false");
			clientSub9.setRelationshipCode("18");
			clientSub9.setMaritalStatusCode("1");
			clientSub9.setProduct(prod1);
		}
		ClientSubElement clientSub10= new ClientSubElement();
		if(bool10==true) {
			clientSub10.setAge("63");
			clientSub10.setClientCode("member 11");
			clientSub10.setBirthDate("1982-12-06");
			clientSub10.setNationalityCode("IN");
			clientSub10.setFirstName("sunita");
			clientSub10.setLastName("singh");
			clientSub10.setTitleCode("MRS");
			clientSub10.setOccuptionCode("false");
			clientSub10.setRelationshipCode("19");
			clientSub10.setMaritalStatusCode("1");
			clientSub10.setProduct(prod1);
		}
		ClientSubElement clientSub11= new ClientSubElement();
		if(bool11==true) {
			clientSub11.setAge("75");
			clientSub11.setClientCode("member 12");
			clientSub11.setBirthDate("1982-12-06");
			clientSub11.setNationalityCode("IN");
			clientSub11.setFirstName("satyadev");
			clientSub11.setLastName("singh");
			clientSub11.setTitleCode("MR");
			clientSub11.setOccuptionCode("false");
			clientSub11.setRelationshipCode("18");
			clientSub11.setMaritalStatusCode("1");
			clientSub11.setProduct(prod1);
		}
		ClientSubElement clientSub12= new ClientSubElement();
		if(bool12==true) {
			clientSub12.setAge("76");
			clientSub12.setClientCode("member 13");
			clientSub12.setBirthDate("1982-12-06");
			clientSub12.setNationalityCode("IN");
			clientSub12.setFirstName("shelja");
			clientSub12.setLastName("singh");
			clientSub12.setTitleCode("MRS");
			clientSub12.setOccuptionCode("false");
			clientSub12.setRelationshipCode("1");
			clientSub12.setMaritalStatusCode("1");
			clientSub12.setProduct(prod);
		}
		
		if(bool==true) {
			clientList.add(clientSub);
			}
			if(bool1==true) {
			clientList.add(clientSub1);
			}
			if(bool2==true) {
			clientList.add(clientSub2);
			}
			if(bool3==true) {
				clientList.add(clientSub3);
				}
			if(bool4==true) {
				clientList.add(clientSub4);
				}
			if(bool5==true) {
				clientList.add(clientSub5);
				}
			if(bool6==true) {
				clientList.add(clientSub6);
				}
			if(bool7==true) {
				clientList.add(clientSub7);
				}
			if(bool8==true) {
				clientList.add(clientSub8);
				}
			if(bool9==true) {
				clientList.add(clientSub9);
				}
			if(bool10==true) {
				clientList.add(clientSub10);
				}
			if(bool11==true) {
				clientList.add(clientSub11);
				}
			if(bool12==true) {
				clientList.add(clientSub12);
				}
			
		dependants.setClientSubElement(clientList);
		
		
		Client cli = new Client();
		
		// cli.setAge("");
		cli.setClientCode("PolicyHolder");
		cli.setOccuptionCode(occupation);
		cli.setAddress(Addr);
		cli.setProduct(prod);
		// cli.setAnnualIncome("999999");
		cli.setBirthDate(dob);
		cli.setContactInformation(contactInform);
		// cli.setFamilySize("1");
		cli.setFirstName(s1[0]);
		cli.setGenderCode(gencode);
		// cli.setGstinNumber("abc12345");
		//cli.setHeight("170");
		// cli.setIDProofNumber("IDNO388");
		// cli.setIDProofTypeCode("IDNO1");
		cli.setLastName(s1[1]);
		// cli.setLifeStyleHabits(lifeStyle);
		cli.setMaritalStatusCode("1");
		cli.setMiddleName("");
		cli.setNationalityCode("IN");
		cli.setRelationshipCode(relationship_code);
		cli.setTitleCode(saluta );
		//cli.setWeight("");
		if(bool==true || bool7==true) {
		cli.setDependants(dependants);
		}
		Proposer prop = new Proposer();
		prop.setAddress(Addr);
		prop.setBirthDate(dob);
		prop.setContactInformation(contactInform);
		prop.setFirstName(s1[0]);
		prop.setGenderCode(gencode);
		// prop.setGstinNumber("abc12345");
		// prop.setIDProofNumber("IDNO388");
		// prop.setIDProofTypeCode("IDNO1");
		prop.setLastName(s1[1]);
		prop.setMaritalStatusCode("1");
		prop.setMiddleName("");
		prop.setNationalityCode("IN");
		prop.setRelationshipCode("1");

		NomineeAddress nomineeAddr = new NomineeAddress();
		nomineeAddr.setAddressLine1(nomaddress);
		nomineeAddr.setAddressLine2("");
		nomineeAddr.setAddressLine3("");
		nomineeAddr.setCountryCode("IN");
		nomineeAddr.setDistrict("");
		nomineeAddr.setPinCode(nompincode);
		nomineeAddr.setStateCode(state_code);
		nomineeAddr.setTownCode(city_code);

		Application appli = new Application();
		appli.setNamefor80D(fullname);
		appli.setNomineeAddress(nomineeAddr);
		appli.setNomineeName(nomname);
		appli.setNomineeTitleCode(saluta1);
		appli.setProposer(prop);
		appli.setRelationToNomineeCode(relationship_code);
		// appli.setRuralFlag("0");
		appli.setTPANameCode("FHPL");

		Prospect pros = new Prospect();
		pros.setBrandCode("ApolloMunich");
		//pros.setTotalPremiumAmount(TotalPremium);
		//System.out.println(TotalPremium);
		pros.setApplication(appli);
		pros.setClient(cli);

		
		ProposalCaptureServiceRequest proposalCapt = new ProposalCaptureServiceRequest();
		proposalCapt.setAction("Create");
		proposalCapt.setProspect(pros);
		proposalCapt.setPartner(part);

		ProposalCapture proposalC = new ProposalCapture();
		proposalC.setProposalCaptureServiceRequest(proposalCapt);

		Document document;
		try {
			document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

			document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			Marshaller marshaller = JAXBContext.newInstance(ProposalCapture.class).createMarshaller();
			marshaller.marshal(proposalC, document);

			SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();

			soapMessage.getSOAPPart().getEnvelope().removeNamespaceDeclaration("SOAP-ENV");

			String myNamespace = "b2b";
			String myNamespaceURI = "http://www.apollomunichinsurance.com/B2BService";

			String myNamespace1 = "prop";
			String myNamespaceURI1 = "http://schemas.datacontract.org/2004/07/ProposalCaptureServiceLibrary";

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
			HttpPost post = new HttpPost("http://b2buat.apollomunichinsurance.com/ProposalCaptureHttpService.svc");
			String output = new String(outputStream.toByteArray());
			StringEntity userEntity = new StringEntity(output);
			post.setEntity(userEntity);
			post.setHeader("Accept-Encoding", "gzip,deflate");
			post.setHeader("Content-Type", "text/xml; charset=UTF-8");
			post.setHeader("SOAPAction",
					"http://www.apollomunichinsurance.com/B2BService/IProposalCaptureService/ProposalCapture");
			HttpResponse response1 = client1.execute(post);
			String res_xml = EntityUtils.toString(response1.getEntity());
			InputSource is = new InputSource(new StringReader(res_xml));
			System.out.println("self all proposal request:"+output);
			System.out.println("\n");
			// System.out.println(response1);
			System.out.println("self all proposal response:"+res_xml);
			try {

				String xpath_ProposalCaptureResult = "//ProposalCaptureResult/text()";
				 Document doc = parseXmlFile(res_xml);
				XPathFactory xPathfactory = XPathFactory.newInstance();
				XPath xpath = xPathfactory.newXPath();
				XPathExpression xpath_expression_ProposalCaptureResult = xpath.compile(xpath_ProposalCaptureResult);
				NodeList ProposalCaptureResultNodes = (NodeList) xpath_expression_ProposalCaptureResult.evaluate(doc,
						XPathConstants.NODESET);
				for (int i = 0; i < ProposalCaptureResultNodes.getLength(); i++) {
					System.out.println("ProposalCaptureResult: " + ProposalCaptureResultNodes.item(i).getNodeValue());
					String Proposal_id = ProposalCaptureResultNodes.item(i).getNodeValue();
					session.setAttribute("Proposal_id", Proposal_id);
				}
					pw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (SOAPException e) {
			e.printStackTrace();

		} catch (ClientProtocolException e1) {
			
			e1.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();

		}catch (IOException e1) {
			
			e1.printStackTrace();
		} finally {

		}
		
		
		return;
	}

	public static void apollo_payment(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		String Proposal_id = (String) session.getAttribute("Proposal_id");
		String Floater_Proposal_id = (String) session.getAttribute("Floater_Proposal_id");
		String health_policy=(String) session.getAttribute("health_policy");

		String SALTCHARS = "MAI1780";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 6) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();

		PGDetail pgdet = new PGDetail();
		pgdet.setIPAddress("203.122.13.226");
		pgdet.setMerchantRefNo(saltStr);
		if(health_policy.equals("Optima_Restore")) {
			pgdet.setProposalId(Proposal_id);
		}
		else if(health_policy.equals("Optima_Restore_Floater")) {
			pgdet.setProposalId(Floater_Proposal_id);
		}
		//pgdet.setReturnUrl("http://localhost:8082/PolicyMaster/ConfirmPaymentStatus");
		pgdet.setReturnUrl("http://192.168.10.61:8080/PolicyMaster/ConfirmPaymentStatus");
		pgdet.setUDF1("");
		pgdet.setUDF2("");
		pgdet.setUDF3("");
		pgdet.setUDF4("");
		pgdet.setUDF5("");

		Partner part = new Partner();
		part.setPartnerCode("13961");
		part.setPassword("master123");
		part.setUserName("policymaster");

		paymentGatewayServiceRequest pgsr = new paymentGatewayServiceRequest();
		pgsr.setPGDetail(pgdet);
		pgsr.setPartner(part);

		PaymentDetails paymentdet = new PaymentDetails();
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
			post.setHeader("SOAPAction",
					"http://www.apollomunichinsurance.com/B2BService/IPaymentGatewayService/PaymentDetails");
			HttpResponse response1 = client1.execute(post);
			String res_xml = EntityUtils.toString(response1.getEntity());
			InputSource is = new InputSource(new StringReader(res_xml));
			System.out.println( "payment request :"+output);
			System.out.println("\n");
			// System.out.println(response1);
			System.out.println( "payment response :"+res_xml);
			
				String xpath_PaymentUrl = "//PaymentUrl/text()";
				String xpath_PaymentId = "//PaymentId[1]//text()" ;
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
					session.setAttribute("PaymentUrl", PaymentUrl);
				}
				for (int i = 0; i < PaymentIdNodes.getLength(); i++) {
					System.out.println("PaymentId: " + PaymentIdNodes.item(i).getNodeValue());
					 PaymentId = PaymentIdNodes.item(i).getNodeValue();
					
					session.setAttribute("PaymentId", PaymentId);
					System.out.println(PaymentId);
				
				pw.close();
			}
			}catch (Exception e) {
				e.printStackTrace();
			}
		
		
		return;
	}
	
	
	
	public static void apollo_paymentVerification(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		PrintWriter pw = response.getWriter();
		String TransactionId=(String) session.getAttribute("TransactionId");
		Partner part = new Partner();
    	part.setPartnerCode("13961");
    	part.setPassword("master123");
    	part.setUserName("policymaster");
    	
    	
    	TransactionVerificationRequest transactionrequest = new TransactionVerificationRequest();
    	transactionrequest.setPartner(part);
    	transactionrequest.setPaymentId(PaymentId);
    	transactionrequest.setTransactionId(TransactionId);
    	
    	
    	VerifyTransaction verifytransac = new VerifyTransaction();
    	verifytransac.setTransactionVerificationRequest(transactionrequest);
    	
    	 Document document;
         try {
        	 document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
				
        	 document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
				Marshaller marshaller = JAXBContext.newInstance(VerifyTransaction.class).createMarshaller();
				marshaller.marshal(verifytransac, document);
             
             SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();
             
                soapMessage.getSOAPPart().getEnvelope().removeNamespaceDeclaration("SOAP-ENV");
                
                String myNamespace = "b2b";
			    String myNamespaceURI = "http://www.apollomunichinsurance.com/B2BService";
			    
			    String myNamespace1 = "tran";
			    String myNamespaceURI1 = "http://schemas.datacontract.org/2004/07/TransactionVerificationLibrary";
			    
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
             HttpPost post = new HttpPost("http://b2buat.apollomunichinsurance.com/TransactionVerificationHttpService.svc");
             String output = new String(outputStream.toByteArray());
             StringEntity userEntity = new StringEntity(output);
              post.setEntity(userEntity);
              post.setHeader("Accept-Encoding", "gzip,deflate");
              post.setHeader("Content-Type", "text/xml; charset=UTF-8");
              post.setHeader("SOAPAction", "http://www.apollomunichinsurance.com/B2BService/ITransactionVerificationService/VerifyTransaction");
              HttpResponse response1=client1.execute(post);
              String res_xml = EntityUtils.toString(response1.getEntity());
              InputSource is = new InputSource(new StringReader(res_xml));
              System.out.println("payment verification request: "+output);
              System.out.println("\n");
     		 //System.out.println(response1);
      		 System.out.println("payment verification response: "+res_xml);
      		

				String xpath_VerifyTransactionResult = "//VerifyTransactionResult/text()";
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(is);
				XPathFactory xPathfactory = XPathFactory.newInstance();
				XPath xpath = xPathfactory.newXPath();
				XPathExpression xpath_expression_VerifyTransactionResult = xpath.compile(xpath_VerifyTransactionResult);
				NodeList VerifyTransactionResultNodes = (NodeList) xpath_expression_VerifyTransactionResult.evaluate(doc,
						XPathConstants.NODESET);
				for (int i = 0; i < VerifyTransactionResultNodes.getLength(); i++) {
					System.out.println("VerifyTransactionResult: " + VerifyTransactionResultNodes.item(i).getNodeValue());
					VerifyTransactionResult = VerifyTransactionResultNodes.item(i).getNodeValue();
					 //System.out.println(VerifyTransactionResult);
					 pw.println("payment successful");
					 
				}
				
			
					pw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		
         if(session!=null) {
        	 session.removeAttribute("ap");
        	 session.removeAttribute("app");
        	 session.removeAttribute("TransactionId");
        	 session.removeAttribute("PaymentUrl");
        	 session.removeAttribute("TotalPremium");
        	 session.removeAttribute("FloaterTotalPremium");
        	 session.removeAttribute("health_policy");
         }
		return;
	}
	
	public static void apollo_PremiumFloater(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		String members=(String) session.getAttribute("members");
		
		apollo_proposal_pojo ap = (apollo_proposal_pojo) session.getAttribute("ap");
		String date = ap.getDob();
		String city = ap.getCity();
		String sumassured=ap.getSumassured();
		
		AddressSubElement addressSubElem = new AddressSubElement();
		
		int SACCode;
		int  memberage=0 ;
		if(memberage!=0)
			{
		session.setAttribute("age", memberage);
        
        if(memberage>=18)
        {
        	SACCode=2;	
        }
        else
        {
        	SACCode=3;
        }
			}
		
		 main m= new main();
		String state_one_code =m.State(city);
		String city_code =m.town(city);
		addressSubElem.setStateCode(state_one_code);
		System.out.println("StateCode :"+state_one_code );
		addressSubElem.setTownCode(city_code);
		System.out.println( "towncode"+city_code );
		Address Addr = new Address();
		Addr.setAddress(addressSubElem);

		Partner part = new Partner();
		part.setPartnerCode("13961");
		part.setPassword("master123");
		part.setUserName("policymaster");
		Map<String,String> hm=m.religareMembers(members);
		
		boolean bool=members.contains("spouse");
        boolean bool1=members.contains("son");
        boolean bool2=members.contains("son1");
        boolean bool3=members.contains("son2");
        boolean bool4=members.contains("daughter");
        boolean bool5=members.contains("daughter1");
        boolean bool6=members.contains("daughter2");
        boolean bool7=members.contains("father");
        boolean bool8=members.contains("mother");
        boolean bool9=members.contains("father-in-law");
        boolean bool10=members.contains("mother-in-law");
        boolean bool11=members.contains("grandfather");
        boolean bool12=members.contains("grandmother");

		ProductSubElement productSubElem = new ProductSubElement();
		//productSubElem.setClientcode("PolicyHolder");
		
		productSubElem.setProductCode("11121");
		productSubElem.setProductGroup("1");
		productSubElem.setProductLine("9");
		productSubElem.setProductType("1");
		productSubElem.setProductVersion("1");
		productSubElem.setSACCode("1");
		productSubElem.setSumAssured(sumassured);
		
		ProductSubElement productSubElem1 = new ProductSubElement();
		ProductSubElement productSubElem2 = new ProductSubElement();
		
		productSubElem1.setProductCode("11121");
		productSubElem1.setProductGroup("1");
		productSubElem1.setProductLine("9");
		productSubElem1.setProductType("1");
		productSubElem1.setProductVersion("1");
		productSubElem1.setSACCode("2");
		productSubElem1.setSumAssured("0");
		
		

		if(bool1==true) {
			productSubElem2.setProductCode("11121");
			productSubElem2.setProductGroup("1");
			productSubElem2.setProductLine("9");
			productSubElem2.setProductType("1");
			productSubElem2.setProductVersion("1");
			productSubElem2.setSACCode("3");
			productSubElem2.setSumAssured("0");
		}
		
		
		Product prod = new Product();
		prod.setProduct(productSubElem1);
		
		Product prod1 = new Product();
		prod1.setProduct(productSubElem);
		
		Product prod2 = new Product();
		prod2.setProduct(productSubElem2);

		SimpleDateFormat format = new SimpleDateFormat("dd/yy/yyyy");
		java.util.Date utilDate;
		Calendar dob = Calendar.getInstance();
		Calendar today = Calendar.getInstance();

		try {
			utilDate = format.parse(date);
			dob.setTime(utilDate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		

Dependants dependants = new Dependants();

List<ClientSubElement> clientList = new ArrayList<>();
ClientSubElement clientSub= new ClientSubElement();
if(bool==true) {
	clientSub.setAge(hm.get("age_spouse"));
	clientSub.setClientCode("member 1");
	clientSub.setProduct(prod);
}
	ClientSubElement clientSub1= new ClientSubElement();
	if(bool1==true) {
		clientSub1.setAge(hm.get("age_son"));
		clientSub1.setClientCode("member 2");
		clientSub1.setProduct(prod2);
	
	}
	ClientSubElement clientSub2= new ClientSubElement();
	if(bool2==true) {
		clientSub2.setAge(hm.get("age_son"));
		clientSub2.setClientCode("member 3");
		clientSub2.setFirstName("");
		clientSub2.setLastName("");
		clientSub2.setTitleCode("");
		clientSub2.setProduct(prod2);
	}
	ClientSubElement clientSub3= new ClientSubElement();
	if(bool3==true) {
		clientSub3.setAge(hm.get("age_son"));
		clientSub3.setClientCode("member 4");
		clientSub3.setFirstName("");
		clientSub3.setLastName("");
		clientSub3.setTitleCode("");
		clientSub3.setProduct(prod2);
	}
	ClientSubElement clientSub4= new ClientSubElement();
	if(bool4==true) {
		clientSub4.setAge("3");
		clientSub4.setClientCode("member 5");
		clientSub4.setProduct(prod2);
	}
	ClientSubElement clientSub5= new ClientSubElement();
	if(bool5==true) {
		clientSub5.setAge("2");
		clientSub5.setClientCode("member 6");
		/*clientSub5.setFirstName("");
		clientSub5.setLastName("");
		clientSub5.setSalutation("");*/
		clientSub5.setProduct(prod2);
	}
	ClientSubElement clientSub6= new ClientSubElement();
	if(bool6==true) {
		clientSub6.setAge("4");
		clientSub6.setClientCode("member 7");
		/*clientSub6.setFirstName("");
		clientSub6.setLastName("");
		clientSub6.setSalutation("");*/
		clientSub6.setProduct(prod2);
	}
	ClientSubElement clientSub7= new ClientSubElement();
	if(bool7==true) {
		clientSub7.setAge("55");
		clientSub7.setClientCode("member 8");
		/*clientSub7.setFirstName("");
		clientSub7.setLastName("");
		clientSub7.setSalutation("");*/
		clientSub7.setProduct(prod);
	}
	ClientSubElement clientSub8= new ClientSubElement();
	if(bool8==true) {
		clientSub8.setAge("54");
		clientSub8.setClientCode("member 9");
		/*clientSub8.setFirstName("");
		clientSub8.setLastName("");
		clientSub8.setSalutation("");*/
		clientSub8.setProduct(prod);
	}
	ClientSubElement clientSub9= new ClientSubElement();
	if(bool9==true) {
		clientSub9.setAge("55");
		clientSub9.setClientCode("member 10");
		/*clientSub9.setFirstName("");
		clientSub9.setLastName("");
		clientSub9.setSalutation("");*/
		clientSub9.setProduct(prod);
	}
	ClientSubElement clientSub10= new ClientSubElement();
	if(bool10==true) {
		clientSub10.setAge("54");
		clientSub10.setClientCode("member 11");
		/*clientSub10.setFirstName("");
		clientSub10.setLastName("");
		clientSub10.setSalutation("");*/
		clientSub10.setProduct(prod);
	}
	ClientSubElement clientSub11= new ClientSubElement();
	if(bool11==true) {
		clientSub11.setAge("75");
		clientSub11.setClientCode("member 12");
		/*clientSub11.setFirstName("");
		clientSub11.setLastName("");
		clientSub11.setSalutation("")*/;
		clientSub11.setProduct(prod);
	}
	ClientSubElement clientSub12= new ClientSubElement();
	if(bool12==true) {
		clientSub12.setAge("76");
		clientSub12.setClientCode("member 13");
		/*clientSub12.setFirstName("");
		clientSub12.setLastName("");
		clientSub12.setSalutation("");*/
		clientSub12.setProduct(prod);
	}
	
	if(bool==true) {
	clientList.add(clientSub);
	}
	if(bool1==true) {
	clientList.add(clientSub1);
	}
	if(bool2==true) {
	clientList.add(clientSub2);
	}
	if(bool3==true) {
		clientList.add(clientSub3);
		}
	if(bool4==true) {
		clientList.add(clientSub4);
		}
	if(bool5==true) {
		clientList.add(clientSub5);
		}
	if(bool6==true) {
		clientList.add(clientSub6);
		}
	if(bool7==true) {
		clientList.add(clientSub7);
		}
	if(bool8==true) {
		clientList.add(clientSub8);
		}
	if(bool9==true) {
		clientList.add(clientSub9);
		}
	if(bool10==true) {
		clientList.add(clientSub10);
		}
	if(bool11==true) {
		clientList.add(clientSub11);
		}
	if(bool12==true) {
		clientList.add(clientSub12);
		}
	dependants.setClientSubElement(clientList);
		

Client cli = new Client();
cli.setAge(hm.get("age_self"));
cli.setClientCode("PolicyHolder");
//cli.setOccuptionCode("303601");
cli.setAddress(Addr);
cli.setProduct(prod1);
if(bool==true || bool7==true) {
cli.setDependants(dependants);
}
		
	

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
			System.out.println("floater premium request :"+output);
			System.out.println("\n");
			// System.out.println(response1);
			System.out.println("floater premium response :"+res_xml);

				String xpath_TotalPremium = "//TotalPremium/text()";
				String xpath_BasePremiumAmount = "//BasePremiumAmount[1]//text()";
				String xpath_GrossPremiumAmount = "//GrossPremiumAmount[1]//text()";
				String xpath_TaxAmount = "//TaxAmount[1]//text()";
    			String xpath_DiscountAmount = "//DiscountAmount[1]//text()";
				
				Document doc = parseXmlFile(res_xml);
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
					
					String FloaterTotalPremium = TotalPremiumNodes.item(i).getNodeValue();
					System.out.println("FloaterTotalPremium");
					session.setAttribute("FloaterTotalPremium", FloaterTotalPremium);

					String s1[] = FloaterTotalPremium.split("\\.");
					String tp = s1[0];

					Integer a = Integer.parseInt(tp);
					Integer b1 = a / 12;
					String b3 = String.valueOf(b1);
					System.out.println(b3);
					session.setAttribute("b3", b3);
					// String b2=(String) session.getAttribute("b2");
					pw.close();
					// response.sendRedirect("healthquotes");

				}
				for (int i = 0; i < BasePremiumNodes.getLength(); i++) {
	    			System.out.println("BasePremiumfloater: " + BasePremiumNodes.item(i).getNodeValue());
	    			BasePremiumfloater = BasePremiumNodes.item(i).getNodeValue();
	    			System.out.println("BasePremiumfloater");
	    			 session.setAttribute("BasePremiumfloater", BasePremiumfloater);
	    		}
					
					for (int i = 0; i < GrossPremiumNodes.getLength(); i++) {
	    			
	    			System.out.println("GrossPremiumfloater: " + GrossPremiumNodes.item(i).getNodeValue());
	    			GrossPremiumfloater = GrossPremiumNodes.item(i).getNodeValue();
		    			System.out.println("GrossPremiumfloater");
		    			 session.setAttribute("GrossPremiumfloater", GrossPremiumfloater);
	    		}
					for (int i = 0; i < DiscountNodes .getLength(); i++) {
	        			
	        			System.out.println("DiscountAmount: " + DiscountNodes .item(i).getNodeValue());
	        			 DiscountAmountfloater = DiscountNodes.item(i).getNodeValue();
		    			System.out.println("DiscountAmountfloater");
		    			 session.setAttribute("DiscountAmountfloater", DiscountAmountfloater);
	        		}
	    			for (int i = 0; i < TaxNodes .getLength(); i++) {
	        			
	        			System.out.println("TaxAmountfloater: " + TaxNodes.item(i).getNodeValue());
	        		TaxAmountfloater = TaxNodes.item(i).getNodeValue();
		    			System.out.println("TaxAmountfloater");
		    			 session.setAttribute("TaxAmountfloater", TaxAmountfloater);
	        			
	        		}
			} catch (Exception e) {
				e.printStackTrace();
			}

		
		
		
	}
	public static void apollo_FloaterProposal(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		String members=(String) session.getAttribute("members");
		apollo_proposal_pojo ap = (apollo_proposal_pojo) session.getAttribute("ap");
		apollo_proposal_pojo app = (apollo_proposal_pojo) session.getAttribute("app");
		
		String sumassured=ap.getSumassured();
		String fullname = app.getFullname();
		String spousefullname=app.getSpouse_fullname();
		String sonfullname=app.getSon_fullname();
		String son1fullname=app.getSon1_fullname();
		String son2fullname=app.getSon2_fullname();
		String daughterfullname=app.getDaughter_fullname();
		String daughter1fullname=app.getDaughter1_fullname();
		String daughter2fullname=app.getDaughter2_fullname();
		String salutation = app.getSalutation();
		String spousesalutation=app.getSpouse_salutation();
		String sonsalutation=app.getSon_salutation();
		String son1salutation=app.getSon1_salutation();
		String son2salutation=app.getSon2_salutation();
		String daughtersalutation=app.getDaughter_salutation();
		String daughter1salutation=app.getDaughter1_salutation();
		String daughter2salutation=app.getDaughter2_salutation();
		String dob = app.getDob();
		String spousedob=app.getSpouse_dob();
		String sondob=app.getSon_dob();
		String son1dob=app.getSon1_dob();
		String son2dob=app.getSon2_dob();
		String daughterdob=app.getDaughter_dob();
		String daughter1dob=app.getDaughter_dob();
		String daughter2dob=app.getDaughter_dob();
		String occupation = app.getOccupation();
		String height = app.getHeight();
		String height1 = app.getHeight1();
		String weight = app.getWeight();
		String mobile = app.getMobile();
		String email = app.getEmail();
		String address = app.getAddress();
		String city = app.getCity();
		String state = app.getState();
		String pincode = app.getPincode();
		String nomname = app.getNomname();
		String nomaddress = app.getNomaddress();
		String nompincode = app.getNompincode();
		String nomsalutation=app.getNomsalutation();
		String nomrelation=app.getNomrelation();
		String nomdob=app.getNomdob();
		String s = fullname;
		String s1[] = s.split("\\s");
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		
		String s2= spousefullname;
		String s3[]=s2.split("\\s");
		System.out.println(s3[0]);
		System.out.println(s3[1]);
		
		// calculating age from dob



		Partner part = new Partner();
		part.setPartnerCode("13961");
		part.setPassword("master123");
		part.setUserName("policymaster");
	

		AddressSubElement addressSubElem = new AddressSubElement();
		
		 main m= new main();
			String state_one_code =m.State(city);
			String city_code =m.town(city);
		 // String occupation_code = m.occupation(occupation);
		  String relationship_code =m.nomineerelation(nomrelation);
		 
		 addressSubElem.setStateCode(state_one_code);
			//System.out.println("StateCode :"+state_code);
			addressSubElem.setTownCode(city_code);
			//System.out.println("townCode :"+city_code);
			
		

		 
		addressSubElem.setAddressLine1(address);
		addressSubElem.setAddressLine2("");
		addressSubElem.setAddressLine3("");
		addressSubElem.setCountryCode("IN");
		addressSubElem.setDistrict("");
		addressSubElem.setPinCode(pincode);
		addressSubElem.setStateCode(state_one_code);
		addressSubElem.setTownCode(city_code);


		Address Addr = new Address();
		Addr.setAddress(addressSubElem);
		Map<String,String> hm=m.religareMembers(members);
		
		boolean bool=members.contains("spouse");
        boolean bool1=members.contains("son");
        boolean bool2=members.contains("son1");
        boolean bool3=members.contains("son2");
        boolean bool4=members.contains("daughter");
        boolean bool5=members.contains("daughter1");
        boolean bool6=members.contains("daughter2");
        boolean bool7=members.contains("father");
        boolean bool8=members.contains("mother");
        boolean bool9=members.contains("father-in-law");
        boolean bool10=members.contains("mother-in-law");
        boolean bool11=members.contains("grandfather");
        boolean bool12=members.contains("grandmother");

		ProductSubElement productSubElem = new ProductSubElement();

		productSubElem.setBasePremiumAmount(BasePremiumfloater);
		productSubElem.setClientCode("PolicyHolder");
		 productSubElem.setDiscountAmount(DiscountAmountfloater);
		 productSubElem.setGrossPremiumAmount(GrossPremiumfloater);
		 //productSubElem.setLoadingAmount("11006");
		// productSubElem.setPaidBy("1");
		productSubElem.setProductCode("11121");
		productSubElem.setProductGroup("1");
		productSubElem.setProductLine("9");
		productSubElem.setProductType("1");
		productSubElem.setProductVersion("1");
		productSubElem.setSACCode("1");
		productSubElem.setSumAssured(sumassured);
		 productSubElem.setTaxAmount(TaxAmountfloater);
		 
		 ProductSubElement productSubElem1 = new ProductSubElement();
		
			
			 //productSubElem.setLoadingAmount("11006");
			// productSubElem.setPaidBy("1");
			productSubElem1.setBasePremiumAmount("0.00");
			productSubElem1.setProductCode("11121");
			 productSubElem1.setGrossPremiumAmount("0.00");
			 productSubElem1.setDiscountAmount("0.00");
			productSubElem1.setProductGroup("1");
			productSubElem1.setProductLine("9");
			productSubElem1.setProductType("1");
			productSubElem1.setProductVersion("1");
			productSubElem1.setSACCode("2");
			productSubElem1.setSumAssured("0");
			productSubElem1.setTaxAmount("0.00");
			
			 
			 ProductSubElement productSubElem2 = new ProductSubElement();
			 if(bool1==true) {
				 productSubElem2.setBasePremiumAmount("0.00");
				productSubElem2.setClientCode("Member 2 ");
				 productSubElem2.setGrossPremiumAmount("0.00");
				 productSubElem2.setDiscountAmount("0.00");
				productSubElem2.setProductCode("11121");
				productSubElem2.setProductGroup("1");
				productSubElem2.setProductLine("9");
				productSubElem2.setProductType("1");
				productSubElem2.setProductVersion("1");
				productSubElem2.setSACCode("3");
				productSubElem2.setSumAssured("0");
				productSubElem2.setTaxAmount("0.00");
			 }
				
		Product prod = new Product();
		prod.setProduct(productSubElem);
		
		Product prod1 = new Product();
		prod1.setProduct(productSubElem1);
		
		Product prod2 = new Product();
		prod2.setProduct(productSubElem2);
		

		LifeStyleHabits lifeStyle = new LifeStyleHabits();
		

		ContactSubElement contactSubElem = new ContactSubElement();
		contactSubElem.setNumber(mobile);
		contactSubElem.setType("7");

		ContactNumber contactNum = new ContactNumber();
		contactNum.setContactNumber(contactSubElem);

		ContactInformation contactInform = new ContactInformation();
		contactInform.setContactNumber(contactNum);
		contactInform.setEmail(email);
 
		 String salu[]= m.Titleapollo(salutation) ;
		  String saluta =salu[0];
		 String gencode = salu[1];
		 
		 String salu1[]=m.Titleapollo(nomsalutation);
		 String saluta1=salu1[0];
		 String nomgencode=salu1[1];
		System.out.println("salutation: "+saluta);
		System.out.println("gendercode: "+gencode);
		
		/*ClientSubElement clientSub2= new ClientSubElement();
		
		clientSub2.setAge(custage);
		clientSub2.setClientCode("Member 1");
		clientSub2.setBirthDate(nomdob);
		//clientSub2.setFirstName(n1[0]);
		//clientSub2.setGenderCode(nomgencode);
		//clientSub2.setLastName(n1[1]);
		//clientSub2.setMaritalStatusCode("1");
		clientSub2.setNationalityCode("IN");
		clientSub2.setOccuptionCode("false");
		clientSub2.setRelationshipCode(relationship_code);
		clientSub2.setProduct(prod1);*/


		Dependants dependants = new Dependants();
		List<ClientSubElement> clientList = new ArrayList<>();
		ClientSubElement clientSub= new ClientSubElement();
		if(bool==true) {
		
		clientSub.setAge(hm.get("age_spouse"));
		clientSub.setClientCode("member 1");
		clientSub.setBirthDate(spousedob);
		clientSub.setNationalityCode("IN");
		clientSub.setOccuptionCode("false");
		clientSub.setRelationshipCode(relationship_code);
		clientSub.setTitleCode("MRS");
		clientSub.setProduct(prod1);
		clientSub.setFirstName(s3[0]);
		clientSub.setLastName(s3[1]);
		}
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate today = LocalDate.now();
		
	ClientSubElement clientSub1= new ClientSubElement();
	if(bool1==true) {
		LocalDate localDate = LocalDate.parse(sondob, dateTimeFormatter);
		Period p = Period.between(localDate, today);
		String s4[] = sonfullname.split("\\s");
		clientSub1.setAge(String.format("%d", p.getYears()));
		clientSub1.setClientCode("member 2");
		clientSub1.setFirstName(s4[0]);
		clientSub1.setLastName(s4[1]);
		clientSub1.setBirthDate(sondob);
		clientSub1.setNationalityCode("IN");
		clientSub1.setOccuptionCode("false");
		clientSub1.setRelationshipCode("20");
		clientSub1.setTitleCode("MR");
		clientSub1.setMaritalStatusCode("2");
		clientSub1.setProduct(prod2);
		
	}
	
	
	ClientSubElement clientSub2= new ClientSubElement();
	if(bool2==true) {
		LocalDate localDate = LocalDate.parse(son1dob, dateTimeFormatter);
		Period p = Period.between(localDate, today);
		
		String s4[] = son1fullname.split("\\s");
		clientSub2.setAge(String.format("%d", p.getYears()));
		clientSub2.setClientCode("member 3");
		clientSub2.setFirstName(s4[0]);
		clientSub2.setLastName(s4[1]);
		clientSub2.setBirthDate(son1dob);
		clientSub2.setNationalityCode("IN");
		clientSub2.setOccuptionCode("false");
		clientSub2.setRelationshipCode("20");
		clientSub2.setTitleCode("MR");
		clientSub2.setMaritalStatusCode("2");
		clientSub2.setProduct(prod2);
	}
	ClientSubElement clientSub3= new ClientSubElement();
	if(bool3==true) {
		LocalDate localDate = LocalDate.parse(son2dob, dateTimeFormatter);
		Period p = Period.between(localDate, today);
		
		String s4[] = son2fullname.split("\\s");
		clientSub3.setAge(String.format("%d", p.getYears()));
		clientSub3.setClientCode("member 4");
		clientSub3.setFirstName(s4[0]);
		clientSub3.setLastName(s4[1]);
		clientSub3.setBirthDate(son2dob);
		clientSub3.setNationalityCode("IN");
		clientSub3.setOccuptionCode("false");
		clientSub3.setRelationshipCode("20");
		clientSub3.setTitleCode("MR");
		clientSub3.setMaritalStatusCode("2");
		clientSub3.setProduct(prod2);
	}
		ClientSubElement clientSub4= new ClientSubElement();
		if(bool4==true) {
			LocalDate localDate = LocalDate.parse(daughterdob, dateTimeFormatter);
			Period p = Period.between(localDate, today);
			String s4[] = daughterfullname.split("\\s");
			clientSub4.setAge(String.format("%d", p.getYears()));
			clientSub4.setClientCode("member 5");
			clientSub4.setFirstName(s4[0]);
			clientSub4.setLastName(s4[1]);
			clientSub4.setBirthDate(daughterdob);
			clientSub4.setNationalityCode("IN");
			clientSub4.setOccuptionCode("false");
			clientSub4.setRelationshipCode("17");
			clientSub4.setTitleCode("MISS");
			clientSub4.setMaritalStatusCode("2");
			clientSub4.setProduct(prod2);
			
		}
		ClientSubElement clientSub5= new ClientSubElement();
		if(bool5==true) {
			LocalDate localDate = LocalDate.parse(son1dob, dateTimeFormatter);
			Period p = Period.between(localDate, today);
			
			String s4[] = daughter1fullname.split("\\s");
			clientSub5.setAge(String.format("%d", p.getYears()));
			clientSub5.setClientCode("member 6");
			clientSub5.setFirstName(s4[0]);
			clientSub5.setLastName(s4[1]);
			clientSub5.setBirthDate(daughter1dob);
			clientSub5.setNationalityCode("IN");
			clientSub5.setOccuptionCode("false");
			clientSub5.setRelationshipCode("17");
			clientSub5.setTitleCode("MISS");
			clientSub5.setMaritalStatusCode("2");
			clientSub5.setProduct(prod2);
		}
		ClientSubElement clientSub6= new ClientSubElement();
		if(bool6==true) {
			LocalDate localDate = LocalDate.parse(son1dob, dateTimeFormatter);
			Period p = Period.between(localDate, today);
			
			String s4[] = daughter2fullname.split("\\s");
			clientSub6.setAge(String.format("%d", p.getYears()));
			clientSub6.setClientCode("member 7");
			clientSub6.setFirstName(s4[0]);
			clientSub6.setLastName(s4[1]);
			clientSub6.setBirthDate(daughter2dob);
			clientSub6.setNationalityCode("IN");
			clientSub6.setOccuptionCode("false");
			clientSub6.setRelationshipCode("17");
			clientSub6.setTitleCode("MISS");
			clientSub6.setMaritalStatusCode("2");
			clientSub6.setProduct(prod2);
		}
		ClientSubElement clientSub7= new ClientSubElement();
		if(bool7==true) {
			clientSub7.setAge("65");
			clientSub7.setClientCode("member 8");
			clientSub7.setNationalityCode("IN");
			clientSub7.setBirthDate("1934-05-12");
			clientSub7.setFirstName("jai");
			clientSub7.setLastName("prakesh");
			clientSub7.setOccuptionCode("false");
			clientSub7.setRelationshipCode("4");
			clientSub7.setTitleCode("MR");
			clientSub7.setMaritalStatusCode("1");
			clientSub7.setProduct(prod1);
		}
		ClientSubElement clientSub8= new ClientSubElement();
		if(bool8==true) {
			clientSub8.setAge("64");
			clientSub8.setClientCode("member 9");
			clientSub8.setNationalityCode("IN");
			clientSub8.setBirthDate("1934-05-12");
			clientSub8.setFirstName("shanti");
			clientSub8.setLastName("devi");
			clientSub8.setTitleCode("MRS");
			clientSub8.setOccuptionCode("false");
			clientSub8.setRelationshipCode("5");
			clientSub8.setMaritalStatusCode("1");
			clientSub8.setProduct(prod1);
		}
		ClientSubElement clientSub9= new ClientSubElement();
		if(bool9==true) {
			clientSub9.setAge("66");
			clientSub9.setClientCode("member 10");
			clientSub9.setNationalityCode("IN");
			clientSub9.setBirthDate("1934-05-12");
			clientSub9.setFirstName("ramavtar");
			clientSub9.setLastName("singh");
			clientSub9.setTitleCode("MR");
			clientSub9.setOccuptionCode("false");
			clientSub9.setRelationshipCode("18");
			clientSub9.setMaritalStatusCode("1");
			clientSub9.setProduct(prod1);
		}
		ClientSubElement clientSub10= new ClientSubElement();
		if(bool10==true) {
			clientSub10.setAge("63");
			clientSub10.setClientCode("member 11");
			clientSub10.setNationalityCode("IN");
			clientSub10.setBirthDate("1934-05-12");
			clientSub10.setFirstName("surbhi");
			clientSub10.setLastName("joshi");
			clientSub10.setTitleCode("MRS");
			clientSub10.setOccuptionCode("false");
			clientSub10.setRelationshipCode("19");
			clientSub10.setMaritalStatusCode("1");
			clientSub10.setProduct(prod1);
		}
		ClientSubElement clientSub11= new ClientSubElement();
		if(bool11==true) {
			clientSub11.setAge("75");
			clientSub11.setClientCode("member 12");
			clientSub11.setFirstName("satyaraj");
			clientSub11.setLastName("singh");
			clientSub11.setTitleCode("MR");
			clientSub11.setProduct(prod1);
		}
		ClientSubElement clientSub12= new ClientSubElement();
		if(bool12==true) {
			clientSub12.setAge("76");
			clientSub12.setClientCode("member 13");
			clientSub12.setFirstName("rajeshwari");
			clientSub12.setLastName("singh");
			clientSub12.setTitleCode("MRS");
			clientSub12.setProduct(prod);
		}
		
		if(bool==true) {
			clientList.add(clientSub);
			}
			if(bool1==true) {
			clientList.add(clientSub1);
			}
			if(bool2==true) {
			clientList.add(clientSub2);
			}
			if(bool3==true) {
				clientList.add(clientSub3);
				}
			if(bool4==true) {
				clientList.add(clientSub4);
				}
			if(bool5==true) {
				clientList.add(clientSub5);
				}
			if(bool6==true) {
				clientList.add(clientSub6);
				}
			if(bool7==true) {
				clientList.add(clientSub7);
				}
			if(bool8==true) {
				clientList.add(clientSub8);
				}
			if(bool9==true) {
				clientList.add(clientSub9);
				}
			if(bool10==true) {
				clientList.add(clientSub10);
				}
			if(bool11==true) {
				clientList.add(clientSub11);
				}
			if(bool12==true) {
				clientList.add(clientSub12);
				}
			
		dependants.setClientSubElement(clientList);
		
		
		Client cli = new Client();
		if(bool==true || bool7==true) {
		cli.setDependants(dependants);
		}
		// cli.setAge("");
		cli.setClientCode("PolicyHolder");
		cli.setOccuptionCode(occupation);
		cli.setAddress(Addr);
		cli.setProduct(prod);
		//cli.setClientSubElement(clientSub);
		// cli.setAnnualIncome("999999");
		cli.setBirthDate(dob);
		cli.setContactInformation(contactInform);
		// cli.setFamilySize("1");
		cli.setFirstName(s1[0]);
		cli.setGenderCode(gencode);
		// cli.setGstinNumber("abc12345");
		//cli.setHeight("170");
		// cli.setIDProofNumber("IDNO388");
		// cli.setIDProofTypeCode("IDNO1");
		cli.setLastName(s1[1]);
		// cli.setLifeStyleHabits(lifeStyle);
		cli.setMaritalStatusCode("1");
		cli.setMiddleName("");
		cli.setNationalityCode("IN");
		cli.setRelationshipCode("1");
		cli.setTitleCode(saluta);
		//cli.setWeight("");
		
		
		Proposer prop = new Proposer();
		prop.setAddress(Addr);
		prop.setBirthDate(dob);
		prop.setContactInformation(contactInform);
		prop.setFirstName(s1[0]);
		prop.setGenderCode(gencode);
		// prop.setGstinNumber("abc12345");
		// prop.setIDProofNumber("IDNO388");
		// prop.setIDProofTypeCode("IDNO1");
		prop.setLastName(s1[1]);
		prop.setMaritalStatusCode("1");
		prop.setMiddleName("");
		prop.setNationalityCode("IN");
		prop.setRelationshipCode("1");

		NomineeAddress nomineeAddr = new NomineeAddress();
		nomineeAddr.setAddressLine1(address);
		nomineeAddr.setAddressLine2("");
		nomineeAddr.setAddressLine3("");
		nomineeAddr.setCountryCode("IN");
		nomineeAddr.setDistrict("");
		nomineeAddr.setPinCode(nompincode);
		nomineeAddr.setStateCode(state_one_code);
		nomineeAddr.setTownCode(city_code);

		Application appli = new Application();
		appli.setNamefor80D(fullname);
		appli.setNomineeAddress(nomineeAddr);
		appli.setNomineeName(nomname);
		appli.setNomineeTitleCode(saluta1);
		appli.setProposer(prop);
		appli.setRelationToNomineeCode(relationship_code);
		// appli.setRuralFlag("0");
		appli.setTPANameCode("FHPL");

		Prospect pros = new Prospect();
		pros.setBrandCode("ApolloMunich");
		//pros.setTotalPremiumAmount("8431.1");
		pros.setApplication(appli);
		pros.setClient(cli);

		ProposalCaptureServiceRequest proposalCapt = new ProposalCaptureServiceRequest();
		proposalCapt.setAction("Create");
		proposalCapt.setProspect(pros);
		proposalCapt.setPartner(part);

		ProposalCapture proposalC = new ProposalCapture();
		proposalC.setProposalCaptureServiceRequest(proposalCapt);

		Document document;
		try {
			document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

			document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			Marshaller marshaller = JAXBContext.newInstance(ProposalCapture.class).createMarshaller();
			marshaller.marshal(proposalC, document);

			SOAPMessage soapMessage = MessageFactory.newInstance().createMessage();

			soapMessage.getSOAPPart().getEnvelope().removeNamespaceDeclaration("SOAP-ENV");

			String myNamespace = "b2b";
			String myNamespaceURI = "http://www.apollomunichinsurance.com/B2BService";

			String myNamespace1 = "prop";
			String myNamespaceURI1 = "http://schemas.datacontract.org/2004/07/ProposalCaptureServiceLibrary";

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
			HttpPost post = new HttpPost("http://b2buat.apollomunichinsurance.com/ProposalCaptureHttpService.svc");
			String output = new String(outputStream.toByteArray());
			StringEntity userEntity = new StringEntity(output);
			post.setEntity(userEntity);
			post.setHeader("Accept-Encoding", "gzip,deflate");
			post.setHeader("Content-Type", "text/xml; charset=UTF-8");
			post.setHeader("SOAPAction","http://www.apollomunichinsurance.com/B2BService/IProposalCaptureService/ProposalCapture");
			HttpResponse response1 = client1.execute(post);
			String res_xml = EntityUtils.toString(response1.getEntity());
			InputSource is = new InputSource(new StringReader(res_xml));
			System.out.println( "floater proposal request "+output);
			System.out.println("\n");
			// System.out.println(response1);
			System.out.println("floater proposal response:"+ res_xml);
			try {

				String xpath_ProposalCaptureResult = "//ProposalCaptureResult/text()";
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = parseXmlFile(res_xml);
				XPathFactory xPathfactory = XPathFactory.newInstance();
				XPath xpath = xPathfactory.newXPath();
				XPathExpression xpath_expression_ProposalCaptureResult = xpath.compile(xpath_ProposalCaptureResult);
				NodeList ProposalCaptureResultNodes = (NodeList) xpath_expression_ProposalCaptureResult.evaluate(doc,
						XPathConstants.NODESET);
				for (int i = 0; i < ProposalCaptureResultNodes.getLength(); i++) {
					System.out.println("ProposalCaptureResult: " + ProposalCaptureResultNodes.item(i).getNodeValue());
					String Floater_Proposal_id = ProposalCaptureResultNodes.item(i).getNodeValue();
					session.setAttribute("Floater_Proposal_id", Floater_Proposal_id);
				}
					pw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (SOAPException e) {
			e.printStackTrace();

		} catch (ClientProtocolException e1) {
		
			e1.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();

		}catch (IOException e1) {
			e1.printStackTrace();
		} finally {

		}
		return;
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
			}catch (NullPointerException e) {
				throw new RuntimeException(e);
			}
			}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
