package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name ="VerifyTransaction", namespace="http://www.apollomunichinsurance.com/B2BService")
public class VerifyTransaction {
private TransactionVerificationRequest TransactionVerificationRequest;

public TransactionVerificationRequest getTransactionVerificationRequest() {
	return TransactionVerificationRequest;
}
@XmlElement(name="TransactionVerificationRequest",namespace="http://www.apollomunichinsurance.com/B2BService")
public void setTransactionVerificationRequest(TransactionVerificationRequest transactionVerificationRequest) {
	TransactionVerificationRequest = transactionVerificationRequest;
}

@Override
public String toString() {
	return "VerifyTransaction [TransactionVerificationRequest=" + TransactionVerificationRequest + "]";
}
}
