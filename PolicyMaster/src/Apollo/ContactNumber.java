package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="ContactNumber" ,namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public class ContactNumber {
	ContactSubElement ContactNumber;

	
public ContactSubElement getContactNumber() {
		return ContactNumber;
	}

 @XmlElement(name="ContactNumber",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setContactNumber(ContactSubElement contactNumber) {
		ContactNumber = contactNumber;
	}


@Override
public String toString() {
	return "ContactNumber [ContactNumber=" + ContactNumber + "]";
}

	
	
}
