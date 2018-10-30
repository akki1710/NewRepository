package com;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.annotation.JsonSetter;

public class PostPremiumDetails {
	
	private String QuickQuoteNumber;
	private boolean IsFullQuote;
	private String TPSourceName;
	private String IMDNumber;
	private String AgentCode;
	private String MakeCode;
	private String ModelCode;
	private String ManfMonth;
	private String ManfYear;
	private String RtoCode;
	private String RegNo1;
	private String RegNo2;
	private String RegNo3;
	private String RegNo4;
	private String RegistrationDate;
	private String DeliveryDate;
	private float VehicleIDV;
	private String ProductCode;
	private String PolicyStartDate;
	private String PolicyEndDate;
	private String PolicyTenure;
	private String BusinessType;
	private String BuyerState;
	private boolean NoPreviousPolicyHistory;
	private String PreviousPolicyInsurerName;
	private String PreviousPolicyType;
	private String PreviousPolicyStartDate;
	private String PreviousPolicyEndDate;
	private String PreviousPolicyNumber;
	private int ClaimAmount;
	private int NoOfClaims;
	private String PreviousYearNCBPercentage;
	private int PreviousPolicyTenure;
	
	private String ProposalNumber;//b
	private Double TotalPremium;//b
	private Double CurrentIDV;//b
	private String QuotationNumber;
	private String CustomerID;
	private String txn;
	private String FullName;
	private String EmailID;
    private String MobileNumber;
	private String PaymentDate;
	
	
	public String getPaymentDate() {
		return PaymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		PaymentDate = paymentDate;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getQuotationNumber() {
		return QuotationNumber;
	}
	public void setQuotationNumber(String quotationNumber) {
		QuotationNumber = quotationNumber;
	}
	public String getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	public String getTxn() {
		return txn;
	}
	public void setTxn(String txn) {
		this.txn = txn;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getProposalNumber() {
		return ProposalNumber;
	}
	public void setProposalNumber(String proposalNumber) {
		ProposalNumber = proposalNumber;
	}
	public Double getTotalPremium() {
		return TotalPremium;
	}
	public void setTotalPremium(Double totalPremium) {
		TotalPremium = totalPremium;
	}
	public Double getCurrentIDV() {
		return CurrentIDV;
	}
	public void setCurrentIDV(Double currentIDV) {
		CurrentIDV = currentIDV;
	}
	public String getQuickQuoteNumber() {
		return QuickQuoteNumber;
	}
	@JsonSetter("QuickQuoteNumber")
	public void setQuickQuoteNumber(String quickQuoteNumber) {
		QuickQuoteNumber = quickQuoteNumber;
	}
	public boolean isIsFullQuote() {
		return IsFullQuote;
	}
	@JsonSetter("IsFullQuote")
	public void setIsFullQuote(boolean isFullQuote) {
		IsFullQuote = isFullQuote;
	}
	public String getTPSourceName() {
		return TPSourceName;
	}
	@JsonSetter("TPSourceName")
	public void setTPSourceName(String tPSourceName) {
		TPSourceName = tPSourceName;
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
	public void setManfMonth(String string) {
		ManfMonth = string;
	}
	public String getManfYear() {
		return ManfYear;
	}
	@JsonSetter("ManfYear")
	public void setManfYear(String string) {
		ManfYear = string;
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
	public String getRegistrationDate() {
		return RegistrationDate;
	}
	@JsonSetter("RegistrationDate")
	public void setRegistrationDate(String string) {
		RegistrationDate = string;
	}
	public String getDeliveryDate() {
		return DeliveryDate;
	}
	@JsonSetter("DeliveryDate")
	public void setDeliveryDate(String string) {
		DeliveryDate = string;
	}
	public float getVehicleIDV() {
		return VehicleIDV;
	}
	@JsonSetter("VehicleIDV")
	public void setVehicleIDV(float vehicleIDV) {
		VehicleIDV = vehicleIDV;
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
	public void setPolicyStartDate(String string) {
		PolicyStartDate = string;
	}
	public String getPolicyEndDate() {
		return PolicyEndDate;
	}
	@JsonSetter("PolicyEndDate")
	public void setPolicyEndDate(String string) {
		PolicyEndDate = string;
	}
	public String getPolicyTenure() {
		return PolicyTenure;
	}
	@JsonSetter("PolicyTenure")
	public void setPolicyTenure(String string) {
		PolicyTenure = string;
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
	public boolean isNoPreviousPolicyHistory() {
		return NoPreviousPolicyHistory;
	}
	public void setNoPreviousPolicyHistory(boolean noPreviousPolicyHistory) {
		NoPreviousPolicyHistory = noPreviousPolicyHistory;
	}
	public String getPreviousPolicyInsurerName() {
		return PreviousPolicyInsurerName;
	}
	public void setPreviousPolicyInsurerName(String previousPolicyInsurerName) {
		PreviousPolicyInsurerName = previousPolicyInsurerName;
	}
	public String getPreviousPolicyType() {
		return PreviousPolicyType;
	}
	public void setPreviousPolicyType(String previousPolicyType) {
		PreviousPolicyType = previousPolicyType;
	}
	public String getPreviousPolicyStartDate() {
		return PreviousPolicyStartDate;
	}
	public void setPreviousPolicyStartDate(String previousPolicyStartDate) {
		PreviousPolicyStartDate = previousPolicyStartDate;
	}
	public String getPreviousPolicyEndDate() {
		return PreviousPolicyEndDate;
	}
	public void setPreviousPolicyEndDate(String previousPolicyEndDate) {
		PreviousPolicyEndDate = previousPolicyEndDate;
	}
	public String getPreviousPolicyNumber() {
		return PreviousPolicyNumber;
	}
	public void setPreviousPolicyNumber(String previousPolicyNumber) {
		PreviousPolicyNumber = previousPolicyNumber;
	}
	public int getClaimAmount() {
		return ClaimAmount;
	}
	public void setClaimAmount(int claimAmount) {
		ClaimAmount = claimAmount;
	}
	public int getNoOfClaims() {
		return NoOfClaims;
	}
	public void setNoOfClaims(int noOfClaims) {
		NoOfClaims = noOfClaims;
	}
	public String getPreviousYearNCBPercentage() {
		return PreviousYearNCBPercentage;
	}
	public void setPreviousYearNCBPercentage(String previousYearNCBPercentage) {
		PreviousYearNCBPercentage = previousYearNCBPercentage;
	}
	public int getPreviousPolicyTenure() {
		return PreviousPolicyTenure;
	}
	public void setPreviousPolicyTenure(int previousPolicyTenure) {
		PreviousPolicyTenure = previousPolicyTenure;
	}
	
	
	//--------------------------------------------------------------------------------------------------------
	
	public static void test(HttpServletRequest request, HttpServletResponse response){
		
		HttpSession session = request.getSession();
		String Car_RegNo=(String)session.getAttribute("RegNo");
		System.out.println("Car_RegNo detail in postpremiumdetail class''''''''''''''''''''''''''''"+Car_RegNo);
	}
	
	
}
