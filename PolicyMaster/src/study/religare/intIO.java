package study.religare;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="createPolicy",namespace="http://relinterface.insurance.symbiosys.c2lbiz.com")
class createPolicy{
	
	private intIO intIO;

	public createPolicy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public createPolicy(study.religare.intIO intIO) {
		super();
		this.intIO = intIO;
	}

	public intIO getIntIO() {
		return intIO;
	}
	
	@XmlElement(name="intIO",namespace="http://relinterface.insurance.symbiosys.c2lbiz.com")
	public void setIntIO(intIO intIO) {
		this.intIO = intIO;
	}

	@Override
	public String toString() {
		return "createPolicy [intIO=" + intIO + "]";
	}
	
}
@XmlRootElement(name="intIO")
class intIO {
	
	private policy policy;

	public intIO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public intIO(study.religare.policy policy) {
		super();
		this.policy = policy;
	}

	public policy getPolicy() {
		return policy;
	}
	
	@XmlElement(name="policy",namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setPolicy(policy policy) {
		this.policy = policy;
	}

	@Override
	public String toString() {
		return "intIO [policy=" + policy + "]";
	}
	
}
