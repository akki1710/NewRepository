package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Proposer",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public class Proposer {
private Address Address;
private ContactInformation ContactInformation; 
  private String BirthDate;
  private String FirstName;
  private String GenderCode;
  private String GstinNumber;
  private String IDProofNumber;
  private String IDProofTypeCode;
  private String LastName;
  private String MaritalStatusCode;
  private String MiddleName;
  private String NationalityCode;
  private String RelationshipCode;
public Address getAddress() {
	return Address;
}
@XmlElement(name="Address",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setAddress(Address address) {
	Address = address;
}
public ContactInformation getContactInformation() {
	return ContactInformation;
}
@XmlElement(name="ContactInformation",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setContactInformation(ContactInformation contactInformation) {
	ContactInformation = contactInformation;
}
public String getBirthDate() {
	return BirthDate;
}
@XmlElement(name="BirthDate",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setBirthDate(String birthDate) {
	BirthDate = birthDate;
}
public String getFirstName() {
	return FirstName;
}
@XmlElement(name="FirstName",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getGenderCode() {
	return GenderCode;
}
@XmlElement(name="GenderCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setGenderCode(String genderCode) {
	GenderCode = genderCode;
}
public String getGstinNumber() {
	return GstinNumber;
}
@XmlElement(name="GstinNumber",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setGstinNumber(String gstinNumber) {
	GstinNumber = gstinNumber;
}
public String getIDProofNumber() {
	return IDProofNumber;
}
@XmlElement(name="IDProofNumber",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setIDProofNumber(String iDProofNumber) {
	IDProofNumber = iDProofNumber;
}
public String getIDProofTypeCode() {
	return IDProofTypeCode;
}
@XmlElement(name="IDProofTypeCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setIDProofTypeCode(String iDProofTypeCode) {
	IDProofTypeCode = iDProofTypeCode;
}
public String getLastName() {
	return LastName;
}
@XmlElement(name="LastName",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getMaritalStatusCode() {
	return MaritalStatusCode;
}
@XmlElement(name="MaritalStatusCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setMaritalStatusCode(String maritalStatusCode) {
	MaritalStatusCode = maritalStatusCode;
}
public String getMiddleName() {
	return MiddleName;
}

@XmlElement(name="MiddleName",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setMiddleName(String middleName) {
	MiddleName = middleName;
}
public String getNationalityCode() {
	return NationalityCode;
}
@XmlElement(name="NationalityCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setNationalityCode(String nationalityCode) {
	NationalityCode = nationalityCode;
}
public String getRelationshipCode() {
	return RelationshipCode;
}
@XmlElement(name="RelationshipCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setRelationshipCode(String relationshipCode) {
	RelationshipCode = relationshipCode;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Proposer [Address=").append(Address).append(", ContactInformation=").append(ContactInformation)
			.append(", BirthDate=").append(BirthDate).append(", FirstName=").append(FirstName).append(", GenderCode=")
			.append(GenderCode).append(", GstinNumber=").append(GstinNumber).append(", IDProofNumber=")
			.append(IDProofNumber).append(", IDProofTypeCode=").append(IDProofTypeCode).append(", LastName=")
			.append(LastName).append(", MaritalStatusCode=").append(MaritalStatusCode).append(", MiddleName=")
			.append(MiddleName).append(", NationalityCode=").append(NationalityCode).append(", RelationshipCode=")
			.append(RelationshipCode).append("]");
	return builder.toString();
}

 }
