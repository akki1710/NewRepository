package com;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchema;

@XmlRootElement(name="GetQuot")
public class User {
	
	private String strProductCode;
	private String strPolicyType;
	private String strRTOCode;
	private String strVehicleCode;
	private String strADDONCover;
	private String strFirstRegDt;
	private String strInsuredState;
	private String strPrevPolExpDt;
	private String strPrevPolClaimYN;
	private String strPrevPolNCB;
	private String Regyr;
	private String RegNo;
	private String VehicleType;
	
	public User(String strProductCode, String strPolicyType, String strRTOCode, String strVehicleCode,
			String strADDONCover, String strFirstRegDt, String strInsuredState, String strPrevPolExpDt,
			String strPrevPolClaimYN, String strPrevPolNCB) {
		super();
		this.strProductCode = strProductCode;
		this.strPolicyType = strPolicyType;
		this.strRTOCode = strRTOCode;
		this.strVehicleCode = strVehicleCode;
		this.strADDONCover = strADDONCover;
		this.strFirstRegDt = strFirstRegDt;
		this.strInsuredState = strInsuredState;
		this.strPrevPolExpDt = strPrevPolExpDt;
		this.strPrevPolClaimYN = strPrevPolClaimYN;
		this.strPrevPolNCB = strPrevPolNCB;
	}

	public User() {
	}
	
	public String getStrProductCode() {
		return strProductCode;
	}
	
	@XmlElement
	public void setStrProductCode(String strProductCode) {
		this.strProductCode = strProductCode;
	}
	
	public String getStrPolicyType() {
		return strPolicyType;
	}

	@XmlElement
	public void setStrPolicyType(String strPolicyType) {
		this.strPolicyType = strPolicyType;
	}
	
	public String getStrRTOCode() {
		return strRTOCode;
	}

	@XmlElement
	public void setStrRTOCode(String strRTOCode) {
		this.strRTOCode = strRTOCode;
	}
	
	public String getStrVehicleCode() {
		return strVehicleCode;
	}

	@XmlElement
	public void setStrVehicleCode(String strVehicleCode) {
		this.strVehicleCode = strVehicleCode;
	}
	
	public String getStrADDONCover() {
		return strADDONCover;
	}

	@XmlElement
	public void setStrADDONCover(String strADDONCover) {
		this.strADDONCover = strADDONCover;
	}
	
	public String getStrFirstRegDt() {
		return strFirstRegDt;
	}

	@XmlElement
	public void setStrFirstRegDt(String strFirstRegDt) {
		this.strFirstRegDt = strFirstRegDt;
	}
	
	public String getStrInsuredState() {
		return strInsuredState;
	}

	@XmlElement
	public void setStrInsuredState(String strInsuredState) {
		this.strInsuredState = strInsuredState;
	}
	
	public String getStrPrevPolExpDt() {
		return strPrevPolExpDt;
	}

	@XmlElement
	public void setStrPrevPolExpDt(String strPrevPolExpDt) {
		this.strPrevPolExpDt = strPrevPolExpDt;
	}
	
	public String getStrPrevPolClaimYN() {
		return strPrevPolClaimYN;
	}

	@XmlElement
	public void setStrPrevPolClaimYN(String strPrevPolClaimYN) {
		this.strPrevPolClaimYN = strPrevPolClaimYN;
	}
	
	public String getStrPrevPolNCB() {
		return strPrevPolNCB;
	}

	@XmlElement
	public void setStrPrevPolNCB(String strPrevPolNCB) {
		this.strPrevPolNCB = strPrevPolNCB;
	}
	

	public String getRegyr() {
		return Regyr;
	}

	public void setRegyr(String regyr) {
		Regyr = regyr;
	}
	
	public String getVehicleType() {
		return VehicleType;
	}

	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}
	
	public String getRegNo() {
		return RegNo;
	}

	public void setRegNo(String regNo) {
		RegNo = regNo;
	}

	@Override
	public String toString() {
		return "User [strProductCode=" + strProductCode + ", strPolicyType=" + strPolicyType + ", strRTOCode="
				+ strRTOCode + ", strVehicleCode=" + strVehicleCode + ", strADDONCover=" + strADDONCover
				+ ", strFirstRegDt=" + strFirstRegDt + ", strInsuredState=" + strInsuredState + ", strPrevPolExpDt="
				+ strPrevPolExpDt + ", strPrevPolClaimYN=" + strPrevPolClaimYN + ", strPrevPolNCB=" + strPrevPolNCB
				+ "]";
	}
	
	
}
