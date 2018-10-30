package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Application",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
public class Application {
	private String Namefor80D;
	private NomineeAddress NomineeAddress;
	private Proposer Proposer;
	private String NomineeName;
	private String NomineeTitleCode;
	private String RelationToNomineeCode;
	private String RuralFlag;
	private String TPANameCode;
	public String getNamefor80D() {
		return Namefor80D;
	}
	@XmlElement(name="Namefor80D" ,namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setNamefor80D(String namefor80d) {
		Namefor80D = namefor80d;
	}
	public NomineeAddress getNomineeAddress() {
		return NomineeAddress;
	}
	@XmlElement(name="NomineeAddress" ,namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setNomineeAddress(NomineeAddress nomineeAddress) {
		NomineeAddress = nomineeAddress;
	}
	public Proposer getProposer() {
		return Proposer;
	}
	@XmlElement(name="Proposer" ,namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setProposer(Proposer proposer) {
		Proposer = proposer;
	}
	public String getNomineeName() {
		return NomineeName;
	}
	@XmlElement(name="NomineeName" ,namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setNomineeName(String nomineeName) {
		NomineeName = nomineeName;
	}
	public String getNomineeTitleCode() {
		return NomineeTitleCode;
	}
	@XmlElement(name="NomineeTitleCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setNomineeTitleCode(String nomineeTitleCode) {
		NomineeTitleCode = nomineeTitleCode;
	}
	public String getRelationToNomineeCode() {
		return RelationToNomineeCode;
	}
	@XmlElement(name="RelationToNomineeCode" ,namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setRelationToNomineeCode(String relationToNomineeCode) {
		RelationToNomineeCode = relationToNomineeCode;
	}
	public String getRuralFlag() {
		return RuralFlag;
	}
	@XmlElement(name="RuralFlag" ,namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setRuralFlag(String ruralFlag) {
		RuralFlag = ruralFlag;
	}
	public String getTPANameCode() {
		return TPANameCode;
	}
	@XmlElement(name="TPANameCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setTPANameCode(String tPANameCode) {
		TPANameCode = tPANameCode;
	}
	@Override
	public String toString() {
		return "Application [Namefor80D=" + Namefor80D + ", NomineeAddress=" + NomineeAddress + ", Proposer=" + Proposer
				+ ", NomineeName=" + NomineeName + ", NomineeTitleCode=" + NomineeTitleCode + ", RelationToNomineeCode="
				+ RelationToNomineeCode + ", RuralFlag=" + RuralFlag + ", TPANameCode=" + TPANameCode + "]";
	}

}