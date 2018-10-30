/**
 * 
 */
/**
 * @author JS201801079
 *
 */
@XmlSchema(namespace = "",
elementFormDefault = XmlNsForm.QUALIFIED,xmlns = {
        @XmlNs(prefix="b2b", namespaceURI = "http://www.apollomunichinsurance.com/B2BService"),
        @XmlNs(prefix="prem", namespaceURI = "http://schemas.datacontract.org/2004/07/PremiumCalculatorLibrary"),
        @XmlNs(prefix="ser", namespaceURI = "http://schemas.datacontract.org/2004/07/ServiceObjects"),
        @XmlNs(prefix="prop", namespaceURI="http://schemas.datacontract.org/2004/07/ProposalCaptureServiceLibrary"),
        @XmlNs(prefix="pay",namespaceURI="http://schemas.datacontract.org/2004/07/PaymentGatewayServiceLibrarys"),
        @XmlNs(prefix="tran",namespaceURI="http://schemas.datacontract.org/2004/07/TransactionVerificationLibrary")

})
package Apollo;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
