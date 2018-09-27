package com;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

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
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import com.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import Royal.RoyalBikeBrandnewPremium;
import Royal.RoyalBikePremium;
import Royal.RoyalCarBrandnewPremium;
import Royal.RoyalCarPremium;
import Royal.Serv2ToRolSunDTO;
/**
 * Servlet implementation class shri
 */
@WebServlet("/shri")
public class shri extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public shri() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter pw = response.getWriter();  
		
		 HttpSession session=request.getSession();		
		 try {
			 User userpoj=(User) session.getAttribute("userpoj");
			 String strRTOCode = userpoj.getStrRTOCode();
			 String strVehicleCode = userpoj.getStrVehicleCode();
			 String strProductCode = userpoj.getStrProductCode();
			 //String strPolicyType = (String) session.getAttribute("strPolicyType");
			 String strADDONCover =userpoj.getStrADDONCover();
			 String strPrevPolClaimYN = userpoj.getStrPrevPolClaimYN();
			 String strPrevPolNCB = userpoj.getStrPrevPolNCB();
			 String strPrevPolExpDt = userpoj.getStrPrevPolExpDt();
			 System.out.println("strPrevPolExpDt: "+strPrevPolExpDt);
			 String strFirstRegDt = userpoj.getStrFirstRegDt();
			 String strInsuredState= userpoj.getStrInsuredState();
		 
		 User user=new User();
			user.setStrProductCode(strProductCode);
			user.setStrPolicyType("MOT-PLT-001");
			user.setStrRTOCode(strRTOCode);
			user.setStrVehicleCode(strVehicleCode);
			user.setStrADDONCover(strADDONCover);
			user.setStrFirstRegDt(strFirstRegDt);
			user.setStrPrevPolExpDt("");
			user.setStrInsuredState(strInsuredState);
			user.setStrPrevPolClaimYN(strPrevPolClaimYN);
			user.setStrPrevPolNCB(strPrevPolNCB);
			
			/*pw.println(user.getStrProductCode());
			pw.println(user.getStrPolicyType());
			pw.println(user.getStrRTOCode());
			pw.println(user.getStrVehicleCode());
			pw.println(user.getStrADDONCover());
			pw.println(user.getStrFirstRegDt());
			pw.println(user.getStrInsuredState());
			pw.println(user.getStrPrevPolExpDt());
			pw.println(user.getStrPrevPolClaimYN());
			pw.println(user.getStrPrevPolNCB());*/
			
			Document document;
			
				document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
				Marshaller marshaller = JAXBContext.newInstance(User.class).createMarshaller();
				marshaller.marshal(user, document);
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
				
				HttpClient client = HttpClientBuilder.create().build();
				String output = new String(outputStream.toByteArray());
				System.out.println(output);
				HttpPost post = new HttpPost("http://119.226.131.2/ShriramService/ShriramService.asmx");
				StringEntity userEntity = new StringEntity(output);
				post.setEntity(userEntity);
				post.setHeader("Accept-Encoding", "gzip,deflate");
				post.setHeader("Content-Type", "text/xml; charset=UTF-8");
				//post.setHeader("Content-Type", "application/soap+xml; charset=UTF-8;action=http://tempuri.org/GetQuot");
				post.setHeader("SOAPAction", "http://tempuri.org/GetQuot");
				 HttpResponse response1=client.execute(post);
				 String res_xml = EntityUtils.toString(response1.getEntity());
				 System.out.println(res_xml);
				 /*pw.println("\n");
				 pw.println(output);
				 pw.println("\n");*/
				 pw.println(res_xml);
				 Shri_Res shrires=new Shri_Res();
				 Document document1 = parseXmlFile(res_xml);
				 NodeList nodeLst = document1.getElementsByTagName("POL_SYS_ID");
				 NodeList nodeLst1=document1.getElementsByTagName("PROPOSAL_NO");
				 NodeList nodeLst2=document1.getElementsByTagName("VehicleIDV");
				 NodeList nodeLst3=document1.getElementsByTagName("ERROR_CODE");
				 NodeList nodeLst4=document1.getElementsByTagName("ERROR_DESC");
				 NodeList nodeLst5=document1.getElementsByTagName("CoverDtlList");
				 String ec = nodeLst.item(0).getTextContent();
				 String ec1= nodeLst1.item(0).getTextContent();
				 String ec2= nodeLst2.item(0).getTextContent();
				 String ec3= nodeLst3.item(0).getTextContent();
				 String ec4= nodeLst4.item(0).getTextContent();
				 
				 shrires.setPOL_SYS_ID(ec);
				 shrires.setPROPOSAL_NO(ec1);
				 shrires.setVehicleIDV(ec2);
				 shrires.setERROR_CODE(ec3);
				 shrires.setERROR_DESC(ec4);
				 
				 System.out.println("Error Desc: "+shrires.getERROR_DESC());
				 
				 if(nodeLst5 != null) {
					 int length = nodeLst5.getLength();
				        for (int i = 0; i < length; i++) {
				        	 if (nodeLst5.item(i).getNodeType() == Node.ELEMENT_NODE) {
				        		 Element el = (Element) nodeLst5.item(i);
				        		 if ( el.getNodeName().contains("CoverDtl")) {
				        			 String CoverDesc = el.getElementsByTagName("CoverDesc").item(1).getTextContent();
				                     String Premium = el.getElementsByTagName("Premium").item(1).getTextContent();
				                     shrires.setPremium(Premium);
				                     String CoverDesc1 = el.getElementsByTagName("CoverDesc").item(5).getTextContent();
				                     String Premium1 = el.getElementsByTagName("Premium").item(5).getTextContent();
				                     shrires.setTotalPremium(Premium1);
				        		 }
				        	 }
				        }
				 }
				
				 session.setAttribute("shrires", shrires);
				
				

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
			
			/*Liberty*/
		 try {
			 String reg_year = (String) session.getAttribute("reg_year");
			 System.out.println("Reg Year : "+reg_year);
			 String insurer = (String) session.getAttribute("insurer");
			 System.out.println("insurer : "+insurer);
			 String ncb = (String) session.getAttribute("ncb");
			 String PrePolicyExpDate = (String) session.getAttribute("prePolendDate");
			 String NewPolStartDate = (String) session.getAttribute("newPolStartDate");
			 String NewPolEndDate = (String) session.getAttribute("newPolEndDate");
			 String PreviousPolicyStartDate = (String) session.getAttribute("prevPolStartDate");
			 User userpoj=(User) session.getAttribute("userpoj");
			 String RtoCode = userpoj.getStrRTOCode();
			 String RegNo1 = (String) session.getAttribute("reg1");
			 String RegNo2 = (String) session.getAttribute("reg2");
			 String RegNo3 = (String) session.getAttribute("reg3");
			 String RegNo4 = (String) session.getAttribute("reg4");
			 String MakeCode = (String) session.getAttribute("MakeCode");
			 String ModelCode = (String) session.getAttribute("ModelCode");
			 String BusinessType = (String) session.getAttribute("BusinessType");
			 String productCode= (String)session.getAttribute("productCode");
			 String BuyerState= (String)session.getAttribute("BuyerState");
			 System.out.println(BuyerState);
			 
			 PostPremiumDetails postd=new PostPremiumDetails();
				
				String SALTCHARS = "MAI17801901078";
		        StringBuilder salt = new StringBuilder();
		        Random rnd = new Random();
		        while (salt.length() < 14) { // length of the random string.
		            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
		            salt.append(SALTCHARS.charAt(index));
		        }
		        String saltStr = salt.toString();
		        
		        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		        LocalDateTime currentdate = LocalDateTime.now();  
		        LocalDateTime nextYear = currentdate.plusYears(1).minusDays(1);
		        
		        if(reg_year.equals("Brandnew"))
		        {
		        postd.setQuickQuoteNumber(saltStr);
		        postd.setIsFullQuote(false);
		        postd.setMakeCode(MakeCode);
		        postd.setModelCode(ModelCode);
		        postd.setManfMonth("01");
		        postd.setManfYear("2018");
		        postd.setRtoCode(RtoCode);
		        postd.setRegNo1(RegNo1);
		        postd.setRegNo2(RegNo2);
		        postd.setRegNo3(RegNo3);
		        postd.setRegNo4(RegNo4);
		        postd.setDeliveryDate(dtf.format(currentdate));
		        postd.setRegistrationDate(dtf.format(currentdate));
		        postd.setVehicleIDV(0);
		        postd.setProductCode(productCode);
		        postd.setPolicyStartDate(dtf.format(currentdate));
		        postd.setPolicyEndDate(dtf.format(nextYear));
		        postd.setPolicyTenure("1");
		        postd.setTPSourceName("TPService");
		        postd.setBusinessType("New Business");
		        postd.setIMDNumber("IMD1039348");
		        postd.setBuyerState(BuyerState);
		        postd.setAgentCode("");
		        }
		        else{
		        	postd.setQuickQuoteNumber(saltStr);
			        postd.setIsFullQuote(false);
			        postd.setMakeCode(MakeCode);
			        postd.setModelCode(ModelCode);
			        postd.setManfMonth("01");
			        postd.setManfYear(reg_year);
			        postd.setRtoCode(RtoCode);
			        postd.setRegNo1(RegNo1);
			        postd.setRegNo2(RegNo2);
			        postd.setRegNo3(RegNo3);
			        postd.setRegNo4(RegNo4);
			        postd.setDeliveryDate("01/01/"+reg_year);
			        postd.setRegistrationDate("01/01/"+reg_year);
			        postd.setVehicleIDV(0);
			        postd.setProductCode(productCode);
			        postd.setPolicyStartDate(NewPolStartDate);
			        postd.setPolicyEndDate(NewPolEndDate);
			        postd.setPolicyTenure("1");
			        postd.setTPSourceName("TPService");
			        postd.setBusinessType("Roll Over");
			        postd.setIMDNumber("IMD1039348");
			        postd.setBuyerState(BuyerState);
			        postd.setAgentCode("");
			        postd.setNoPreviousPolicyHistory(false);
			        postd.setPreviousPolicyInsurerName(insurer);
			        postd.setPreviousPolicyNumber("1234567890");
			        postd.setPreviousPolicyType("PackagePolicy");
			        postd.setPreviousPolicyStartDate(PreviousPolicyStartDate);
			        postd.setPreviousPolicyEndDate(PrePolicyExpDate);
			        postd.setPreviousPolicyTenure(1);
			        postd.setPreviousYearNCBPercentage(ncb);
			        postd.setClaimAmount(0);
			        postd.setNoOfClaims(0);
		        }
		        
				 
				 HttpClient client = HttpClientBuilder.create().build();
				 
						ObjectMapper objectMapper = new ObjectMapper();
						String jsonRequest=objectMapper.writeValueAsString(postd);
						System.out.println("Request :  "+jsonRequest);
						pw.println("Request :  "+jsonRequest);
						    
						    HttpPost post1 = new HttpPost("http://168.87.83.122:8180/api/IMDTPService/PostPremiumDetails");
							StringEntity userEntity = new StringEntity(jsonRequest);
							post1.setEntity(userEntity);
							post1.setHeader("Content-Type", "application/json");
							HttpResponse response1=client.execute(post1);
							String res_json = EntityUtils.toString(response1.getEntity());
							System.out.println("\nResponse : "+res_json);
							pw.println("\nResponse : "+res_json);
							
							JSONObject obj = new JSONObject(res_json);
							String ProposalNumber=(String) obj.get("ProposalNumber");
							Double TotalPremium=(Double) obj.get("TotalPremium");
							Double CurrentIDV=(Double) obj.get("CurrentIDV");
							
							
							session.setAttribute("ProposalNumber", ProposalNumber);
							session.setAttribute("TotalPremium", TotalPremium);
							session.setAttribute("CurrentIDV1", CurrentIDV);
							System.out.println("\nProposalNumber : "+ProposalNumber);
							System.out.println("TotalPremium : "+TotalPremium);
							System.out.println("CurrentIDV1 : "+CurrentIDV);
						
						
				 }catch(Exception e)
					{
						e.printStackTrace();
					}		
				 
				
			/*Liberty*/
				 
/* RoyalSundaram Code Here*/
				 
				 try {
						Serv2ToRolSunDTO serv2ToRolSunDTObike1 = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunbike");
						String bikeregistrationNumber = serv2ToRolSunDTObike1.getBikeregistrationNumber();
						
						
						String registrationNumber = serv2ToRolSunDTObike1.getRegistrationNumber();
					Serv2ToRolSunDTO serv2ToRolSunDTOCarProductName = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunRolloverCarSet");
							
							String rproductName = serv2ToRolSunDTOCarProductName.getRproductName();
						
							
							
							if (bikeregistrationNumber.equals("")) {
							if(rproductName.equals("BrandNewCar"))
								{
									RoyalCarBrandnewPremium.brandnewCarPremium(request, response);
									//response.sendRedirect("termquotes");
								}
								else if(rproductName.equals("RolloverCar"))
								{
									RoyalCarPremium.carPremiumCalculation(request, response);
									//response.sendRedirect("termquotes");
								}
								
								}
							else if(registrationNumber.equals("")){
								if(rproductName.equals("BrandnewTwoWheeler"))
								{
									RoyalBikeBrandnewPremium.brandnewBikePremium(request, response);
									//response.sendRedirect("termquotes");
								}
								else if(rproductName.equals("RolloverTwoWheeler"))
								{
									RoyalBikePremium.bikePremiumCalculation(request, response);
									//response.sendRedirect("termquotes");
								}
								
							}
							 response.sendRedirect("termquotes");
					} catch (Exception e) {
						e.printStackTrace();
					} 
				 
				 
				 
				 
				 
				 
				 
				 
				 
				 
			
			pw.close(); 
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
