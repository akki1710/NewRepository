package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="TransactionVerificationRequest",namespace="http://www.apollomunichinsurance.com/B2BService")
public class TransactionVerificationRequest {
	private Partner Partner;
	private String PaymentId;
	private String TransactionId;
	public Partner getPartner() {
		return Partner;
	}
	@XmlElement(name="Partner",namespace="http://schemas.datacontract.org/2004/07/TransactionVerificationLibrary")
	public void setPartner(Partner partner) {
		Partner = partner;
	}
	public String getPaymentId() {
		return PaymentId;
	}
	@XmlElement(name="PaymentId",namespace="http://schemas.datacontract.org/2004/07/TransactionVerificationLibrary")
	public void setPaymentId(String paymentId) {
		PaymentId = paymentId;
	}
	public String getTransactionId() {
		return TransactionId;
	}
	@XmlElement(name="TransactionId",namespace="http://schemas.datacontract.org/2004/07/TransactionVerificationLibrary")
	public void setTransactionId(String transactionId) {
		TransactionId = transactionId;
	}
	@Override
	public String toString() {
		return "TransactionVerificationRequest [Partner=" + Partner + ", PaymentId=" + PaymentId + ", TransactionId="
				+ TransactionId + "]";
	}

}
