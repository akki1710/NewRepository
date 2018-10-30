package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Clients")
public class Clients {

	private Client Client;
	

	
	/*public Clients() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Clients(Apollo.Client client) {
		super();
		Client = client;
	}*/

	
	public Client getClient() {
		return Client;
	}

	@XmlElement(name="Client",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setClient(Client client) {
		Client = client;
	}


	@Override
	public String toString() {
		return "Clients [Client=" + Client + "]";
	}


	


	


	
}

