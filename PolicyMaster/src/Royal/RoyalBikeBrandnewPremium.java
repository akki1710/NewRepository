package Royal;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.crypto.Data;
import javax.xml.transform.stream.StreamSource;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * Servlet implementation class RoyalBikeBrandnewPremium
 */
@WebServlet("/RoyalBikeBrandnewPremium")
public class RoyalBikeBrandnewPremium extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RoyalBikeBrandnewPremium() {
        super();
        
    }

	
    public static void brandnewBikePremium(HttpServletRequest request, HttpServletResponse response) {
		try {
			PrintWriter pw = response.getWriter();
			HttpSession session = request.getSession();

			Serv2ToRolSunDTO serv2ToRolSunDTOComman = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunDTOComman");
			String bikeregistrationNumber = serv2ToRolSunDTOComman.getBikeregistrationNumber();
			
			String rname = serv2ToRolSunDTOComman.getRname();
			String rmobile = serv2ToRolSunDTOComman.getRmobile();
			String remail = serv2ToRolSunDTOComman.getRemail();
			String rpinCode=serv2ToRolSunDTOComman.getRpinCode();
			
			
			
			
			String BikeManufacturerName = serv2ToRolSunDTOComman.getBikeManufacturerName();
			String BikeModelCode = serv2ToRolSunDTOComman.getBikeModelCode();
			String BikeModelName = serv2ToRolSunDTOComman.getBikeModelName();
			String rcity =serv2ToRolSunDTOComman.getRcity();

			
			String bikePreviousInsurerName = serv2ToRolSunDTOComman.getBikePreviousInsurerName();
			String bikeclaimsMadeInPreviousPolicy = serv2ToRolSunDTOComman.getBikeclaimsMadeInPreviousPolicy();
			String bikePreviousPolicyExpiryDate = serv2ToRolSunDTOComman.getBikePreviousPolicyExpiryDate();
			String bikeNoClaimBonusPercent = serv2ToRolSunDTOComman.getBikeNoClaimBonusPercent();
			String bikeRegistrationChargesRoadTax = serv2ToRolSunDTOComman.getBikeRegistrationChargesRoadTax();
			String bikeVehicleOwnershipChanged = serv2ToRolSunDTOComman.getBikeVehicleOwnershipChanged();
			String YearOfManufacturebike = serv2ToRolSunDTOComman.getYearOfManufacturebike();
			String regDate = serv2ToRolSunDTOComman.getRegDate();
			
			
			String rproductName =serv2ToRolSunDTOComman.getRproductName();

			// Current Date Code

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDateTime currentdate = LocalDateTime.now();
			LocalDateTime nextYear = currentdate.plusYears(1).minusDays(1);

			authenticationDetails authenticationDetails = new authenticationDetails();
			authenticationDetails.setAgentId(RoyalGlobalAccess.agentId);
			authenticationDetails.setApiKey(RoyalGlobalAccess.apikey);

			proposerDetails proposerDetails = new proposerDetails();
			
			proposerDetails.setFirstName(rname);
			proposerDetails.setLastName("");
			proposerDetails.setEmailId(remail);
			proposerDetails.setMobileNo(rmobile);
			proposerDetails.setDateOfBirth("");
			proposerDetails.setIsNewUser("");
			proposerDetails.setIsLoginCheck("");
			proposerDetails.setTitle("Ms");
			proposerDetails.setResidenceAddressOne("");
			proposerDetails.setResidenceAddressTwo("");
			proposerDetails.setResidenceAddressThree("");
			proposerDetails.setResidenceAddressFour("");
			proposerDetails.setResidenceCity(rcity);
			proposerDetails.setResidencePinCode(rpinCode);
			
			vehicleDetails vehicleDetails = new vehicleDetails();
			vehicleDetails.setVehicleModelCode(BikeModelCode);
			vehicleDetails.setYearOfManufacture(YearOfManufacturebike);
			vehicleDetails.setVehicleManufacturerName(BikeManufacturerName);
			vehicleDetails.setRegistrationNumber(bikeregistrationNumber);
			vehicleDetails.setVehicleMostlyDrivenOn("City roads");
			vehicleDetails.setVehicleRegDate(regDate);

			vehicleDetails.setVehicleRegisteredInTheNameOf("Company");
			vehicleDetails.setModelName(BikeModelName);

			vehicleDetails.setCompanyNameForCar(BikeManufacturerName);
			vehicleDetails.setIsTwoWheelerFinanced("No");
			vehicleDetails.setVehicleSubLine("motorCycle");
			vehicleDetails.setFuelType("petrol");
			vehicleDetails.setRegion("East Region");
			vehicleDetails.setTypeOfCover("Bundled");
			vehicleDetails.setProductname(rproductName);
			vehicleDetails.setCarRegisteredCity(rcity);
			vehicleDetails.setPreviousInsurerName(bikePreviousInsurerName);
			vehicleDetails.setPreviousPolicyExpiryDate(bikePreviousPolicyExpiryDate);
			vehicleDetails.setNoClaimBonusPercent(bikeNoClaimBonusPercent);
			vehicleDetails.setVechileOwnerShipChanged(bikeVehicleOwnershipChanged);
			vehicleDetails.setClaimsMadeInPreviousPolicy(bikeclaimsMadeInPreviousPolicy);
			vehicleDetails.setRegistrationchargesRoadtax(bikeRegistrationChargesRoadTax);

			CALCULATEPREMIUMREQUEST calculatePremium = new CALCULATEPREMIUMREQUEST();
			calculatePremium.setAuthenticationDetails(authenticationDetails);

			calculatePremium.setProposerDetails(proposerDetails);
			calculatePremium.setVehicleDetails(vehicleDetails);

			calculatePremium.setReqType("XML");
			calculatePremium.setResType("XML");

			String xmlString = "";

			JAXBContext context = JAXBContext.newInstance(CALCULATEPREMIUMREQUEST.class);
			Marshaller m = context.createMarshaller();

			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

			StringWriter sw = new StringWriter();
			m.marshal(calculatePremium, sw);
			xmlString = sw.getBuffer().toString();

			System.out.println(xmlString);
			// ...... unmarshelling

			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(RoyalGlobalAccess.bikeBrandnewCalculatePremiumURL);
			post.addHeader("content-type", "application/xml");
			 post.addHeader("Accept", "application/xml");
			StringEntity userEntity = new StringEntity(sw.getBuffer().toString());
			post.setEntity(userEntity);
			HttpResponse response1 = client.execute(post);
			int statusCode = response1.getStatusLine().getStatusCode();
			String res_xml = EntityUtils.toString(response1.getEntity());
			System.out.println(res_xml);
			System.out.println("statusCode  " + statusCode);

			// OUR code here

			JAXBContext jContext = JAXBContext.newInstance(PREMIUMDETAILS.class);
			Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
			StreamSource streamSource = new StreamSource(new StringReader(res_xml));
			JAXBElement<PREMIUMDETAILS> je = unmarshallerObj.unmarshal(streamSource, PREMIUMDETAILS.class);
			PREMIUMDETAILS pREMIUMDETAILS = (PREMIUMDETAILS) je.getValue();
			pw.println(pREMIUMDETAILS.getDATA());
			System.out.println(pREMIUMDETAILS.getDATA());
			System.out.println(pREMIUMDETAILS.getStatus());
			DATA data =  pREMIUMDETAILS.getDATA();
			System.out.println(data.getGROSS_PREMIUM());
			System.out.println(data.getQUOTE_ID());
			System.out.println(data.getIDV());
			session.setAttribute("data",data );
			session.setAttribute("proposerDetails", proposerDetails);

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
    
    
    public static void brandnewBikeUpdateDetails(HttpServletRequest request, HttpServletResponse response) {

		try {
			PrintWriter pw = response.getWriter();
			HttpSession session = request.getSession();
			DATA data = (DATA) session.getAttribute("data");
			String idv1 = data.getIDV();
			String quoteId1 = data.getQUOTE_ID();
			Serv2ToRolSunDTO serv2ToRolSunDTOComman = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunDTOComman");
			String bikeregistrationNumber = serv2ToRolSunDTOComman.getBikeregistrationNumber();
			
			String rname = serv2ToRolSunDTOComman.getRname();
			String rmobile = serv2ToRolSunDTOComman.getRmobile();
			String remail = serv2ToRolSunDTOComman.getRemail();
			String rpinCode=serv2ToRolSunDTOComman.getRpinCode();

			Serv2ToRolSunDTO serv2ToRolSunDTOComman1 = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunDTOComman1");
			String rnomines_name = serv2ToRolSunDTOComman1.getRnomines_name();
			String rnomines_relation = serv2ToRolSunDTOComman1.getRnomines_relation();
			String rselectage = serv2ToRolSunDTOComman1.getRselectage();
			String rengine_number = serv2ToRolSunDTOComman1.getRengine_number();
			String rchassis_number = serv2ToRolSunDTOComman1.getRchassis_number();
			String rfinanced = serv2ToRolSunDTOComman1.getRfinanced();
			String rtitle = serv2ToRolSunDTOComman1.getRtitle();
			String raddress= serv2ToRolSunDTOComman1.getRaddress();
			String royalBirthdate=serv2ToRolSunDTOComman1.getRoyalBirthdate();

			
			String BikeManufacturerName = serv2ToRolSunDTOComman.getBikeManufacturerName();
			String BikeModelCode = serv2ToRolSunDTOComman.getBikeModelCode();
			String BikeModelName = serv2ToRolSunDTOComman.getBikeModelName();
			String rcity =serv2ToRolSunDTOComman.getRcity();
			
			String bikePreviousInsurerName = serv2ToRolSunDTOComman.getBikePreviousInsurerName();
			String bikeclaimsMadeInPreviousPolicy = serv2ToRolSunDTOComman.getBikeclaimsMadeInPreviousPolicy();
			String bikePreviousPolicyExpiryDate = serv2ToRolSunDTOComman.getBikePreviousPolicyExpiryDate();
			String bikeNoClaimBonusPercent = serv2ToRolSunDTOComman.getBikeNoClaimBonusPercent();
			String bikeRegistrationChargesRoadTax = serv2ToRolSunDTOComman.getBikeRegistrationChargesRoadTax();
			String bikeVehicleOwnershipChanged = serv2ToRolSunDTOComman.getBikeVehicleOwnershipChanged();
			String YearOfManufacturebike = serv2ToRolSunDTOComman.getYearOfManufacturebike();
			String regDate = serv2ToRolSunDTOComman.getRegDate();
			String previousPolicyno = serv2ToRolSunDTOComman.getPreviousPolicyno();
			
		
			String rproductName =serv2ToRolSunDTOComman.getRproductName();

			/* Current Date Code */
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDateTime currentdate = LocalDateTime.now();
			LocalDateTime nextYear = currentdate.plusYears(1).minusDays(1);

			authenticationDetails authenticationDetails = new authenticationDetails();
			authenticationDetails.setAgentId(RoyalGlobalAccess.agentId);
			authenticationDetails.setApikey(RoyalGlobalAccess.apikey);

			proposerDetails proposerDetails = new proposerDetails();
			proposerDetails.setFirstName(rname);
			proposerDetails.setLastName("");
			proposerDetails.setEmailId(remail);
			proposerDetails.setMobileNo(rmobile);
			proposerDetails.setDateOfBirth(royalBirthdate);
			proposerDetails.setIsNewUser("");
			proposerDetails.setIsLoginCheck("");
			proposerDetails.setOccupation("business");
			proposerDetails.setNomineeName(rnomines_name);
			proposerDetails.setRelationshipWithNominee(rnomines_relation);
			proposerDetails.setNomineeAge(rselectage);
			proposerDetails.setRelationshipwithGuardian("");
			proposerDetails.setPermanentAddress1(raddress);
			proposerDetails.setPermanentAddress2(raddress);
			proposerDetails.setPermanentAddress3(raddress);
			proposerDetails.setPermanentAddress4(raddress);
			proposerDetails.setPermanentCity(rcity);
			proposerDetails.setPermanentPincode(rpinCode);
			proposerDetails.setResidenceAddressOne(raddress);
			proposerDetails.setResidenceAddressTwo(raddress);
			proposerDetails.setResidenceAddressThree(raddress);
			proposerDetails.setResidenceAddressFour(raddress);
			proposerDetails.setResidenceCity(rcity);
			proposerDetails.setResidencePinCode(rpinCode);
			proposerDetails.setGuardianAge("");
			proposerDetails.setSameAdressReg("yes");
			proposerDetails.setTitle(rtitle);
			
			
			vehicleDetails vehicleDetails = new vehicleDetails();
			vehicleDetails.setVehicleModelCode(BikeModelCode);
			vehicleDetails.setVehicleManufacturerName(BikeManufacturerName);
			vehicleDetails.setYearOfManufacture(YearOfManufacturebike);
			vehicleDetails.setVehicleMostlyDrivenOn("City roads");
			vehicleDetails.setIdv(idv1);
			vehicleDetails.setNoClaimBonusPercent(bikeNoClaimBonusPercent);
			vehicleDetails.setPreviousPolicyExpiryDate(bikePreviousPolicyExpiryDate);
			vehicleDetails.setPreviousPolicyType("");
			vehicleDetails.setRegistrationchargesRoadtax(bikeRegistrationChargesRoadTax);
			vehicleDetails.setVechileOwnerShipChanged(bikeVehicleOwnershipChanged);
			vehicleDetails.setPreviousInsurerName(bikePreviousInsurerName);
			vehicleDetails.setPolicyStartDate(dtf.format(currentdate));
			vehicleDetails.setPreviousPolicyNo(previousPolicyno);
			vehicleDetails.setClaimsMadeInPreviousPolicy(bikeclaimsMadeInPreviousPolicy);
			vehicleDetails.setClaimsReported("0");
			vehicleDetails.setRegistrationNumber(bikeregistrationNumber);
			vehicleDetails.setVehicleRegisteredInTheNameOf("Company");
			vehicleDetails.setModelName(BikeModelName);
			vehicleDetails.setVehicleRegDate(regDate);
			vehicleDetails.setProductname(rproductName);
			vehicleDetails.setCompanyNameForCar(BikeManufacturerName);
			vehicleDetails.setIsTwoWheelerFinanced("No");
			vehicleDetails.setVehicleSubLine("motorCycle");
			vehicleDetails.setFuelType("Petrol");
			vehicleDetails.setRegion("East Region");
			vehicleDetails.setCarRegisteredCity(rcity);
			vehicleDetails.setChassisNumber(rchassis_number);
			vehicleDetails.setEngineNumber(rengine_number);
			vehicleDetails.setTypeOfCover("Bundled");
			
			CALCULATEPREMIUMREQUEST calculatePremium = new CALCULATEPREMIUMREQUEST();
			calculatePremium.setAuthenticationDetails(authenticationDetails);

			calculatePremium.setProposerDetails(proposerDetails);
			calculatePremium.setVehicleDetails(vehicleDetails);
			calculatePremium.setQuoteId(quoteId1);
			calculatePremium.setReqType("XML");
			calculatePremium.setResType("XML");
			
			String xmlString = "";

			JAXBContext context = JAXBContext.newInstance(CALCULATEPREMIUMREQUEST.class);
			Marshaller m = context.createMarshaller();

			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

			StringWriter sw = new StringWriter();
			m.marshal(calculatePremium, sw);
			xmlString = sw.getBuffer().toString();

			System.out.println(xmlString);
			// ...... unmarshelling

			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(RoyalGlobalAccess.bikeBrandnewUpdateVehiclesURL);
			post.addHeader("content-type", "application/xml");
			 post.addHeader("Accept", "application/xml");
			StringEntity userEntity = new StringEntity(sw.getBuffer().toString());
			post.setEntity(userEntity);
			HttpResponse response1 = client.execute(post);
			int statusCode = response1.getStatusLine().getStatusCode();
			String res_xml = EntityUtils.toString(response1.getEntity());
			System.out.println(res_xml);
			pw.println(res_xml);
			System.out.println("statusCode  " + statusCode);

			// OUR code here

			JAXBContext jContext = JAXBContext.newInstance(PREMIUMDETAILS.class);
			Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
			StreamSource streamSource = new StreamSource(new StringReader(res_xml));
			JAXBElement<PREMIUMDETAILS> je = unmarshallerObj.unmarshal(streamSource, PREMIUMDETAILS.class);
			PREMIUMDETAILS pREMIUMDETAILS = (PREMIUMDETAILS) je.getValue();
			System.out.println(pREMIUMDETAILS.getDATA());
			System.out.println(pREMIUMDETAILS.getStatus());
			DATA data1 =  pREMIUMDETAILS.getDATA();
			System.out.println(data1.getGROSS_PREMIUM());
			System.out.println(data1.getQUOTE_ID());
			System.out.println(data1.getIDV());
			session.setAttribute("data1",data1 );
			pw.print(pREMIUMDETAILS.getDATA());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

    
    
    public static void brandnewBikeProposalService(HttpServletRequest request, HttpServletResponse response) {
		try {

			PrintWriter pw = response.getWriter();
			HttpSession session = request.getSession();

			Serv2ToRolSunDTO serv2ToRolSunDTOComman = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunDTOComman");

			String remail = serv2ToRolSunDTOComman.getRemail();

			DATA data1 = (DATA) session.getAttribute("data1");
			String quoteId1 = data1.getQUOTE_ID();
			String premium = data1.getPREMIUM();

			authenticationDetails AuthenticationDetails = new authenticationDetails();
			AuthenticationDetails.setApiKey(RoyalGlobalAccess.apikey);
			AuthenticationDetails.setAgentId(RoyalGlobalAccess.agentId);
			GPROPOSALREQUEST gPROPOSALREQUEST = new GPROPOSALREQUEST();
			gPROPOSALREQUEST.setEmailId(remail);
			gPROPOSALREQUEST.setPremium(premium);
			gPROPOSALREQUEST.setQuoteId(quoteId1);
			gPROPOSALREQUEST.setAuthenticationDetails(AuthenticationDetails);

			String xmlString = "";

			JAXBContext context = JAXBContext.newInstance(GPROPOSALREQUEST.class);
			Marshaller m = context.createMarshaller();

			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

			StringWriter sw = new StringWriter();
			m.marshal(gPROPOSALREQUEST, sw);
			xmlString = sw.getBuffer().toString();

			System.out.println(xmlString);
			// ...... unmarshelling

			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(RoyalGlobalAccess.bikeBrandnewPropsalServicURL);
			post.addHeader("content-type", "application/xml");
			 post.addHeader("Accept", "application/xml");
			StringEntity userEntity = new StringEntity(sw.getBuffer().toString());
			post.setEntity(userEntity);
			HttpResponse response1 = client.execute(post);
			int statusCode = response1.getStatusLine().getStatusCode();
			String res_xml = EntityUtils.toString(response1.getEntity());
			System.out.println(res_xml);
			pw.println(res_xml);
			System.out.println("statusCode  " + statusCode);

			// OUR code here

			JAXBContext jContext = JAXBContext.newInstance(PREMIUMDETAILS.class);
			Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
			StreamSource streamSource = new StreamSource(new StringReader(res_xml));
			JAXBElement<PREMIUMDETAILS> je = unmarshallerObj.unmarshal(streamSource, PREMIUMDETAILS.class);
			PREMIUMDETAILS pREMIUMDETAILS = (PREMIUMDETAILS) je.getValue();
			System.out.println(pREMIUMDETAILS.getDATA());
			System.out.println(pREMIUMDETAILS.getStatus());
			DATA data2 =  pREMIUMDETAILS.getDATA();
			System.out.println(data2.getGROSS_PREMIUM());
			System.out.println(data2.getQUOTE_ID());
			System.out.println(data2.getIDV());
			System.out.println(data2.getPREMIUM());
			session.setAttribute("data2",data2 );
			response.sendRedirect("bikePayment.jsp");
			
		} catch (Exception e) {

		}
    }

	
	
	

    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.brandnewBikePremium(request, response);
		this.brandnewBikeUpdateDetails(request, response);
		this.brandnewBikeProposalService(request, response);
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doGet(request, response);
	}

}
