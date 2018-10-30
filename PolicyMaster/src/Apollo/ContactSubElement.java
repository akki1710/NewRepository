package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ContactNumber",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public class ContactSubElement {
private String Number;
private String Type;
public String getNumber() {
	return Number;
}
@XmlElement(name="Number",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setNumber(String number) {
	Number = number;
}
public String getType() {
	return Type;
}
@XmlElement(name="Type",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setType(String type) {
	Type = type;
}
@Override
public String toString() {
	return "ContactSubElement [Number=" + Number + ", Type=" + Type + "]";
}

}


