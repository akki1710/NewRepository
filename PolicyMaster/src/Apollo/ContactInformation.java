package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ContactInformation")
public class ContactInformation {
private ContactNumber ContactNumber; 
private String Email;
public ContactNumber getContactNumber() {
	return ContactNumber;
}
@XmlElement(name="ContactNumber",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setContactNumber(ContactNumber contactNumber) {
	ContactNumber = contactNumber;
}
public String getEmail() {
	return Email;
}
@XmlElement(name="Email" ,namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setEmail(String email) {
	Email = email;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("ContactInformation [ContactNumber=").append(ContactNumber).append(", Email=").append(Email)
			.append("]");
	return builder.toString();
}
}
