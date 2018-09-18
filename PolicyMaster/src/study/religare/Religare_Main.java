package study.religare;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.stream.StreamSource;

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


public class Religare_Main {
	
	public static void main(String[] args) throws ParserConfigurationException, JAXBException, SOAPException, IOException {
		partyAddressDOList partyAddressDOList=new partyAddressDOList();
		partyAddressDOList.setAddressLine1Lang1("USA");
		partyAddressDOList.setAddressLine2Lang1("USA");
		partyAddressDOList.setAddressTypeCd("PERMANENT");
		partyAddressDOList.setAreaCd("Jalgaon");
		partyAddressDOList.setCityCd("Jalgaon");
		partyAddressDOList.setPinCode("425001");
		partyAddressDOList.setStateCd("Maharashtra");
		
		partyAddressDOList partyAddressDOList1=new partyAddressDOList();
		partyAddressDOList1.setAddressLine1Lang1("USA");
		partyAddressDOList1.setAddressLine2Lang1("USA");
		partyAddressDOList1.setAddressTypeCd("COMMUNICATION");
		partyAddressDOList1.setAreaCd("Jalgaon");
		partyAddressDOList1.setCityCd("Jalgaon");
		partyAddressDOList1.setPinCode("425001");
		partyAddressDOList1.setStateCd("Maharashtra");
		
		partyContactDOList partyContactDOList=new partyContactDOList();
		partyContactDOList.setContactNum("9123456789");
		partyContactDOList.setContactTypeCd("MOBILE");
		partyContactDOList.setStdCode("");
		
		partyEmailDOList partyEmailDOList=new partyEmailDOList();
		partyEmailDOList.setEmailAddress("swap@gmail.com");
		partyEmailDOList.setEmailTypeCd("PERSONAL");
		
		partyIdentityDOList partyIdentityDOList=new partyIdentityDOList();
		partyIdentityDOList.setIdentityNum("");
		partyIdentityDOList.setIdentityTypeCd("");
		
		partyQuestionDOList partyQuestionDOList=new partyQuestionDOList();
		partyQuestionDOList.setQuestionCd("");
		partyQuestionDOList.setQuestionSetCd("");
		partyQuestionDOList.setResponse("");
		
		partyDOList partyDOList=new partyDOList();
		partyDOList.setBirthDt("17/08/1985");
		partyDOList.setFirstName("Oswald");
		partyDOList.setGenderCd("MALE");
		partyDOList.setGuid("0");
		partyDOList.setLastName("Patel");
		partyDOList.getpartyAddressDOList().add(partyAddressDOList);
		partyDOList.getpartyAddressDOList().add(partyAddressDOList1);
		//partyDOList.setPartyAddressDOList(partyAddressDOList);
		partyDOList.setPartyContactDOList(partyContactDOList);
		partyDOList.setPartyEmailDOList(partyEmailDOList);
		partyDOList.setPartyIdentityDOList(partyIdentityDOList);
		partyDOList.setPartyQuestionDOList(partyQuestionDOList);
		partyDOList.setRelationCd("SELF");
		partyDOList.setRoleCd("PROPOSER");
		partyDOList.setTitleCd("MR");
		
		partyAddressDOList partyAddressDOList2=new partyAddressDOList();
		partyAddressDOList2.setAddressLine1Lang1("fdg");
		partyAddressDOList2.setAddressLine2Lang1("mumbai");
		partyAddressDOList2.setAddressTypeCd("PERMANENT");
		partyAddressDOList2.setAreaCd("Mumbai");
		partyAddressDOList2.setCityCd("Mumbai");
		partyAddressDOList2.setPinCode("400010");
		partyAddressDOList2.setStateCd("Maharashtra");
		
		partyAddressDOList partyAddressDOList3=new partyAddressDOList();
		partyAddressDOList3.setAddressLine1Lang1("fdg");
		partyAddressDOList3.setAddressLine2Lang1("mumbai");
		partyAddressDOList3.setAddressTypeCd("COMMUNICATION");
		partyAddressDOList3.setAreaCd("Mumbai");
		partyAddressDOList3.setCityCd("Mumbai");
		partyAddressDOList3.setPinCode("400010");
		partyAddressDOList3.setStateCd("Maharashtra");
		
		partyContactDOList partyContactDOList1=new partyContactDOList();
		partyContactDOList1.setContactNum("9123456789");
		partyContactDOList1.setContactTypeCd("MOBILE");
		partyContactDOList1.setStdCode("");
		
		partyEmailDOList partyEmailDOList1=new partyEmailDOList();
		partyEmailDOList1.setEmailAddress("swap@gmail.com");
		partyEmailDOList1.setEmailTypeCd("PERSONAL");
		
		partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
		partyIdentityDOList1.setIdentityNum("");
		partyIdentityDOList1.setIdentityTypeCd("");
		
		partyQuestionDOList partyQuestionDOList1=new partyQuestionDOList();
		partyQuestionDOList1.setQuestionCd("H101");
		partyQuestionDOList1.setQuestionSetCd("HEDCFLEAFONE");
		partyQuestionDOList1.setResponse("NO");
		
		partyDOList partyDOList1=new partyDOList();
		partyDOList1.setBirthDt("29/12/1992");
		partyDOList1.setFirstName("Ganesh");
		partyDOList1.setGenderCd("MALE");
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
		partyDOList1.setTitleCd("MR");
		
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
		 
		 	/*JAXBContext jContext=JAXBContext.newInstance(createPolicyResponse.class);
			Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
			StreamSource streamSource = new StreamSource(new StringReader(res_xml));
			JAXBElement<createPolicyResponse> je = unmarshallerObj.unmarshal(streamSource,  createPolicyResponse.class);        
			createPolicyResponse createPolicyResponse = (createPolicyResponse)je.getValue();
			
			//System.out.println(createPolicyResponse.getReturn().getPolicy_data_iO().getError_lists().getErr_description());
			//System.out.println(createPolicyResponse.getReturn().getPolicy_data_iO().getPolicy().getBusinessTypeCd());
			System.out.println(createPolicyResponse.toString());*/
		 	
		 Document document1 = parseXmlFile(res_xml);
		 NodeList nodeLst = document1.getElementsByTagName("proposal-num");
		 NodeList nodeLst1=document1.getElementsByTagName("premium");
		 String proposal_num = nodeLst.item(0).getTextContent();
		 String premium = nodeLst1.item(0).getTextContent();
		 System.out.println(proposal_num);
		 System.out.println(premium);
		 
		/* error_lists error_lists=new error_lists();
		 error_lists.setErr_description(err_description1);
		 System.out.println(error_lists.getErr_description());*/
		 
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
