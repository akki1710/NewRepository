package Apollo;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Dependants" )
public class Dependants {
//private ClientSubElement ClientSubElement;
private List <ClientSubElement> ClientSubElement;


public List<ClientSubElement> getClientSubElement() {
	return ClientSubElement;
}
@XmlElement(name="Client",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setClientSubElement(List<ClientSubElement> clientSubElement) {
	ClientSubElement = clientSubElement;
}

/*public ClientSubElement getClientSubElement() {
	return ClientSubElement;
}
@XmlElement(name="Client",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public void setClientSubElement(ClientSubElement clientSubElement) {
	ClientSubElement = clientSubElement;
}*/
@Override
public String toString() {
	return "Dependants [ClientSubElement=" + ClientSubElement + "]";
}



	}