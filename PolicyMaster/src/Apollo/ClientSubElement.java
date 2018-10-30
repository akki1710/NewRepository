package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Client")
public class ClientSubElement {
private String Age;
private String ClientCode;
private String OccuptionCode;
private String FirstName;
private String LastName;
private String GenderCode;
private String MaritalStatusCode;
private String NationalityCode;
private String RelationshipCode;
private String BirthDate;
private Product product;
private  String TitleCode; 


public String getTitleCode() {
	return TitleCode;
}
@XmlElement(name="TitleCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setTitleCode(String TitleCode) {
	this.TitleCode = TitleCode;
}
public String getFirstName() {
	return FirstName;
}
@XmlElement(name="FirstName",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getOccuptionCode() {
	return OccuptionCode;
}
@XmlElement(name="OccuptionCode" ,namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setOccuptionCode(String occuptionCode) {
	OccuptionCode = occuptionCode;
}

public String getLastName() {
	return LastName;
}
@XmlElement(name="LastName",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")

public void setLastName(String lastName) {
	LastName = lastName;
}
public String getGenderCode() {
	return GenderCode;
}
@XmlElement(name="GenderCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")

public void setGenderCode(String genderCode) {
	GenderCode = genderCode;
}
public String getMaritalStatusCode() {
	return MaritalStatusCode;
}
@XmlElement(name="MaritalStatusCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")

public void setMaritalStatusCode(String maritalStatusCode) {
	MaritalStatusCode = maritalStatusCode;
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
public String getBirthDate() {
	return BirthDate;
}
@XmlElement(name="BirthDate",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")

public void setBirthDate(String birthDate) {
	BirthDate = birthDate;
}
public String getAge() {
	return Age;
}
@XmlElement(name="Age",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setAge(String age) {
	Age = age;
}
public String getClientCode() {
	return ClientCode;
}
@XmlElement(name="ClientCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setClientCode(String clientCode) {
	ClientCode = clientCode;
}
public Product getProduct() {
	return product;
}
@XmlElement(name="Product",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setProduct(Product product) {
	this.product = product;
}
@Override
public String toString() {
	return "ClientSubElement [Age=" + Age + ", ClientCode=" + ClientCode + ", OccuptionCode=" + OccuptionCode
			+ ", FirstName=" + FirstName + ", LastName=" + LastName + ", GenderCode=" + GenderCode
			+ ", MaritalStatusCode=" + MaritalStatusCode + ", NationalityCode=" + NationalityCode
			+ ", RelationshipCode=" + RelationshipCode + ", BirthDate=" + BirthDate + ", product=" + product + "]";
}

}
