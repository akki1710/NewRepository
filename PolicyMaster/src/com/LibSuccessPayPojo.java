package com;

import com.fasterxml.jackson.annotation.JsonSetter;

public class LibSuccessPayPojo {
	
    private String GCCustomerID;
	private Double PremiumAmount;
	private String ProductCode;
	private String QuotationNumber;
	private String PaymentSource;
	private String PaymentDate;
	private String TransactionID;
	private String TPSourceName;
	private String TPEmailID;
	private boolean SendEmailtoCustomer;
	private String OTP;
	private String OTPCreatedDate;
	private String OTPEnteredDate;
	private String IMDNumber;
	private String OfficeCode;
	
	
	public String getGCCustomerID() {
		return GCCustomerID;
	}
	@JsonSetter("GCCustomerID")
	public void setGCCustomerID(String gCCustomerID) {
		GCCustomerID = gCCustomerID;
	}
	
	public Double getPremiumAmount() {
		return PremiumAmount;
	}
	@JsonSetter("PremiumAmount")
	public void setPremiumAmount(Double string) {
		PremiumAmount = string;
	}
	public String getProductCode() {
		return ProductCode;
	}
	@JsonSetter("ProductCode")
	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}
	public String getQuotationNumber() {
		return QuotationNumber;
	}
	@JsonSetter("QuotationNumber")
	public void setQuotationNumber(String quotationNumber) {
		QuotationNumber = quotationNumber;
	}
	public String getPaymentSource() {
		return PaymentSource;
	}
	@JsonSetter("PaymentSource")
	public void setPaymentSource(String paymentSource) {
		PaymentSource = paymentSource;
	}
	public String getPaymentDate() {
		return PaymentDate;
	}
	@JsonSetter("PaymentDate")
	public void setPaymentDate(String paymentDate) {
		PaymentDate = paymentDate;
	}
	public String getTransactionID() {
		return TransactionID;
	}
	@JsonSetter("TransactionID")
	public void setTransactionID(String transactionID) {
		TransactionID = transactionID;
	}
	public String getTPSourceName() {
		return TPSourceName;
	}
	@JsonSetter("TPSourceName")
	public void setTPSourceName(String tPSourceName) {
		TPSourceName = tPSourceName;
	}
	public String getTPEmailID() {
		return TPEmailID;
	}
	@JsonSetter("TPEmailID")
	public void setTPEmailID(String tPEmailID) {
		TPEmailID = tPEmailID;
	}
	public boolean getSendEmailtoCustomer() {
		return SendEmailtoCustomer;
	}
	@JsonSetter("SendEmailtoCustomer")
	public void setSendEmailtoCustomer(boolean sendEmailtoCustomer) {
		SendEmailtoCustomer = sendEmailtoCustomer;
	}
	public String getOTP() {
		return OTP;
	}
	@JsonSetter("OTP")
	public void setOTP(String oTP) {
		OTP = oTP;
	}
	public String getOTPCreatedDate() {
		return OTPCreatedDate;
	}
	@JsonSetter("OTPCreatedDate")
	public void setOTPCreatedDate(String oTPCreatedDate) {
		OTPCreatedDate = oTPCreatedDate;
	}
	public String getOTPEnteredDate() {
		return OTPEnteredDate;
	}
	@JsonSetter("OTPEnteredDate")
	public void setOTPEnteredDate(String oTPEnteredDate) {
		OTPEnteredDate = oTPEnteredDate;
	}
	public String getIMDNumber() {
		return IMDNumber;
	}
	@JsonSetter("IMDNumber")
	public void setIMDNumber(String iMDNumber) {
		IMDNumber = iMDNumber;
	}
	public String getOfficeCode() {
		return OfficeCode;
	}
	@JsonSetter("OfficeCode")
	public void setOfficeCode(String officeCode) {
		OfficeCode = officeCode;
	}
	@Override
	public String toString() {
		return "LibSuccessPayPojo [GCCustomerID=" + GCCustomerID + ", PremiumAmount=" + PremiumAmount + ", ProductCode="
				+ ProductCode + ", QuotationNumber=" + QuotationNumber + ", PaymentSource=" + PaymentSource
				+ ", PaymentDate=" + PaymentDate + ", TransactionID=" + TransactionID + ", TPSourceName=" + TPSourceName
				+ ", TPEmailID=" + TPEmailID + ", SendEmailtoCustomer=" + SendEmailtoCustomer + ", OTP=" + OTP
				+ ", OTPCreatedDate=" + OTPCreatedDate + ", OTPEnteredDate=" + OTPEnteredDate + ", IMDNumber="
				+ IMDNumber + ", OfficeCode=" + OfficeCode + "]";
	}
	
	
	

}
