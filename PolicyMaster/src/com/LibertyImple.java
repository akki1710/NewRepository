package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class LibertyImple {

	public static void BikeCarPostPremiumDetailsHalfQuote(HttpServletRequest request, HttpServletResponse response) throws IOException, Exception{
		
		
		
		 System.out.println("liberty half quote called");
		 PrintWriter pw = response.getWriter();
		 HttpSession session = request.getSession();
		 
		 try{
		 User userpoj=(User) session.getAttribute("userpoj");
		 PostPremiumDetails postd=new PostPremiumDetails();
		 PostPremiumDetails postde = (PostPremiumDetails) session.getAttribute("postd");
		 
		 String reg_year = (String) session.getAttribute("reg_year");
		 String ncb = postde.getPreviousYearNCBPercentage();
		 String insurer = postde.getPreviousPolicyInsurerName();
		 String PrePolicyExpDate = postde.getPreviousPolicyEndDate();
		 String NewPolStartDate = postde.getPolicyStartDate();
		 String NewPolEndDate = postde.getPolicyEndDate();
		 String PreviousPolicyStartDate = postde.getPreviousPolicyStartDate();
		 String MakeCode =postde.getMakeCode();
		 String ModelCode = postde.getModelCode();
		 String BusinessType = postde.getBusinessType();
		 String productCode =postde.getProductCode();
		 String BuyerState = postde.getBuyerState();
		 String RtoCode = userpoj.getStrRTOCode();
		 String ManfYear = postde.getManfYear();
		 String RegNo1 = postde.getRegNo1();
		 String RegNo2 = postde.getRegNo2();
		 String RegNo3 = postde.getRegNo3();
		 String RegNo4 = postde.getRegNo4();
		 
		 System.out.println("Reg Year : "+reg_year);
		 System.out.println("ncb : "+ncb);
		 System.out.println("insurer : "+insurer);
		 System.out.println("PrePolicyExpDate : "+PrePolicyExpDate);
		 System.out.println("NewPolStartDate : "+NewPolStartDate);
		 System.out.println("NewPolEndDate : "+NewPolEndDate);
		 System.out.println("PreviousPolicyStartDate : "+PreviousPolicyStartDate);
		 System.out.println("MakeCode : "+MakeCode);
		 System.out.println("ModelCode : "+ModelCode);
		 System.out.println("BusinessType : "+BusinessType);
		 System.out.println("productCode : "+productCode);
		 System.out.println("BuyerState : "+BuyerState);
		 System.out.println("RtoCode  : "+RtoCode);
		 System.out.println("BikeManfYear : "+ManfYear);
		 System.out.println("RegNo1 : "+RegNo1);
		 System.out.println("RegNo2 : "+RegNo2);
		 System.out.println("RegNo3 : "+RegNo3);
		 System.out.println("RegNo4 : "+RegNo4);
		
		 
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
	        String month =Integer.toString(currentdate.getMonthValue()-3);
	        String year = Integer.toString(currentdate.getYear());
	        
	        postd.setQuickQuoteNumber(saltStr);
	        postd.setIsFullQuote(false);
	        postd.setMakeCode(MakeCode);
	        postd.setModelCode(ModelCode);
			postd.setRtoCode(RtoCode);
	        postd.setRegNo1(RegNo1);
	        postd.setRegNo2(RegNo2);
	        postd.setRegNo3(RegNo3);
	        postd.setRegNo4(RegNo4);
			postd.setVehicleIDV(0);
			postd.setProductCode(productCode);
			postd.setPolicyTenure("1");
			postd.setTPSourceName("PolicyMaster");
	       // postd.setTPSourceName("TPService");
			postd.setIMDNumber("IMD1101839");
	        postd.setBuyerState(BuyerState);
	        postd.setAgentCode("");
	       
	        
	        if(reg_year.equals("Brandnew"))
	        {
	       
	        postd.setManfMonth(month);
	        postd.setManfYear(year);
	        postd.setDeliveryDate(dtf.format(currentdate));
	        postd.setRegistrationDate(dtf.format(currentdate));
	        postd.setPolicyStartDate(dtf.format(currentdate));
	        postd.setPolicyEndDate(dtf.format(nextYear));
	        postd.setBusinessType("New Business");
	        postd.setNoPreviousPolicyHistory(true);
	        
	        }
	        else{
	        	
		        postd.setManfMonth("01");
		        postd.setManfYear(ManfYear);
		        postd.setDeliveryDate(reg_year+"/01/01");
		        postd.setRegistrationDate(reg_year+"/01/01");
		        postd.setPolicyStartDate(NewPolStartDate);
		        postd.setPolicyEndDate(NewPolEndDate);
		        postd.setBusinessType("Roll Over");
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
			
			
		    HttpPost post1 = new HttpPost("https://api.libertyinsurance.in/Motor/API/IMDTPService/PostPremiumDetails");
		   // HttpPost post1 = new HttpPost("http://168.87.83.122:8180/api/IMDTPService/PostPremiumDetails");
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
			
			//----------------------b----------------------------
			postd.setProposalNumber(ProposalNumber);//b
			postd.setTotalPremium(TotalPremium);//b
			postd.setCurrentIDV(CurrentIDV);//b
			session.setAttribute("postd", postd);//b
			//--------------------------------------------------------
			
			System.out.println("\nProposalNumber : "+ProposalNumber);
			System.out.println("TotalPremium : "+TotalPremium);
			System.out.println("CurrentIDV1 : "+CurrentIDV);
			
		 } catch (Exception e){
			 e.printStackTrace();
		 }
	}



public static void BikeCarPostPremiumDetailsFullQuote(HttpServletRequest request, HttpServletResponse response) throws IOException, Exception{

	System.out.println("liberty full quote called");
	 PrintWriter pw = response.getWriter();
	 HttpSession session = request.getSession();
	 HttpClient client = HttpClientBuilder.create().build();
	 
	try{
		
		 User userpoj=(User) session.getAttribute("userpoj");
		 PostPremiumDetails postde = (PostPremiumDetails) session.getAttribute("postd");
		 CustmerObj custmpojo = (CustmerObj)session.getAttribute("custpojo");
		 Proposal1 proppojo=(Proposal1) session.getAttribute("proppojo");
		 
		 String reg_year = (String) session.getAttribute("reg_year");
		 
		 
		 String ncb = postde.getPreviousYearNCBPercentage();
		 String insurer = postde.getPreviousPolicyInsurerName();
		 String PrePolicyExpDate = postde.getPreviousPolicyEndDate();
		 String NewPolStartDate = postde.getPolicyStartDate();
		 String NewPolEndDate = postde.getPolicyEndDate();
		 String PreviousPolicyStartDate = postde.getPreviousPolicyStartDate();
		 String MakeCode =postde.getMakeCode();
		 String ModelCode = postde.getModelCode();
		 String BusinessType = postde.getBusinessType();
		 String productCode =postde.getProductCode();
		 String BuyerState = postde.getBuyerState();
		 String RtoCode = userpoj.getStrRTOCode();
		 String ManfYear = postde.getManfYear();
		 String RegNo1 = postde.getRegNo1();
		 String RegNo2 = postde.getRegNo2();
		 String RegNo3 = postde.getRegNo3();
		 String RegNo4 = postde.getRegNo4();
		 
		 String Salutation = custmpojo.getSalutation();
		 String AddressLine1 = custmpojo.getAddressLine1();
		 String PinCode = custmpojo.getPinCode();
		 String FirstName = custmpojo.getFirstName();
		 String LastName = custmpojo.getLastName();
		 String EmailId = custmpojo.getEmailID();
		 String MobileNo = custmpojo.getMobileNumber();
		 String PanNo = custmpojo.getPanNo();
		 
		 String DateOfBirth=proppojo.getDateOfBirth();
		 String EngineNo=proppojo.getEngineNo();
		 String ChassisNo=proppojo.getChassisNo();
		 
		 String nomineeAge=proppojo.getNomineeAgeforPAOwnerDriver();
		 String appointee_name= proppojo.getAppointeeNameforPAOwnerDriver();
		 String appointee_relation= proppojo.getAppointeeRelationforPAOwnerDriver();
		 String NomineeNameforPAOwnerDriver=proppojo.getNomineeNameforPAOwnerDriver();
		 String NomineeRelationforPAOwnerDriver=proppojo.getNomineeRelationforPAOwnerDriver();
		 
		 String s1=NomineeNameforPAOwnerDriver;
		 String[] words=s1.split("\\s");
		 
		 Double CurrentIDV1 = postde.getCurrentIDV();
		 
		 String[] minor_app=new String[3];
		 if(Integer.parseInt(nomineeAge)<18) {
			 minor_app=appointee_name.split(" "); //"Hay Mack"
		 }else {
			
			 minor_app[0]="";
			 minor_app[1]="";
		}
		 
			 
		 boolean Isminor=false;
		 if(Integer.parseInt(nomineeAge)>17)
		 {
			 System.out.println("If Minor called : "+nomineeAge);
			  Isminor=false;
		 }else {
			 System.out.println("else Minor called : "+nomineeAge);
			  Isminor=true;
		 }
		
		 
		 LibFullPostPremiumDetail postd2=new LibFullPostPremiumDetail();
			
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
	       String CurrentDate=dtf.format(currentdate);
	       String month =Integer.toString(currentdate.getMonthValue()-3);
	       String year = Integer.toString(currentdate.getYear());
	       
	       if(reg_year.equals("Brandnew"))
	       {
	       postd2.setQuickQuoteNumber(saltStr);
	       postd2.setIsFullQuote(true);
	       postd2.setMakeCode(MakeCode);// b done
	       postd2.setModelCode(ModelCode);//b done
	       postd2.setManfMonth(month);//b done
	       postd2.setManfYear(year);//b done
	       postd2.setRtoCode(RtoCode);//b done
	       postd2.setRegNo1(RegNo1);// b done
	       postd2.setRegNo2(RegNo2);// b done
	       postd2.setRegNo3(RegNo3);// b done
	       postd2.setRegNo4(RegNo4);// b done
	       postd2.setDeliveryDate(dtf.format(currentdate));
	       postd2.setRegistrationDate(dtf.format(currentdate));
	       postd2.setVehicleIDV(CurrentIDV1);
	       postd2.setProductCode(productCode);//b done
	       postd2.setPolicyStartDate(dtf.format(currentdate));
	       postd2.setPolicyEndDate(dtf.format(nextYear));
	       postd2.setPolicyTenure("1");
	       postd2.setTPSourceName("PolicyMaster");
	     //  postd2.setTPSourceName("TPService");
	       postd2.setBusinessType("New Business");
	       postd2.setBuyerState(BuyerState);
	       postd2.setIMDNumber("IMD1101839");
	       postd2.setAgentCode("");
	       postd2.setEngineNo(EngineNo);
	       postd2.setChassisNo(ChassisNo);
	       postd2.setConsumableCover("");
	       postd2.setDepreciationCover("");
	       postd2.setRoadSideAsstCover("");
	       postd2.setGAPCover("");
	       postd2.setGAPCoverSI(0);
	       postd2.setEngineSafeCover("");
	       postd2.setKeyLossCover("");
	       postd2.setKeyLossCoverSI(0);
	       postd2.setPassengerAsstCover("");
	       postd2.setNoOfPassengerForLLToEmployee(1);
	       postd2.setNoOfPassengerForLLToPaidDriver(1);
	       postd2.setLegalliabilityToEmployee("");
	       postd2.setLegalLiabilityToPaidDriver("yes");
	       postd2.setPAUnnamed("yes");
	       postd2.setNoOfPernamed(1);
	       postd2.setNoOfPerunnamed(0);
	       postd2.setUnnamedPASI(0);
	       postd2.setPAOwnerDriver("yes");
	       postd2.setElectricalAccessories("no");
	       postd2.setNonElectricalAccessories("no");
	       postd2.setExternalFuelKit("");
	       postd2.setRelatedDetails(false);
	       postd2.setFuelType("");
	       postd2.setFuelSI(0);
	       postd2.setNamedPASI(0);
	       postd2.setNoNomineeDetails(false);
	       postd2.setNomineeFirstName(words[0]);
	       postd2.setNomineeMiddleName("");
	       postd2.setNomineelastName(words[1]);
	       postd2.setNomineeRelationship(NomineeRelationforPAOwnerDriver);
	       postd2.setOtherRelation("");
	       postd2.setIsMinor(Isminor);
	       postd2.setRepFirstName(minor_app[0]);
	       postd2.setRepLastName(minor_app[1]);
	       postd2.setRepOtherRelation("");
	       postd2.setRepRelationWithMinor(appointee_relation);
	       postd2.setReportDate(null);
	       postd2.setNoPreviousPolicyHistory(true);
	       postd2.setPreviousPolicyInsurerName("");
	       postd2.setPreviousPolicyNumber("");
	       postd2.setPreviousPolicyType("");
	       postd2.setPreviousPolicyStartDate(null);
	       postd2.setPreviousPolicyEndDate(null);
	       postd2.setPreviousYearNCBPercentage(null);
	       postd2.setClaimAmount(0);
	       postd2.setNoOfClaims(0);
	       postd2.setIsInspectionDone(false);
	       postd2.setInspectionDoneByWhom("");
	       postd2.setInspectionDate(null);
	       postd2.setReportDate(null);
	       postd2.setIsFinancierDetails("");
	       postd2.setAgreementType("");
	       postd2.setFinancierName("");
	       postd2.setFinancierAddress("");
			 CustmerObj custmerObj1=new CustmerObj();	
			 custmerObj1.setTPSource("PolicyMaster");
			// custmerObj1.setTPSource("TPService");
			 custmerObj1.setCustomerType("I");
			 custmerObj1.setFirstName(FirstName);//b done
			 custmerObj1.setLastName(LastName);//b done
			 custmerObj1.setSalutation(Salutation);//b done 
			 custmerObj1.setDOB(DateOfBirth);
			 custmerObj1.setEmailID(EmailId);//b done
			 custmerObj1.setMobileNumber(MobileNo);//b done
			 custmerObj1.setAddressLine1(AddressLine1);//b done 
			 custmerObj1.setAddressLine2("");
			 custmerObj1.setAddressLine3("");
			 custmerObj1.setPinCodeLocality("");
			 custmerObj1.setPinCode(PinCode);// b done
			 custmerObj1.setPanNo(PanNo);//b edit bt nt mendatory
			 custmerObj1.setPermanentLocationSameAsMailLocation(true);
			 custmerObj1.setMailingAddressLine1("");
			 custmerObj1.setMailingPinCode("");
			 custmerObj1.setMailingPinCodeLocality("");
			 custmerObj1.setGSTIN("");
			 custmerObj1.setIsEIAAvailable("");
			 custmerObj1.setEIAAccNo("");
			 custmerObj1.setIsEIAPolicy("no");
			 custmerObj1.setEIAAccWith("");
			 custmerObj1.setEIAAccNo("");
			 custmerObj1.setEIAPanNo("");
			 custmerObj1.setEIAUIDNo("");
	       postd2.setCustmerObj(custmerObj1);// b done
	       }
	       else{
	       	postd2.setQuickQuoteNumber(saltStr);
		        postd2.setIsFullQuote(true);
		        postd2.setMakeCode(MakeCode);
		        postd2.setModelCode(ModelCode);
		        postd2.setManfMonth("01");
		        postd2.setManfYear(ManfYear);//bdone
		        postd2.setRtoCode(RtoCode);
		        postd2.setRegNo1(RegNo1);
		        postd2.setRegNo2(RegNo2);
		        postd2.setRegNo3(RegNo3);
		        postd2.setRegNo4(RegNo4);
		        postd2.setDeliveryDate(reg_year+"/01/01");
		        postd2.setRegistrationDate(reg_year+"/01/01");
		        postd2.setVehicleIDV(CurrentIDV1);
		        postd2.setProductCode(productCode);
		        postd2.setPolicyStartDate(NewPolStartDate);
		        postd2.setPolicyEndDate(NewPolEndDate);
		        postd2.setPolicyTenure("1");
		        postd2.setTPSourceName("PolicyMaster");
		      //  postd2.setTPSourceName("TPService");
		        postd2.setBusinessType("Roll Over");
		        postd2.setBuyerState(BuyerState);
		        postd2.setIMDNumber("IMD1101839");
		        postd2.setAgentCode("");
		        postd2.setEngineNo(EngineNo);
		        postd2.setChassisNo(ChassisNo);
		        postd2.setConsumableCover("");
		        postd2.setDepreciationCover("");
		        postd2.setRoadSideAsstCover("");
		        postd2.setGAPCover("");
		        postd2.setGAPCoverSI(0);
		        postd2.setEngineSafeCover("");
		        postd2.setKeyLossCover("");
		        postd2.setKeyLossCoverSI(0);
		        postd2.setPassengerAsstCover("");
		        postd2.setNoOfPassengerForLLToEmployee(1);
		        postd2.setNoOfPassengerForLLToPaidDriver(1);
		        postd2.setLegalliabilityToEmployee("");
		        postd2.setLegalLiabilityToPaidDriver("yes");
		        postd2.setPAUnnamed("yes");
		        postd2.setNoOfPernamed(1);
		        postd2.setNoOfPerunnamed(0);
		        postd2.setUnnamedPASI(0);
		        postd2.setPAOwnerDriver("yes");
		        postd2.setElectricalAccessories("no");
		        postd2.setNonElectricalAccessories("no");
		        postd2.setExternalFuelKit("");
		        postd2.setRelatedDetails(false);
		        postd2.setFuelType("");
		        postd2.setFuelSI(0);
		        postd2.setNamedPASI(0);
		        postd2.setNoNomineeDetails(false);
		        postd2.setNomineeFirstName(words[0]);
		        postd2.setNomineeMiddleName("");
		        postd2.setNomineelastName(words[1]);
		        postd2.setNomineeRelationship(NomineeRelationforPAOwnerDriver);
		        postd2.setOtherRelation("");
		        postd2.setIsMinor(Isminor);
		        postd2.setRepFirstName(minor_app[0]);
		        postd2.setRepLastName(minor_app[1]);
		        postd2.setRepOtherRelation("");
		        postd2.setRepRelationWithMinor(appointee_relation);
		        postd2.setReportDate(null);
		        postd2.setNoPreviousPolicyHistory(false);
		        postd2.setPreviousPolicyInsurerName(insurer);
		        postd2.setPreviousPolicyNumber("1234567890");
		        postd2.setPreviousPolicyType("PackagePolicy");
		        postd2.setPreviousPolicyStartDate(PreviousPolicyStartDate);
		        postd2.setPreviousPolicyEndDate(PrePolicyExpDate);
		        postd2.setPreviousYearNCBPercentage(ncb);
		        postd2.setPreviousPolicyTenure(1);
		        postd2.setClaimAmount(0);
		        postd2.setNoOfClaims(0);
		        postd2.setIsInspectionDone(false);
		        postd2.setInspectionDoneByWhom("");
		        postd2.setInspectionDate(null);
		        postd2.setReportDate(null);
		        postd2.setIsFinancierDetails("");
		        postd2.setAgreementType("");
		        postd2.setFinancierName("");
		        postd2.setFinancierAddress("");
				 CustmerObj custmerObj1=new CustmerObj();
				 custmerObj1.setTPSource("PolicyMaster");
				 //custmerObj1.setTPSource("TPService");
				 custmerObj1.setCustomerType("I");
				 custmerObj1.setFirstName(FirstName);
				 custmerObj1.setLastName(LastName);
				 custmerObj1.setSalutation(Salutation);
				 custmerObj1.setDOB(DateOfBirth);
				 custmerObj1.setEmailID(EmailId);
				 custmerObj1.setMobileNumber(MobileNo);
				 custmerObj1.setAddressLine1(AddressLine1);
				 custmerObj1.setAddressLine2("");
				 custmerObj1.setAddressLine3("");
				 custmerObj1.setPinCodeLocality("");
				 custmerObj1.setPinCode(PinCode);
				 custmerObj1.setPanNo(PanNo);//bt nt mandatory
				 custmerObj1.setPermanentLocationSameAsMailLocation(true);
				 custmerObj1.setMailingAddressLine1("");
				 custmerObj1.setMailingPinCode("");
				 custmerObj1.setMailingPinCodeLocality("");
				 custmerObj1.setGSTIN("");
				 custmerObj1.setIsEIAAvailable("");
				 custmerObj1.setEIAAccNo("");
				 custmerObj1.setIsEIAPolicy("no");
				 custmerObj1.setEIAAccWith("");
				 custmerObj1.setEIAAccNo("");
				 custmerObj1.setEIAPanNo("");
				 custmerObj1.setEIAUIDNo("");
		        postd2.setCustmerObj(custmerObj1);
	       }
					ObjectMapper objectMapper = new ObjectMapper();
					String jsonRequest=objectMapper.writeValueAsString(postd2);
					System.out.println("Request :  "+jsonRequest);
					pw.println("Request :  "+jsonRequest);
					    
					  HttpPost post1 = new HttpPost("https://api.libertyinsurance.in/Motor/API/IMDTPService/PostPremiumDetails");
					 //   HttpPost post1 = new HttpPost("http://168.87.83.122:8180/api/IMDTPService/PostPremiumDetails");
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
						String CustomerID=(String) obj.get("CustomerID");
						String QuotationNumber=(String) obj.get("QuotationNumber");
						
						String SALTCHARS1 = "LVGI";
				        StringBuilder salt1 = new StringBuilder();
				        Random rnd1 = new Random();
				        while (salt1.length() < 4) { // length of the random string.
				            int index1 = (int) (rnd1.nextFloat() * SALTCHARS1.length());
				            salt1.append(SALTCHARS1.charAt(index1));
				        }
				        String saltStr1 = salt1.toString();
				        
				        String SALTCHARS2 = "1709120000000612";
				        StringBuilder salt2 = new StringBuilder();
				        Random rnd2 = new Random();
				        while (salt2.length() < 16) { // length of the random string.
				            int index2 = (int) (rnd2.nextFloat() * SALTCHARS2.length());
				            salt2.append(SALTCHARS2.charAt(index2));
				        }
				        String saltStr2 = salt2.toString();
				        
				        String tnx=saltStr1+saltStr2;
				        
				        
						String FullName = FirstName+" "+LastName;
						
						PostPremiumDetails finalresponse= new PostPremiumDetails();
						finalresponse.setTxn(tnx);
						finalresponse.setFullName(FullName);
						finalresponse.setQuotationNumber(QuotationNumber);
						finalresponse.setTotalPremium(TotalPremium);
						finalresponse.setCustomerID(CustomerID);
						finalresponse.setCurrentIDV(CurrentIDV);
						finalresponse.setEmailID(EmailId);
						finalresponse.setMobileNumber(MobileNo);
						finalresponse.setPaymentDate(CurrentDate);
						finalresponse.setProductCode(productCode);
						
						session.setAttribute("finalresponse", finalresponse);
						
						/*session.setAttribute("ProposalNumber", ProposalNumber);
						session.setAttribute("TotalPremium", TotalPremium);
						session.setAttribute("CustomerID", CustomerID);
						session.setAttribute("CurrentIDV", CurrentIDV);
						session.setAttribute("QuotationNumber", QuotationNumber);
						session.setAttribute("PaymentDate", CurrentDate);
						session.setAttribute("tnx", tnx);*/
						System.out.println("\nProposalNumber : "+ProposalNumber);
						System.out.println("TotalPremium : "+TotalPremium);
						System.out.println("CurrentIDV : "+CurrentIDV);
						System.out.println(tnx);
					
						response.sendRedirect("LibertyPay.jsp");
		 
		 
		
	}catch(Exception e){
		
	}
	if(session!=null){
		session.removeAttribute("posted");
		session.removeAttribute("postd");
		session.removeAttribute("custmpojo");
	}
 
}
}
