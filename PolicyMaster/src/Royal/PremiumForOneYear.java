package Royal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class PremiumForOneYear {

	private String CGST;
	private String ECESS;
	private String GROSS_PREMIUM;
	private String IDV;
	private String IGST;
	private String KRISHI_CESS;
	private String PACKAGE_PREMIUM;
	private String POLICY_EXPIRY_DATE;
	private String POLICY_START_DATE;
	private String PREMIUM;
	private String PREMIUM_WITHOUT_COVERS;
	private String SERVICETAX;
	private String SGST;
	private String TAX_TYPE;
	private String UTGST;
	private String VERSION_NO;
	private String POLICY_TERM;
	@XmlElement(name="LIABILITY")
	private LIABILITY LIABILITY;
	@XmlElement(name="OD_PREMIUM")
	private OD_PREMIUM OD_PREMIUM;
	public String getCGST() {
		return CGST;
	}
	public void setCGST(String cGST) {
		CGST = cGST;
	}
	public String getECESS() {
		return ECESS;
	}
	public void setECESS(String eCESS) {
		ECESS = eCESS;
	}
	public String getGROSS_PREMIUM() {
		return GROSS_PREMIUM;
	}
	public void setGROSS_PREMIUM(String gROSS_PREMIUM) {
		GROSS_PREMIUM = gROSS_PREMIUM;
	}
	public String getIDV() {
		return IDV;
	}
	public void setIDV(String iDV) {
		IDV = iDV;
	}
	public String getIGST() {
		return IGST;
	}
	public void setIGST(String iGST) {
		IGST = iGST;
	}
	public String getKRISHI_CESS() {
		return KRISHI_CESS;
	}
	public void setKRISHI_CESS(String kRISHI_CESS) {
		KRISHI_CESS = kRISHI_CESS;
	}
	public String getPACKAGE_PREMIUM() {
		return PACKAGE_PREMIUM;
	}
	public void setPACKAGE_PREMIUM(String pACKAGE_PREMIUM) {
		PACKAGE_PREMIUM = pACKAGE_PREMIUM;
	}
	public String getPOLICY_EXPIRY_DATE() {
		return POLICY_EXPIRY_DATE;
	}
	public void setPOLICY_EXPIRY_DATE(String pOLICY_EXPIRY_DATE) {
		POLICY_EXPIRY_DATE = pOLICY_EXPIRY_DATE;
	}
	public String getPOLICY_START_DATE() {
		return POLICY_START_DATE;
	}
	public void setPOLICY_START_DATE(String pOLICY_START_DATE) {
		POLICY_START_DATE = pOLICY_START_DATE;
	}
	public String getPREMIUM() {
		return PREMIUM;
	}
	public void setPREMIUM(String pREMIUM) {
		PREMIUM = pREMIUM;
	}
	public String getPREMIUM_WITHOUT_COVERS() {
		return PREMIUM_WITHOUT_COVERS;
	}
	public void setPREMIUM_WITHOUT_COVERS(String pREMIUM_WITHOUT_COVERS) {
		PREMIUM_WITHOUT_COVERS = pREMIUM_WITHOUT_COVERS;
	}
	public String getSERVICETAX() {
		return SERVICETAX;
	}
	public void setSERVICETAX(String sERVICETAX) {
		SERVICETAX = sERVICETAX;
	}
	public String getSGST() {
		return SGST;
	}
	public void setSGST(String sGST) {
		SGST = sGST;
	}
	public String getTAX_TYPE() {
		return TAX_TYPE;
	}
	public void setTAX_TYPE(String tAX_TYPE) {
		TAX_TYPE = tAX_TYPE;
	}
	public String getUTGST() {
		return UTGST;
	}
	public void setUTGST(String uTGST) {
		UTGST = uTGST;
	}
	public String getVERSION_NO() {
		return VERSION_NO;
	}
	public void setVERSION_NO(String vERSION_NO) {
		VERSION_NO = vERSION_NO;
	}
	public String getPOLICY_TERM() {
		return POLICY_TERM;
	}
	public void setPOLICY_TERM(String pOLICY_TERM) {
		POLICY_TERM = pOLICY_TERM;
	}
	public LIABILITY getLIABILITY() {
		return LIABILITY;
	}
	public void setLIABILITY(LIABILITY lIABILITY) {
		LIABILITY = lIABILITY;
	}
	public OD_PREMIUM getOD_PREMIUM() {
		return OD_PREMIUM;
	}
	public void setOD_PREMIUM(OD_PREMIUM oD_PREMIUM) {
		OD_PREMIUM = oD_PREMIUM;
	}
	@Override
	public String toString() {
		return "PremiumForOneYear [CGST=" + CGST + ", ECESS=" + ECESS + ", GROSS_PREMIUM=" + GROSS_PREMIUM + ", IDV="
				+ IDV + ", IGST=" + IGST + ", KRISHI_CESS=" + KRISHI_CESS + ", PACKAGE_PREMIUM=" + PACKAGE_PREMIUM
				+ ", POLICY_EXPIRY_DATE=" + POLICY_EXPIRY_DATE + ", POLICY_START_DATE=" + POLICY_START_DATE
				+ ", PREMIUM=" + PREMIUM + ", PREMIUM_WITHOUT_COVERS=" + PREMIUM_WITHOUT_COVERS + ", SERVICETAX="
				+ SERVICETAX + ", SGST=" + SGST + ", TAX_TYPE=" + TAX_TYPE + ", UTGST=" + UTGST + ", VERSION_NO="
				+ VERSION_NO + ", POLICY_TERM=" + POLICY_TERM + ", LIABILITY=" + LIABILITY + ", OD_PREMIUM="
				+ OD_PREMIUM + "]";
	}
	
	
	
}
