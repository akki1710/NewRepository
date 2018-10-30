package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Dependants" ,namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public class DependantsSubElement {
  private ClientSubElement ClientSubElement;

public ClientSubElement getClientSubElement() {
	return ClientSubElement;
}
@XmlElement(name="Client" ,namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setClientSubElement(ClientSubElement clientSubElement) {
	ClientSubElement = clientSubElement;
}

@Override
public String toString() {
	return "DependantsSubElement [ClientSubElement=" + ClientSubElement + "]";
}
  
}
