package com;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PolicyScheduleURL")
public class PolicyUrlPojo {
	
	private String strPolSysId;

	public PolicyUrlPojo(String strPolSysId) {
		super();
		this.strPolSysId = strPolSysId;
	}

	public PolicyUrlPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStrPolSysId() {
		return strPolSysId;
	}
	
	@XmlElement(name="strPolSysId")
	public void setStrPolSysId(String strPolSysId) {
		this.strPolSysId = strPolSysId;
	}
	

}
