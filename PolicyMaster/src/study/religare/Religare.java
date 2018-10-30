package study.religare;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.net.SocketException;
import java.util.Map;

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
import com.main;

import Apollo.apollo;
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
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  PrintWriter pw = response.getWriter();  
			
			 HttpSession session=request.getSession();		
			 apollo_proposal_pojo ap = (apollo_proposal_pojo) session.getAttribute("ap");
			 String members=(String) session.getAttribute("members");
			 String cityCd=ap.getCity();
			 String name=ap.getFullname();
			 String emailAddress=ap.getEmail();
			 String contactNum=ap.getMobile();
			 String birthDt=ap.getDob();
			 String title=ap.getSalutation();
			 
			 String firstName=null;
			 String lastName=null;
			 
			 
			 		if(name!=null) {
					String word[]=name.split("\\s");
			        
			        firstName=word[0];
			        lastName=word[1];
			        }
			 
			 	main m=new main();
		        String prefix[]=m.TitleReligare(title);
		        String titleCd=prefix[0];
		        String genderCd=prefix[1];
			 
			 System.out.println("cityCd: "+cityCd);
			 System.out.println("firstName: "+firstName);
			 System.out.println("lastName: "+lastName);
			 System.out.println("emailAddress: "+emailAddress);
			 System.out.println("contactNum: "+contactNum);
			 System.out.println("titleCd: "+titleCd);
			 System.out.println("genderCd: "+genderCd);
			 System.out.println("birthDt: "+birthDt);
			 
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
				
				partyDOList partyDOList1=new partyDOList();
				partyDOList1.setBirthDt(birthDt);
				partyDOList1.setFirstName(firstName);
				partyDOList1.setGenderCd(genderCd);
				partyDOList1.setGuid("0");
				partyDOList1.setLastName(lastName);
				partyDOList1.getpartyAddressDOList().add(partyAddressDOList);
				partyDOList1.getpartyAddressDOList().add(partyAddressDOList1);
				//partyDOList.setPartyAddressDOList(partyAddressDOList);
				partyDOList1.setPartyContactDOList(partyContactDOList);
				partyDOList1.setPartyEmailDOList(partyEmailDOList);
				partyDOList1.setPartyIdentityDOList(partyIdentityDOList);
				partyDOList1.setPartyQuestionDOList(partyQuestionDOList);
				partyDOList1.setRelationCd("SELF");
				partyDOList1.setRoleCd("PRIMARY");
				partyDOList1.setTitleCd(titleCd);
				
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

		        partyDOList partyDOList2=new partyDOList();
				partyDOList partyDOList3=new partyDOList();
				partyDOList partyDOList4=new partyDOList();
				partyDOList partyDOList5=new partyDOList();
				partyDOList partyDOList6=new partyDOList();
				partyDOList partyDOList7=new partyDOList();
				partyDOList partyDOList8=new partyDOList();
				partyDOList partyDOList9=new partyDOList();
				partyDOList partyDOList10=new partyDOList();
				partyDOList partyDOList11=new partyDOList();
				partyDOList partyDOList12=new partyDOList();
				partyDOList partyDOList13=new partyDOList();
				partyDOList partyDOList14=new partyDOList();
				if(bool==true) {
					
					partyAddressDOList partyAddressDOList2=new partyAddressDOList();
					partyAddressDOList2.setAddressLine1Lang1("");
					partyAddressDOList2.setAddressLine2Lang1("");
					partyAddressDOList2.setAddressTypeCd("");
					partyAddressDOList2.setAreaCd("");
					partyAddressDOList2.setCityCd("");
					partyAddressDOList2.setPinCode("");
					partyAddressDOList2.setStateCd("");
					
					partyContactDOList partyContactDOList1=new partyContactDOList();
					partyContactDOList1.setContactNum("");
					partyContactDOList1.setContactTypeCd("");
					partyContactDOList1.setStdCode("");
					
					partyEmailDOList partyEmailDOList1=new partyEmailDOList();
					partyEmailDOList1.setEmailAddress("");
					partyEmailDOList1.setEmailTypeCd("");
					
					partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
					partyIdentityDOList1.setIdentityNum("");
					partyIdentityDOList1.setIdentityTypeCd("");
					
					partyQuestionDOList partyQuestionDOList1=new partyQuestionDOList();
					partyQuestionDOList1.setQuestionCd("");
					partyQuestionDOList1.setQuestionSetCd("");
					partyQuestionDOList1.setResponse("");
					

					partyDOList2.setBirthDt(birthDt);
					partyDOList2.setFirstName("abc");
					partyDOList2.setGenderCd("FEMALE");
					partyDOList2.setGuid("42");
					partyDOList2.setLastName("def");
					partyDOList2.getpartyAddressDOList().add(partyAddressDOList2);
					partyDOList2.setPartyContactDOList(partyContactDOList1);
					partyDOList2.setPartyEmailDOList(partyEmailDOList1);
					partyDOList2.setPartyIdentityDOList(partyIdentityDOList1);
					partyDOList2.setPartyQuestionDOList(partyQuestionDOList1);
					partyDOList2.setRelationCd("SPSE");
					partyDOList2.setRoleCd("PRIMARY");
					partyDOList2.setTitleCd("MS");
				}
				
				if(bool1==true) {
			        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
					partyAddressDOList2.setAddressLine1Lang1("");
					partyAddressDOList2.setAddressLine2Lang1("");
					partyAddressDOList2.setAddressTypeCd("");
					partyAddressDOList2.setAreaCd("");
					partyAddressDOList2.setCityCd("");
					partyAddressDOList2.setPinCode("");
					partyAddressDOList2.setStateCd("");
					
					partyContactDOList partyContactDOList1=new partyContactDOList();
					partyContactDOList1.setContactNum("");
					partyContactDOList1.setContactTypeCd("");
					partyContactDOList1.setStdCode("");
					
					partyEmailDOList partyEmailDOList1=new partyEmailDOList();
					partyEmailDOList1.setEmailAddress("");
					partyEmailDOList1.setEmailTypeCd("");
					
					partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
					partyIdentityDOList1.setIdentityNum("");
					partyIdentityDOList1.setIdentityTypeCd("");
					
					partyQuestionDOList partyQuestionDOList1=new partyQuestionDOList();
					partyQuestionDOList1.setQuestionCd("");
					partyQuestionDOList1.setQuestionSetCd("");
					partyQuestionDOList1.setResponse("");
					

					partyDOList3.setBirthDt("2/1/2010");
					partyDOList3.setFirstName("abc");
					partyDOList3.setGenderCd("MALE");
					partyDOList3.setGuid("43");
					partyDOList3.setLastName("def");
					partyDOList3.getpartyAddressDOList().add(partyAddressDOList2);
					partyDOList3.setPartyContactDOList(partyContactDOList1);
					partyDOList3.setPartyEmailDOList(partyEmailDOList1);
					partyDOList3.setPartyIdentityDOList(partyIdentityDOList1);
					partyDOList3.setPartyQuestionDOList(partyQuestionDOList1);
					partyDOList3.setRelationCd("SONM");
					partyDOList3.setRoleCd("PRIMARY");
					partyDOList3.setTitleCd("MR");
				}
				
				if(bool2==true) {
			        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
					partyAddressDOList2.setAddressLine1Lang1("");
					partyAddressDOList2.setAddressLine2Lang1("");
					partyAddressDOList2.setAddressTypeCd("");
					partyAddressDOList2.setAreaCd("");
					partyAddressDOList2.setCityCd("");
					partyAddressDOList2.setPinCode("");
					partyAddressDOList2.setStateCd("");
					
					partyContactDOList partyContactDOList1=new partyContactDOList();
					partyContactDOList1.setContactNum("");
					partyContactDOList1.setContactTypeCd("");
					partyContactDOList1.setStdCode("");
					
					partyEmailDOList partyEmailDOList1=new partyEmailDOList();
					partyEmailDOList1.setEmailAddress("");
					partyEmailDOList1.setEmailTypeCd("");
					
					partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
					partyIdentityDOList1.setIdentityNum("");
					partyIdentityDOList1.setIdentityTypeCd("");
					
					partyQuestionDOList partyQuestionDOList1=new partyQuestionDOList();
					partyQuestionDOList1.setQuestionCd("");
					partyQuestionDOList1.setQuestionSetCd("");
					partyQuestionDOList1.setResponse("");
					

					partyDOList4.setBirthDt("2/1/2010");
					partyDOList4.setFirstName("abc");
					partyDOList4.setGenderCd("MALE");
					partyDOList4.setGuid("44");
					partyDOList4.setLastName("def");
					partyDOList4.getpartyAddressDOList().add(partyAddressDOList2);
					partyDOList4.setPartyContactDOList(partyContactDOList1);
					partyDOList4.setPartyEmailDOList(partyEmailDOList1);
					partyDOList4.setPartyIdentityDOList(partyIdentityDOList1);
					partyDOList4.setPartyQuestionDOList(partyQuestionDOList1);
					partyDOList4.setRelationCd("SONM");
					partyDOList4.setRoleCd("PRIMARY");
					partyDOList4.setTitleCd("MR");
					
				}
				if(bool3==true) {
			        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
					partyAddressDOList2.setAddressLine1Lang1("");
					partyAddressDOList2.setAddressLine2Lang1("");
					partyAddressDOList2.setAddressTypeCd("");
					partyAddressDOList2.setAreaCd("");
					partyAddressDOList2.setCityCd("");
					partyAddressDOList2.setPinCode("");
					partyAddressDOList2.setStateCd("");
					
					partyContactDOList partyContactDOList1=new partyContactDOList();
					partyContactDOList1.setContactNum("");
					partyContactDOList1.setContactTypeCd("");
					partyContactDOList1.setStdCode("");
					
					partyEmailDOList partyEmailDOList1=new partyEmailDOList();
					partyEmailDOList1.setEmailAddress("");
					partyEmailDOList1.setEmailTypeCd("");
					
					partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
					partyIdentityDOList1.setIdentityNum("");
					partyIdentityDOList1.setIdentityTypeCd("");
					
					partyQuestionDOList partyQuestionDOList1=new partyQuestionDOList();
					partyQuestionDOList1.setQuestionCd("");
					partyQuestionDOList1.setQuestionSetCd("");
					partyQuestionDOList1.setResponse("");
					

					partyDOList5.setBirthDt("2/1/2010");
					partyDOList5.setFirstName("abc");
					partyDOList5.setGenderCd("MALE");
					partyDOList5.setGuid("45");
					partyDOList5.setLastName("def");
					partyDOList5.getpartyAddressDOList().add(partyAddressDOList2);
					partyDOList5.setPartyContactDOList(partyContactDOList1);
					partyDOList5.setPartyEmailDOList(partyEmailDOList1);
					partyDOList5.setPartyIdentityDOList(partyIdentityDOList1);
					partyDOList5.setPartyQuestionDOList(partyQuestionDOList1);
					partyDOList5.setRelationCd("SONM");
					partyDOList5.setRoleCd("PRIMARY");
					partyDOList5.setTitleCd("MR");
					
				}
				
				if(bool4==true) {
				 	
			        
			        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
					partyAddressDOList2.setAddressLine1Lang1("");
					partyAddressDOList2.setAddressLine2Lang1("");
					partyAddressDOList2.setAddressTypeCd("");
					partyAddressDOList2.setAreaCd("");
					partyAddressDOList2.setCityCd("");
					partyAddressDOList2.setPinCode("");
					partyAddressDOList2.setStateCd("");
					
					partyContactDOList partyContactDOList1=new partyContactDOList();
					partyContactDOList1.setContactNum("");
					partyContactDOList1.setContactTypeCd("");
					partyContactDOList1.setStdCode("");
					
					partyEmailDOList partyEmailDOList1=new partyEmailDOList();
					partyEmailDOList1.setEmailAddress("");
					partyEmailDOList1.setEmailTypeCd("");
					
					partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
					partyIdentityDOList1.setIdentityNum("");
					partyIdentityDOList1.setIdentityTypeCd("");
					
					partyQuestionDOList partyQuestionDOList1=new partyQuestionDOList();
					partyQuestionDOList1.setQuestionCd("");
					partyQuestionDOList1.setQuestionSetCd("");
					partyQuestionDOList1.setResponse("");
					

					partyDOList6.setBirthDt("1/1/2008");
					partyDOList6.setFirstName("abc");
					partyDOList6.setGenderCd("FEMALE");
					partyDOList6.setGuid("46");
					partyDOList6.setLastName("def");
					partyDOList6.getpartyAddressDOList().add(partyAddressDOList2);
					partyDOList6.setPartyContactDOList(partyContactDOList1);
					partyDOList6.setPartyEmailDOList(partyEmailDOList1);
					partyDOList6.setPartyIdentityDOList(partyIdentityDOList1);
					partyDOList6.setPartyQuestionDOList(partyQuestionDOList1);
					partyDOList6.setRelationCd("UDTR");
					partyDOList6.setRoleCd("PRIMARY");
					partyDOList6.setTitleCd("MS");
					
				}
				if(bool5==true) {
			        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
					partyAddressDOList2.setAddressLine1Lang1("");
					partyAddressDOList2.setAddressLine2Lang1("");
					partyAddressDOList2.setAddressTypeCd("");
					partyAddressDOList2.setAreaCd("");
					partyAddressDOList2.setCityCd("");
					partyAddressDOList2.setPinCode("");
					partyAddressDOList2.setStateCd("");
					
					partyContactDOList partyContactDOList1=new partyContactDOList();
					partyContactDOList1.setContactNum("");
					partyContactDOList1.setContactTypeCd("");
					partyContactDOList1.setStdCode("");
					
					partyEmailDOList partyEmailDOList1=new partyEmailDOList();
					partyEmailDOList1.setEmailAddress("");
					partyEmailDOList1.setEmailTypeCd("");
					
					partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
					partyIdentityDOList1.setIdentityNum("");
					partyIdentityDOList1.setIdentityTypeCd("");
					
					partyQuestionDOList partyQuestionDOList1=new partyQuestionDOList();
					partyQuestionDOList1.setQuestionCd("");
					partyQuestionDOList1.setQuestionSetCd("");
					partyQuestionDOList1.setResponse("");
					

					partyDOList7.setBirthDt("1/1/2008");
					partyDOList7.setFirstName("abc");
					partyDOList7.setGenderCd("FEMALE");
					partyDOList7.setGuid("47");
					partyDOList7.setLastName("def");
					partyDOList7.getpartyAddressDOList().add(partyAddressDOList2);
					partyDOList7.setPartyContactDOList(partyContactDOList1);
					partyDOList7.setPartyEmailDOList(partyEmailDOList1);
					partyDOList7.setPartyIdentityDOList(partyIdentityDOList1);
					partyDOList7.setPartyQuestionDOList(partyQuestionDOList1);
					partyDOList7.setRelationCd("UDTR");
					partyDOList7.setRoleCd("PRIMARY");
					partyDOList7.setTitleCd("MS");
				}
				if(bool6==true) {
			        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
					partyAddressDOList2.setAddressLine1Lang1("");
					partyAddressDOList2.setAddressLine2Lang1("");
					partyAddressDOList2.setAddressTypeCd("");
					partyAddressDOList2.setAreaCd("");
					partyAddressDOList2.setCityCd("");
					partyAddressDOList2.setPinCode("");
					partyAddressDOList2.setStateCd("");
					
					partyContactDOList partyContactDOList1=new partyContactDOList();
					partyContactDOList1.setContactNum("");
					partyContactDOList1.setContactTypeCd("");
					partyContactDOList1.setStdCode("");
					
					partyEmailDOList partyEmailDOList1=new partyEmailDOList();
					partyEmailDOList1.setEmailAddress("");
					partyEmailDOList1.setEmailTypeCd("");
					
					partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
					partyIdentityDOList1.setIdentityNum("");
					partyIdentityDOList1.setIdentityTypeCd("");
					
					partyQuestionDOList partyQuestionDOList1=new partyQuestionDOList();
					partyQuestionDOList1.setQuestionCd("");
					partyQuestionDOList1.setQuestionSetCd("");
					partyQuestionDOList1.setResponse("");
					

					partyDOList8.setBirthDt("1/1/2008");
					partyDOList8.setFirstName("abc");
					partyDOList8.setGenderCd("FEMALE");
					partyDOList8.setGuid("48");
					partyDOList8.setLastName("def");
					partyDOList8.getpartyAddressDOList().add(partyAddressDOList2);
					partyDOList8.setPartyContactDOList(partyContactDOList1);
					partyDOList8.setPartyEmailDOList(partyEmailDOList1);
					partyDOList8.setPartyIdentityDOList(partyIdentityDOList1);
					partyDOList8.setPartyQuestionDOList(partyQuestionDOList1);
					partyDOList8.setRelationCd("UDTR");
					partyDOList8.setRoleCd("PRIMARY");
					partyDOList8.setTitleCd("MS");
				}
				if(bool7==true) {
			        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
							partyAddressDOList2.setAddressLine1Lang1("");
							partyAddressDOList2.setAddressLine2Lang1("");
							partyAddressDOList2.setAddressTypeCd("");
							partyAddressDOList2.setAreaCd("");
							partyAddressDOList2.setCityCd("");
							partyAddressDOList2.setPinCode("");
							partyAddressDOList2.setStateCd("");
							
							partyContactDOList partyContactDOList1=new partyContactDOList();
							partyContactDOList1.setContactNum("");
							partyContactDOList1.setContactTypeCd("");
							partyContactDOList1.setStdCode("");
							
							partyEmailDOList partyEmailDOList1=new partyEmailDOList();
							partyEmailDOList1.setEmailAddress("");
							partyEmailDOList1.setEmailTypeCd("");
							
							partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
							partyIdentityDOList1.setIdentityNum("");
							partyIdentityDOList1.setIdentityTypeCd("");
							
							partyQuestionDOList partyQuestionDOList1=new partyQuestionDOList();
							partyQuestionDOList1.setQuestionCd("");
							partyQuestionDOList1.setQuestionSetCd("");
							partyQuestionDOList1.setResponse("");
							

							partyDOList9.setBirthDt("1/1/1965");
							partyDOList9.setFirstName("abc");
							partyDOList9.setGenderCd("MALE");
							partyDOList9.setGuid("49");
							partyDOList9.setLastName("def");
							partyDOList9.getpartyAddressDOList().add(partyAddressDOList2);
							partyDOList9.setPartyContactDOList(partyContactDOList1);
							partyDOList9.setPartyEmailDOList(partyEmailDOList1);
							partyDOList9.setPartyIdentityDOList(partyIdentityDOList1);
							partyDOList9.setPartyQuestionDOList(partyQuestionDOList1);
							partyDOList9.setRelationCd("FATH");
							partyDOList9.setRoleCd("PRIMARY");
							partyDOList9.setTitleCd("MR");
				}
				if(bool8==true) {
			        		partyAddressDOList partyAddressDOList2=new partyAddressDOList();
			        		partyAddressDOList2.setAddressLine1Lang1("");
							partyAddressDOList2.setAddressLine2Lang1("");
							partyAddressDOList2.setAddressTypeCd("");
							partyAddressDOList2.setAreaCd("");
							partyAddressDOList2.setCityCd("");
							partyAddressDOList2.setPinCode("");
							partyAddressDOList2.setStateCd("");
							
							partyContactDOList partyContactDOList1=new partyContactDOList();
							partyContactDOList1.setContactNum("");
							partyContactDOList1.setContactTypeCd("");
							partyContactDOList1.setStdCode("");
							
							partyEmailDOList partyEmailDOList1=new partyEmailDOList();
							partyEmailDOList1.setEmailAddress("");
							partyEmailDOList1.setEmailTypeCd("");
							
							partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
							partyIdentityDOList1.setIdentityNum("");
							partyIdentityDOList1.setIdentityTypeCd("");
							
							partyQuestionDOList partyQuestionDOList1=new partyQuestionDOList();
							partyQuestionDOList1.setQuestionCd("");
							partyQuestionDOList1.setQuestionSetCd("");
							partyQuestionDOList1.setResponse("");
							

							partyDOList10.setBirthDt("1/1/1965");
							partyDOList10.setFirstName("abc");
							partyDOList10.setGenderCd("FEMALE");
							partyDOList10.setGuid("50");
							partyDOList10.setLastName("def");
							partyDOList10.getpartyAddressDOList().add(partyAddressDOList2);
							partyDOList10.setPartyContactDOList(partyContactDOList1);
							partyDOList10.setPartyEmailDOList(partyEmailDOList1);
							partyDOList10.setPartyIdentityDOList(partyIdentityDOList1);
							partyDOList10.setPartyQuestionDOList(partyQuestionDOList1);
							partyDOList10.setRelationCd("MOTH");
							partyDOList10.setRoleCd("PRIMARY");
							partyDOList10.setTitleCd("MS");
				}
				if(bool9==true) {
			        		partyAddressDOList partyAddressDOList2=new partyAddressDOList();
							partyAddressDOList2.setAddressLine1Lang1("");
							partyAddressDOList2.setAddressLine2Lang1("");
							partyAddressDOList2.setAddressTypeCd("");
							partyAddressDOList2.setAreaCd("");
							partyAddressDOList2.setCityCd("");
							partyAddressDOList2.setPinCode("");
							partyAddressDOList2.setStateCd("");
							
							partyContactDOList partyContactDOList1=new partyContactDOList();
							partyContactDOList1.setContactNum("");
							partyContactDOList1.setContactTypeCd("");
							partyContactDOList1.setStdCode("");
							
							partyEmailDOList partyEmailDOList1=new partyEmailDOList();
							partyEmailDOList1.setEmailAddress("");
							partyEmailDOList1.setEmailTypeCd("");
							
							partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
							partyIdentityDOList1.setIdentityNum("");
							partyIdentityDOList1.setIdentityTypeCd("");
							
							partyQuestionDOList partyQuestionDOList1=new partyQuestionDOList();
							partyQuestionDOList1.setQuestionCd("");
							partyQuestionDOList1.setQuestionSetCd("");
							partyQuestionDOList1.setResponse("");
							

							partyDOList11.setBirthDt("1/1/1965");
							partyDOList11.setFirstName("abc");
							partyDOList11.setGenderCd("MALE");
							partyDOList11.setGuid("51");
							partyDOList11.setLastName("def");
							partyDOList11.getpartyAddressDOList().add(partyAddressDOList2);
							partyDOList11.setPartyContactDOList(partyContactDOList1);
							partyDOList11.setPartyEmailDOList(partyEmailDOList1);
							partyDOList11.setPartyIdentityDOList(partyIdentityDOList1);
							partyDOList11.setPartyQuestionDOList(partyQuestionDOList1);
							partyDOList11.setRelationCd("FLAW");
							partyDOList11.setRoleCd("PRIMARY");
							partyDOList11.setTitleCd("MR");
				}
				if(bool10==true) {
			        		partyAddressDOList partyAddressDOList2=new partyAddressDOList();
							partyAddressDOList2.setAddressLine1Lang1("");
							partyAddressDOList2.setAddressLine2Lang1("");
							partyAddressDOList2.setAddressTypeCd("");
							partyAddressDOList2.setAreaCd("");
							partyAddressDOList2.setCityCd("");
							partyAddressDOList2.setPinCode("");
							partyAddressDOList2.setStateCd("");
							
							partyContactDOList partyContactDOList1=new partyContactDOList();
							partyContactDOList1.setContactNum("");
							partyContactDOList1.setContactTypeCd("");
							partyContactDOList1.setStdCode("");
							
							partyEmailDOList partyEmailDOList1=new partyEmailDOList();
							partyEmailDOList1.setEmailAddress("");
							partyEmailDOList1.setEmailTypeCd("");
							
							partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
							partyIdentityDOList1.setIdentityNum("");
							partyIdentityDOList1.setIdentityTypeCd("");
							
							partyQuestionDOList partyQuestionDOList1=new partyQuestionDOList();
							partyQuestionDOList1.setQuestionCd("");
							partyQuestionDOList1.setQuestionSetCd("");
							partyQuestionDOList1.setResponse("");
							

							partyDOList12.setBirthDt("1/1/1965");
							partyDOList12.setFirstName("abc");
							partyDOList12.setGenderCd("FEMALE");
							partyDOList12.setGuid("52");
							partyDOList12.setLastName("def");
							partyDOList12.getpartyAddressDOList().add(partyAddressDOList2);
							partyDOList12.setPartyContactDOList(partyContactDOList1);
							partyDOList12.setPartyEmailDOList(partyEmailDOList1);
							partyDOList12.setPartyIdentityDOList(partyIdentityDOList1);
							partyDOList12.setPartyQuestionDOList(partyQuestionDOList1);
							partyDOList12.setRelationCd("MLAW");
							partyDOList12.setRoleCd("PRIMARY");
							partyDOList12.setTitleCd("MS");
				}
				if(bool11==true) {
			        		partyAddressDOList partyAddressDOList2=new partyAddressDOList();
							partyAddressDOList2.setAddressLine1Lang1("");
							partyAddressDOList2.setAddressLine2Lang1("");
							partyAddressDOList2.setAddressTypeCd("");
							partyAddressDOList2.setAreaCd("");
							partyAddressDOList2.setCityCd("");
							partyAddressDOList2.setPinCode("");
							partyAddressDOList2.setStateCd("");
							
							partyContactDOList partyContactDOList1=new partyContactDOList();
							partyContactDOList1.setContactNum("");
							partyContactDOList1.setContactTypeCd("");
							partyContactDOList1.setStdCode("");
							
							partyEmailDOList partyEmailDOList1=new partyEmailDOList();
							partyEmailDOList1.setEmailAddress("");
							partyEmailDOList1.setEmailTypeCd("");
							
							partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
							partyIdentityDOList1.setIdentityNum("");
							partyIdentityDOList1.setIdentityTypeCd("");
							
							partyQuestionDOList partyQuestionDOList1=new partyQuestionDOList();
							partyQuestionDOList1.setQuestionCd("");
							partyQuestionDOList1.setQuestionSetCd("");
							partyQuestionDOList1.setResponse("");
							

							partyDOList13.setBirthDt("1/1/1960");
							partyDOList13.setFirstName("abc");
							partyDOList13.setGenderCd("MALE");
							partyDOList13.setGuid("53");
							partyDOList13.setLastName("def");
							partyDOList13.getpartyAddressDOList().add(partyAddressDOList2);
							partyDOList13.setPartyContactDOList(partyContactDOList1);
							partyDOList13.setPartyEmailDOList(partyEmailDOList1);
							partyDOList13.setPartyIdentityDOList(partyIdentityDOList1);
							partyDOList13.setPartyQuestionDOList(partyQuestionDOList1);
							partyDOList13.setRelationCd("GFAT");
							partyDOList13.setRoleCd("PRIMARY");
							partyDOList13.setTitleCd("MR");
				}
				if(bool12==true) {
			        		partyAddressDOList partyAddressDOList2=new partyAddressDOList();
							partyAddressDOList2.setAddressLine1Lang1("");
							partyAddressDOList2.setAddressLine2Lang1("");
							partyAddressDOList2.setAddressTypeCd("");
							partyAddressDOList2.setAreaCd("");
							partyAddressDOList2.setCityCd("");
							partyAddressDOList2.setPinCode("");
							partyAddressDOList2.setStateCd("");
							
							partyContactDOList partyContactDOList1=new partyContactDOList();
							partyContactDOList1.setContactNum("");
							partyContactDOList1.setContactTypeCd("");
							partyContactDOList1.setStdCode("");
							
							partyEmailDOList partyEmailDOList1=new partyEmailDOList();
							partyEmailDOList1.setEmailAddress("");
							partyEmailDOList1.setEmailTypeCd("");
							
							partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
							partyIdentityDOList1.setIdentityNum("");
							partyIdentityDOList1.setIdentityTypeCd("");
							
							partyQuestionDOList partyQuestionDOList1=new partyQuestionDOList();
							partyQuestionDOList1.setQuestionCd("");
							partyQuestionDOList1.setQuestionSetCd("");
							partyQuestionDOList1.setResponse("");
							

							partyDOList14.setBirthDt("1/1/1960");
							partyDOList14.setFirstName("abc");
							partyDOList14.setGenderCd("FEMALE");
							partyDOList14.setGuid("54");
							partyDOList14.setLastName("def");
							partyDOList14.getpartyAddressDOList().add(partyAddressDOList2);
							partyDOList14.setPartyContactDOList(partyContactDOList1);
							partyDOList14.setPartyEmailDOList(partyEmailDOList1);
							partyDOList14.setPartyIdentityDOList(partyIdentityDOList1);
							partyDOList14.setPartyQuestionDOList(partyQuestionDOList1);
							partyDOList14.setRelationCd("GMOT");
							partyDOList14.setRoleCd("PRIMARY");
							partyDOList14.setTitleCd("MRS");
				}
				
				policyAdditionalFieldsDOList policyAdditionalFieldsDOList=new policyAdditionalFieldsDOList();
				policyAdditionalFieldsDOList.setFieldAgree("YES");
				policyAdditionalFieldsDOList.setFieldAlerts("YES");
				policyAdditionalFieldsDOList.setFieldTc("YES");
				
				policy policy=new policy();
				policy.setAddOns("CAREWITHNCB");
				policy.setBusinessTypeCd("NEWBUSINESS");
				policy.setBaseProductId("12001002");
				policy.setBaseAgentId("20008325");
				policy.setCoverType(hm.get("cover_type"));
				policy.getpartyDOList().add(partyDOList);
				policy.getpartyDOList().add(partyDOList1);
				if(bool==true) {
					policy.getpartyDOList().add(partyDOList2);
				}
				if(bool1==true) {
					policy.getpartyDOList().add(partyDOList3);
				}
				if(bool2==true) {
					policy.getpartyDOList().add(partyDOList4);
				}
				if(bool3==true) {
					policy.getpartyDOList().add(partyDOList5);
				}
				if(bool4==true) {
					policy.getpartyDOList().add(partyDOList6);
				}
				if(bool5==true) {
					policy.getpartyDOList().add(partyDOList7);
				}
				if(bool6==true) {
					policy.getpartyDOList().add(partyDOList8);
				}
				if(bool7==true) {
					policy.getpartyDOList().add(partyDOList9);
				}
				if(bool8==true) {
					policy.getpartyDOList().add(partyDOList10);
				}
				if(bool9==true) {
					policy.getpartyDOList().add(partyDOList11);
				}
				if(bool10==true) {
					policy.getpartyDOList().add(partyDOList12);
				}
				if(bool11==true) {
					policy.getpartyDOList().add(partyDOList13);
				}
				if(bool12==true) {
					policy.getpartyDOList().add(partyDOList14);
				}
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
					 
				} catch (Exception e) {
					e.printStackTrace();
				} 
				 response.sendRedirect("healthquotes.jsp");
				Apollo.apollo.apollo_premium(request, response);
				Apollo.apollo.apollo_PremiumFloater(request, response);
				
				 pw.close();
			
	}
	
	public static void religare_premium(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		apollo_proposal_pojo app = (apollo_proposal_pojo) session.getAttribute("app");
		String members=(String) session.getAttribute("members");
		main m=new main();
		
		String salutation = app.getSalutation();
		String spousesalutation = app.getSpouse_salutation();
        String sonsalutation=app.getSon_salutation();
        String son1salutation=app.getSon1_salutation();
        String son2salutation=app.getSon2_salutation();
        String daughtersalutation=app.getDaughter_salutation();
        String daughter1salutation=app.getDaughter1_salutation();
        String daughter2salutation=app.getDaughter2_salutation();
		String fullname = app.getFullname();
		String spousefullname = app.getSpouse_fullname();
		String sonfullname=app.getSon_fullname();
		String son1fullname=app.getSon1_fullname();
		String son2fullname=app.getSon2_fullname();
	    String daughterfullname=app.getDaughter_fullname();
	    String daughter1fullname=app.getDaughter1_fullname();
	    String daughter2fullname=app.getDaughter2_fullname();
		String dob = app.getDob();
		String spousedob = app.getSpouse_dob();
        String sondob=app.getSon_dob();
        String son1dob=app.getSon1_dob();
        String son2dob=app.getSon2_dob();
        String daughterdob=app.getDaughter_dob();
        String daughter1dob=app.getDaughter1_dob();
        String daughter2dob=app.getDaughter2_dob();
		String mobile = app.getMobile();
		String email = app.getEmail();
		String address = app.getAddress();
		String city = app.getCity();
		String state = app.getState();
		String pincode = app.getPincode();
		String disease=app.getDisease();
		String nomsalutation=app.getNomsalutation();
		String nomname=app.getNomname();
		String nomrelation=app.getNomrelation();
		String nommobile=app.getNommobile();
		String nomdob=app.getNomdob();
		String nomemail=app.getNomemail();
		String nomaddress=app.getNomaddress();
		String nomcity=app.getNomcity();
		String nomstate=app.getNomstate();
		String nompincode=app.getNompincode();
		
		 System.out.println("salutation: "+salutation);
		 System.out.println("spousesalutation: "+spousesalutation);
		 System.out.println("sonsalutation: "+sonsalutation);
		 System.out.println("son1salutation: "+son1salutation);
		 System.out.println("son2salutation: "+son2salutation);
		 System.out.println("daughtersalutation: "+daughtersalutation);
		 System.out.println("daughter1salutation: "+daughter1salutation);
		 System.out.println("daughter2salutation: "+daughter2salutation);
		 System.out.println("fullname: "+fullname);
		 System.out.println("spousefullname: "+spousefullname);
		 System.out.println("sonfullname: "+sonfullname);
		 System.out.println("son1fullname: "+son1fullname);
		 System.out.println("son2fullname: "+son2fullname);
		 System.out.println("daughterfullname: "+daughterfullname);
		 System.out.println("daughter1fullname: "+daughter1fullname);
		 System.out.println("daughter2fullname: "+daughter2fullname);
		 System.out.println("dob: "+dob);
		 System.out.println("spousedob: "+spousedob);
		 System.out.println("sondob: "+sondob);
		 System.out.println("son1dob: "+son1dob);
		 System.out.println("son2dob: "+son2dob);
		 System.out.println("daughterdob: "+daughterdob);
		 System.out.println("daughter1dob: "+daughter1dob);
		 System.out.println("daughter2dob: "+daughter2dob);
		 System.out.println("mobile: "+mobile);
		 System.out.println("email: "+email);
		 System.out.println("address: "+address);
		 System.out.println("city: "+city);
		 System.out.println("state: "+state);
		 System.out.println("pincode: "+pincode);
		 System.out.println("nomsalutation: "+nomsalutation);
		 System.out.println("nomname: "+nomname);
		 System.out.println("nomrelation: "+nomrelation);
		 System.out.println("nommobile: "+nommobile);
		 System.out.println("nomdob: "+nomdob);
		 System.out.println("nomemail: "+nomemail);
		 System.out.println("nomaddress: "+nomaddress);
		 System.out.println("nomcity: "+nomcity);
		 System.out.println("nomstate: "+nomstate);
		 System.out.println("nompincode: "+nompincode);
		 
		 String firstname=null;
		 String lastname=null;
		 
		 	if(fullname!=null) {
		 	String word[]=fullname.split("\\s");
		 	firstname=word[0];
		 	lastname=word[1];
		 	}
		 	
		 	
		 	
		 	String prefix[]=m.TitleReligare(salutation);
	        String title=prefix[0];
	        String gender=prefix[1];
	        
	       
	        
	        if(disease==null) {
	        	disease="";
	        }
	        String [] diseases=m.religare_disease(disease);
	        String questionCd=diseases[0];
	        String questionSetCd=diseases[1];
	        String response_disease=diseases[2];
	        
	        System.out.println("questionCd: "+questionCd);
	        System.out.println("questionSetCd: "+questionSetCd);
	        System.out.println("response_disease: "+response_disease);
		 
		 partyAddressDOList partyAddressDOList=new partyAddressDOList();
		 	partyAddressDOList.setAddressLine1Lang1(address);
		 	partyAddressDOList.setAddressLine2Lang1("");
			partyAddressDOList.setAddressTypeCd("PERMANENT");
			partyAddressDOList.setAreaCd("");
			partyAddressDOList.setCityCd(city);
			partyAddressDOList.setPinCode(pincode);
			partyAddressDOList.setStateCd(state);
			
			partyAddressDOList partyAddressDOList1=new partyAddressDOList();
			partyAddressDOList1.setAddressLine1Lang1(address);
			partyAddressDOList1.setAddressLine2Lang1("");
			partyAddressDOList1.setAddressTypeCd("COMMUNICATION");
			partyAddressDOList1.setAreaCd("");
			partyAddressDOList1.setCityCd(city);
			partyAddressDOList1.setPinCode(pincode);
			partyAddressDOList1.setStateCd(state);
			
			partyContactDOList partyContactDOList=new partyContactDOList();
			partyContactDOList.setContactNum(mobile);
			partyContactDOList.setContactTypeCd("MOBILE");
			partyContactDOList.setStdCode("");
			
			partyEmailDOList partyEmailDOList=new partyEmailDOList();
			partyEmailDOList.setEmailAddress(email);
			partyEmailDOList.setEmailTypeCd("PERSONAL");
			
			partyIdentityDOList partyIdentityDOList=new partyIdentityDOList();
			partyIdentityDOList.setIdentityNum("");
			partyIdentityDOList.setIdentityTypeCd("");
			
			partyQuestionDOList partyQuestionDOList=new partyQuestionDOList();
			partyQuestionDOList.setQuestionCd("");
			partyQuestionDOList.setQuestionSetCd("");
			partyQuestionDOList.setResponse("");
			
			partyDOList partyDOList=new partyDOList();
			partyDOList.setBirthDt(dob);
			partyDOList.setFirstName(firstname);
			partyDOList.setGenderCd(gender);
			partyDOList.setGuid("0");
			partyDOList.setLastName(lastname);
			partyDOList.getpartyAddressDOList().add(partyAddressDOList);
			partyDOList.getpartyAddressDOList().add(partyAddressDOList1);
			partyDOList.setPartyContactDOList(partyContactDOList);
			partyDOList.setPartyEmailDOList(partyEmailDOList);
			partyDOList.setPartyIdentityDOList(partyIdentityDOList);
			partyDOList.setPartyQuestionDOList(partyQuestionDOList);
			partyDOList.setRelationCd("SELF");
			partyDOList.setRoleCd("PROPOSER");
			partyDOList.setTitleCd(title);
			
			partyQuestionDOList partyQuestionDOList1=new partyQuestionDOList();
			partyQuestionDOList1.setQuestionCd(questionCd);
			partyQuestionDOList1.setQuestionSetCd(questionSetCd);
			partyQuestionDOList1.setResponse(response_disease);
			
			partyDOList partyDOList1=new partyDOList();
			partyDOList1.setBirthDt(dob);
			partyDOList1.setFirstName(firstname);
			partyDOList1.setGenderCd(gender);
			partyDOList1.setGuid("0");
			partyDOList1.setLastName(lastname);
			partyDOList1.getpartyAddressDOList().add(partyAddressDOList);
			partyDOList1.getpartyAddressDOList().add(partyAddressDOList1);
			partyDOList1.setPartyContactDOList(partyContactDOList);
			partyDOList1.setPartyEmailDOList(partyEmailDOList);
			partyDOList1.setPartyIdentityDOList(partyIdentityDOList);
			partyDOList1.setPartyQuestionDOList(partyQuestionDOList1);
			partyDOList1.setRelationCd("SELF");
			partyDOList1.setRoleCd("PRIMARY");
			partyDOList1.setTitleCd(title);
			
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
	        
			partyDOList partyDOList2=new partyDOList();
			partyDOList partyDOList3=new partyDOList();
			partyDOList partyDOList4=new partyDOList();
			partyDOList partyDOList5=new partyDOList();
			partyDOList partyDOList6=new partyDOList();
			partyDOList partyDOList7=new partyDOList();
			partyDOList partyDOList8=new partyDOList();
			partyDOList partyDOList9=new partyDOList();
			partyDOList partyDOList10=new partyDOList();
			partyDOList partyDOList11=new partyDOList();
			partyDOList partyDOList12=new partyDOList();
			partyDOList partyDOList13=new partyDOList();
			partyDOList partyDOList14=new partyDOList();
			if(bool==true) {
				
				 	String word[]=spousefullname.split("\\s");
				 	String spousefirstname=word[0];
				 	String spouselastname=word[1];
				 	
				
				 	String prefix1[]=m.TitleReligare(spousesalutation);
			        String spousetitle=prefix1[0];
			        String spousegender=prefix1[1];
				
				partyAddressDOList partyAddressDOList2=new partyAddressDOList();
				partyAddressDOList2.setAddressLine1Lang1("");
				partyAddressDOList2.setAddressLine2Lang1("");
				partyAddressDOList2.setAddressTypeCd("");
				partyAddressDOList2.setAreaCd("");
				partyAddressDOList2.setCityCd("");
				partyAddressDOList2.setPinCode("");
				partyAddressDOList2.setStateCd("");
				
				partyContactDOList partyContactDOList1=new partyContactDOList();
				partyContactDOList1.setContactNum("");
				partyContactDOList1.setContactTypeCd("");
				partyContactDOList1.setStdCode("");
				
				partyEmailDOList partyEmailDOList1=new partyEmailDOList();
				partyEmailDOList1.setEmailAddress("");
				partyEmailDOList1.setEmailTypeCd("");
				
				partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
				partyIdentityDOList1.setIdentityNum("");
				partyIdentityDOList1.setIdentityTypeCd("");
				
				partyQuestionDOList partyQuestionDOList2=new partyQuestionDOList();
				partyQuestionDOList2.setQuestionCd("");
				partyQuestionDOList2.setQuestionSetCd("");
				partyQuestionDOList2.setResponse("");
				

				partyDOList2.setBirthDt(spousedob);
				partyDOList2.setFirstName(spousefirstname);
				partyDOList2.setGenderCd(spousegender);
				partyDOList2.setGuid("42");
				partyDOList2.setLastName(spouselastname);
				partyDOList2.getpartyAddressDOList().add(partyAddressDOList2);
				partyDOList2.setPartyContactDOList(partyContactDOList1);
				partyDOList2.setPartyEmailDOList(partyEmailDOList1);
				partyDOList2.setPartyIdentityDOList(partyIdentityDOList1);
				partyDOList2.setPartyQuestionDOList(partyQuestionDOList2);
				partyDOList2.setRelationCd("SPSE");
				partyDOList2.setRoleCd("PRIMARY");
				partyDOList2.setTitleCd(spousetitle);
			}
			
			if(bool1==true) {
				String word[]=sonfullname.split("\\s");
			 	String sonfirstname=word[0];
			 	String sonlastname=word[1];
			 	
			 	String prefix1[]=m.TitleReligare(sonsalutation);
		        String sontitle=prefix1[0];
		        String songender=prefix1[1];
		        
		        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
				partyAddressDOList2.setAddressLine1Lang1("");
				partyAddressDOList2.setAddressLine2Lang1("");
				partyAddressDOList2.setAddressTypeCd("");
				partyAddressDOList2.setAreaCd("");
				partyAddressDOList2.setCityCd("");
				partyAddressDOList2.setPinCode("");
				partyAddressDOList2.setStateCd("");
				
				partyContactDOList partyContactDOList1=new partyContactDOList();
				partyContactDOList1.setContactNum("");
				partyContactDOList1.setContactTypeCd("");
				partyContactDOList1.setStdCode("");
				
				partyEmailDOList partyEmailDOList1=new partyEmailDOList();
				partyEmailDOList1.setEmailAddress("");
				partyEmailDOList1.setEmailTypeCd("");
				
				partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
				partyIdentityDOList1.setIdentityNum("");
				partyIdentityDOList1.setIdentityTypeCd("");
				
				partyQuestionDOList partyQuestionDOList2=new partyQuestionDOList();
				partyQuestionDOList2.setQuestionCd("");
				partyQuestionDOList2.setQuestionSetCd("");
				partyQuestionDOList2.setResponse("");
				

				partyDOList3.setBirthDt(sondob);
				partyDOList3.setFirstName(sonfirstname);
				partyDOList3.setGenderCd(songender);
				partyDOList3.setGuid("43");
				partyDOList3.setLastName(sonlastname);
				partyDOList3.getpartyAddressDOList().add(partyAddressDOList2);
				partyDOList3.setPartyContactDOList(partyContactDOList1);
				partyDOList3.setPartyEmailDOList(partyEmailDOList1);
				partyDOList3.setPartyIdentityDOList(partyIdentityDOList1);
				partyDOList3.setPartyQuestionDOList(partyQuestionDOList2);
				partyDOList3.setRelationCd("SONM");
				partyDOList3.setRoleCd("PRIMARY");
				partyDOList3.setTitleCd(sontitle);
			}
			if(bool2==true) {
				String word[]=son1fullname.split("\\s");
			 	String son1firstname=word[0];
			 	String son1lastname=word[1];
			 	
			 	String prefix1[]=m.TitleReligare(son1salutation);
		        String son1title=prefix1[0];
		        String son1gender=prefix1[1];
		        
		        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
				partyAddressDOList2.setAddressLine1Lang1("");
				partyAddressDOList2.setAddressLine2Lang1("");
				partyAddressDOList2.setAddressTypeCd("");
				partyAddressDOList2.setAreaCd("");
				partyAddressDOList2.setCityCd("");
				partyAddressDOList2.setPinCode("");
				partyAddressDOList2.setStateCd("");
				
				partyContactDOList partyContactDOList1=new partyContactDOList();
				partyContactDOList1.setContactNum("");
				partyContactDOList1.setContactTypeCd("");
				partyContactDOList1.setStdCode("");
				
				partyEmailDOList partyEmailDOList1=new partyEmailDOList();
				partyEmailDOList1.setEmailAddress("");
				partyEmailDOList1.setEmailTypeCd("");
				
				partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
				partyIdentityDOList1.setIdentityNum("");
				partyIdentityDOList1.setIdentityTypeCd("");
				
				partyQuestionDOList partyQuestionDOList2=new partyQuestionDOList();
				partyQuestionDOList2.setQuestionCd("");
				partyQuestionDOList2.setQuestionSetCd("");
				partyQuestionDOList2.setResponse("");
				

				partyDOList4.setBirthDt(son1dob);
				partyDOList4.setFirstName(son1firstname);
				partyDOList4.setGenderCd(son1gender);
				partyDOList4.setGuid("44");
				partyDOList4.setLastName(son1lastname);
				partyDOList4.getpartyAddressDOList().add(partyAddressDOList2);
				partyDOList4.setPartyContactDOList(partyContactDOList1);
				partyDOList4.setPartyEmailDOList(partyEmailDOList1);
				partyDOList4.setPartyIdentityDOList(partyIdentityDOList1);
				partyDOList4.setPartyQuestionDOList(partyQuestionDOList2);
				partyDOList4.setRelationCd("SONM");
				partyDOList4.setRoleCd("PRIMARY");
				partyDOList4.setTitleCd(son1title);

			}
			if(bool3==true) {
				String word[]=son2fullname.split("\\s");
			 	String son2firstname=word[0];
			 	String son2lastname=word[1];
			 	
			 	String prefix1[]=m.TitleReligare(son2salutation);
		        String son2title=prefix1[0];
		        String son2gender=prefix1[1];
		        
		        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
				partyAddressDOList2.setAddressLine1Lang1("");
				partyAddressDOList2.setAddressLine2Lang1("");
				partyAddressDOList2.setAddressTypeCd("");
				partyAddressDOList2.setAreaCd("");
				partyAddressDOList2.setCityCd("");
				partyAddressDOList2.setPinCode("");
				partyAddressDOList2.setStateCd("");
				
				partyContactDOList partyContactDOList1=new partyContactDOList();
				partyContactDOList1.setContactNum("");
				partyContactDOList1.setContactTypeCd("");
				partyContactDOList1.setStdCode("");
				
				partyEmailDOList partyEmailDOList1=new partyEmailDOList();
				partyEmailDOList1.setEmailAddress("");
				partyEmailDOList1.setEmailTypeCd("");
				
				partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
				partyIdentityDOList1.setIdentityNum("");
				partyIdentityDOList1.setIdentityTypeCd("");
				
				partyQuestionDOList partyQuestionDOList2=new partyQuestionDOList();
				partyQuestionDOList2.setQuestionCd("");
				partyQuestionDOList2.setQuestionSetCd("");
				partyQuestionDOList2.setResponse("");
				

				partyDOList5.setBirthDt(son2dob);
				partyDOList5.setFirstName(son2firstname);
				partyDOList5.setGenderCd(son2gender);
				partyDOList5.setGuid("45");
				partyDOList5.setLastName(son2lastname);
				partyDOList5.getpartyAddressDOList().add(partyAddressDOList2);
				partyDOList5.setPartyContactDOList(partyContactDOList1);
				partyDOList5.setPartyEmailDOList(partyEmailDOList1);
				partyDOList5.setPartyIdentityDOList(partyIdentityDOList1);
				partyDOList5.setPartyQuestionDOList(partyQuestionDOList2);
				partyDOList5.setRelationCd("SONM");
				partyDOList5.setRoleCd("PRIMARY");
				partyDOList5.setTitleCd(son2title);
			}
			if(bool4==true) {
				String word[]=daughterfullname.split("\\s");
			 	String daughterfirstname=word[0];
			 	String daughterlastname=word[1];
			 	
			 	String prefix1[]=m.TitleReligare(daughtersalutation);
		        String daughtertitle=prefix1[0];
		        String daughtergender=prefix1[1];
		        
		        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
				partyAddressDOList2.setAddressLine1Lang1("");
				partyAddressDOList2.setAddressLine2Lang1("");
				partyAddressDOList2.setAddressTypeCd("");
				partyAddressDOList2.setAreaCd("");
				partyAddressDOList2.setCityCd("");
				partyAddressDOList2.setPinCode("");
				partyAddressDOList2.setStateCd("");
				
				partyContactDOList partyContactDOList1=new partyContactDOList();
				partyContactDOList1.setContactNum("");
				partyContactDOList1.setContactTypeCd("");
				partyContactDOList1.setStdCode("");
				
				partyEmailDOList partyEmailDOList1=new partyEmailDOList();
				partyEmailDOList1.setEmailAddress("");
				partyEmailDOList1.setEmailTypeCd("");
				
				partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
				partyIdentityDOList1.setIdentityNum("");
				partyIdentityDOList1.setIdentityTypeCd("");
				
				partyQuestionDOList partyQuestionDOList2=new partyQuestionDOList();
				partyQuestionDOList2.setQuestionCd("");
				partyQuestionDOList2.setQuestionSetCd("");
				partyQuestionDOList2.setResponse("");
				

				partyDOList6.setBirthDt(daughterdob);
				partyDOList6.setFirstName(daughterfirstname);
				partyDOList6.setGenderCd(daughtergender);
				partyDOList6.setGuid("46");
				partyDOList6.setLastName(daughterlastname);
				partyDOList6.getpartyAddressDOList().add(partyAddressDOList2);
				partyDOList6.setPartyContactDOList(partyContactDOList1);
				partyDOList6.setPartyEmailDOList(partyEmailDOList1);
				partyDOList6.setPartyIdentityDOList(partyIdentityDOList1);
				partyDOList6.setPartyQuestionDOList(partyQuestionDOList2);
				partyDOList6.setRelationCd("UDTR");
				partyDOList6.setRoleCd("PRIMARY");
				partyDOList6.setTitleCd(daughtertitle);
				
			}
			if(bool5==true) {
				String word[]=daughter1fullname.split("\\s");
			 	String daughter1firstname=word[0];
			 	String daughter1lastname=word[1];
			 	
			 	String prefix1[]=m.TitleReligare(daughter1salutation);
		        String daughter1title=prefix1[0];
		        String daughter1gender=prefix1[1];
		        
		        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
				partyAddressDOList2.setAddressLine1Lang1("");
				partyAddressDOList2.setAddressLine2Lang1("");
				partyAddressDOList2.setAddressTypeCd("");
				partyAddressDOList2.setAreaCd("");
				partyAddressDOList2.setCityCd("");
				partyAddressDOList2.setPinCode("");
				partyAddressDOList2.setStateCd("");
				
				partyContactDOList partyContactDOList1=new partyContactDOList();
				partyContactDOList1.setContactNum("");
				partyContactDOList1.setContactTypeCd("");
				partyContactDOList1.setStdCode("");
				
				partyEmailDOList partyEmailDOList1=new partyEmailDOList();
				partyEmailDOList1.setEmailAddress("");
				partyEmailDOList1.setEmailTypeCd("");
				
				partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
				partyIdentityDOList1.setIdentityNum("");
				partyIdentityDOList1.setIdentityTypeCd("");
				
				partyQuestionDOList partyQuestionDOList2=new partyQuestionDOList();
				partyQuestionDOList2.setQuestionCd("");
				partyQuestionDOList2.setQuestionSetCd("");
				partyQuestionDOList2.setResponse("");
				

				partyDOList7.setBirthDt(daughter1dob);
				partyDOList7.setFirstName(daughter1firstname);
				partyDOList7.setGenderCd(daughter1gender);
				partyDOList7.setGuid("47");
				partyDOList7.setLastName(daughter1lastname);
				partyDOList7.getpartyAddressDOList().add(partyAddressDOList2);
				partyDOList7.setPartyContactDOList(partyContactDOList1);
				partyDOList7.setPartyEmailDOList(partyEmailDOList1);
				partyDOList7.setPartyIdentityDOList(partyIdentityDOList1);
				partyDOList7.setPartyQuestionDOList(partyQuestionDOList2);
				partyDOList7.setRelationCd("UDTR");
				partyDOList7.setRoleCd("PRIMARY");
				partyDOList7.setTitleCd(daughter1title);
			}
			if(bool6==true) {
				String word[]=daughter2fullname.split("\\s");
			 	String daughter2firstname=word[0];
			 	String daughter2lastname=word[1];
			 	
			 	String prefix1[]=m.TitleReligare(daughter2salutation);
		        String daughter2title=prefix1[0];
		        String daughter2gender=prefix1[1];
		        
		        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
				partyAddressDOList2.setAddressLine1Lang1("");
				partyAddressDOList2.setAddressLine2Lang1("");
				partyAddressDOList2.setAddressTypeCd("");
				partyAddressDOList2.setAreaCd("");
				partyAddressDOList2.setCityCd("");
				partyAddressDOList2.setPinCode("");
				partyAddressDOList2.setStateCd("");
				
				partyContactDOList partyContactDOList1=new partyContactDOList();
				partyContactDOList1.setContactNum("");
				partyContactDOList1.setContactTypeCd("");
				partyContactDOList1.setStdCode("");
				
				partyEmailDOList partyEmailDOList1=new partyEmailDOList();
				partyEmailDOList1.setEmailAddress("");
				partyEmailDOList1.setEmailTypeCd("");
				
				partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
				partyIdentityDOList1.setIdentityNum("");
				partyIdentityDOList1.setIdentityTypeCd("");
				
				partyQuestionDOList partyQuestionDOList2=new partyQuestionDOList();
				partyQuestionDOList2.setQuestionCd("");
				partyQuestionDOList2.setQuestionSetCd("");
				partyQuestionDOList2.setResponse("");
				

				partyDOList8.setBirthDt(daughter2dob);
				partyDOList8.setFirstName(daughter2firstname);
				partyDOList8.setGenderCd(daughter2gender);
				partyDOList8.setGuid("48");
				partyDOList8.setLastName(daughter2lastname);
				partyDOList8.getpartyAddressDOList().add(partyAddressDOList2);
				partyDOList8.setPartyContactDOList(partyContactDOList1);
				partyDOList8.setPartyEmailDOList(partyEmailDOList1);
				partyDOList8.setPartyIdentityDOList(partyIdentityDOList1);
				partyDOList8.setPartyQuestionDOList(partyQuestionDOList2);
				partyDOList8.setRelationCd("UDTR");
				partyDOList8.setRoleCd("PRIMARY");
				partyDOList8.setTitleCd(daughter2title);
			}
			if(bool7==true) {
		        
		        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
				partyAddressDOList2.setAddressLine1Lang1("");
				partyAddressDOList2.setAddressLine2Lang1("");
				partyAddressDOList2.setAddressTypeCd("");
				partyAddressDOList2.setAreaCd("");
				partyAddressDOList2.setCityCd("");
				partyAddressDOList2.setPinCode("");
				partyAddressDOList2.setStateCd("");
				
				partyContactDOList partyContactDOList1=new partyContactDOList();
				partyContactDOList1.setContactNum("");
				partyContactDOList1.setContactTypeCd("");
				partyContactDOList1.setStdCode("");
				
				partyEmailDOList partyEmailDOList1=new partyEmailDOList();
				partyEmailDOList1.setEmailAddress("");
				partyEmailDOList1.setEmailTypeCd("");
				
				partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
				partyIdentityDOList1.setIdentityNum("");
				partyIdentityDOList1.setIdentityTypeCd("");
				
				partyQuestionDOList partyQuestionDOList2=new partyQuestionDOList();
				partyQuestionDOList2.setQuestionCd("");
				partyQuestionDOList2.setQuestionSetCd("");
				partyQuestionDOList2.setResponse("");
				

				partyDOList9.setBirthDt("01-01-1965");
				partyDOList9.setFirstName("abc");
				partyDOList9.setGenderCd("MALE");
				partyDOList9.setGuid("49");
				partyDOList9.setLastName("def");
				partyDOList9.getpartyAddressDOList().add(partyAddressDOList2);
				partyDOList9.setPartyContactDOList(partyContactDOList1);
				partyDOList9.setPartyEmailDOList(partyEmailDOList1);
				partyDOList9.setPartyIdentityDOList(partyIdentityDOList1);
				partyDOList9.setPartyQuestionDOList(partyQuestionDOList2);
				partyDOList9.setRelationCd("FATH");
				partyDOList9.setRoleCd("PRIMARY");
				partyDOList9.setTitleCd("MR");
			}
			if(bool8==true) {
		        
		        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
				partyAddressDOList2.setAddressLine1Lang1("");
				partyAddressDOList2.setAddressLine2Lang1("");
				partyAddressDOList2.setAddressTypeCd("");
				partyAddressDOList2.setAreaCd("");
				partyAddressDOList2.setCityCd("");
				partyAddressDOList2.setPinCode("");
				partyAddressDOList2.setStateCd("");
				
				partyContactDOList partyContactDOList1=new partyContactDOList();
				partyContactDOList1.setContactNum("");
				partyContactDOList1.setContactTypeCd("");
				partyContactDOList1.setStdCode("");
				
				partyEmailDOList partyEmailDOList1=new partyEmailDOList();
				partyEmailDOList1.setEmailAddress("");
				partyEmailDOList1.setEmailTypeCd("");
				
				partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
				partyIdentityDOList1.setIdentityNum("");
				partyIdentityDOList1.setIdentityTypeCd("");
				
				partyQuestionDOList partyQuestionDOList2=new partyQuestionDOList();
				partyQuestionDOList2.setQuestionCd("");
				partyQuestionDOList2.setQuestionSetCd("");
				partyQuestionDOList2.setResponse("");
				
				partyDOList10.setBirthDt("01-02-1965");
				partyDOList10.setFirstName("abc");
				partyDOList10.setGenderCd("FEMALE");
				partyDOList10.setGuid("50");
				partyDOList10.setLastName("xyz");
				partyDOList10.getpartyAddressDOList().add(partyAddressDOList2);
				partyDOList10.setPartyContactDOList(partyContactDOList1);
				partyDOList10.setPartyEmailDOList(partyEmailDOList1);
				partyDOList10.setPartyIdentityDOList(partyIdentityDOList1);
				partyDOList10.setPartyQuestionDOList(partyQuestionDOList1);
				partyDOList10.setRelationCd("MOTH");
				partyDOList10.setRoleCd("PRIMARY");
				partyDOList10.setTitleCd("MS");
				
			}
			if(bool9==true) {
		        
		        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
				partyAddressDOList2.setAddressLine1Lang1("");
				partyAddressDOList2.setAddressLine2Lang1("");
				partyAddressDOList2.setAddressTypeCd("");
				partyAddressDOList2.setAreaCd("");
				partyAddressDOList2.setCityCd("");
				partyAddressDOList2.setPinCode("");
				partyAddressDOList2.setStateCd("");
				
				partyContactDOList partyContactDOList1=new partyContactDOList();
				partyContactDOList1.setContactNum("");
				partyContactDOList1.setContactTypeCd("");
				partyContactDOList1.setStdCode("");
				
				partyEmailDOList partyEmailDOList1=new partyEmailDOList();
				partyEmailDOList1.setEmailAddress("");
				partyEmailDOList1.setEmailTypeCd("");
				
				partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
				partyIdentityDOList1.setIdentityNum("");
				partyIdentityDOList1.setIdentityTypeCd("");
				
				partyQuestionDOList partyQuestionDOList2=new partyQuestionDOList();
				partyQuestionDOList2.setQuestionCd("");
				partyQuestionDOList2.setQuestionSetCd("");
				partyQuestionDOList2.setResponse("");
				
				partyDOList11.setBirthDt("01-03-1965");
				partyDOList11.setFirstName("xyz");
				partyDOList11.setGenderCd("MALE");
				partyDOList11.setGuid("51");
				partyDOList11.setLastName("abc");
				partyDOList11.getpartyAddressDOList().add(partyAddressDOList2);
				partyDOList11.setPartyContactDOList(partyContactDOList1);
				partyDOList11.setPartyEmailDOList(partyEmailDOList1);
				partyDOList11.setPartyIdentityDOList(partyIdentityDOList1);
				partyDOList11.setPartyQuestionDOList(partyQuestionDOList1);
				partyDOList11.setRelationCd("FLAW");
				partyDOList11.setRoleCd("PRIMARY");
				partyDOList11.setTitleCd("MR");
			}
			if(bool10==true) {
		        
		        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
				partyAddressDOList2.setAddressLine1Lang1("");
				partyAddressDOList2.setAddressLine2Lang1("");
				partyAddressDOList2.setAddressTypeCd("");
				partyAddressDOList2.setAreaCd("");
				partyAddressDOList2.setCityCd("");
				partyAddressDOList2.setPinCode("");
				partyAddressDOList2.setStateCd("");
				
				partyContactDOList partyContactDOList1=new partyContactDOList();
				partyContactDOList1.setContactNum("");
				partyContactDOList1.setContactTypeCd("");
				partyContactDOList1.setStdCode("");
				
				partyEmailDOList partyEmailDOList1=new partyEmailDOList();
				partyEmailDOList1.setEmailAddress("");
				partyEmailDOList1.setEmailTypeCd("");
				
				partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
				partyIdentityDOList1.setIdentityNum("");
				partyIdentityDOList1.setIdentityTypeCd("");
				
				partyQuestionDOList partyQuestionDOList2=new partyQuestionDOList();
				partyQuestionDOList2.setQuestionCd("");
				partyQuestionDOList2.setQuestionSetCd("");
				partyQuestionDOList2.setResponse("");
				
				partyDOList12.setBirthDt("01-04-1966");
				partyDOList12.setFirstName("qwe");
				partyDOList12.setGenderCd("FEMALE");
				partyDOList12.setGuid("52");
				partyDOList12.setLastName("xcv");
				partyDOList12.getpartyAddressDOList().add(partyAddressDOList2);
				partyDOList12.setPartyContactDOList(partyContactDOList1);
				partyDOList12.setPartyEmailDOList(partyEmailDOList1);
				partyDOList12.setPartyIdentityDOList(partyIdentityDOList1);
				partyDOList12.setPartyQuestionDOList(partyQuestionDOList1);
				partyDOList12.setRelationCd("MLAW");
				partyDOList12.setRoleCd("PRIMARY");
				partyDOList12.setTitleCd("MS");
			}
			if(bool11==true) {
		        
		        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
				partyAddressDOList2.setAddressLine1Lang1("");
				partyAddressDOList2.setAddressLine2Lang1("");
				partyAddressDOList2.setAddressTypeCd("");
				partyAddressDOList2.setAreaCd("");
				partyAddressDOList2.setCityCd("");
				partyAddressDOList2.setPinCode("");
				partyAddressDOList2.setStateCd("");
				
				partyContactDOList partyContactDOList1=new partyContactDOList();
				partyContactDOList1.setContactNum("");
				partyContactDOList1.setContactTypeCd("");
				partyContactDOList1.setStdCode("");
				
				partyEmailDOList partyEmailDOList1=new partyEmailDOList();
				partyEmailDOList1.setEmailAddress("");
				partyEmailDOList1.setEmailTypeCd("");
				
				partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
				partyIdentityDOList1.setIdentityNum("");
				partyIdentityDOList1.setIdentityTypeCd("");
				
				partyQuestionDOList partyQuestionDOList2=new partyQuestionDOList();
				partyQuestionDOList2.setQuestionCd("");
				partyQuestionDOList2.setQuestionSetCd("");
				partyQuestionDOList2.setResponse("");
				
				partyDOList13.setBirthDt("01-05-1960");
				partyDOList13.setFirstName("iop");
				partyDOList13.setGenderCd("MALE");
				partyDOList13.setGuid("53");
				partyDOList13.setLastName("klj");
				partyDOList13.getpartyAddressDOList().add(partyAddressDOList2);
				partyDOList13.setPartyContactDOList(partyContactDOList1);
				partyDOList13.setPartyEmailDOList(partyEmailDOList1);
				partyDOList13.setPartyIdentityDOList(partyIdentityDOList1);
				partyDOList13.setPartyQuestionDOList(partyQuestionDOList1);
				partyDOList13.setRelationCd("GFAT");
				partyDOList13.setRoleCd("PRIMARY");
				partyDOList13.setTitleCd("MR");
			}
			if(bool12==true) {
		        
		        partyAddressDOList partyAddressDOList2=new partyAddressDOList();
				partyAddressDOList2.setAddressLine1Lang1("");
				partyAddressDOList2.setAddressLine2Lang1("");
				partyAddressDOList2.setAddressTypeCd("");
				partyAddressDOList2.setAreaCd("");
				partyAddressDOList2.setCityCd("");
				partyAddressDOList2.setPinCode("");
				partyAddressDOList2.setStateCd("");
				
				partyContactDOList partyContactDOList1=new partyContactDOList();
				partyContactDOList1.setContactNum("");
				partyContactDOList1.setContactTypeCd("");
				partyContactDOList1.setStdCode("");
				
				partyEmailDOList partyEmailDOList1=new partyEmailDOList();
				partyEmailDOList1.setEmailAddress("");
				partyEmailDOList1.setEmailTypeCd("");
				
				partyIdentityDOList partyIdentityDOList1=new partyIdentityDOList();
				partyIdentityDOList1.setIdentityNum("");
				partyIdentityDOList1.setIdentityTypeCd("");
				
				partyQuestionDOList partyQuestionDOList2=new partyQuestionDOList();
				partyQuestionDOList2.setQuestionCd("");
				partyQuestionDOList2.setQuestionSetCd("");
				partyQuestionDOList2.setResponse("");
				
				partyDOList14.setBirthDt("01-06-1961");
				partyDOList14.setFirstName("gfhd");
				partyDOList14.setGenderCd("FEMALE");
				partyDOList14.setGuid("54");
				partyDOList14.setLastName("vbn");
				partyDOList14.getpartyAddressDOList().add(partyAddressDOList2);
				partyDOList14.setPartyContactDOList(partyContactDOList1);
				partyDOList14.setPartyEmailDOList(partyEmailDOList1);
				partyDOList14.setPartyIdentityDOList(partyIdentityDOList1);
				partyDOList14.setPartyQuestionDOList(partyQuestionDOList1);
				partyDOList14.setRelationCd("GMOT");
				partyDOList14.setRoleCd("PRIMARY");
				partyDOList14.setTitleCd("MS");
			}
			
			policyAdditionalFieldsDOList policyAdditionalFieldsDOList=new policyAdditionalFieldsDOList();
			policyAdditionalFieldsDOList.setField12("");
			policyAdditionalFieldsDOList.setFieldAgree("YES");
			policyAdditionalFieldsDOList.setFieldAlerts("YES");
			policyAdditionalFieldsDOList.setFieldTc("YES");
			
			policy policy=new policy();
			policy.setAddOns("CAREWITHNCB");
			policy.setBusinessTypeCd("NEWBUSINESS");
			policy.setBaseProductId("12001002");
			policy.setBaseAgentId("20008325");
			policy.setCoverType(hm.get("cover_type"));
			policy.getpartyDOList().add(partyDOList);
			policy.getpartyDOList().add(partyDOList1);
			if(bool==true) {
				policy.getpartyDOList().add(partyDOList2);
			}
			if(bool1==true) {
				policy.getpartyDOList().add(partyDOList3);
			}
			if(bool2==true) {
				policy.getpartyDOList().add(partyDOList4);
			}
			if(bool3==true) {
				policy.getpartyDOList().add(partyDOList5);
			}
			if(bool4==true) {
				policy.getpartyDOList().add(partyDOList6);
			}
			if(bool5==true) {
				policy.getpartyDOList().add(partyDOList7);
			}
			if(bool6==true) {
				policy.getpartyDOList().add(partyDOList8);
			}
			if(bool7==true) {
				policy.getpartyDOList().add(partyDOList9);
			}
			if(bool8==true) {
				policy.getpartyDOList().add(partyDOList10);
			}
			if(bool9==true) {
				policy.getpartyDOList().add(partyDOList11);
			}
			if(bool10==true) {
				policy.getpartyDOList().add(partyDOList12);
			}
			if(bool11==true) {
				policy.getpartyDOList().add(partyDOList13);
			}
			if(bool12==true) {
				policy.getpartyDOList().add(partyDOList14);
			}
			policy.setPolicyAdditionalFieldsDOList(policyAdditionalFieldsDOList);
			policy.setPolicyNum("");
			policy.setProposalNum("");
			policy.setQuotationReferenceNum("");
			policy.setSumInsured("013");
			policy.setTerm("1");
			policy.setUwDecisionCd("");
			policy.setIsPremiumCalculation("YES");
			policy.setNomineeDob(nomdob);
			policy.setNomineeName(nomname);
			policy.setNomineeRelationship(nomrelation);
			
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
				 String rel_two_proposal_num = nodeLst.item(0).getTextContent();
				 String rel_two_premium = nodeLst1.item(0).getTextContent();
				 
				 System.out.println("rel_two_proposal_num: "+rel_two_proposal_num);
				 System.out.println("rel_two_premium: "+rel_two_premium);
				 
				 session.setAttribute("rel_two_proposal_num", rel_two_proposal_num);
				 session.setAttribute("rel_two_premium", rel_two_premium);
				 
					pw.close(); 
			} catch (Exception e) {
				e.printStackTrace();
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
