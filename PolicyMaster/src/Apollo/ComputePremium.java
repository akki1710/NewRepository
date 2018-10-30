package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ComputePremium",namespace="http://www.apollomunichinsurance.com/B2BService")
public class ComputePremium {
	
	private PremiumCalculatorRequest premiumCalculatorRequest;

	public ComputePremium() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComputePremium(PremiumCalculatorRequest premiumCalculatorRequest) {
		super();
		this.premiumCalculatorRequest = premiumCalculatorRequest;
	}

	public PremiumCalculatorRequest getPremiumCalculatorRequest() {
		return premiumCalculatorRequest;
	}
	@XmlElement(name = "premiumCalculatorRequest",namespace="http://www.apollomunichinsurance.com/B2BService")
	public void setPremiumCalculatorRequest(PremiumCalculatorRequest premiumCalculatorRequest) {
		this.premiumCalculatorRequest = premiumCalculatorRequest;
	}
	
	public String toString() {
		return "ComputePremium [premiumCalculatorRequest=" + premiumCalculatorRequest + "]";
	}

	
	}
	
	

