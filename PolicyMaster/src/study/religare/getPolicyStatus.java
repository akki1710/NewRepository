package study.religare;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="getPolicyStatus",namespace="http://relinterface.insurance.symbiosys.c2lbiz.com")
public class getPolicyStatus {
	private intSetPolicyStatusIO intSetPolicyStatusIO;

	public getPolicyStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public getPolicyStatus(study.religare.intSetPolicyStatusIO intSetPolicyStatusIO) {
		super();
		this.intSetPolicyStatusIO = intSetPolicyStatusIO;
	}

	public intSetPolicyStatusIO getIntSetPolicyStatusIO() {
		return intSetPolicyStatusIO;
	}
	@XmlElement(name="intSetPolicyStatusIO",namespace="http://relinterface.insurance.symbiosys.c2lbiz.com")
	public void setIntSetPolicyStatusIO(intSetPolicyStatusIO intSetPolicyStatusIO) {
		this.intSetPolicyStatusIO = intSetPolicyStatusIO;
	}

	@Override
	public String toString() {
		return "getPolicyStatus [intSetPolicyStatusIO=" + intSetPolicyStatusIO + "]";
	}
	
}

@XmlRootElement(name="intSetPolicyStatusIO")
class intSetPolicyStatusIO{
	private String proposalNum;

	public intSetPolicyStatusIO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public intSetPolicyStatusIO(String proposalNum) {
		super();
		this.proposalNum = proposalNum;
	}

	public String getProposalNum() {
		return proposalNum;
	}
	
	@XmlElement(name="proposalNum",namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setProposalNum(String proposalNum) {
		this.proposalNum = proposalNum;
	}

	@Override
	public String toString() {
		return "intSetPolicyStatusIO [proposalNum=" + proposalNum + "]";
	}
	
}