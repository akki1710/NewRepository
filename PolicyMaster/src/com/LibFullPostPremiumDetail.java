package com;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSetter;

public class LibFullPostPremiumDetail {
	
	private boolean IsFullQuote;
	private String QuickQuoteNumber;
	private String TPSourceName;
	private String MakeCode;
	private String ModelCode;
	private String ManfMonth;
	private String ManfYear;
	private String RtoCode;
	private String RegNo1;
	private String RegNo2;
	private String RegNo3;
	private String RegNo4;
	private String EngineNo;
	private String ChassisNo;
	private String RegistrationDate;
	private String DeliveryDate;
	private Double VehicleIDV;
	private String ProductCode;
	private String PolicyStartDate;
	private String PolicyEndDate;
	private String PolicyTenure;
	private String BusinessType;
	private String BuyerState;
	private String ConsumableCover;
	private String DepreciationCover;
	private String RoadSideAsstCover;
	private String GAPCover;
	private String EngineSafeCover;
	private float GAPCoverSI;
	private String KeyLossCover;
	private float KeyLossCoverSI;
	private String PassengerAsstCover;
	private String LegalLiabilityToPaidDriver;
	private int NoOfPassengerForLLToPaidDriver;
	private String LegalliabilityToEmployee;
	private float NoOfPassengerForLLToEmployee;
	private String PAUnnamed;
	private float NoOfPerunnamed;
	private float UnnamedPASI;
	private String PAOwnerDriver;
	private String ElectricalAccessories;
	private String NonElectricalAccessories;
	private String ExternalFuelKit;
	private boolean RelatedDetails;
	private String FuelType;
	private float NoOfPernamed;
    private float NamedPASI;
    private boolean NoNomineeDetails;
	private String NomineeFirstName;
    private float FuelSI;
    private String NomineeMiddleName;
    private String NomineelastName;
    private String NomineeRelationship;
    private String OtherRelation;
    private boolean IsMinor;
    private String RepFirstName;
    private String RepLastName;
    private String RepRelationWithMinor;
    private String RepOtherRelation;
    private boolean NoPreviousPolicyHistory;
    private String PreviousPolicyInsurerName;
    private String PreviousPolicyType;
    private String PreviousPolicyStartDate;
    private String PreviousPolicyEndDate;
    private String PreviousPolicyNumber;
    private float ClaimAmount;
    private float NoOfClaims;
    private String PreviousYearNCBPercentage;
    private int PreviousPolicyTenure;
    private boolean IsInspectionDone;
    private String InspectionDoneByWhom;
    private String ReportDate;
    private String InspectionDate;
    private String IsFinancierDetails;
    private String AgreementType;
    private String FinancierName;
    private String FinancierAddress;
    private CustmerObj custmerObj;
    private String IMDNumber;
    private String AgentCode;
    
