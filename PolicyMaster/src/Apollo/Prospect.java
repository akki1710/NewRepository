package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="Prospect",namespace="http://schemas.datacontract.org/2004/07/ProposalCaptureServiceLibrary")
public class Prospect {
	private Application Application;
	private Client Client;
	private   String BrandCode ;
	private String TotalPremiumAmount;
	public Application getApplication() {
		return Application;
	}
	@XmlElement(name="Application",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setApplication(Application application) {
		Application = application;
	}
	public Client getClient() {
		return Client;
	}
	@XmlElement(name="Client",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setClient(Client client) {
		Client = client;
	}
	public String getBrandCode() {
		return BrandCode;
	}
	@XmlElement(name="BrandCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setBrandCode(String brandCode) {
		BrandCode = brandCode;
	}
	public String getTotalPremiumAmount() {
		return TotalPremiumAmount;
	}
	@XmlElement(name="TotalPremiumAmount",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setTotalPremiumAmount(String totalPremiumAmount) {
		TotalPremiumAmount = totalPremiumAmount;
	}
	@Override
	public String toString() {
		return "Prospect [Application=" + Application + ", Client=" + Client + ", BrandCode=" + BrandCode
				+ ", TotalPremiumAmount=" + TotalPremiumAmount + "]";
	}
}