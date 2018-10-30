package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="ProposalCaptureServiceRequest ")
public class ProposalCaptureServiceRequest {
private Prospect Prospect;
private String Action;
private Partner Partner;
public Prospect getProspect() {
	return Prospect;
}
@XmlElement(name="Prospect",namespace="http://schemas.datacontract.org/2004/07/ProposalCaptureServiceLibrary")
public void setProspect(Prospect prospect) {
	Prospect = prospect;
}
public String getAction() {
	return Action;
}
@XmlElement(name="Action",namespace="http://schemas.datacontract.org/2004/07/ProposalCaptureServiceLibrary")
public void setAction(String action) {
	Action = action;
}
public Partner getPartner() {
	return Partner;
}
@XmlElement(name="Partner",namespace="http://schemas.datacontract.org/2004/07/ProposalCaptureServiceLibrary")
public void setPartner(Partner partner) {
	Partner = partner;
}
@Override
public String toString() {
	return "ProposalCaptureServiceRequest [Prospect=" + Prospect + ", Action=" + Action + ", Partner=" + Partner + "]";
}

}