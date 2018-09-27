package Royal;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import javax.xml.transform.stream.StreamSource;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import Royal.CALCULATEPREMIUMREQUEST;
import Royal.DATA;
import Royal.GPROPOSALREQUEST;
import Royal.PREMIUMDETAILS;
import Royal.PremiumForOneYear;
import Royal.Serv2ToRolSunDTO;
import Royal.authenticationDetails;
import Royal.proposerDetails;
import Royal.vehicleDetails;

/**
 * Servlet implementation class BikeCalcuPremium
 */
@WebServlet("/BikeCalcuPremium")
public class RoyalBikePremium extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RoyalBikePremium() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void bikePremiumCalculation(HttpServletRequest request, HttpServletResponse response) {
		try {
			PrintWriter pw = response.getWriter();
			HttpSession session = request.getSession();

			Serv2ToRolSunDTO serv2ToRolSunbikeGet = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunbike");
			String bikeregistrationNumber = serv2ToRolSunbikeGet.getBikeregistrationNumber();
			Serv2ToRolSunDTO serv2ToRolSunDTCommanget = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunDTOComman");
			String rname = serv2ToRolSunDTCommanget.getRname();
			String rmobile = serv2ToRolSunDTCommanget.getRmobile();
			String remail = serv2ToRolSunDTCommanget.getRemail();
			String rpinCode=serv2ToRolSunDTCommanget.getRpinCode();
			
			
			
			Serv2ToRolSunDTO serv2ToRolSunbikeModelInfoGet = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunbikeModelInfo");
			String BikeManufacturerName = serv2ToRolSunbikeModelInfoGet.getBikeManufacturerName();
			String BikeModelCode = serv2ToRolSunbikeModelInfoGet.getBikeModelCode();
			String BikeModelName = serv2ToRolSunbikeModelInfoGet.getBikeModelName();
			String rcity =serv2ToRolSunbikeModelInfoGet.getRcity();

			Serv2ToRolSunDTO serv2ToRolSunRolloverBikeGet = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunRolloverBikeSet");
			String bikePreviousInsurerName = serv2ToRolSunRolloverBikeGet.getBikePreviousInsurerName();
			String bikeclaimsMadeInPreviousPolicy = serv2ToRolSunRolloverBikeGet.getBikeclaimsMadeInPreviousPolicy();
			String bikePreviousPolicyExpiryDate = serv2ToRolSunRolloverBikeGet.getBikePreviousPolicyExpiryDate();
			String bikeNoClaimBonusPercent = serv2ToRolSunRolloverBikeGet.getBikeNoClaimBonusPercent();
			String bikeRegistrationChargesRoadTax = serv2ToRolSunRolloverBikeGet.getBikeRegistrationChargesRoadTax();
			String bikeVehicleOwnershipChanged = serv2ToRolSunRolloverBikeGet.getBikeVehicleOwnershipChanged();
			String YearOfManufacturebike = serv2ToRolSunRolloverBikeGet.getYearOfManufacturebike();
			String regDate = serv2ToRolSunRolloverBikeGet.getRegDate();
			
			Serv2ToRolSunDTO serv2ToRolSunRolloverCarGet = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunRolloverCarSet");
			String rproductName =serv2ToRolSunRolloverCarGet.getRproductName();

			
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
			proposerDetails.setTitle("");
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
			HttpPost post = new HttpPost(RoyalGlobalAccess.BikeRollOverCalculatePremiumURL);
			post.addHeader("content-type", "application/xml");
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

			System.out.println(pREMIUMDETAILS.getPremiumForOneYear());
			System.out.println(pREMIUMDETAILS.getPremiumForTwoYears());
			System.out.println(pREMIUMDETAILS.getPremiumForThreeYears());
			PremiumForOneYear PremiumForOneYear = pREMIUMDETAILS.getPremiumForOneYear();
			System.out.println(PremiumForOneYear.getGROSS_PREMIUM());
			System.out.println(PremiumForOneYear.getIDV());
			String Idv = PremiumForOneYear.getIDV();
			session.setAttribute("PremiumForOneYear", PremiumForOneYear);
			session.setAttribute("proposerDetails", proposerDetails);
			System.out.println(pREMIUMDETAILS.getStatus());
			// String qote = session.setAttribute("A", A);
			// System.out.println(data.getQUOTE_ID());
			// String quote = session.setAttribute("quote", "data.getQUOTE_ID()");

			if (session != null) {
				session.removeAttribute("registrationNumber");
				session.removeAttribute("yearOfManufacture");
				session.removeAttribute("vehicleManufacturerName");
				session.removeAttribute("fuelType1");
				session.removeAttribute("vehicleModelCode");
				session.removeAttribute("rname");
				session.removeAttribute("rmobile");
				session.removeAttribute("remail");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void BikeUpdateVehic(HttpServletRequest request, HttpServletResponse response) {

		try {
			PrintWriter pw = response.getWriter();
			HttpSession session = request.getSession();

			PremiumForOneYear PremiumForOneYear1 = (PremiumForOneYear) session.getAttribute("PremiumForOneYear");
			String idv1 = PremiumForOneYear1.getIDV();

			Serv2ToRolSunDTO serv2ToRolSunbikeGet = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunbike");
			String bikeregistrationNumber = serv2ToRolSunbikeGet.getBikeregistrationNumber();
			Serv2ToRolSunDTO serv2ToRolSunDTCommanget = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunDTOComman");
			String rname = serv2ToRolSunDTCommanget.getRname();
			String rmobile = serv2ToRolSunDTCommanget.getRmobile();
			String remail = serv2ToRolSunDTCommanget.getRemail();
			String rpinCode=serv2ToRolSunDTCommanget.getRpinCode();

			Serv2ToRolSunDTO Serv2ToRolSunDTOBikeUpdateVehiclesGet = (Serv2ToRolSunDTO) session.getAttribute("Serv2ToRolSunDTOUpdateVehiclesSet");
			String rnomines_name = Serv2ToRolSunDTOBikeUpdateVehiclesGet.getRnomines_name();
			String rnomines_relation = Serv2ToRolSunDTOBikeUpdateVehiclesGet.getRnomines_relation();
			String rselectage = Serv2ToRolSunDTOBikeUpdateVehiclesGet.getRselectage();
			String rengine_number = Serv2ToRolSunDTOBikeUpdateVehiclesGet.getRengine_number();
			String rchassis_number = Serv2ToRolSunDTOBikeUpdateVehiclesGet.getRchassis_number();
			String rfinanced = Serv2ToRolSunDTOBikeUpdateVehiclesGet.getRfinanced();
			String rtitle = Serv2ToRolSunDTOBikeUpdateVehiclesGet.getRtitle();
			String raddress= Serv2ToRolSunDTOBikeUpdateVehiclesGet.getRaddress();
			String royalBirthdate=Serv2ToRolSunDTOBikeUpdateVehiclesGet.getRoyalBirthdate();

			Serv2ToRolSunDTO serv2ToRolSunbikeModelInfoGet = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunbikeModelInfo");
			String BikeManufacturerName = serv2ToRolSunbikeModelInfoGet.getBikeManufacturerName();
			String BikeModelCode = serv2ToRolSunbikeModelInfoGet.getBikeModelCode();
			String BikeModelName = serv2ToRolSunbikeModelInfoGet.getBikeModelName();
			String rcity =serv2ToRolSunbikeModelInfoGet.getRcity();
			Serv2ToRolSunDTO serv2ToRolSunRolloverBikeGet = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunRolloverBikeSet");
			String bikePreviousInsurerName = serv2ToRolSunRolloverBikeGet.getBikePreviousInsurerName();
			String bikeclaimsMadeInPreviousPolicy = serv2ToRolSunRolloverBikeGet.getBikeclaimsMadeInPreviousPolicy();
			String bikePreviousPolicyExpiryDate = serv2ToRolSunRolloverBikeGet.getBikePreviousPolicyExpiryDate();
			String bikeNoClaimBonusPercent = serv2ToRolSunRolloverBikeGet.getBikeNoClaimBonusPercent();
			String bikeRegistrationChargesRoadTax = serv2ToRolSunRolloverBikeGet.getBikeRegistrationChargesRoadTax();
			String bikeVehicleOwnershipChanged = serv2ToRolSunRolloverBikeGet.getBikeVehicleOwnershipChanged();
			String YearOfManufacturebike = serv2ToRolSunRolloverBikeGet.getYearOfManufacturebike();
			String regDate = serv2ToRolSunRolloverBikeGet.getRegDate();
			String previousPolicyno = serv2ToRolSunRolloverBikeGet.getPreviousPolicyno();
			
			Serv2ToRolSunDTO serv2ToRolSunRolloverCarGet = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunRolloverCarSet");
			String rproductName =serv2ToRolSunRolloverCarGet.getRproductName();


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
			proposerDetails.setNomineeAge(rselectage);
			proposerDetails.setRelationshipwithGuardian(rnomines_relation);
			proposerDetails.setPermanentAddress1(raddress);
			proposerDetails.setPermanentAddress2("");
			proposerDetails.setPermanentAddress3("");
			proposerDetails.setPermanentAddress4("");
			proposerDetails.setGuardianAge("");
			proposerDetails.setResidenceCity(rcity);
			proposerDetails.setStrTitle(rtitle);
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
			HttpPost post = new HttpPost(RoyalGlobalAccess.BikeRollOverUpdateVehiclesURL);
			post.addHeader("content-type", "application/xml");
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

			System.out.println(pREMIUMDETAILS);

			DATA data = pREMIUMDETAILS.getDATA();
			System.out.println(data.getPREMIUM());
			System.out.println(data.getQUOTE_ID());
			session.setAttribute("data", data);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void GProposalService(HttpServletRequest request, HttpServletResponse response) {
		try {

			PrintWriter pw = response.getWriter();
			HttpSession session = request.getSession();

			Serv2ToRolSunDTO serv2ToRolSunDTObike3 = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunDTOComman");

			String remail = serv2ToRolSunDTObike3.getRemail();

			DATA data = (DATA) session.getAttribute("data");
			String quoteId1 = data.getQUOTE_ID();
			String premium = data.getPREMIUM();

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
			HttpPost post = new HttpPost(RoyalGlobalAccess.BikeRollOverPropsalServicURL);
			post.addHeader("content-type", "application/xml");
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
			DATA data2 = pREMIUMDETAILS.getDATA();
			System.out.println(data2.getGROSS_PREMIUM());
			System.out.println(data2.getQUOTE_ID());

			session.setAttribute("data", data2);
			System.out.println(data2);
			System.out.println(pREMIUMDETAILS.getStatus());
			String A = data2.getQUOTE_ID();

			response.sendRedirect("bikePayment.jsp");
		} catch (Exception e) {

		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		this.bikePremiumCalculation(request, response);
		this.BikeUpdateVehic(request, response);
		this.GProposalService(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
