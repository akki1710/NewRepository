package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
	
	@XmlRootElement(name="premiumCalculatorRequest")
	public class PremiumCalculatorRequest {
		
		private Partner	Partner;
	    private Clients Clients;
	    
		public Partner getPartner() {
			return Partner;
		}
		@XmlElement(name="Partner",namespace="http://schemas.datacontract.org/2004/07/PremiumCalculatorLibrary")
		public void setPartner(Partner partner) {
			Partner = partner;
		}
		
		public Clients getClients() {
			return Clients;
		}
		@XmlElement(name="Clients",namespace="http://schemas.datacontract.org/2004/07/PremiumCalculatorLibrary")
		public void setClients(Clients clients) {
			Clients = clients;
		}
		
		@Override
		public String toString() {
			return "PremiumCalculatorRequest [Partner=" + Partner + ", Clients=" + Clients + "]";
		}
		
		/*public PremiumCalculatorRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
		public PremiumCalculatorRequest(Apollo.Partner partner, Apollo.Clients clients) {
			super();
			Partner = partner;
			Clients = clients;
		}*/
		
	
		
	
	
	}
	
	
	
		



