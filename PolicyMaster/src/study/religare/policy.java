package study.religare;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="policy",namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
class policy {
	
	private String addOns;
	private String businessTypeCd;
	private String baseProductId;
	private String baseAgentId;
	private String coverType;
	private String policyNum;
	private String proposalNum;
	private String quotationReferenceNum;
	private String sumInsured;
	private String term;
	private String uwDecisionCd;
	private String isPremiumCalculation;
	private String nomineeDob;
	private String nomineeName;
	private String nomineeRelationship;
	
	private policyAdditionalFieldsDOList policyAdditionalFieldsDOList;
	private partyDOList partyDOList;
	public policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public policy(String addOns, String businessTypeCd, String baseProductId, String baseAgentId, String coverType,
			String policyNum, String proposalNum, String quotationReferenceNum, String sumInsured, String term,
			String uwDecisionCd, String isPremiumCalculation,
			study.religare.policyAdditionalFieldsDOList policyAdditionalFieldsDOList,
			study.religare.partyDOList partyDOList) {
		super();
		this.addOns = addOns;
		this.businessTypeCd = businessTypeCd;
		this.baseProductId = baseProductId;
		this.baseAgentId = baseAgentId;
		this.coverType = coverType;
		this.policyNum = policyNum;
		this.proposalNum = proposalNum;
		this.quotationReferenceNum = quotationReferenceNum;
		this.sumInsured = sumInsured;
		this.term = term;
		this.uwDecisionCd = uwDecisionCd;
		this.isPremiumCalculation = isPremiumCalculation;
		this.policyAdditionalFieldsDOList = policyAdditionalFieldsDOList;
		this.partyDOList = partyDOList;
	}
	@XmlElement(name="partyDOList",namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	private List<partyDOList> pdl=new ArrayList<partyDOList>();
	
	public List<partyDOList> getpartyDOList(){
		return pdl;
		
	}

	public void setPartyDOList(List<partyDOList> pdl) {
		this.pdl=pdl;
	}
	
	public String getAddOns() {
		return addOns;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setAddOns(String addOns) {
		this.addOns = addOns;
	}
	public String getBusinessTypeCd() {
		return businessTypeCd;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setBusinessTypeCd(String businessTypeCd) {
		this.businessTypeCd = businessTypeCd;
	}
	public String getBaseProductId() {
		return baseProductId;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setBaseProductId(String baseProductId) {
		this.baseProductId = baseProductId;
	}
	public String getBaseAgentId() {
		return baseAgentId;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setBaseAgentId(String baseAgentId) {
		this.baseAgentId = baseAgentId;
	}
	public String getCoverType() {
		return coverType;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}
	public String getPolicyNum() {
		return policyNum;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setPolicyNum(String policyNum) {
		this.policyNum = policyNum;
	}
	public String getProposalNum() {
		return proposalNum;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setProposalNum(String proposalNum) {
		this.proposalNum = proposalNum;
	}
	public String getQuotationReferenceNum() {
		return quotationReferenceNum;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setQuotationReferenceNum(String quotationReferenceNum) {
		this.quotationReferenceNum = quotationReferenceNum;
	}
	public String getSumInsured() {
		return sumInsured;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getTerm() {
		return term;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setTerm(String term) {
		this.term = term;
	}
	public String getUwDecisionCd() {
		return uwDecisionCd;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setUwDecisionCd(String uwDecisionCd) {
		this.uwDecisionCd = uwDecisionCd;
	}
	public String getIsPremiumCalculation() {
		return isPremiumCalculation;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setIsPremiumCalculation(String isPremiumCalculation) {
		this.isPremiumCalculation = isPremiumCalculation;
	}
	public policyAdditionalFieldsDOList getPolicyAdditionalFieldsDOList() {
		return policyAdditionalFieldsDOList;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setPolicyAdditionalFieldsDOList(policyAdditionalFieldsDOList policyAdditionalFieldsDOList) {
		this.policyAdditionalFieldsDOList = policyAdditionalFieldsDOList;
	}
	
	public String getNomineeDob() {
		return nomineeDob;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setNomineeDob(String nomineeDob) {
		this.nomineeDob = nomineeDob;
	}
	public String getNomineeName() {
		return nomineeName;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public String getNomineeRelationship() {
		return nomineeRelationship;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setNomineeRelationship(String nomineeRelationship) {
		this.nomineeRelationship = nomineeRelationship;
	}
	/*public partyDOList getPartyDOList() {
		return partyDOList;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setPartyDOList(partyDOList partyDOList) {
		this.partyDOList = partyDOList;
	}*/
	@Override
	public String toString() {
		return "policy [addOns=" + addOns + ", businessTypeCd=" + businessTypeCd + ", baseProductId=" + baseProductId
				+ ", baseAgentId=" + baseAgentId + ", coverType=" + coverType + ", policyNum=" + policyNum
				+ ", proposalNum=" + proposalNum + ", quotationReferenceNum=" + quotationReferenceNum + ", sumInsured="
				+ sumInsured + ", term=" + term + ", uwDecisionCd=" + uwDecisionCd + ", isPremiumCalculation="
				+ isPremiumCalculation + ", policyAdditionalFieldsDOList=" + policyAdditionalFieldsDOList
				+ ", partyDOList=" + partyDOList + "]";
	}
	
	
}
