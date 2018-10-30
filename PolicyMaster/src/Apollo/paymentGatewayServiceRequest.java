package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="paymentGatewayServiceRequest")
public class paymentGatewayServiceRequest {
private  PGDetail  PGDetail;
private Partner Partner;
public PGDetail getPGDetail() {
	return PGDetail;
}
@XmlElement(name="PGDetail",namespace="http://schemas.datacontract.org/2004/07/PaymentGatewayServiceLibrary")
public void setPGDetail(PGDetail pGDetail) {
	this.PGDetail = pGDetail;
}
public Partner getPartner() {
	return Partner;
}
@XmlElement(name="Partner",namespace="http://schemas.datacontract.org/2004/07/PaymentGatewayServiceLibrary")
public void setPartner(Partner partner) {
	this.Partner = partner;
}
@Override
public String toString() {
	return "paymentGatewayServiceRequest [PGDetail=" + PGDetail + ", Partner=" + Partner + "]";
}
}
