package Royal;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="PREMIUMDETAILS")
public class BikePremiumDetails {
	
	@XmlElement(name="PremiumForOneYear")
	private PremiumForOneYear PremiumForOneYear;
	
	@XmlElement(name="PremiumForTwoYears")
	private PremiumForTwoYears PremiumForTwoYears;
	
	@XmlElement(name="PremiumForThreeYears")
	private PremiumForThreeYears PremiumForThreeYears;
	
	@XmlElement(name="status")
	private STATUS status;
	
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
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
		return "BikePremiumDetails [PremiumForOneYear=" + PremiumForOneYear + ", PremiumForTwoYears="
				+ PremiumForTwoYears + ", PremiumForThreeYears=" + PremiumForThreeYears + ", status=" + status + "]";
	}
	public static void main(String[] args) {
		
		BikePremiumDetails PREMIUMDET= new BikePremiumDetails();
		System.out.println(PREMIUMDET);
		
	}
	
}
