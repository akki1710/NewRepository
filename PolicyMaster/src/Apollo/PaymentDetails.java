package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PaymentDetails", namespace="http://www.apollomunichinsurance.com/B2BService")
public class PaymentDetails {
private paymentGatewayServiceRequest paymentGatewayServiceRequest;

public paymentGatewayServiceRequest getPaymentGatewayServiceRequest() {
	return paymentGatewayServiceRequest;
}
@XmlElement(name="paymentGatewayServiceRequest", namespace="http://www.apollomunichinsurance.com/B2BService")
public void setPaymentGatewayServiceRequest(paymentGatewayServiceRequest paymentGatewayServiceRequest) {
	this.paymentGatewayServiceRequest = paymentGatewayServiceRequest;
}

@Override
public String toString() {
	return "PaymentDetails [paymentGatewayServiceRequest=" + paymentGatewayServiceRequest + "]";
}
}
