package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Product")
public class ProductSubElement {
	private String BasePremiumAmount;
	private String ClientCode;
	private String DiscountAmount;
	private String GrossPremiumAmount;
	private String LoadingAmount;
	private String PaidBy;
	private String ProductCode;
	private String ProductGroup;
	private String ProductLine;
	private String ProductType;
	private String ProductVersion;
	private String SACCode;
	private String SumAssured;
    private String TaxAmount;
    public String getBasePremiumAmount() {
		return BasePremiumAmount;
	}
    @XmlElement(name="BasePremiumAmount",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setBasePremiumAmount(String BasePremiumAmount) {
		this.BasePremiumAmount = BasePremiumAmount;
	}
	
	public String getDiscountAmount() {
		return DiscountAmount;
	}
	@XmlElement(name="DiscountAmount",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setDiscountAmount(String DiscountAmount) {
		this.DiscountAmount = DiscountAmount;
	}
	
	public String getGrossPremiumAmount() {
		return GrossPremiumAmount;
	}
	@XmlElement(name="GrossPremiumAmount",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setGrossPremiumAmount(String GrossPremiumAmount) {
		this.GrossPremiumAmount = GrossPremiumAmount;
	}
	//----
	public String getLoadingAmount() {
		return LoadingAmount;
	}
	@XmlElement(name="LoadingAmount",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setLoadingAmount(String LoadingAmount) {
		this.LoadingAmount = LoadingAmount;
	}
	
	public String getPaidBy() {
		return PaidBy;
	}
	@XmlElement(name="PaidBy",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setPaidBy(String PaidBy) {
		this.PaidBy = PaidBy;
	}
	
	public String getClientCode() {
		return ClientCode;
	}
	@XmlElement(name="ClientCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setClientCode(String clientCode) {
		ClientCode = clientCode;
	}
	public String getProductCode() {
		return ProductCode;
	}
	@XmlElement(name="ProductCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}
	public String getProductGroup() {
		return ProductGroup;
	}
	@XmlElement(name="ProductGroup",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setProductGroup(String productGroup) {
		ProductGroup = productGroup;
	}
	public String getProductLine() {
		return ProductLine;
	}
	@XmlElement(name="ProductLine",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setProductLine(String productLine) {
		ProductLine = productLine;
	}
	public String getProductType() {
		return ProductType;
	}
	@XmlElement(name="ProductType",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setProductType(String productType) {
		ProductType = productType;
	}
	public String getProductVersion() {
		return ProductVersion;
	}
	@XmlElement(name="ProductVersion",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setProductVersion(String productVersion) {
		ProductVersion = productVersion;
	}
	public String getSACCode() {
		return SACCode;
	}
	@XmlElement(name="SACCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setSACCode(String sACCode) {
		SACCode = sACCode;
	}
	public String getSumAssured() {
		return SumAssured;
	}
	@XmlElement(name="SumAssured",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setSumAssured(String sumAssured) {
		SumAssured = sumAssured;
		
	}
	
	public String getTaxAmount() {
		return TaxAmount;
	}
	@XmlElement(name="TaxAmount",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setTaxAmount(String TaxAmount) {
		this.TaxAmount = TaxAmount;
	}
	@Override
	public String toString() {
		return "ProductSubElement [BasePremiumAmount=" + BasePremiumAmount + ", DiscountAmount=" + DiscountAmount
				+ ", GrossPremiumAmount=" + GrossPremiumAmount + ", ClientCode=" + ClientCode + ", ProductCode="
				+ ProductCode + ", ProductGroup=" + ProductGroup + ", ProductLine=" + ProductLine + ", ProductType="
				+ ProductType + ", ProductVersion=" + ProductVersion + ", SACCode=" + SACCode + ", SumAssured="
				+ SumAssured + ", TaxAmount=" + TaxAmount + "]";
	}
	
	
	
}