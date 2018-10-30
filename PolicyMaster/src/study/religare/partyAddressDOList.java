package study.religare;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="partyAddressDOList")
class partyAddressDOList {
	
	private String addressLine1Lang1;
	private String addressLine2Lang1;
	private String addressTypeCd;
	private String areaCd;
	private String cityCd;
	private String pinCode;
	private String stateCd;
	public partyAddressDOList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public partyAddressDOList(String addressLine1Lang1, String addressLine2Lang1, String addressTypeCd, String areaCd,
			String cityCd, String pinCode, String stateCd) {
		super();
		this.addressLine1Lang1 = addressLine1Lang1;
		this.addressLine2Lang1 = addressLine2Lang1;
		this.addressTypeCd = addressTypeCd;
		this.areaCd = areaCd;
		this.cityCd = cityCd;
		this.pinCode = pinCode;
		this.stateCd = stateCd;
	}
	public String getAddressLine1Lang1() {
		return addressLine1Lang1;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setAddressLine1Lang1(String addressLine1Lang1) {
		this.addressLine1Lang1 = addressLine1Lang1;
	}
	public String getAddressLine2Lang1() {
		return addressLine2Lang1;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setAddressLine2Lang1(String addressLine2Lang1) {
		this.addressLine2Lang1 = addressLine2Lang1;
	}
	public String getAddressTypeCd() {
		return addressTypeCd;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setAddressTypeCd(String addressTypeCd) {
		this.addressTypeCd = addressTypeCd;
	}
	public String getAreaCd() {
		return areaCd;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}
	public String getCityCd() {
		return cityCd;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setCityCd(String cityCd) {
		this.cityCd = cityCd;
	}
	public String getPinCode() {
		return pinCode;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getStateCd() {
		return stateCd;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}
	@Override
	public String toString() {
		return "partyAddressDOList [addressLine1Lang1=" + addressLine1Lang1 + ", addressLine2Lang1=" + addressLine2Lang1
				+ ", addressTypeCd=" + addressTypeCd + ", areaCd=" + areaCd + ", cityCd=" + cityCd + ", pinCode="
				+ pinCode + ", stateCd=" + stateCd + "]";
	}
	
	

}

@XmlRootElement(name="partyContactDOList")
class partyContactDOList{
	private String contactNum;
	private String contactTypeCd;
	private String stdCode;
	public partyContactDOList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public partyContactDOList(String contactNum, String contactTypeCd, String stdCode) {
		super();
		this.contactNum = contactNum;
		this.contactTypeCd = contactTypeCd;
		this.stdCode = stdCode;
	}
	public String getContactNum() {
		return contactNum;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	public String getContactTypeCd() {
		return contactTypeCd;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setContactTypeCd(String contactTypeCd) {
		this.contactTypeCd = contactTypeCd;
	}
	public String getStdCode() {
		return stdCode;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setStdCode(String stdCode) {
		this.stdCode = stdCode;
	}
	@Override
	public String toString() {
		return "partyContactDOList [contactNum=" + contactNum + ", contactTypeCd=" + contactTypeCd + ", stdCode="
				+ stdCode + "]";
	}
	
	
}
@XmlRootElement(name="partyEmailDOList")
class partyEmailDOList{
	private String emailAddress;
	private String emailTypeCd;
	public partyEmailDOList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public partyEmailDOList(String emailAddress, String emailTypeCd) {
		super();
		this.emailAddress = emailAddress;
		this.emailTypeCd = emailTypeCd;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getEmailTypeCd() {
		return emailTypeCd;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setEmailTypeCd(String emailTypeCd) {
		this.emailTypeCd = emailTypeCd;
	}
	@Override
	public String toString() {
		return "partyEmailDOList [emailAddress=" + emailAddress + ", emailTypeCd=" + emailTypeCd + "]";
	}
	
}
@XmlRootElement(name="partyIdentityDOList")
class partyIdentityDOList{
	private String identityNum;
	private String identityTypeCd;
	public partyIdentityDOList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public partyIdentityDOList(String identityNum, String identityTypeCd) {
		super();
		this.identityNum = identityNum;
		this.identityTypeCd = identityTypeCd;
	}
	public String getIdentityNum() {
		return identityNum;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setIdentityNum(String identityNum) {
		this.identityNum = identityNum;
	}
	public String getIdentityTypeCd() {
		return identityTypeCd;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setIdentityTypeCd(String identityTypeCd) {
		this.identityTypeCd = identityTypeCd;
	}
	@Override
	public String toString() {
		return "partyIdentityDOList [identityNum=" + identityNum + ", identityTypeCd=" + identityTypeCd + "]";
	}
	
}
@XmlRootElement(name="partyQuestionDOList")
class partyQuestionDOList{
	private String questionCd;
	private String questionSetCd;
	private String response;
	public partyQuestionDOList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public partyQuestionDOList(String questionCd, String questionSetCd, String response) {
		super();
		this.questionCd = questionCd;
		this.questionSetCd = questionSetCd;
		this.response = response;
	}
	public String getQuestionCd() {
		return questionCd;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setQuestionCd(String questionCd) {
		this.questionCd = questionCd;
	}
	public String getQuestionSetCd() {
		return questionSetCd;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setQuestionSetCd(String questionSetCd) {
		this.questionSetCd = questionSetCd;
	}
	public String getResponse() {
		return response;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setResponse(String response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "partyQuestionDOList [questionCd=" + questionCd + ", questionSetCd=" + questionSetCd + ", response="
				+ response + "]";
	}
	
}
@XmlRootElement(name="policyAdditionalFieldsDOList")
class policyAdditionalFieldsDOList{
	private String fieldAgree;
	private String fieldAlerts;
	private String fieldTc;
	private String field12;
	public policyAdditionalFieldsDOList() {
		super();
	}
	public policyAdditionalFieldsDOList(String fieldAgree, String fieldAlerts, String fieldTc, String field12) {
		super();
		this.fieldAgree = fieldAgree;
		this.fieldAlerts = fieldAlerts;
		this.fieldTc = fieldTc;
		this.field12 = field12;
	}
	public String getFieldAgree() {
		return fieldAgree;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setFieldAgree(String fieldAgree) {
		this.fieldAgree = fieldAgree;
	}
	public String getFieldAlerts() {
		return fieldAlerts;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setFieldAlerts(String fieldAlerts) {
		this.fieldAlerts = fieldAlerts;
	}
	public String getFieldTc() {
		return fieldTc;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setFieldTc(String fieldTc) {
		this.fieldTc = fieldTc;
	}
	public String getField12() {
		return field12;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setField12(String field12) {
		this.field12 = field12;
	}
	@Override
	public String toString() {
		return "policyAdditionalFieldsDOList [fieldAgree=" + fieldAgree + ", fieldAlerts=" + fieldAlerts + ", fieldTc="
				+ fieldTc + ", field12=" + field12 + "]";
	}
	
}