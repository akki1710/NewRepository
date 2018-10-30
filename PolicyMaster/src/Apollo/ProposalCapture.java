package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="ProposalCapture",namespace="http://www.apollomunichinsurance.com/B2BService")
public class ProposalCapture {
private ProposalCaptureServiceRequest ProposalCaptureServiceRequest;

public ProposalCaptureServiceRequest getProposalCaptureServiceRequest() {
	return ProposalCaptureServiceRequest;
}
@XmlElement(name="ProposalCaptureServiceRequest" , namespace="http://www.apollomunichinsurance.com/B2BService")
public void setProposalCaptureServiceRequest(ProposalCaptureServiceRequest proposalCaptureServiceRequest) {
	ProposalCaptureServiceRequest = proposalCaptureServiceRequest;
}

@Override
public String toString() {
	return "ProposalCapture [ProposalCaptureServiceRequest=" + ProposalCaptureServiceRequest + "]";
}
}
