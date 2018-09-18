package Royal;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="CALCULATEPREMIUMREQUEST")
public class CALCULATEPREMIUMREQUEST {
	private String isNewUser;
	private String reqType;
	private String resType;
	private String quoteId;
	private  authenticationDetails authenticationDetails;
	private proposerDetails proposerDetails;
	private vehicleDetails vehicleDetails;
	public String getIsNewUser() {
		return isNewUser;
	}
	public void setIsNewUser(String isNewUser) {
		this.isNewUser = isNewUser;
	}
	public String getReqType() {
		return reqType;
	}
	public void setReqType(String reqType) {
		this.reqType = reqType;
	}
	public String getResType() {
		return resType;
	}
	public void setResType(String resType) {
		this.resType = resType;
	}
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public authenticationDetails getAuthenticationDetails() {
		return authenticationDetails;
	}
	public void setAuthenticationDetails(authenticationDetails authenticationDetails) {
		this.authenticationDetails = authenticationDetails;
	}
	public proposerDetails getProposerDetails() {
		return proposerDetails;
	}
	public void setProposerDetails(proposerDetails proposerDetails) {
		this.proposerDetails = proposerDetails;
	}
	public vehicleDetails getVehicleDetails() {
		return vehicleDetails;
	}
	public void setVehicleDetails(vehicleDetails vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}
	@Override
	public String toString() {
		return "CALCULATEPREMIUMREQUEST [isNewUser=" + isNewUser + ", reqType=" + reqType + ", resType=" + resType
				+ ", quoteId=" + quoteId + ", authenticationDetails=" + authenticationDetails + ", proposerDetails="
				+ proposerDetails + ", vehicleDetails=" + vehicleDetails + "]";
	}
	
	
	
	
	}
	
	
	


