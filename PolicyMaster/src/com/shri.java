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
import org.json.JSONException;
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
			user.setStrPrevPolExpDt(strPrevPolExpDt);
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
				System.out.println("Enter into liberty api : ,,,,,,,,");
				LibertyImple.BikeCarPostPremiumDetailsHalfQuote(request, response);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
		

				 
/* RoyalSundaram Code Here*/
				 
				 try {
						Serv2ToRolSunDTO serv2ToRolSunDTOComman = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunDTOComman");
						String bikeregistrationNumber = serv2ToRolSunDTOComman.getBikeregistrationNumber();
						
						
						String registrationNumber = serv2ToRolSunDTOComman.getRegistrationNumber();
							
							String rproductName = serv2ToRolSunDTOComman.getRproductName();
							if (registrationNumber == null) {
								registrationNumber = "";
								
							}
							System.out.println("registrationNumber: " + registrationNumber);
							if (bikeregistrationNumber == null) {
								bikeregistrationNumber = "";
							}
						
							System.out.println("bikeregistrationNumber: "+bikeregistrationNumber);
							
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
							
					} catch (Exception e) {
						e.printStackTrace();
					} 
				 
				 
				 response.sendRedirect("termquotes");
				 
				 
				 
				 
				 
				 
				 
			
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
