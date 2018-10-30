package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Partner")
public class Partner {
	private String PartnerCode;
	private String Password;
	private String UserName;
	public String getPartnerCode() {
		return PartnerCode;
	}
	@XmlElement( name="PartnerCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setPartnerCode(String partnerCode) {
		PartnerCode = partnerCode;
	}
	public String getPassword() {
		return Password;
	}
	@XmlElement(name="Password",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setPassword(String password) {
		Password = password;
	}
	public String getUserName() {
		return UserName;
	}
	@XmlElement(name="UserName",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setUserName(String userName) {
		UserName = userName;
	}
	@Override
	public String toString() {
		return "Partner [PartnerCode=" + PartnerCode + ", Password=" + Password + ", UserName=" + UserName + "]";
	}
}
