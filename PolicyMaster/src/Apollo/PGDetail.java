package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PGDetail", namespace="http://schemas.datacontract.org/2004/07/PaymentGatewayServiceLibrary")
		            
public class PGDetail {
	private String IPAddress;
	private String MerchantRefNo;
	private String ProposalId;
	private String ReturnUrl;
	private String UDF1;
	private String UDF2;
	private String UDF3;
	private String UDF4;
	private String UDF5;
	public String getIPAddress() {
		return IPAddress;
	}@XmlElement(name="IPAddress", namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setIPAddress(String iPAddress) {
		IPAddress = iPAddress;
	}
	public String getMerchantRefNo() {
		return MerchantRefNo;
	}
	@XmlElement(name="MerchantRefNo", namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setMerchantRefNo(String merchantRefNo) {
		MerchantRefNo = merchantRefNo;
	}
	public String getProposalId() {
		return ProposalId;
	}
	@XmlElement(name="ProposalId", namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setProposalId(String proposalId) {
		ProposalId = proposalId;
	}
	public String getReturnUrl() {
		return ReturnUrl;
	}
	@XmlElement(name="ReturnUrl", namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setReturnUrl(String returnUrl) {
		ReturnUrl = returnUrl;
	}
	public String getUDF1() {
		return UDF1;
	}
	@XmlElement(name="UDF1", namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setUDF1(String uDF1) {
		UDF1 = uDF1;
	}
	public String getUDF2() {
		return UDF2;
	}
	@XmlElement(name="UDF2", namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setUDF2(String uDF2) {
		UDF2 = uDF2;
	}
	public String getUDF3() {
		return UDF3;
	}
	@XmlElement(name="UDF3", namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setUDF3(String uDF3) {
		UDF3 = uDF3;
	}
	public String getUDF4() {
		return UDF4;
	}
	@XmlElement(name="UDF4", namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setUDF4(String uDF4) {
		UDF4 = uDF4;
	}
	public String getUDF5() {
		return UDF5;
	}
	@XmlElement(name="UDF5", namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setUDF5(String uDF5) {
		UDF5 = uDF5;
	}
	@Override
	public String toString() {
		return "PGDetail [IPAddress=" + IPAddress + ", MerchantRefNo=" + MerchantRefNo + ", ProposalId=" + ProposalId
				+ ", ReturnUrl=" + ReturnUrl + ", UDF1=" + UDF1 + ", UDF2=" + UDF2 + ", UDF3=" + UDF3 + ", UDF4=" + UDF4
				+ ", UDF5=" + UDF5 + "]";
	}
	
}
