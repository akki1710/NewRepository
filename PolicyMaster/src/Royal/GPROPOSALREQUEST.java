package Royal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GPROPOSALREQUEST")
public class GPROPOSALREQUEST {
	
	private  authenticationDetails authenticationDetails;
	private String premium;
	private String quoteId;
	private String strEmail;
	private String emailId;
	private String reqType;
	private String isOTPVerified;
	public authenticationDetails getAuthenticationDetails() {
		return authenticationDetails;
	}
	public void setAuthenticationDetails(authenticationDetails authenticationDetails) {
		this.authenticationDetails = authenticationDetails;
	}
	public String getPremium() {
		return premium;
	}
	public void setPremium(String premium) {
		this.premium = premium;
	}
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getStrEmail() {
		return strEmail;
	}
	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getReqType() {
		return reqType;
	}
	public void setReqType(String reqType) {
		this.reqType = reqType;
	}
	public String getIsOTPVerified() {
		return isOTPVerified;
	}
	public void setIsOTPVerified(String isOTPVerified) {
		this.isOTPVerified = isOTPVerified;
	}
	@Override
	public String toString() {
		return "GPROPOSALREQUEST [authenticationDetails=" + authenticationDetails + ", premium=" + premium
				+ ", quoteId=" + quoteId + ", strEmail=" + strEmail + ", emailId=" + emailId + ", reqType=" + reqType
				+ ", isOTPVerified=" + isOTPVerified + "]";
	}
	
	
	
	
	
}
