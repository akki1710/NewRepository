package Royal;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
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

import study.db.Db;

/**
 * Servlet implementation class RoyalCarBrandnewPremium
 */
@WebServlet("/RoyalCarBrandnewPremium")
public class RoyalCarBrandnewPremium extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RoyalCarBrandnewPremium() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void brandnewCarPremium(HttpServletRequest request, HttpServletResponse response) {
		try {
			PrintWriter pw = response.getWriter();
			HttpSession session = request.getSession();

			Serv2ToRolSunDTO serv2ToRolSunDTOComman = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunDTOComman");
			String rname = serv2ToRolSunDTOComman.getRname();
			String remail = serv2ToRolSunDTOComman.getRemail();
			String rmobile = serv2ToRolSunDTOComman.getRmobile();
			String fuelType1 = serv2ToRolSunDTOComman.getFuelType1();
			String rpinCode = serv2ToRolSunDTOComman.getRpinCode();
			String rcity = serv2ToRolSunDTOComman.getRcity();
			String registrationNumber = serv2ToRolSunDTOComman.getRegistrationNumber();
			String vehicleManufacturerName = serv2ToRolSunDTOComman.getVehicleManufacturerName();
			String vehicleModelCode = serv2ToRolSunDTOComman.getVehicleModelCode();
			String yearOfManufacture = serv2ToRolSunDTOComman.getYearOfManufacture();
			String rPreviousPolicyFromDt = serv2ToRolSunDTOComman.getrPreviousPolicyFromDt();
			String rPreviousPolicyToDt = serv2ToRolSunDTOComman.getrPreviousPolicyToDt();
			String rPreviousInsurer = serv2ToRolSunDTOComman.getrPreviousInsurer();
			String rstrPrevPolExpDt = serv2ToRolSunDTOComman.getRstrPrevPolExpDt();
			String claimAmountReceived = serv2ToRolSunDTOComman.getClaimAmountReceived();
			String claimsMadeInPreviousPolicy = serv2ToRolSunDTOComman.getClaimsMadeInPreviousPolicy();
			String claimsReported = serv2ToRolSunDTOComman.getClaimsReported();
			String isCarOwnershipChanged = serv2ToRolSunDTOComman.getIsCarOwnershipChanged();
			String rproductName = serv2ToRolSunDTOComman.getRproductName();
			String previousPolicyno = serv2ToRolSunDTOComman.getPreviousPolicyno();
			String regDate = serv2ToRolSunDTOComman.getRegDate();
			String noClaimBonusPercent = serv2ToRolSunDTOComman.getNoClaimBonusPercent();
			/* ss */
			/* Current Date Code */
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDateTime currentdate = LocalDateTime.now();
			LocalDateTime nextYear = currentdate.plusYears(1).minusDays(1);

			authenticationDetails authenticationDetails = new authenticationDetails();
			authenticationDetails.setAgentId(RoyalGlobalAccess.agentId);
			authenticationDetails.setApikey(RoyalGlobalAccess.apikey);
			proposerDetails proposerDetails = new proposerDetails();
			proposerDetails.setStrEmail(remail);
			proposerDetails.setStrFirstName(rname);
			proposerDetails.setStrMobileNo(rmobile);
			proposerDetails.setStrTitle("");
			proposerDetails.setDateOfBirth("10/10/1994");
			vehicleDetails vehicleDetails = new vehicleDetails();
			vehicleDetails.setYearOfManufacture(yearOfManufacture);
			vehicleDetails.setCarRegisteredCity(rcity);
			vehicleDetails.setVehicleManufacturerName(vehicleManufacturerName);
			vehicleDetails.setVehicleModelCode(vehicleModelCode);
			vehicleDetails.setVehicleregDate(regDate);
			vehicleDetails.setVehicleMostlyDrivenOn("hilly areas");
			vehicleDetails.setProductName(rproductName);
			vehicleDetails.setFuelType(fuelType1);
			vehicleDetails.setIsBiFuelKit("yes");
			vehicleDetails.setIsBiFuelKitYes("ADD ON");
			vehicleDetails.setAddonValue("8225");
			vehicleDetails.setNoClaimBonusPercent(noClaimBonusPercent);
			vehicleDetails.setVehicleRegisteredInTheNameOf("individual");
			vehicleDetails.setPreviousPolicyNo(previousPolicyno);
			vehicleDetails.setClaimAmountReceived(claimAmountReceived);
			vehicleDetails.setClaimsMadeInPreviousPolicy(claimsMadeInPreviousPolicy);
			vehicleDetails.setClaimsReported(claimsReported);
			vehicleDetails.setPolicyED(rPreviousPolicyFromDt);
			vehicleDetails.setPolicySD(rPreviousPolicyToDt);
			vehicleDetails.setPreviousPolicyExpiryDate(rstrPrevPolExpDt);
			vehicleDetails.setPreviousInsurerName(rPreviousInsurer);
			vehicleDetails.setIsCarOwnershipChanged(isCarOwnershipChanged);
			vehicleDetails.setDrivingExperience("2");
			vehicleDetails.setTypeOfCover("Bundled");

			CALCULATEPREMIUMREQUEST calculatePremium = new CALCULATEPREMIUMREQUEST();
			calculatePremium.setAuthenticationDetails(authenticationDetails);
			// calculatePremium.setElectronicAccessoriesDetails(electronicAccessoriesDetails);
			// calculatePremium.setNonElectronicAccessoriesDetails(NonElectronicAccessoriesDetails);
			calculatePremium.setProposerDetails(proposerDetails);
			calculatePremium.setVehicleDetails(vehicleDetails);

			calculatePremium.setReqType("XML");
			calculatePremium.setResType("XML");
			calculatePremium.setIsNewUser("Yes");

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
			HttpPost post = new HttpPost(RoyalGlobalAccess.CarBrandnewCalculatePremiumURL);
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

			System.out.println(pREMIUMDETAILS.getDATA());
			DATA data = pREMIUMDETAILS.getDATA();

			System.out.println(data.getGROSS_PREMIUM());
			System.out.println(data.getQUOTE_ID());
			System.out.println(data.getIDV());
			session.setAttribute("data", data);
			session.setAttribute("proposerDetails", proposerDetails);
			System.out.println(data);
			System.out.println(pREMIUMDETAILS.getStatus());
			String A = data.getQUOTE_ID();

			// String qote = session.setAttribute("A", A);
			// System.out.println(data.getQUOTE_ID());
			// String quote = session.setAttribute("quote", "data.getQUOTE_ID()");
			String quoteid = serv2ToRolSunDTOComman.getQUOTE_ID();

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

	public static void brandnewCarUpdateDetails(HttpServletRequest request, HttpServletResponse response) {

		try {

			PrintWriter pw = response.getWriter();
			HttpSession session = request.getSession();

			DATA data = (DATA) session.getAttribute("data");
			String quoteId1 = data.getQUOTE_ID();
			String idv = data.getIDV();

			Serv2ToRolSunDTO serv2ToRolSunDTOComman1 = (Serv2ToRolSunDTO) session
					.getAttribute("serv2ToRolSunDTOComman1");
			String rnomines_name = serv2ToRolSunDTOComman1.getRnomines_name();
			String rnomines_relation = serv2ToRolSunDTOComman1.getRnomines_relation();
			String rselectage = serv2ToRolSunDTOComman1.getRselectage();
			String rengine_number = serv2ToRolSunDTOComman1.getRengine_number();
			String rchassis_number = serv2ToRolSunDTOComman1.getRchassis_number();
			String rfinanced = serv2ToRolSunDTOComman1.getRfinanced();
			String raddress = serv2ToRolSunDTOComman1.getRaddress();
			String rtitle = serv2ToRolSunDTOComman1.getRtitle();
			String royalBirthdate = serv2ToRolSunDTOComman1.getRoyalBirthdate();
			String rfinancierName = serv2ToRolSunDTOComman1.getRfinancierName();
			String rfinancierCity = serv2ToRolSunDTOComman1.getRfinancierCity();

			Serv2ToRolSunDTO serv2ToRolSunDTOComman = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunDTOComman");
			String registrationNumber = serv2ToRolSunDTOComman.getRegistrationNumber();
			String yearOfManufacture = serv2ToRolSunDTOComman.getYearOfManufacture();
			String vehicleManufacturerName = serv2ToRolSunDTOComman.getVehicleManufacturerName();
			String fuelType1 = serv2ToRolSunDTOComman.getFuelType1();
			String vehicleModelCode = serv2ToRolSunDTOComman.getVehicleModelCode();
			String rname = serv2ToRolSunDTOComman.getRname();
			String rmobile = serv2ToRolSunDTOComman.getRmobile();
			String remail = serv2ToRolSunDTOComman.getRemail();
			String rpinCode = serv2ToRolSunDTOComman.getRpinCode();
			String rcity = serv2ToRolSunDTOComman.getRcity();
			// Rollover

			String rPreviousPolicyFromDt = serv2ToRolSunDTOComman.getrPreviousPolicyFromDt();
			String rPreviousPolicyToDt = serv2ToRolSunDTOComman.getrPreviousPolicyToDt();
			String rPreviousInsurer = serv2ToRolSunDTOComman.getrPreviousInsurer();
			String rstrPrevPolExpDt = serv2ToRolSunDTOComman.getRstrPrevPolExpDt();
			String claimAmountReceived = serv2ToRolSunDTOComman.getClaimAmountReceived();
			String claimsMadeInPreviousPolicy = serv2ToRolSunDTOComman.getClaimsMadeInPreviousPolicy();
			String claimsReported = serv2ToRolSunDTOComman.getClaimsReported();
			String isCarOwnershipChanged = serv2ToRolSunDTOComman.getIsCarOwnershipChanged();
			String noClaimBonusPercent = serv2ToRolSunDTOComman.getNoClaimBonusPercent();
			String rproductName = serv2ToRolSunDTOComman.getRproductName();

			// Current Date Code
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDateTime currentdate = LocalDateTime.now();
			LocalDateTime nextYear = currentdate.plusYears(1).minusDays(1);

			authenticationDetails authenticationDetails = new authenticationDetails();
			authenticationDetails.setAgentId(RoyalGlobalAccess.agentId);
			authenticationDetails.setApikey(RoyalGlobalAccess.apikey);

			proposerDetails proposerDetails = new proposerDetails();
			proposerDetails.setAadharNumber("");
			proposerDetails.setAddressfour("");
			proposerDetails.setAddressone(raddress);
			proposerDetails.setAddressThree("");
			proposerDetails.setAddressTwo("");
			proposerDetails.setContactAddress1(raddress);
			proposerDetails.setContactAddress2("");
			proposerDetails.setContactAddress3("");
			proposerDetails.setContactAddress4("");
			proposerDetails.setContactCity(rcity);
			proposerDetails.setContactPincode("");
			proposerDetails.setDateOfBirth(royalBirthdate);
			proposerDetails.setGuardianAge("");
			proposerDetails.setGuardianName("");
			proposerDetails.setOccupation("");
			proposerDetails.setNomineeAge(rselectage);
			proposerDetails.setNomineeName(rnomines_name);
			proposerDetails.setPanNumber("");
			proposerDetails.setRegCity(rcity);
			proposerDetails.setRegPinCode(rpinCode);
			proposerDetails.setRelationshipwithGuardian("");
			proposerDetails.setRelationshipWithNominee(rnomines_relation);
			proposerDetails.setSame_addr_reg("");
			proposerDetails.setStrEmail(remail);
			proposerDetails.setStrFirstName(rname);
			proposerDetails.setStrMobileNo(rmobile);
			proposerDetails.setStrPhoneNo("");
			proposerDetails.setStrStdCode("");
			proposerDetails.setStrTitle(rtitle);

			vehicleDetails vehicleDetails = new vehicleDetails();
			// vehicleDetails.setElectronicAccessoriesDetails(electronicAccessoriesDetails);
			// vehicleDetails.setNonElectronicAccessoriesDetails(nonElectronicAccessoriesDetails);
			vehicleDetails.setYearOfManufacture("2018");
			vehicleDetails.setCarRegisteredCity(rcity);
			vehicleDetails.setRegion("South Region");
			vehicleDetails.setQuoteId(quoteId1);
			vehicleDetails.setVehicleManufacturerName(vehicleManufacturerName);
			vehicleDetails.setVehicleModelCode(vehicleModelCode);
			vehicleDetails.setVehicleregDate(dtf.format(currentdate));
			vehicleDetails.setIdv(idv);
			vehicleDetails.setEngineCapacityAmount("1955 CC");
			vehicleDetails.setDrivingExperience("2");
			vehicleDetails.setVehicleMostlyDrivenOn("hilly areas");
			vehicleDetails.setAverageMonthlyMileageRun("");
			vehicleDetails.setVehicleSubLine("");
			vehicleDetails.setProductName(rproductName);
			vehicleDetails.setFuelType(fuelType1);
			vehicleDetails.setIsBiFuelKit("yes");
			vehicleDetails.setIsBiFuelKitYes("ADD ON");
			vehicleDetails.setAddonValue("8225");
			vehicleDetails.setAutomobileAssociationMembership("");
			vehicleDetails.setVehicleRegisteredInTheNameOf("individual");
			vehicleDetails.setCompanyNameForCar("");

			vehicleDetails.setHdnLossOfBaggage("");
			vehicleDetails.setValueOfLossOfBaggage("");
			vehicleDetails.setIsCarFinanced(rfinanced);
			vehicleDetails.setIsCarFinancedValue("Lease");
			vehicleDetails.setFinancierName(rfinancierName);
			vehicleDetails.setAccidentcoverforpaiddriver("");
			vehicleDetails.setPersonalaccidentcoverforunnamedpassengers("");
			vehicleDetails.setLegalliabilitytopaiddriver("");
			vehicleDetails.setFibreglass("");
			vehicleDetails.setCover_elec_acc("");

			vehicleDetails.setRegistrationNumber(registrationNumber);
			vehicleDetails.setChassisNumber(rchassis_number);
			vehicleDetails.setEngineNumber(rengine_number);
			vehicleDetails.setIsCarFinanced(rfinanced);
			vehicleDetails.setIsCarFinancedValue("Lease");
			vehicleDetails.setFinancierName(rfinancierName);
			vehicleDetails.setPreviousInsurerName(rPreviousInsurer);
			vehicleDetails.setPreviuosPolicyNumber("1020");
			vehicleDetails.setPreviousinsurersCorrectAddress("");
			vehicleDetails.setPreviousPolicyExpiryDate(rstrPrevPolExpDt);
			vehicleDetails.setPolicyED(rPreviousPolicyToDt);
			vehicleDetails.setPolicySD(rPreviousPolicyFromDt);
			vehicleDetails.setClaimAmountReceived(claimAmountReceived);
			vehicleDetails.setClaimsMadeInPreviousPolicy(claimsMadeInPreviousPolicy);
			vehicleDetails.setClaimsReported(claimsReported);
			vehicleDetails.setIsCarOwnershipChanged(isCarOwnershipChanged);
			vehicleDetails.setNoClaimBonusPercent(noClaimBonusPercent);
			vehicleDetails.setDrivingExperience("2");
			vehicleDetails.setTypeOfCover("Bundled");
			CALCULATEPREMIUMREQUEST calculatePremium = new CALCULATEPREMIUMREQUEST();
			calculatePremium.setAuthenticationDetails(authenticationDetails);
			// calculatePremium.setElectronicAccessoriesDetails(electronicAccessoriesDetails);
			// calculatePremium.setNonElectronicAccessoriesDetails(NonElectronicAccessoriesDetails);
			calculatePremium.setProposerDetails(proposerDetails);
			calculatePremium.setVehicleDetails(vehicleDetails);

			calculatePremium.setReqType("XML");
			calculatePremium.setResType("XML");
			calculatePremium.setIsNewUser("Yes");
			calculatePremium.setQuoteId(quoteId1);

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
			HttpPost post = new HttpPost(RoyalGlobalAccess.CarBrandnewUpdateVehiclesURL);
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
			DATA data1 = pREMIUMDETAILS.getDATA();
			System.out.println(data1.getGROSS_PREMIUM());
			System.out.println(data1.getIDV());
			session.setAttribute("data1", data1);
			System.out.println(data1);
			System.out.println(pREMIUMDETAILS.getStatus());
			// response.sendRedirect("termquotes.jsp");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void brandnewCarPropsalService(HttpServletRequest request, HttpServletResponse response) {
		try {
			PrintWriter pw = response.getWriter();
			HttpSession session = request.getSession();

			Serv2ToRolSunDTO serv2ToRolSunDTOComman = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunDTOComman");
			String remail = serv2ToRolSunDTOComman.getRemail();
			String rname = serv2ToRolSunDTOComman.getRname();
			String rphoneno = serv2ToRolSunDTOComman.getRmobile();

			DATA data1 = (DATA) session.getAttribute("data1");
			String quoteId1 = data1.getQUOTE_ID();
			String premium = data1.getPREMIUM();

			GPROPOSALREQUEST pROPOSALREQUEST = new GPROPOSALREQUEST();

			authenticationDetails rsauthenticationDetails = new authenticationDetails();
			rsauthenticationDetails.setAgentId(RoyalGlobalAccess.agentId);
			rsauthenticationDetails.setApikey(RoyalGlobalAccess.apikey);

			pROPOSALREQUEST.setPremium(premium);
			pROPOSALREQUEST.setQuoteId(quoteId1);
			pROPOSALREQUEST.setReqType("xml");
			pROPOSALREQUEST.setStrEmail(remail);
			pROPOSALREQUEST.setAuthenticationDetails(rsauthenticationDetails);
			pROPOSALREQUEST.setIsOTPVerified("yes");

			String xmlString = "";

			JAXBContext context = JAXBContext.newInstance(GPROPOSALREQUEST.class);
			Marshaller m = context.createMarshaller();

			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

			StringWriter sw = new StringWriter();
			m.marshal(pROPOSALREQUEST, sw);
			xmlString = sw.getBuffer().toString();

			System.out.println(xmlString);
			// ...... unmarshelling

			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(RoyalGlobalAccess.CarBrandnewPropsalServiceURL);
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
			DATA data2 = pREMIUMDETAILS.getDATA();
			System.out.println(data2.getGROSS_PREMIUM());
			System.out.println(data2.getQUOTE_ID());

			session.setAttribute("data2", data2);
			System.out.println(data2);
			System.out.println(pREMIUMDETAILS.getStatus());
			String A = data2.getQUOTE_ID();

			String quoteId2 = data2.getQUOTE_ID();

			String motor_policy = "RoyalSundaram Car Brandnew Policy";
			Connection con = Db.myGetConnection();
			if (rphoneno != null) {
				String s = "insert into final_details(ProposalNo, ApprovePolNo,TotalPremium,PolicyName,FullName,Email,Mobile) values(?,?,?,?,?,?,?)";
				PreparedStatement stmt = con.prepareStatement(s);

				stmt.setString(1, quoteId1);
				stmt.setString(2, quoteId2);
				stmt.setString(3, premium);
				stmt.setString(4, motor_policy);
				stmt.setString(5, rname);
				stmt.setString(6, remail);
				stmt.setString(7, rphoneno);
				stmt.executeUpdate();
				stmt.close();

				System.out.println("insert");
			}

			response.sendRedirect("RoyalPaymentDetails.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.brandnewCarPremium(request, response);
		this.brandnewCarUpdateDetails(request, response);
		this.brandnewCarPropsalService(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
