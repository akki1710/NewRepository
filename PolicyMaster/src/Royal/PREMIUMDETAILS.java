package Royal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class PREMIUMDETAILS {
	@XmlElement(name="DATA")
	private DATA DATA;
	
	@XmlElement(name="Status")
	private STATUS Status;
	 private PremiumForOneYear PremiumForOneYear;
	 private PremiumForTwoYears PremiumForTwoYears;
	 private PremiumForThreeYears PremiumForThreeYears;
	 
	

	public DATA getDATA() {
		return DATA;
	}



	public void setDATA(DATA dATA) {
		DATA = dATA;
	}



	public STATUS getStatus() {
		return Status;
	}



	public void setStatus(STATUS status) {
		Status = status;
	}



	public PremiumForOneYear getPremiumForOneYear() {
		return PremiumForOneYear;
	}



	public void setPremiumForOneYear(PremiumForOneYear premiumForOneYear) {
		PremiumForOneYear = premiumForOneYear;
	}



	public PremiumForTwoYears getPremiumForTwoYears() {
		return PremiumForTwoYears;
	}



	public void setPremiumForTwoYears(PremiumForTwoYears premiumForTwoYears) {
		PremiumForTwoYears = premiumForTwoYears;
	}



	public PremiumForThreeYears getPremiumForThreeYears() {
		return PremiumForThreeYears;
	}



	public void setPremiumForThreeYears(PremiumForThreeYears premiumForThreeYears) {
		PremiumForThreeYears = premiumForThreeYears;
	}



	@Override
	public String toString() {
		return "PREMIUMDETAILS [DATA=" + DATA + ", Status=" + Status + ", PremiumForOneYear=" + PremiumForOneYear
				+ ", PremiumForTwoYears=" + PremiumForTwoYears + ", PremiumForThreeYears=" + PremiumForThreeYears + "]";
	}



	
	
	
}
