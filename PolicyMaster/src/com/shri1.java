package com;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
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
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.Proposal1;
import com.fasterxml.jackson.databind.ObjectMapper;


import Royal.RoyalBikeBrandnewPremium;
import Royal.RoyalBikePremium;
import Royal.RoyalCarBrandnewPremium;
import Royal.RoyalCarPremium;
import Royal.Serv2ToRolSunDTO;

/**
 * Servlet implementation class shri1
 */
@WebServlet("/shri1")
public class shri1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public shri1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter pw = response.getWriter();  
		 HttpSession session=request.getSession();
		 HttpClient client = HttpClientBuilder.create().build();
		 
		 String policy=(String) session.getAttribute("policy"); // added
		 User userpoj=(User) session.getAttribute("userpoj");
			
			if(policy.equals("Motor Package"))
	        {
				try {
					String Regyr=userpoj.getRegyr();
				 	String VehicleType=userpoj.getVehicleType();
					
				if(Regyr.equals("Brandnew") && VehicleType.equals("Car")) {
					System.out.println("shri car fresh called");
					shri_fresh_car(request,response);
			 	}
				else if(Regyr.equals("Brandnew") && VehicleType.equals("Bike")){
					System.out.println("shri bike fresh called");
					shri_bike_fresh(request, response);
				}
				else {
					System.out.println("shri car/bike renewal called");
					shri_carbike_renewal(request,response);
				}
				} catch (Exception e) {
					e.printStackTrace();
				}
//Liberty start			
	        }else if(policy.equals("Liberty Motor"))
	        {
	        
	            try {
					LibertyImple.BikeCarPostPremiumDetailsFullQuote(request, response);
				} catch (Exception e) {
					e.printStackTrace();
				}
				 	
	        }			// Liberty End
				 
			/*RoyalSundram code Here*/
			
	        else if (policy.equals("Royal Motor")) {
	        	try {
	        	Serv2ToRolSunDTO serv2ToRolSunDTOComman = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunDTOComman");
	    		String registrationNumber = serv2ToRolSunDTOComman.getRegistrationNumber();
	    		String bikeregistrationNumber =	serv2ToRolSunDTOComman.getBikeregistrationNumber();
				String rproductName = serv2ToRolSunDTOComman.getRproductName();
				if (registrationNumber == null) {
					registrationNumber = "";
					
				}
				System.out.println("registrationNumber: " + registrationNumber);
				if (bikeregistrationNumber == null) {
					bikeregistrationNumber = "";
				}
			
				System.out.println("bikeregistrationNumber: "+bikeregistrationNumber);
	        	
	        	if(bikeregistrationNumber.equals(""))
	        	{
	        		if(rproductName.equals("BrandNewCar")) {
	        		
	        		RoyalCarBrandnewPremium.brandnewCarUpdateDetails(request, response);
	        		RoyalCarBrandnewPremium.brandnewCarPropsalService(request, response);
	        		
	        	}
	        	else if(rproductName.equals("RolloverCar"))
	        	{
	        		RoyalCarPremium.rsUpdateVehicles(request, response);
	        		RoyalCarPremium.rsProposalService(request, response);
	        	}
	        	}
	        	
	        	else if(registrationNumber.equals(""))
	        	{
	        	if(rproductName.equals("BrandnewTwoWheeler"))
					{
	        			RoyalBikeBrandnewPremium.brandnewBikeUpdateDetails(request, response);
	        			RoyalBikeBrandnewPremium.brandnewBikeProposalService(request, response);
	        			
		        		
					}
					else if(rproductName.equals("RolloverTwoWheeler"))
					{
						RoyalBikePremium.BikeUpdateVehic(request, response);
		        		RoyalBikePremium.GProposalService(request, response);
					}
	        	}
	        	}catch (Exception e) {
		        	
		        }
	        } 
			pw.close(); 

						 if(session!=null)
							{
									session.removeAttribute("CurrentIDV1");
									session.removeAttribute("proppojo");
									session.removeAttribute("propprevpojo");
									session.removeAttribute("serv2ToRolSunDTOComman");
									session.removeAttribute("serv2ToRolSunDTOComman1");

							}
			
	}
	
	public static void shri_fresh_car(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 PrintWriter pw = response.getWriter();  
		 HttpSession session=request.getSession();
	try {
		User userpoj=(User) session.getAttribute("userpoj");
		 Proposal1 proppojo=(Proposal1) session.getAttribute("proppojo");
		 Proposal1 propprevpojo=(Proposal1) session.getAttribute("propprevpojo");
		 String ProdCode = userpoj.getStrProductCode();
		 String PolicyFromDt=proppojo.getPolicyFromDt();
		 String PolicyToDt=proppojo.getPolicyToDt();
		 String PolicyIssueDt=proppojo.getPolicyIssueDt();
		 String InsuredPrefix=proppojo.getInsuredPrefix();
		 String InsuredName=(String) session.getAttribute("Fullname");
		 String Gender=proppojo.getGender();
		 String Address1= proppojo.getAddress1();
		 String State=proppojo.getState();
		 String City=proppojo.getCity();
		 String PinCode=propprevpojo.getPinCode();
		 String PanNo=proppojo.getPanNo();
		 String EMailID = (String) session.getAttribute("Email");
		 String ProposalType=propprevpojo.getProposalType();
		 String MobileNo = (String) session.getAttribute("Mobile");
		 String DateOfBirth=proppojo.getDateOfBirth();
		 String VehicleCode = userpoj.getStrVehicleCode();
		 String EngineNo=proppojo.getEngineNo();
		 String FirstRegDt=proppojo.getFirstRegDt();
		 String VehicleType=propprevpojo.getVehicleType();
		 String ChassisNo=proppojo.getChassisNo();
		 String RegNo1=proppojo.getRegNo1();
		 String RegNo2=proppojo.getRegNo2();
		 String RegNo3=proppojo.getRegNo3();
		 String RegNo4=proppojo.getRegNo4();
		 String RTOCode = userpoj.getStrRTOCode();
		 String AddonPackage = userpoj.getStrADDONCover();
		 String NomineeNameforPAOwnerDriver=proppojo.getNomineeNameforPAOwnerDriver();
		 String NomineeAgeforPAOwnerDriver=proppojo.getNomineeAgeforPAOwnerDriver();
		 String NomineeRelationforPAOwnerDriver=proppojo.getNomineeRelationforPAOwnerDriver();
		 String AppointeeNameforPAOwnerDriver=proppojo.getAppointeeNameforPAOwnerDriver();
		 String AppointeeRelationforPAOwnerDriver=proppojo.getAppointeeRelationforPAOwnerDriver();
		 String PreviousInsurer=propprevpojo.getPreviousInsurer();
		 String PreviousPolicyFromDt=propprevpojo.getPreviousPolicyFromDt();
		 String PreviousPolicyToDt=propprevpojo.getPreviousPolicyToDt();
		 String PreviousPolicyUWYear=propprevpojo.getPreviousPolicyUWYear();
		 String PreviousPolicyNCBPerc=userpoj.getStrPrevPolNCB();
		 String PreviousPolicyClaimYN=userpoj.getStrPrevPolClaimYN();//stillnotcomplete
		 String VehicleManufactureYear=propprevpojo.getVehicleManufactureYear();
		 
		 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		 Date utilDate1 = formatter.parse(PolicyFromDt);
		 String PolicyFromDt1=formatter.format(utilDate1);
		 Calendar c = Calendar.getInstance();
		    c.setTime(utilDate1);
		    c.add(Calendar.DAY_OF_MONTH, 1095);
		    Date end=c.getTime();
		    String PolicyToDt1=formatter.format(end); 
		    
		    System.out.println("PolicyFromDt: "+PolicyFromDt);
		    System.out.println("PolicyToDt1: "+PolicyToDt1);
		 
		 Proposal1 prop=new Proposal1();
		 	prop.setReferenceNo("");
			prop.setProdCode("MOT-PRD-016");
			prop.setPolicyFromDt(PolicyFromDt);
			prop.setPolicyToDt(PolicyToDt1);
			prop.setPolicyIssueDt(PolicyIssueDt);
			prop.setInsuredPrefix(InsuredPrefix);
			prop.setInsuredName(InsuredName);
			prop.setGender(Gender);
			prop.setAddress1(Address1);
			prop.setAddress2("");
			prop.setAddress3("");
			prop.setState(State);
			prop.setCity(City);
			prop.setPinCode(PinCode);
			prop.setPanNo(PanNo);
			prop.setGSTNo("");
			prop.setTelephoneNo("");
			prop.setFaxNo("");
			prop.setEMailID(EMailID);
			prop.setPolicyType("MOT-PLT-001");
			prop.setProposalType(ProposalType);
			prop.setMobileNo(MobileNo);
			prop.setDateOfBirth(DateOfBirth);
			prop.setPOSAgentName("");
			prop.setPOSAgentPanNo("");
			prop.setCoverNoteNo("");
			prop.setCoverNoteDt("");
			prop.setVehicleCode(VehicleCode);
			prop.setEngineNo(EngineNo);
			prop.setFirstRegDt(FirstRegDt);
			prop.setVehicleType(VehicleType);
			prop.setChassisNo(ChassisNo);
			prop.setRegNo1(RegNo1);
			prop.setRegNo2(RegNo2);
			prop.setRegNo3(RegNo3);
			prop.setRegNo4(RegNo4);
			prop.setRTOCode(RTOCode);
			prop.setIDV_of_Vehicle("");
			prop.setColour("");
			prop.setNoEmpCoverLL("");
			prop.setVehiclePurposeYN("0");
			prop.setDriverAgeYN("0");
			prop.setLimitOwnPremiseYN("0");
			prop.setCNGKitYN("0");
			prop.setCNGKitSI("");
			prop.setLimitedTPPDYN("");
			prop.setInBuiltCNGKitYN("0");
			prop.setVoluntaryExcess("");
			prop.setBangladesh("0");
			prop.setBhutan("0");
			prop.setSriLanka("0");
			prop.setPakistan("0");
			prop.setNepal("0");
			prop.setMaldives("0");
			prop.setDeTariff("");
			prop.setPreInspectionReportYN("0");
			prop.setPreInspection("");
			prop.setBreakIn("");
			prop.setAddonPackage(AddonPackage);
			prop.setNilDepreciationCoverYN("");
			prop.setPAforUnnamedPassengerYN("");
			prop.setPAforUnnamedPassengerSI("");
			prop.setElectricalaccessYN("");
			prop.setElectricalaccessSI("");
			prop.setElectricalaccessRemarks("");
			prop.setNonElectricalaccessYN("");
			prop.setNonElectricalaccessSI("");
			prop.setNonElectricalaccessRemarks("");
			prop.setPAPaidDriverConductorCleanerYN("");
			prop.setPAPaidDriverConductorCleanerSI("");
			prop.setPAPaidDriverCount("");
			prop.setPAPaidConductorCount("");
			prop.setPAPaidCleanerCount("");
			prop.setNomineeNameforPAOwnerDriver(NomineeNameforPAOwnerDriver);
			prop.setNomineeAgeforPAOwnerDriver(NomineeAgeforPAOwnerDriver);
			prop.setNomineeRelationforPAOwnerDriver(NomineeRelationforPAOwnerDriver);
			prop.setAppointeeNameforPAOwnerDriver(AppointeeNameforPAOwnerDriver);
			prop.setAppointeeRelationforPAOwnerDriver(AppointeeRelationforPAOwnerDriver);
			prop.setLLtoPaidDriverYN("");
			prop.setAntiTheftYN("0");
			prop.setPreviousPolicyNo("");
			prop.setPreviousInsurer(PreviousInsurer);
			prop.setPreviousPolicyFromDt(PreviousPolicyFromDt);
			prop.setPreviousPolicyToDt(PreviousPolicyToDt);
			prop.setPreviousPolicyUWYear(PreviousPolicyUWYear);
			prop.setPreviousPolicySI("");
			prop.setPreviousPolicyClaimYN(PreviousPolicyClaimYN);
			prop.setPreviousPolicyNCBPerc(PreviousPolicyNCBPerc);
			prop.setPreviousPolicyType("");
			prop.setPreviousNilDepreciation("");
			prop.setHypothecationType("");
			prop.setHypothecationBankName("");
			prop.setHypothecationAddress1("");
			prop.setHypothecationAddress2("");
			prop.setHypothecationAddress3("");
			prop.setHypothecationAgreementNo("");
			prop.setHypothecationCountry("");
			prop.setHypothecationState("");
			prop.setHypothecationCity("");
			prop.setHypothecationPinCode("");
			prop.setSpecifiedPersonField("");
			prop.setPAOwnerDriverExclusion("");
			prop.setPAOwnerDriverExReason("");
			prop.setDepDeductWaiverYN("0");
			prop.setDailyExpRemYN("0");
			prop.setInvReturnYN("0");
			prop.setLossOfPersonBelongYN("0");
			prop.setEmergencyTranHotelExpRemYN("0");
			prop.setKeyReplacementYN("0");
			prop.setMultiCarBenefitYN("0");
			prop.setAadharNo("");
			prop.setAadharEnrollNo("");
			prop.setForm16("");
			prop.setVehicleManufactureYear(VehicleManufactureYear);
			
			HttpClient client = HttpClientBuilder.create().build();
			Document document;
				document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
				Marshaller marshaller = JAXBContext.newInstance(Proposal1.class).createMarshaller();
				marshaller.marshal(prop, document);
				
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
				
				SOAPBodyElement abc = (SOAPBodyElement) soapMessage.getSOAPBody().addBodyElement(soapMessage.getSOAPPart().getEnvelope().createName("GenerateLtPcProposal",myNamespace,myNamespaceURI));
				
				SOAPBodyElement def = soapMessage.getSOAPBody().addDocument(document);	
			   	abc.addChildElement(def);
				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				soapMessage.writeTo(outputStream);			
				
				
				String output = new String(outputStream.toByteArray());
				System.out.println(output);
				HttpPost post = new HttpPost("http://119.226.131.2/ShriramService/ShriramLongTermservice.asmx");
				StringEntity userEntity = new StringEntity(output);
				post.setEntity(userEntity);
				post.setHeader("Accept-Encoding", "gzip,deflate");
				post.setHeader("Content-Type", "text/xml; charset=UTF-8");
				post.setHeader("SOAPAction", "http://tempuri.org/GenerateLtPcProposal");
				 HttpResponse response1=client.execute(post);
				 String res_xml = EntityUtils.toString(response1.getEntity());

				 System.out.println(res_xml);
				 pw.println(res_xml);
				 Shri_Res shrires1=new Shri_Res();
				 Document document1 = parseXmlFile(res_xml);
				 NodeList nodeLst = document1.getElementsByTagName("POL_SYS_ID");
				 NodeList nodeLst1=document1.getElementsByTagName("PROPOSAL_NO");
				 NodeList nodeLst2=document1.getElementsByTagName("VehicleIDV");
				 NodeList nodeLst3=document1.getElementsByTagName("ERROR_CODE");
				 NodeList nodeLst4=document1.getElementsByTagName("ERROR_DESC");
				 NodeList nodeLst5=document1.getElementsByTagName("CoverDtlList");
				 String POL_SYS_ID = nodeLst.item(0).getTextContent();
				 String ProposalNo= nodeLst1.item(0).getTextContent();
				 String ec2= nodeLst2.item(0).getTextContent();
				 String ec3= nodeLst3.item(0).getTextContent();
				 String ec4= nodeLst4.item(0).getTextContent();

				 shrires1.setPOL_SYS_ID(POL_SYS_ID);
				 shrires1.setPROPOSAL_NO(ProposalNo);
				 shrires1.setVehicleIDV(ec2);
				 shrires1.setERROR_CODE(ec3);
				 shrires1.setERROR_DESC(ec4);
				 if(nodeLst5 != null) {
					 int length = nodeLst5.getLength();
				        for (int i = 0; i < length; i++) {
				        	 if (nodeLst5.item(i).getNodeType() == Node.ELEMENT_NODE) {
				        		 Element el = (Element) nodeLst5.item(i);
				        		 if ( el.getNodeName().contains("CoverDtl")) {
				        			 String CoverDesc = el.getElementsByTagName("CoverDesc").item(1).getTextContent();
				                     String Premium = el.getElementsByTagName("Premium").item(1).getTextContent();

				                     String CoverDesc1 = el.getElementsByTagName("CoverDesc").item(7).getTextContent();
				                     String TotalPremium = el.getElementsByTagName("Premium").item(7).getTextContent();
				                     shrires1.setTotalPremium(TotalPremium);
				        		 }
				        	 }
				        }
				 }
				 session.setAttribute("shrires1", shrires1);
				 response.sendRedirect("shripay.jsp");
					
					pw.close(); 

	
	} catch (ParserConfigurationException e) {
		e.printStackTrace();
	} catch (JAXBException e) {
		e.printStackTrace();
	} catch (SOAPException e) {
		e.printStackTrace();
	} catch (NullPointerException e) {
		e.printStackTrace();
	} catch (ParseException e) {
		e.printStackTrace();
	}
	}
	
	public static void shri_carbike_renewal(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 PrintWriter pw = response.getWriter();  
		 HttpSession session=request.getSession();
		 
		 User userpoj=(User) session.getAttribute("userpoj");
		 Proposal1 proppojo=(Proposal1) session.getAttribute("proppojo");
		 Proposal1 propprevpojo=(Proposal1) session.getAttribute("propprevpojo");
		 String ProdCode = userpoj.getStrProductCode();
		 String PolicyFromDt=proppojo.getPolicyFromDt();
		 String PolicyToDt=proppojo.getPolicyToDt();
		 String PolicyIssueDt=proppojo.getPolicyIssueDt();
		 String InsuredPrefix=proppojo.getInsuredPrefix();
		 String InsuredName=(String) session.getAttribute("Fullname");
		 String Gender=proppojo.getGender();
		 String Address1= proppojo.getAddress1();
		 String State=proppojo.getState();
		 String City=proppojo.getCity();
		 String PinCode=propprevpojo.getPinCode();
		 String PanNo=proppojo.getPanNo();
		 String EMailID = (String) session.getAttribute("Email");
		 String ProposalType=propprevpojo.getProposalType();
		 String MobileNo = (String) session.getAttribute("Mobile");
		 String DateOfBirth=proppojo.getDateOfBirth();
		 String VehicleCode = userpoj.getStrVehicleCode();
		 String EngineNo=proppojo.getEngineNo();
		 String FirstRegDt=proppojo.getFirstRegDt();
		 String VehicleType=propprevpojo.getVehicleType();
		 String ChassisNo=proppojo.getChassisNo();
		 String RegNo1=proppojo.getRegNo1();
		 String RegNo2=proppojo.getRegNo2();
		 String RegNo3=proppojo.getRegNo3();
		 String RegNo4=proppojo.getRegNo4();
		 String RTOCode = userpoj.getStrRTOCode();
		 String AddonPackage = userpoj.getStrADDONCover();
		 String NomineeNameforPAOwnerDriver=proppojo.getNomineeNameforPAOwnerDriver();
		 String NomineeAgeforPAOwnerDriver=proppojo.getNomineeAgeforPAOwnerDriver();
		 String NomineeRelationforPAOwnerDriver=proppojo.getNomineeRelationforPAOwnerDriver();
		 String AppointeeNameforPAOwnerDriver=proppojo.getAppointeeNameforPAOwnerDriver();
		 String AppointeeRelationforPAOwnerDriver=proppojo.getAppointeeRelationforPAOwnerDriver();
		 String PreviousInsurer=propprevpojo.getPreviousInsurer();
		 String PreviousPolicyFromDt=propprevpojo.getPreviousPolicyFromDt();
		 String PreviousPolicyToDt=propprevpojo.getPreviousPolicyToDt();
		 String PreviousPolicyUWYear=propprevpojo.getPreviousPolicyUWYear();
		 String PreviousPolicyNCBPerc=userpoj.getStrPrevPolNCB();
		 String PreviousPolicyClaimYN=userpoj.getStrPrevPolClaimYN();//stillnotcomplete
		 String VehicleManufactureYear=propprevpojo.getVehicleManufactureYear();
		 
		 Proposal1 prop=new Proposal1();
		 	prop.setReferenceNo("");
			prop.setProdCode(ProdCode);
			prop.setPolicyFromDt(PolicyFromDt);
			prop.setPolicyToDt(PolicyToDt);
			prop.setPolicyIssueDt(PolicyIssueDt);
			prop.setInsuredPrefix(InsuredPrefix);
			prop.setInsuredName(InsuredName);
			prop.setGender(Gender);
			prop.setAddress1(Address1);
			prop.setAddress2("");
			prop.setAddress3("");
			prop.setState(State);
			prop.setCity(City);
			prop.setPinCode(PinCode);
			prop.setPanNo(PanNo);
			prop.setGSTNo("");
			prop.setTelephoneNo("");
			prop.setFaxNo("");
			prop.setEMailID(EMailID);
			prop.setPolicyType("MOT-PLT-001");
			prop.setProposalType(ProposalType);
			prop.setMobileNo(MobileNo);
			prop.setDateOfBirth(DateOfBirth);
			prop.setPOSAgentName("");
			prop.setPOSAgentPanNo("");
			prop.setCoverNoteNo("");
			prop.setCoverNoteDt("");
			prop.setVehicleCode(VehicleCode);
			prop.setEngineNo(EngineNo);
			prop.setFirstRegDt(FirstRegDt);
			prop.setVehicleType(VehicleType);
			prop.setChassisNo(ChassisNo);
			prop.setRegNo1(RegNo1);
			prop.setRegNo2(RegNo2);
			prop.setRegNo3(RegNo3);
			prop.setRegNo4(RegNo4);
			prop.setRTOCode(RTOCode);
			prop.setIDV_of_Vehicle("");
			prop.setColour("");
			prop.setNoEmpCoverLL("");
			prop.setVehiclePurposeYN("0");
			prop.setDriverAgeYN("0");
			prop.setLimitOwnPremiseYN("0");
			prop.setCNGKitYN("0");
			prop.setCNGKitSI("");
			prop.setLimitedTPPDYN("");
			prop.setInBuiltCNGKitYN("0");
			prop.setVoluntaryExcess("");
			prop.setBangladesh("0");
			prop.setBhutan("0");
			prop.setSriLanka("0");
			prop.setPakistan("0");
			prop.setNepal("0");
			prop.setMaldives("0");
			prop.setDeTariff("");
			prop.setPreInspectionReportYN("0");
			prop.setPreInspection("");
			prop.setBreakIn("");
			prop.setAddonPackage(AddonPackage);
			prop.setNilDepreciationCoverYN("");
			prop.setPAforUnnamedPassengerYN("");
			prop.setPAforUnnamedPassengerSI("");
			prop.setElectricalaccessYN("");
			prop.setElectricalaccessSI("");
			prop.setElectricalaccessRemarks("");
			prop.setNonElectricalaccessYN("");
			prop.setNonElectricalaccessSI("");
			prop.setNonElectricalaccessRemarks("");
			prop.setPAPaidDriverConductorCleanerYN("");
			prop.setPAPaidDriverConductorCleanerSI("");
			prop.setPAPaidDriverCount("");
			prop.setPAPaidConductorCount("");
			prop.setPAPaidCleanerCount("");
			prop.setNomineeNameforPAOwnerDriver(NomineeNameforPAOwnerDriver);
			prop.setNomineeAgeforPAOwnerDriver(NomineeAgeforPAOwnerDriver);
			prop.setNomineeRelationforPAOwnerDriver(NomineeRelationforPAOwnerDriver);
			prop.setAppointeeNameforPAOwnerDriver(AppointeeNameforPAOwnerDriver);
			prop.setAppointeeRelationforPAOwnerDriver(AppointeeRelationforPAOwnerDriver);
			prop.setLLtoPaidDriverYN("");
			prop.setAntiTheftYN("0");
			prop.setPreviousPolicyNo("");
			prop.setPreviousInsurer(PreviousInsurer);
			prop.setPreviousPolicyFromDt(PreviousPolicyFromDt);
			prop.setPreviousPolicyToDt(PreviousPolicyToDt);
			prop.setPreviousPolicyUWYear(PreviousPolicyUWYear);
			prop.setPreviousPolicySI("");
			prop.setPreviousPolicyClaimYN(PreviousPolicyClaimYN);
			prop.setPreviousPolicyNCBPerc(PreviousPolicyNCBPerc);
			prop.setPreviousPolicyType("");
			prop.setPreviousNilDepreciation("");
			prop.setHypothecationType("");
			prop.setHypothecationBankName("");
			prop.setHypothecationAddress1("");
			prop.setHypothecationAddress2("");
			prop.setHypothecationAddress3("");
			prop.setHypothecationAgreementNo("");
			prop.setHypothecationCountry("");
			prop.setHypothecationState("");
			prop.setHypothecationCity("");
			prop.setHypothecationPinCode("");
			prop.setSpecifiedPersonField("");
			prop.setPAOwnerDriverExclusion("");
			prop.setPAOwnerDriverExReason("");
			prop.setDepDeductWaiverYN("0");
			prop.setDailyExpRemYN("0");
			prop.setInvReturnYN("0");
			prop.setLossOfPersonBelongYN("0");
			prop.setEmergencyTranHotelExpRemYN("0");
			prop.setKeyReplacementYN("0");
			prop.setMultiCarBenefitYN("0");
			prop.setAadharNo("");
			prop.setAadharEnrollNo("");
			prop.setForm16("");
			prop.setVehicleManufactureYear(VehicleManufactureYear);
			
			HttpClient client = HttpClientBuilder.create().build();
			Document document;
			try {
				document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
				Marshaller marshaller = JAXBContext.newInstance(Proposal1.class).createMarshaller();
				marshaller.marshal(prop, document);
				
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
				
				SOAPBodyElement abc = (SOAPBodyElement) soapMessage.getSOAPBody().addBodyElement(soapMessage.getSOAPPart().getEnvelope().createName("GenerateProposal",myNamespace,myNamespaceURI));
				
				SOAPBodyElement def = soapMessage.getSOAPBody().addDocument(document);	
			   	abc.addChildElement(def);
				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				soapMessage.writeTo(outputStream);			
				
				
				String output = new String(outputStream.toByteArray());
				System.out.println(output);
				HttpPost post = new HttpPost("http://119.226.131.2/ShriramService/ShriramService.asmx");
				StringEntity userEntity = new StringEntity(output);
				post.setEntity(userEntity);
				post.setHeader("Accept-Encoding", "gzip,deflate");
				post.setHeader("Content-Type", "text/xml; charset=UTF-8");
				post.setHeader("SOAPAction", "http://tempuri.org/GenerateProposal");
				 HttpResponse response1=client.execute(post);
				 String res_xml = EntityUtils.toString(response1.getEntity());

				 System.out.println(res_xml);
				 pw.println(res_xml);
				 Shri_Res shrires1=new Shri_Res();
				 Document document1 = parseXmlFile(res_xml);
				 NodeList nodeLst = document1.getElementsByTagName("POL_SYS_ID");
				 NodeList nodeLst1=document1.getElementsByTagName("PROPOSAL_NO");
				 NodeList nodeLst2=document1.getElementsByTagName("VehicleIDV");
				 NodeList nodeLst3=document1.getElementsByTagName("ERROR_CODE");
				 NodeList nodeLst4=document1.getElementsByTagName("ERROR_DESC");
				 NodeList nodeLst5=document1.getElementsByTagName("CoverDtlList");
				 String POL_SYS_ID = nodeLst.item(0).getTextContent();
				 String ProposalNo= nodeLst1.item(0).getTextContent();
				 String ec2= nodeLst2.item(0).getTextContent();
				 String ec3= nodeLst3.item(0).getTextContent();
				 String ec4= nodeLst4.item(0).getTextContent();

				 shrires1.setPOL_SYS_ID(POL_SYS_ID);
				 shrires1.setPROPOSAL_NO(ProposalNo);
				 shrires1.setVehicleIDV(ec2);
				 shrires1.setERROR_CODE(ec3);
				 shrires1.setERROR_DESC(ec4);
				 if(nodeLst5 != null) {
					 int length = nodeLst5.getLength();
				        for (int i = 0; i < length; i++) {
				        	 if (nodeLst5.item(i).getNodeType() == Node.ELEMENT_NODE) {
				        		 Element el = (Element) nodeLst5.item(i);
				        		 if ( el.getNodeName().contains("CoverDtl")) {
				        			 String CoverDesc = el.getElementsByTagName("CoverDesc").item(1).getTextContent();
				                     String Premium = el.getElementsByTagName("Premium").item(1).getTextContent();

				                     String CoverDesc1 = el.getElementsByTagName("CoverDesc").item(7).getTextContent();
				                     String TotalPremium = el.getElementsByTagName("Premium").item(7).getTextContent();
				                     shrires1.setTotalPremium(TotalPremium);
				        		 }
				        	 }
				        }
				 }
				 session.setAttribute("shrires1", shrires1);
				 response.sendRedirect("shripay.jsp");
					
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
			}
			
	}
	
	public static void shri_bike_fresh(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 PrintWriter pw = response.getWriter();  
		 HttpSession session=request.getSession();
	try {
		User userpoj=(User) session.getAttribute("userpoj");
		 Proposal1 proppojo=(Proposal1) session.getAttribute("proppojo");
		 Proposal1 propprevpojo=(Proposal1) session.getAttribute("propprevpojo");
		 String ProdCode = userpoj.getStrProductCode();
		 String PolicyFromDt=proppojo.getPolicyFromDt();
		 String PolicyToDt=proppojo.getPolicyToDt();
		 String PolicyIssueDt=proppojo.getPolicyIssueDt();
		 String InsuredPrefix=proppojo.getInsuredPrefix();
		 String InsuredName=(String) session.getAttribute("Fullname");
		 String Gender=proppojo.getGender();
		 String Address1= proppojo.getAddress1();
		 String State=proppojo.getState();
		 String City=proppojo.getCity();
		 String PinCode=propprevpojo.getPinCode();
		 String PanNo=proppojo.getPanNo();
		 String EMailID = (String) session.getAttribute("Email");
		 String ProposalType=propprevpojo.getProposalType();
		 String MobileNo = (String) session.getAttribute("Mobile");
		 String DateOfBirth=proppojo.getDateOfBirth();
		 String VehicleCode = userpoj.getStrVehicleCode();
		 String EngineNo=proppojo.getEngineNo();
		 String FirstRegDt=proppojo.getFirstRegDt();
		 String VehicleType=propprevpojo.getVehicleType();
		 String ChassisNo=proppojo.getChassisNo();
		 String RegNo1=proppojo.getRegNo1();
		 String RegNo2=proppojo.getRegNo2();
		 String RegNo3=proppojo.getRegNo3();
		 String RegNo4=proppojo.getRegNo4();
		 String RTOCode = userpoj.getStrRTOCode();
		 String AddonPackage = userpoj.getStrADDONCover();
		 String NomineeNameforPAOwnerDriver=proppojo.getNomineeNameforPAOwnerDriver();
		 String NomineeAgeforPAOwnerDriver=proppojo.getNomineeAgeforPAOwnerDriver();
		 String NomineeRelationforPAOwnerDriver=proppojo.getNomineeRelationforPAOwnerDriver();
		 String AppointeeNameforPAOwnerDriver=proppojo.getAppointeeNameforPAOwnerDriver();
		 String AppointeeRelationforPAOwnerDriver=proppojo.getAppointeeRelationforPAOwnerDriver();
		 String PreviousInsurer=propprevpojo.getPreviousInsurer();
		 String PreviousPolicyFromDt=propprevpojo.getPreviousPolicyFromDt();
		 String PreviousPolicyToDt=propprevpojo.getPreviousPolicyToDt();
		 String PreviousPolicyUWYear=propprevpojo.getPreviousPolicyUWYear();
		 String PreviousPolicyNCBPerc=userpoj.getStrPrevPolNCB();
		 String PreviousPolicyClaimYN=userpoj.getStrPrevPolClaimYN();//stillnotcomplete
		 String VehicleManufactureYear=propprevpojo.getVehicleManufactureYear();
		 
		 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		 Date utilDate1 = formatter.parse(PolicyFromDt);
		 String PolicyFromDt1=formatter.format(utilDate1);
		 Calendar c = Calendar.getInstance();
		    c.setTime(utilDate1);
		    c.add(Calendar.DAY_OF_MONTH, 1825);
		    Date end=c.getTime();
		    String PolicyToDt1=formatter.format(end); 
		    
		    System.out.println("PolicyFromDt: "+PolicyFromDt);
		    System.out.println("PolicyToDt1: "+PolicyToDt1);
		 
		 Proposal1 prop=new Proposal1();
		 	prop.setReferenceNo("");
			prop.setProdCode("MOT-PRD-017");
			prop.setPolicyFromDt(PolicyFromDt);
			prop.setPolicyToDt(PolicyToDt1);
			prop.setPolicyIssueDt(PolicyIssueDt);
			prop.setInsuredPrefix(InsuredPrefix);
			prop.setInsuredName(InsuredName);
			prop.setGender(Gender);
			prop.setAddress1(Address1);
			prop.setAddress2("");
			prop.setAddress3("");
			prop.setState(State);
			prop.setCity(City);
			prop.setPinCode(PinCode);
			prop.setPanNo(PanNo);
			prop.setGSTNo("");
			prop.setTelephoneNo("");
			prop.setFaxNo("");
			prop.setEMailID(EMailID);
			prop.setPolicyType("MOT-PLT-001");
			prop.setProposalType(ProposalType);
			prop.setMobileNo(MobileNo);
			prop.setDateOfBirth(DateOfBirth);
			prop.setPOSAgentName("");
			prop.setPOSAgentPanNo("");
			prop.setCoverNoteNo("");
			prop.setCoverNoteDt("");
			prop.setVehicleCode(VehicleCode);
			prop.setEngineNo(EngineNo);
			prop.setFirstRegDt(FirstRegDt);
			prop.setVehicleType(VehicleType);
			prop.setChassisNo(ChassisNo);
			prop.setRegNo1(RegNo1);
			prop.setRegNo2(RegNo2);
			prop.setRegNo3(RegNo3);
			prop.setRegNo4(RegNo4);
			prop.setRTOCode(RTOCode);
			prop.setIDV_of_Vehicle("");
			prop.setColour("");
			prop.setNoEmpCoverLL("");
			prop.setVehiclePurposeYN("0");
			prop.setDriverAgeYN("0");
			prop.setLimitOwnPremiseYN("0");
			prop.setCNGKitYN("0");
			prop.setCNGKitSI("");
			prop.setLimitedTPPDYN("");
			prop.setInBuiltCNGKitYN("0");
			prop.setVoluntaryExcess("");
			prop.setBangladesh("0");
			prop.setBhutan("0");
			prop.setSriLanka("0");
			prop.setPakistan("0");
			prop.setNepal("0");
			prop.setMaldives("0");
			prop.setDeTariff("");
			prop.setPreInspectionReportYN("0");
			prop.setPreInspection("");
			prop.setBreakIn("");
			prop.setAddonPackage(AddonPackage);
			prop.setNilDepreciationCoverYN("");
			prop.setPAforUnnamedPassengerYN("");
			prop.setPAforUnnamedPassengerSI("");
			prop.setElectricalaccessYN("");
			prop.setElectricalaccessSI("");
			prop.setElectricalaccessRemarks("");
			prop.setNonElectricalaccessYN("");
			prop.setNonElectricalaccessSI("");
			prop.setNonElectricalaccessRemarks("");
			prop.setPAPaidDriverConductorCleanerYN("");
			prop.setPAPaidDriverConductorCleanerSI("");
			prop.setPAPaidDriverCount("");
			prop.setPAPaidConductorCount("");
			prop.setPAPaidCleanerCount("");
			prop.setNomineeNameforPAOwnerDriver(NomineeNameforPAOwnerDriver);
			prop.setNomineeAgeforPAOwnerDriver(NomineeAgeforPAOwnerDriver);
			prop.setNomineeRelationforPAOwnerDriver(NomineeRelationforPAOwnerDriver);
			prop.setAppointeeNameforPAOwnerDriver(AppointeeNameforPAOwnerDriver);
			prop.setAppointeeRelationforPAOwnerDriver(AppointeeRelationforPAOwnerDriver);
			prop.setLLtoPaidDriverYN("");
			prop.setAntiTheftYN("0");
			prop.setPreviousPolicyNo("");
			prop.setPreviousInsurer(PreviousInsurer);
			prop.setPreviousPolicyFromDt(PreviousPolicyFromDt);
			prop.setPreviousPolicyToDt(PreviousPolicyToDt);
			prop.setPreviousPolicyUWYear(PreviousPolicyUWYear);
			prop.setPreviousPolicySI("");
			prop.setPreviousPolicyClaimYN(PreviousPolicyClaimYN);
			prop.setPreviousPolicyNCBPerc(PreviousPolicyNCBPerc);
			prop.setPreviousPolicyType("");
			prop.setPreviousNilDepreciation("");
			prop.setHypothecationType("");
			prop.setHypothecationBankName("");
			prop.setHypothecationAddress1("");
			prop.setHypothecationAddress2("");
			prop.setHypothecationAddress3("");
			prop.setHypothecationAgreementNo("");
			prop.setHypothecationCountry("");
			prop.setHypothecationState("");
			prop.setHypothecationCity("");
			prop.setHypothecationPinCode("");
			prop.setSpecifiedPersonField("");
			prop.setPAOwnerDriverExclusion("");
			prop.setPAOwnerDriverExReason("");
			prop.setDepDeductWaiverYN("0");
			prop.setDailyExpRemYN("0");
			prop.setInvReturnYN("0");
			prop.setLossOfPersonBelongYN("0");
			prop.setEmergencyTranHotelExpRemYN("0");
			prop.setKeyReplacementYN("0");
			prop.setMultiCarBenefitYN("0");
			prop.setAadharNo("");
			prop.setAadharEnrollNo("");
			prop.setForm16("");
			prop.setVehicleManufactureYear(VehicleManufactureYear);
			
			HttpClient client = HttpClientBuilder.create().build();
			Document document;
				document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
				Marshaller marshaller = JAXBContext.newInstance(Proposal1.class).createMarshaller();
				marshaller.marshal(prop, document);
				
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
				
				SOAPBodyElement abc = (SOAPBodyElement) soapMessage.getSOAPBody().addBodyElement(soapMessage.getSOAPPart().getEnvelope().createName("GenerateLtTwProposal",myNamespace,myNamespaceURI));
				
				SOAPBodyElement def = soapMessage.getSOAPBody().addDocument(document);	
			   	abc.addChildElement(def);
				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				soapMessage.writeTo(outputStream);			
				
				
				String output = new String(outputStream.toByteArray());
				System.out.println(output);
				HttpPost post = new HttpPost("http://119.226.131.2/ShriramService/ShriramLongTermservice.asmx");
				StringEntity userEntity = new StringEntity(output);
				post.setEntity(userEntity);
				post.setHeader("Accept-Encoding", "gzip,deflate");
				post.setHeader("Content-Type", "text/xml; charset=UTF-8");
				post.setHeader("SOAPAction", "http://tempuri.org/GenerateLtTwProposal");
				 HttpResponse response1=client.execute(post);
				 String res_xml = EntityUtils.toString(response1.getEntity());

				 System.out.println(res_xml);
				 pw.println(res_xml);
				 Shri_Res shrires1=new Shri_Res();
				 Document document1 = parseXmlFile(res_xml);
				 NodeList nodeLst = document1.getElementsByTagName("POL_SYS_ID");
				 NodeList nodeLst1=document1.getElementsByTagName("PROPOSAL_NO");
				 NodeList nodeLst2=document1.getElementsByTagName("VehicleIDV");
				 NodeList nodeLst3=document1.getElementsByTagName("ERROR_CODE");
				 NodeList nodeLst4=document1.getElementsByTagName("ERROR_DESC");
				 NodeList nodeLst5=document1.getElementsByTagName("CoverDtlList");
				 String POL_SYS_ID = nodeLst.item(0).getTextContent();
				 String ProposalNo= nodeLst1.item(0).getTextContent();
				 String ec2= nodeLst2.item(0).getTextContent();
				 String ec3= nodeLst3.item(0).getTextContent();
				 String ec4= nodeLst4.item(0).getTextContent();

				 shrires1.setPOL_SYS_ID(POL_SYS_ID);
				 shrires1.setPROPOSAL_NO(ProposalNo);
				 shrires1.setVehicleIDV(ec2);
				 shrires1.setERROR_CODE(ec3);
				 shrires1.setERROR_DESC(ec4);
				 if(nodeLst5 != null) {
					 int length = nodeLst5.getLength();
				        for (int i = 0; i < length; i++) {
				        	 if (nodeLst5.item(i).getNodeType() == Node.ELEMENT_NODE) {
				        		 Element el = (Element) nodeLst5.item(i);
				        		 if ( el.getNodeName().contains("CoverDtl")) {
				        			 String CoverDesc = el.getElementsByTagName("CoverDesc").item(1).getTextContent();
				                     String Premium = el.getElementsByTagName("Premium").item(1).getTextContent();

				                     String CoverDesc1 = el.getElementsByTagName("CoverDesc").item(7).getTextContent();
				                     String TotalPremium = el.getElementsByTagName("Premium").item(7).getTextContent();
				                     shrires1.setTotalPremium(TotalPremium);
				        		 }
				        	 }
				        }
				 }
				 session.setAttribute("shrires1", shrires1);
				 response.sendRedirect("shripay.jsp");
				 
				 
				 
				 
				 
				 
				 
					
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
	} catch (ParseException e) {
		// TODO Auto-generated catch block
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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
