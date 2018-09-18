package com;

import com.fasterxml.jackson.annotation.JsonSetter;

public class CustmerObj {

    private String TPSource;
    private String CustomerType;
    private String FirstName;
    private String LastName;
    private String Salutation;
    private String DOB;
    private String EmailID;
    private String MobileNumber;
    private String AddressLine1;
    private String AddressLine2;
    private String AddressLine3;
    private String PinCodeLocality;
    private String PinCode;
    private String PanNo;
    private boolean PermanentLocationSameAsMailLocation;
    private String MailingAddressLine1;
    private String MailingPinCode;
    private String MailingPinCodeLocality;
    private String GSTIN;
    private String IsEIAAvailable;
    private String EIAAccNo;
    private String IsEIAPolicy;
    private String EIAAccWith;
    private String EIAPanNo;
    private String EIAUIDNo;
	public String getTPSource() {
		return TPSource;
	}
	@JsonSetter("TPSource")
	public void setTPSource(String tPSource) {
		TPSource = tPSource;
	}
	public String getCustomerType() {
		return CustomerType;
	}
	@JsonSetter("CustomerType")
	public void setCustomerType(String customerType) {
		CustomerType = customerType;
	}
	public String getFirstName() {
		return FirstName;
	}
	@JsonSetter("FirstName")
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	@JsonSetter("LastName")
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getSalutation() {
		return Salutation;
	}
	@JsonSetter("Salutation")
	public void setSalutation(String salutation) {
		Salutation = salutation;
	}
	public String getDOB() {
		return DOB;
	}
	@JsonSetter("DOB")
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getEmailID() {
		return EmailID;
	}
	@JsonSetter("EmailID")
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	@JsonSetter("MobileNumber")
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getAddressLine1() {
		return AddressLine1;
	}
	@JsonSetter("AddressLine1")
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	@JsonSetter("AddressLine2")
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	public String getAddressLine3() {
		return AddressLine3;
	}
	@JsonSetter("AddressLine3")
	public void setAddressLine3(String addressLine3) {
		AddressLine3 = addressLine3;
	}
	public String getPinCodeLocality() {
		return PinCodeLocality;
	}
	@JsonSetter("PinCodeLocality")
	public void setPinCodeLocality(String pinCodeLocality) {
		PinCodeLocality = pinCodeLocality;
	}
	public String getPinCode() {
		return PinCode;
	}
	@JsonSetter("PinCode")
	public void setPinCode(String pinCode) {
		PinCode = pinCode;
	}
	public String getPanNo() {
		return PanNo;
	}
	@JsonSetter("PanNo")
	public void setPanNo(String panNo) {
		PanNo = panNo;
	}
	public boolean isPermanentLocationSameAsMailLocation() {
		return PermanentLocationSameAsMailLocation;
	}
	@JsonSetter("PermanentLocationSameAsMailLocation")
	public void setPermanentLocationSameAsMailLocation(boolean permanentLocationSameAsMailLocation) {
		PermanentLocationSameAsMailLocation = permanentLocationSameAsMailLocation;
	}
	public String getMailingAddressLine1() {
		return MailingAddressLine1;
	}
	@JsonSetter("MailingAddressLine1")
	public void setMailingAddressLine1(String mailingAddressLine1) {
		MailingAddressLine1 = mailingAddressLine1;
	}
	public String getMailingPinCode() {
		return MailingPinCode;
	}
	@JsonSetter("MailingPinCode")
	public void setMailingPinCode(String mailingPinCode) {
		MailingPinCode = mailingPinCode;
	}
	public String getMailingPinCodeLocality() {
		return MailingPinCodeLocality;
	}
	@JsonSetter("MailingPinCodeLocality")
	public void setMailingPinCodeLocality(String mailingPinCodeLocality) {
		MailingPinCodeLocality = mailingPinCodeLocality;
	}
	public String getGSTIN() {
		return GSTIN;
	}
	@JsonSetter("GSTIN")
	public void setGSTIN(String gSTIN) {
		GSTIN = gSTIN;
	}
	public String getIsEIAAvailable() {
		return IsEIAAvailable;
	}
	@JsonSetter("IsEIAAvailable")
	public void setIsEIAAvailable(String isEIAAvailable) {
		IsEIAAvailable = isEIAAvailable;
	}
	public String getEIAAccNo() {
		return EIAAccNo;
	}
	@JsonSetter("EIAAccNo")
	public void setEIAAccNo(String eIAAccNo) {
		EIAAccNo = eIAAccNo;
	}
	public String getIsEIAPolicy() {
		return IsEIAPolicy;
	}
	@JsonSetter("IsEIAPolicy")
	public void setIsEIAPolicy(String isEIAPolicy) {
		IsEIAPolicy = isEIAPolicy;
	}
	public String getEIAAccWith() {
		return EIAAccWith;
	}
	@JsonSetter("EIAAccWith")
	public void setEIAAccWith(String eIAAccWith) {
		EIAAccWith = eIAAccWith;
	}
	public String getEIAPanNo() {
		return EIAPanNo;
	}
	@JsonSetter("EIAPanNo")
	public void setEIAPanNo(String eIAPanNo) {
		EIAPanNo = eIAPanNo;
	}
	public String getEIAUIDNo() {
		return EIAUIDNo;
	}
	@JsonSetter("EIAUIDNo")
	public void setEIAUIDNo(String eIAUIDNo) {
		EIAUIDNo = eIAUIDNo;
	}
    
    
  
    
}