	public boolean isIsFullQuote() {
		return IsFullQuote;
	}
	@JsonSetter("IsFullQuote")
	public void setIsFullQuote(boolean isFullQuote) {
		IsFullQuote = isFullQuote;
	}
	public String getQuickQuoteNumber() {
		return QuickQuoteNumber;
	}
	@JsonSetter("QuickQuoteNumber")
	public void setQuickQuoteNumber(String quickQuoteNumber) {
		QuickQuoteNumber = quickQuoteNumber;
	}
	public String getTPSourceName() {
		return TPSourceName;
	}
	@JsonSetter("TPSourceName")
	public void setTPSourceName(String tPSourceName) {
		TPSourceName = tPSourceName;
	}
	public String getMakeCode() {
		return MakeCode;
	}
	@JsonSetter("MakeCode")
	public void setMakeCode(String makeCode) {
		MakeCode = makeCode;
	}
	public String getModelCode() {
		return ModelCode;
	}
	@JsonSetter("ModelCode")
	public void setModelCode(String modelCode) {
		ModelCode = modelCode;
	}
	public String getManfMonth() {
		return ManfMonth;
	}
	@JsonSetter("ManfMonth")
	public void setManfMonth(String month1) {
		ManfMonth = month1;
	}
	public String getManfYear() {
		return ManfYear;
	}
	@JsonSetter("ManfYear")
	public void setManfYear(String year1) {
		ManfYear = year1;
	}
	public String getRtoCode() {
		return RtoCode;
	}
	@JsonSetter("RtoCode")
	public void setRtoCode(String rtoCode) {
		RtoCode = rtoCode;
	}
	public String getRegNo1() {
		return RegNo1;
	}
	@JsonSetter("RegNo1")
	public void setRegNo1(String regNo1) {
		RegNo1 = regNo1;
	}
	public String getRegNo2() {
		return RegNo2;
	}
	@JsonSetter("RegNo2")
	public void setRegNo2(String regNo2) {
		RegNo2 = regNo2;
	}
	public String getRegNo3() {
		return RegNo3;
	}
	@JsonSetter("RegNo3")
	public void setRegNo3(String regNo3) {
		RegNo3 = regNo3;
	}
	public String getRegNo4() {
		return RegNo4;
	}
	@JsonSetter("RegNo4")
	public void setRegNo4(String regNo4) {
		RegNo4 = regNo4;
	}
	public String getEngineNo() {
		return EngineNo;
	}
	@JsonSetter("EngineNo")
	public void setEngineNo(String engineNo) {
		EngineNo = engineNo;
	}
	public String getChassisNo() {
		return ChassisNo;
	}
	@JsonSetter("ChassisNo")
	public void setChassisNo(String chassisNo) {
		ChassisNo = chassisNo;
	}
	public String getRegistrationDate() {
		return RegistrationDate;
	}
	@JsonSetter("RegistrationDate")
	public void setRegistrationDate(String registrationDate) {
		RegistrationDate = registrationDate;
	}
	public String getDeliveryDate() {
		return DeliveryDate;
	}
	@JsonSetter("DeliveryDate")
	public void setDeliveryDate(String deliveryDate) {
		DeliveryDate = deliveryDate;
	}
	public Double getVehicleIDV() {
		return VehicleIDV;
	}
	@JsonSetter("VehicleIDV")
	public void setVehicleIDV(Double currentIDV1) {
		VehicleIDV = currentIDV1;
	}
	public String getProductCode() {
		return ProductCode;
	}
	@JsonSetter("ProductCode")
	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}
	public String getPolicyStartDate() {
		return PolicyStartDate;
	}
	@JsonSetter("PolicyStartDate")
	public void setPolicyStartDate(String policyStartDate) {
		PolicyStartDate = policyStartDate;
	}
	public String getPolicyEndDate() {
		return PolicyEndDate;
	}
	@JsonSetter("PolicyEndDate")
	public void setPolicyEndDate(String policyEndDate) {
		PolicyEndDate = policyEndDate;
	}
	public String getPolicyTenure() {
		return PolicyTenure;
	}
	@JsonSetter("PolicyTenure")
	public void setPolicyTenure(String policyTenure) {
		PolicyTenure = policyTenure;
	}
	public String getBusinessType() {
		return BusinessType;
	}
	@JsonSetter("BusinessType")
	public void setBusinessType(String businessType) {
		BusinessType = businessType;
	}
	public String getBuyerState() {
		return BuyerState;
	}
	@JsonSetter("BuyerState")
	public void setBuyerState(String buyerState) {
		BuyerState = buyerState;
	}
	public String getConsumableCover() {
		return ConsumableCover;
	}
	@JsonSetter("ConsumableCover")
	public void setConsumableCover(String consumableCover) {
		ConsumableCover = consumableCover;
	}
	public String getDepreciationCover() {
		return DepreciationCover;
	}
	@JsonSetter("DepreciationCover")
	public void setDepreciationCover(String depreciationCover) {
		DepreciationCover = depreciationCover;
	}
	public String getRoadSideAsstCover() {
		return RoadSideAsstCover;
	}
	@JsonSetter("RoadSideAsstCover")
	public void setRoadSideAsstCover(String roadSideAsstCover) {
		RoadSideAsstCover = roadSideAsstCover;
	}
	public String getGAPCover() {
		return GAPCover;
	}
	@JsonSetter("GAPCover")
	public void setGAPCover(String gAPCover) {
		GAPCover = gAPCover;
	}
	public String getEngineSafeCover() {
		return EngineSafeCover;
	}
	@JsonSetter("EngineSafeCover")
	public void setEngineSafeCover(String engineSafeCover) {
		EngineSafeCover = engineSafeCover;
	}
	public float getGAPCoverSI() {
		return GAPCoverSI;
	}
	@JsonSetter("GAPCoverSI")
	public void setGAPCoverSI(float gAPCoverSI) {
		GAPCoverSI = gAPCoverSI;
	}
	public String getKeyLossCover() {
		return KeyLossCover;
	}
	@JsonSetter("KeyLossCover")
	public void setKeyLossCover(String keyLossCover) {
		KeyLossCover = keyLossCover;
	}
	public float getKeyLossCoverSI() {
		return KeyLossCoverSI;
	}
	@JsonSetter("KeyLossCoverSI")
	public void setKeyLossCoverSI(float keyLossCoverSI) {
		KeyLossCoverSI = keyLossCoverSI;
	}
	public String getPassengerAsstCover() {
		return PassengerAsstCover;
	}
	@JsonSetter("PassengerAsstCover")
	public void setPassengerAsstCover(String passengerAsstCover) {
		PassengerAsstCover = passengerAsstCover;
	}
	public String getLegalLiabilityToPaidDriver() {
		return LegalLiabilityToPaidDriver;
	}
	@JsonSetter("LegalLiabilityToPaidDriver")
	public void setLegalLiabilityToPaidDriver(String legalLiabilityToPaidDriver) {
		LegalLiabilityToPaidDriver = legalLiabilityToPaidDriver;
	}
	public int getNoOfPassengerForLLToPaidDriver() {
		return NoOfPassengerForLLToPaidDriver;
	}
	@JsonSetter("NoOfPassengerForLLToPaidDriver")
	public void setNoOfPassengerForLLToPaidDriver(int noOfPassengerForLLToPaidDriver) {
		NoOfPassengerForLLToPaidDriver = noOfPassengerForLLToPaidDriver;
	}
	public String getLegalliabilityToEmployee() {
		return LegalliabilityToEmployee;
	}
	@JsonSetter("LegalliabilityToEmployee")
	public void setLegalliabilityToEmployee(String legalliabilityToEmployee) {
		LegalliabilityToEmployee = legalliabilityToEmployee;
	}
	public float getNoOfPassengerForLLToEmployee() {
		return NoOfPassengerForLLToEmployee;
	}
	@JsonSetter("NoOfPassengerForLLToEmployee")
	public void setNoOfPassengerForLLToEmployee(float noOfPassengerForLLToEmployee) {
		NoOfPassengerForLLToEmployee = noOfPassengerForLLToEmployee;
	}
	public String getPAUnnamed() {
		return PAUnnamed;
	}
	@JsonSetter("PAUnnamed")
	public void setPAUnnamed(String pAUnnamed) {
		PAUnnamed = pAUnnamed;
	}
	public float getNoOfPerunnamed() {
		return NoOfPerunnamed;
	}
	@JsonSetter("NoOfPerunnamed")
	public void setNoOfPerunnamed(float noOfPerunnamed) {
		NoOfPerunnamed = noOfPerunnamed;
	}
	public float getUnnamedPASI() {
		return UnnamedPASI;
	}
	@JsonSetter("UnnamedPASI")
	public void setUnnamedPASI(float unnamedPASI) {
		UnnamedPASI = unnamedPASI;
	}
	public String getPAOwnerDriver() {
		return PAOwnerDriver;
	}
	@JsonSetter("PAOwnerDriver")
	public void setPAOwnerDriver(String pAOwnerDriver) {
		PAOwnerDriver = pAOwnerDriver;
	}
	public String getElectricalAccessories() {
		return ElectricalAccessories;
	}
	@JsonSetter("ElectricalAccessories")
	public void setElectricalAccessories(String electricalAccessories) {
		ElectricalAccessories = electricalAccessories;
	}
	public String getNonElectricalAccessories() {
		return NonElectricalAccessories;
	}
	@JsonSetter("NonElectricalAccessories")
	public void setNonElectricalAccessories(String nonElectricalAccessories) {
		NonElectricalAccessories = nonElectricalAccessories;
	}
	public String getExternalFuelKit() {
		return ExternalFuelKit;
	}
	@JsonSetter("ExternalFuelKit")
	public void setExternalFuelKit(String externalFuelKit) {
		ExternalFuelKit = externalFuelKit;
	}
	public boolean isRelatedDetails() {
		return RelatedDetails;
	}
	@JsonSetter("RelatedDetails")
	public void setRelatedDetails(boolean relatedDetails) {
		RelatedDetails = relatedDetails;
	}
	public String getFuelType() {
		return FuelType;
	}
	@JsonSetter("FuelType")
	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}
	public float getNoOfPernamed() {
		return NoOfPernamed;
	}
	@JsonSetter("NoOfPernamed")
	public void setNoOfPernamed(float noOfPernamed) {
		NoOfPernamed = noOfPernamed;
	}
	public float getNamedPASI() {
		return NamedPASI;
	}
	@JsonSetter("NamedPASI")
	public void setNamedPASI(float namedPASI) {
		NamedPASI = namedPASI;
	}
	public boolean isNoNomineeDetails() {
		return NoNomineeDetails;
	}
	@JsonSetter("NoNomineeDetails")
	public void setNoNomineeDetails(boolean noNomineeDetails) {
		NoNomineeDetails = noNomineeDetails;
	}
	public String getNomineeFirstName() {
		return NomineeFirstName;
	}
	@JsonSetter("NomineeFirstName")
	public void setNomineeFirstName(String nomineeFirstName) {
		NomineeFirstName = nomineeFirstName;
	}
	public float getFuelSI() {
		return FuelSI;
	}
	@JsonSetter("FuelSI")
	public void setFuelSI(float fuelSI) {
		FuelSI = fuelSI;
	}
	public String getNomineeMiddleName() {
		return NomineeMiddleName;
	}
	@JsonSetter("NomineeMiddleName")
	public void setNomineeMiddleName(String nomineeMiddleName) {
		NomineeMiddleName = nomineeMiddleName;
	}
	public String getNomineelastName() {
		return NomineelastName;
	}
	@JsonSetter("NomineelastName")
	public void setNomineelastName(String nomineelastName) {
		NomineelastName = nomineelastName;
	}
	public String getNomineeRelationship() {
		return NomineeRelationship;
	}
	@JsonSetter("NomineeRelationship")
	public void setNomineeRelationship(String nomineeRelationship) {
		NomineeRelationship = nomineeRelationship;
	}
	public String getOtherRelation() {
		return OtherRelation;
	}
	@JsonSetter("OtherRelation")
	public void setOtherRelation(String otherRelation) {
		OtherRelation = otherRelation;
	}
	public boolean isIsMinor() {
		return IsMinor;
	}
	@JsonSetter("IsMinor")
	public void setIsMinor(boolean isMinor) {
		IsMinor = isMinor;
	}
	public String getRepFirstName() {
		return RepFirstName;
	}
	@JsonSetter("RepFirstName")
	public void setRepFirstName(String repFirstName) {
		RepFirstName = repFirstName;
	}
	public String getRepLastName() {
		return RepLastName;
	}
	@JsonSetter("RepLastName")
	public void setRepLastName(String repLastName) {
		RepLastName = repLastName;
	}
	public String getRepRelationWithMinor() {
		return RepRelationWithMinor;
	}
	@JsonSetter("RepRelationWithMinor")
	public void setRepRelationWithMinor(String repRelationWithMinor) {
		RepRelationWithMinor = repRelationWithMinor;
	}
	public String getRepOtherRelation() {
		return RepOtherRelation;
	}
	@JsonSetter("RepOtherRelation")
	public void setRepOtherRelation(String repOtherRelation) {
		RepOtherRelation = repOtherRelation;
	}
	public boolean isNoPreviousPolicyHistory() {
		return NoPreviousPolicyHistory;
	}
	@JsonSetter("NoPreviousPolicyHistory")
	public void setNoPreviousPolicyHistory(boolean noPreviousPolicyHistory) {
		NoPreviousPolicyHistory = noPreviousPolicyHistory;
	}
	public String getPreviousPolicyInsurerName() {
		return PreviousPolicyInsurerName;
	}
	@JsonSetter("PreviousPolicyInsurerName")
	public void setPreviousPolicyInsurerName(String previousPolicyInsurerName) {
		PreviousPolicyInsurerName = previousPolicyInsurerName;
	}
	public String getPreviousPolicyType() {
		return PreviousPolicyType;
	}
	@JsonSetter("PreviousPolicyType")
	public void setPreviousPolicyType(String previousPolicyType) {
		PreviousPolicyType = previousPolicyType;
	}
	public String getPreviousPolicyStartDate() {
		return PreviousPolicyStartDate;
	}
	@JsonSetter("PreviousPolicyStartDate")
	public void setPreviousPolicyStartDate(String previousPolicyStartDate) {
		PreviousPolicyStartDate = previousPolicyStartDate;
	}
	public String getPreviousPolicyEndDate() {
		return PreviousPolicyEndDate;
	}
	@JsonSetter("PreviousPolicyEndDate")
	public void setPreviousPolicyEndDate(String previousPolicyEndDate) {
		PreviousPolicyEndDate = previousPolicyEndDate;
	}
	public String getPreviousPolicyNumber() {
		return PreviousPolicyNumber;
	}
	@JsonSetter("PreviousPolicyNumber")
	public void setPreviousPolicyNumber(String previousPolicyNumber) {
		PreviousPolicyNumber = previousPolicyNumber;
	}
	public float getClaimAmount() {
		return ClaimAmount;
	}
	@JsonSetter("ClaimAmount")
	public void setClaimAmount(float claimAmount) {
		ClaimAmount = claimAmount;
	}
	public float getNoOfClaims() {
		return NoOfClaims;
	}
	@JsonSetter("NoOfClaims")
	public void setNoOfClaims(float noOfClaims) {
		NoOfClaims = noOfClaims;
	}
	public String getPreviousYearNCBPercentage() {
		return PreviousYearNCBPercentage;
	}
	@JsonSetter("PreviousYearNCBPercentage")
	public void setPreviousYearNCBPercentage(String previousYearNCBPercentage) {
		PreviousYearNCBPercentage = previousYearNCBPercentage;
	}
	public int getPreviousPolicyTenure() {
		return PreviousPolicyTenure;
	}
	@JsonSetter("PreviousPolicyTenure")
	public void setPreviousPolicyTenure(int previousPolicyTenure) {
		PreviousPolicyTenure = previousPolicyTenure;
	}
	public boolean isIsInspectionDone() {
		return IsInspectionDone;
	}
	@JsonSetter("IsInspectionDone")
	public void setIsInspectionDone(boolean isInspectionDone) {
		IsInspectionDone = isInspectionDone;
	}
	public String getInspectionDoneByWhom() {
		return InspectionDoneByWhom;
	}
	@JsonSetter("InspectionDoneByWhom")
	public void setInspectionDoneByWhom(String inspectionDoneByWhom) {
		InspectionDoneByWhom = inspectionDoneByWhom;
	}
	public String getReportDate() {
		return ReportDate;
	}
	@JsonSetter("ReportDate")
	public void setReportDate(String reportDate) {
		ReportDate = reportDate;
	}
	public String getInspectionDate() {
		return InspectionDate;
	}
	@JsonSetter("InspectionDate")
	public void setInspectionDate(String inspectionDate) {
		InspectionDate = inspectionDate;
	}
	public String getIsFinancierDetails() {
		return IsFinancierDetails;
	}
	@JsonSetter("IsFinancierDetails")
	public void setIsFinancierDetails(String isFinancierDetails) {
		IsFinancierDetails = isFinancierDetails;
	}
	public String getAgreementType() {
		return AgreementType;
	}
	@JsonSetter("AgreementType")
	public void setAgreementType(String agreementType) {
		AgreementType = agreementType;
	}
	public String getFinancierName() {
		return FinancierName;
	}
	@JsonSetter("FinancierName")
	public void setFinancierName(String financierName) {
		FinancierName = financierName;
	}
	public String getFinancierAddress() {
		return FinancierAddress;
	}
	@JsonSetter("FinancierAddress")
	public void setFinancierAddress(String financierAddress) {
		FinancierAddress = financierAddress;
	}
	
	
	public CustmerObj getCustmerObj() {
		return custmerObj;
	}
	@JsonSetter("CustmerObj")
	public void setCustmerObj(CustmerObj custmerObj) {
		this.custmerObj = custmerObj;
	}
	public String getIMDNumber() {
		return IMDNumber;
	}
	@JsonSetter("IMDNumber")
	public void setIMDNumber(String iMDNumber) {
		IMDNumber = iMDNumber;
	}
	public String getAgentCode() {
		return AgentCode;
	}
	@JsonSetter("AgentCode")
	public void setAgentCode(String agentCode) {
		AgentCode = agentCode;
	}

	
	public static void main(String[] args) {
		String str = "Javat point tt good side";  
        System.out.println("Returning words:");  
        String[] arr = str.split("Javat", 0);  
        System.out.println(arr[1]);
        for (String w : arr) {  
            System.out.println(w);  
        }  
	}
}
