package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name=" NomineeAddress ",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public class NomineeAddress {

 private String AddressLine1;
 private String AddressLine2;
 private String AddressLine3;
 private String CountryCode;
 private String District;
 private String PinCode;
 private String StateCode;
 private String TownCode;
public String getAddressLine1() {
	return AddressLine1;
}
@XmlElement(name="AddressLine1",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setAddressLine1(String addressLine1) {
	AddressLine1 = addressLine1;
}
public String getAddressLine2() {
	return AddressLine2;
}
@XmlElement(name="AddressLine2",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setAddressLine2(String addressLine2) {
	AddressLine2 = addressLine2;
}
public String getAddressLine3() {
	return AddressLine3;
}
@XmlElement(name="AddressLine3",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setAddressLine3(String addressLine3) {
	AddressLine3 = addressLine3;
}
public String getCountryCode() {
	return CountryCode;
}
@XmlElement(name="CountryCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setCountryCode(String countryCode) {
	CountryCode = countryCode;
}
public String getDistrict() {
	return District;
}
@XmlElement(name="District",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setDistrict(String district) {
	District = district;
}
public String getPinCode() {
	return PinCode;
}
@XmlElement(name="PinCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setPinCode(String pinCode) {
	PinCode = pinCode;
}
public String getStateCode() {
	return StateCode;
}
@XmlElement(name="StateCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setStateCode(String stateCode) {
	StateCode = stateCode;
}
public String getTownCode() {
	return TownCode;
}
@XmlElement(name="TownCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setTownCode(String townCode) {
	TownCode = townCode;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("NomineeAddress [AddressLine1=").append(AddressLine1).append(", AddressLine2=").append(AddressLine2)
			.append(", AddressLine3=").append(AddressLine3).append(", CountryCode=").append(CountryCode)
			.append(", District=").append(District).append(", PinCode=").append(PinCode).append(", StateCode=")
			.append(StateCode).append(", TownCode=").append(TownCode).append("]");
	return builder.toString();
}
}
