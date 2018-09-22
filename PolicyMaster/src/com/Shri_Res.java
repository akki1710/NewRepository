package com;

public class Shri_Res {
	String POL_SYS_ID;
	String PROPOSAL_NO;
	String VehicleIDV;
	String ERROR_CODE;
	String ERROR_DESC;
	String CoverDesc;
	String CoverDesc1;
	String Premium;
	String TotalPremium;
	public String getPOL_SYS_ID() {
		return POL_SYS_ID;
	}
	public void setPOL_SYS_ID(String pOL_SYS_ID) {
		POL_SYS_ID = pOL_SYS_ID;
	}
	public String getPROPOSAL_NO() {
		return PROPOSAL_NO;
	}
	public void setPROPOSAL_NO(String pROPOSAL_NO) {
		PROPOSAL_NO = pROPOSAL_NO;
	}
	public String getVehicleIDV() {
		return VehicleIDV;
	}
	public void setVehicleIDV(String vehicleIDV) {
		VehicleIDV = vehicleIDV;
	}
	public String getERROR_CODE() {
		return ERROR_CODE;
	}
	public void setERROR_CODE(String eRROR_CODE) {
		ERROR_CODE = eRROR_CODE;
	}
	public String getERROR_DESC() {
		return ERROR_DESC;
	}
	public void setERROR_DESC(String eRROR_DESC) {
		ERROR_DESC = eRROR_DESC;
	}
	public String getCoverDesc() {
		return CoverDesc;
	}
	public void setCoverDesc(String coverDesc) {
		CoverDesc = coverDesc;
	}
	public String getCoverDesc1() {
		return CoverDesc1;
	}
	public void setCoverDesc1(String coverDesc1) {
		CoverDesc1 = coverDesc1;
	}
	public String getPremium() {
		return Premium;
	}
	public void setPremium(String premium) {
		Premium = premium;
	}
	public String getTotalPremium() {
		return TotalPremium;
	}
	public void setTotalPremium(String totalPremium) {
		TotalPremium = totalPremium;
	}
	@Override
	public String toString() {
		return "Shri_Res [POL_SYS_ID=" + POL_SYS_ID + ", PROPOSAL_NO=" + PROPOSAL_NO + ", VehicleIDV=" + VehicleIDV
				+ ", ERROR_CODE=" + ERROR_CODE + ", ERROR_DESC=" + ERROR_DESC + ", CoverDesc=" + CoverDesc
				+ ", CoverDesc1=" + CoverDesc1 + ", Premium=" + Premium + ", TotalPremium=" + TotalPremium + "]";
	}
	
}
