package study.religare;

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
 * Servlet implementation class Religare
 */
@WebServlet("/Religare")
public class Religare extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Religare() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  PrintWriter pw = response.getWriter();  
			
			 HttpSession session=request.getSession();		
			 
			 String cityCd=(String) session.getAttribute("city");
			 String firstName=(String) session.getAttribute("firstName");
			 String lastName=(String) session.getAttribute("lastName");
			 String emailAddress=(String) session.getAttribute("email");
			 String contactNum=(String) session.getAttribute("phoneno");
			 String titleCd=(String) session.getAttribute("titleCd");
			 String genderCd=(String) session.getAttribute("genderCd");
			 String birthDt=(String) session.getAttribute("birthDt");
			 
			 partyAddressDOList partyAddressDOList=new partyAddressDOList();
				partyAddressDOList.setAddressLine1Lang1(cityCd);
				partyAddressDOList.setAddressLine2Lang1("");
				partyAddressDOList.setAddressTypeCd("PERMANENT");
				partyAddressDOList.setAreaCd("");
				partyAddressDOList.setCityCd(cityCd);
				partyAddressDOList.setPinCode("110056");
				partyAddressDOList.setStateCd("");
				
				partyAddressDOList partyAddressDOList1=new partyAddressDOList();
				partyAddressDOList1.setAddressLine1Lang1(cityCd);
				partyAddressDOList1.setAddressLine2Lang1("");
				partyAddressDOList1.setAddressTypeCd("COMMUNICATION");
				partyAddressDOList1.setAreaCd("");
				partyAddressDOList1.setCityCd(cityCd);
				partyAddressDOList1.setPinCode("110056");
				partyAddressDOList1.setStateCd("");
				
				partyContactDOList partyContactDOList=new partyContactDOList();
				partyContactDOList.setContactNum(contactNum);
				partyContactDOList.setContactTypeCd("MOBILE");
				partyContactDOList.setStdCode("");
				
				partyEmailDOList partyEmailDOList=new partyEmailDOList();
				partyEmailDOList.setEmailAddress(emailAddress);
				partyEmailDOList.setEmailTypeCd("PERSONAL");
				
				partyIdentityDOList partyIdentityDOList=new partyIdentityDOList();
				partyIdentityDOList.setIdentityNum("");
				partyIdentityDOList.setIdentityTypeCd("");
				
				partyQuestionDOList partyQuestionDOList=new partyQuestionDOList();
				partyQuestionDOList.setQuestionCd("");
				partyQuestionDOList.setQuestionSetCd("");
				partyQuestionDOList.setResponse("");
				
				partyDOList partyDOList=new partyDOList();
				partyDOList.setBirthDt(birthDt);
				partyDOList.setFirstName(firstName);
				partyDOList.setGenderCd(genderCd);
				partyDOList.setGuid("0");
				partyDOList.setLastName(lastName);
				partyDOList.getpartyAddressDOList().add(partyAddressDOList);
				partyDOList.getpartyAddressDOList().add(partyAddressDOList1);
				//partyDOList.setPartyAddressDOList(partyAddressDOList);
				partyDOList.setPartyContactDOList(partyContactDOList);
				partyDOList.setPartyEmailDOList(partyEmailDOList);
				partyDOList.setPartyIdentityDOList(partyIdentityDOList);
				partyDOList.setPartyQuestionDOList(partyQuestionDOList);
				partyDOList.setRelationCd("SELF");
				partyDOList.setRoleCd("PROPOSER");
				partyDOList.setTitleCd(titleCd);
				
				partyAddressDOList partyAddressDOList2=new partyAddressDOList();
				partyAddressDOList2.setAddressLine1Lang1(cityCd);
				partyAddressDOList2.setAddressLine2Lang1("");
				partyAddressDOList2.setAddressTypeCd("PERMANENT");
				partyAddressDOList2.setAreaCd("");
				partyAddressDOList2.setCityCd(cityCd);
				partyAddressDOList2.setPinCode("110056");
				partyAddressDOList2.setStateCd("");
				
				partyAddressDOList partyAddressDOList3=new partyAddressDOList();
				partyAddressDOList3.setAddressLine1Lang1(cityCd);
				partyAddressDOList3.setAddressLine2Lang1("");
				partyAddressDOList3.setAddressTypeCd("COMMUNICATION");
				partyAddressDOList3.setAreaCd("");
				partyAddressDOList3.setCityCd(cityCd);
				partyAddressDOList3.setPinCode("110056");
				partyAddressDOList3.setStateCd("");
				
				partyContactDOList partyContactDOList1=new partyContactDOList();
				partyContactDOList1.setContactNum(contactNum);
				partyContactDOList1.setContactTypeCd("MOBILE");
				partyContactDOList1.setStdCode("");
				
				partyEmailDOList partyEmailDOList1=new partyEmailDOList();
				partyEmailDOList1.setEmailAddress(emailAddress);
				partyEmailDOList1.setEmailTypeCd("PERSONAL");
				
				partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
				partyIdentityDOList1.setIdentityNum("");
				partyIdentityDOList1.setIdentityTypeCd("");
				
				partyQuestionDOList partyQuestionDOList1=new partyQuestionDOList();
				partyQuestionDOList1.setQuestionCd("H101");
				partyQuestionDOList1.setQuestionSetCd("HEDCFLEAFONE");
				partyQuestionDOList1.setResponse("NO");
				
				partyDOList partyDOList1=new partyDOList();
				partyDOList1.setBirthDt(birthDt);
				partyDOList1.setFirstName(firstName);
				partyDOList1.setGenderCd(genderCd);
				partyDOList1.setGuid("1");
				partyDOList1.setLastName("cvgfg");
				partyDOList1.getpartyAddressDOList().add(partyAddressDOList2);
				partyDOList1.getpartyAddressDOList().add(partyAddressDOList3);
				//partyDOList.setPartyAddressDOList(partyAddressDOList);
				partyDOList1.setPartyContactDOList(partyContactDOList1);
				partyDOList1.setPartyEmailDOList(partyEmailDOList1);
				partyDOList1.setPartyIdentityDOList(partyIdentityDOList1);
				partyDOList1.setPartyQuestionDOList(partyQuestionDOList1);
				partyDOList1.setRelationCd("BOTH");
				partyDOList1.setRoleCd("PRIMARY");
				partyDOList1.setTitleCd(titleCd);
				
				policyAdditionalFieldsDOList policyAdditionalFieldsDOList=new policyAdditionalFieldsDOList();
				policyAdditionalFieldsDOList.setFieldAgree("YES");
				policyAdditionalFieldsDOList.setFieldAlerts("YES");
				policyAdditionalFieldsDOList.setFieldTc("YES");
				
				policy policy=new policy();
				policy.setAddOns("CAREWITHNCB");
				policy.setBusinessTypeCd("NEWBUSINESS");
				policy.setBaseProductId("12001002");
				policy.setBaseAgentId("20572800");
				policy.setCoverType("INDIVIDUAL");
				policy.getpartyDOList().add(partyDOList);
				policy.getpartyDOList().add(partyDOList1);
				policy.setPolicyAdditionalFieldsDOList(policyAdditionalFieldsDOList);
				policy.setPolicyNum("");
				policy.setProposalNum("");
				policy.setQuotationReferenceNum("");
				policy.setSumInsured("013");
				policy.setTerm("1");
				policy.setUwDecisionCd("");
				policy.setIsPremiumCalculation("YES");
				
				intIO intIO=new intIO();
				intIO.setPolicy(policy);
				
				createPolicy createPolicy=new createPolicy();
				createPolicy.setIntIO(intIO);
				
				try {
					Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
					Marshaller marshaller = JAXBContext.newInstance(createPolicy.class).createMarshaller();
					marshaller.marshal(createPolicy, document);
					
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
					 NodeList nodeLst = document1.getElementsByTagName("proposal-num");
					 NodeList nodeLst1=document1.getElementsByTagName("premium");
					 String rel_proposal_num = nodeLst.item(0).getTextContent();
					 String rel_premium = nodeLst1.item(0).getTextContent();
					 
					 String s1[]=rel_premium.split("\\.");
						String rp=s1[0];
					 
					Integer a=Integer.parseInt(rp);
					Integer b=a/12;
					 System.out.println("rel_proposal_num: "+rel_proposal_num);
					 System.out.println("rel_premium: "+rel_premium);
					 System.out.println(b);
					 
					 session.setAttribute("rel_proposal_num", rel_proposal_num);
					 session.setAttribute("rel_premium", rel_premium);
					 session.setAttribute("b", b);
					 
					 response.sendRedirect("healthquotes");			 
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
				}
				
				if(session!=null) {
					session.removeAttribute("city");
					session.removeAttribute("titleCd");
					session.removeAttribute("genderCd");
					session.removeAttribute("birthDt");
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
			}catch (NullPointerException e) {
				throw new RuntimeException(e);
			}
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
