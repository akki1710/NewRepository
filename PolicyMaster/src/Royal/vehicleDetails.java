package Royal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;



@XmlAccessorType(XmlAccessType.FIELD)
public class vehicleDetails {
	private String carRegisteredCity;
	private String vehicleModelCode;
	private String yearOfManufacture;
	private String vehicleManufacturerName;
	private String vehicleMostlyDrivenOn;
	@XmlElement(name="vehicleRegDate")
	private String vehicleRegDate;
	@XmlElement(name="vehicleregDate")
	private String vehicleregDate;
	private String idv;
	private String previousPolicyNo;
	private String policyStartDate;
	private String engineCapacityAmount;
	private String drivingExperience;
	private String vehicleRegisteredInTheNameOf;
	private String	modelName;
	private String ProductName;
	@XmlElement(name="productName")
	private String productname;
	private String companyNameForCar;
	private String isTwoWheelerFinanced;
	private String vehicleSubLine;
	private String fuelType;
	private String region;
	private String averageMonthlyMileageRun;
	private String registrationchargesRoadtax;
	private String vechileOwnerShipChanged;
	private String isPreviousPolicyHolder;
	private String noClaimBonusPercent;
	private String isBiFuelKit;
	private String isBiFuelKitYes;
	private String addonValue;
	private String automobileAssociationMembership;
	private String voluntarydeductible;
	private String hdnDepreciation;
	private String hdnInvoicePrice;
	private String hdnKeyReplacement;
	private String hdnProtector;
	private String hdnRoadTax;
	private String hdnWindShield;
	private String hdnSpareCar;
	private String spareCarLimit;
	private String hdnLossOfBaggage;
	private String valueOfLossOfBaggage;
	private String cover_dri_othr_car_ass;
	private String accidentcoverforpaiddriver;
	private String personalaccidentcoverforunnamedpassengers;
	private String legalliabilitytopaiddriver;
	private String fibreglass;
	private String cover_elec_acc;
	private String valueofelectricalaccessories;
    private String quoteId;
	private String registrationNumber;
	private String chassisNumber;
	private String engineNumber;
	private String isCarFinanced;
	private String isCarFinancedValue;
	private String financierName;
	private String cover_non_elec_acc;
	private String valueofnonelectricalaccessories;
	private String policyED;
	private String policySD;
	private String previousInsurerName;
	private String previousPolicyExpiryDate;
	private String previousPolicyType;
	private String previousinsurersCorrectAddress;
	private String previuosPolicyNumber;
	private String claimAmountReceived;
	private String claimsMadeInPreviousPolicy;
	private String claimsReported;
	private String isCarOwnershipChanged;
	private String typeOfCover;
	private ElectricalAccessories electricalAccessories;
	private ElectronicAccessoriesDetails electronicAccessoriesDetails;
	private NonElectricalAccesories nonElectricalAccesories;
	private NonElectronicAccessoriesDetails nonElectronicAccessoriesDetails;
	public String getCarRegisteredCity() {
		return carRegisteredCity;
	}
	public void setCarRegisteredCity(String carRegisteredCity) {
		this.carRegisteredCity = carRegisteredCity;
	}
	public String getVehicleModelCode() {
		return vehicleModelCode;
	}
	public void setVehicleModelCode(String vehicleModelCode) {
		this.vehicleModelCode = vehicleModelCode;
	}
	public String getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(String yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public String getVehicleManufacturerName() {
		return vehicleManufacturerName;
	}
	public void setVehicleManufacturerName(String vehicleManufacturerName) {
		this.vehicleManufacturerName = vehicleManufacturerName;
	}
	public String getVehicleMostlyDrivenOn() {
		return vehicleMostlyDrivenOn;
	}
	public void setVehicleMostlyDrivenOn(String vehicleMostlyDrivenOn) {
		this.vehicleMostlyDrivenOn = vehicleMostlyDrivenOn;
	}
	public String getVehicleRegDate() {
		return vehicleRegDate;
	}
	public void setVehicleRegDate(String vehicleRegDate) {
		this.vehicleRegDate = vehicleRegDate;
	}
	public String getVehicleregDate() {
		return vehicleregDate;
	}
	public void setVehicleregDate(String vehicleregDate) {
		this.vehicleregDate = vehicleregDate;
	}
	public String getIdv() {
		return idv;
	}
	public void setIdv(String idv) {
		this.idv = idv;
	}
	public String getPreviousPolicyNo() {
		return previousPolicyNo;
	}
	public void setPreviousPolicyNo(String previousPolicyNo) {
		this.previousPolicyNo = previousPolicyNo;
	}
	public String getPolicyStartDate() {
		return policyStartDate;
	}
	public void setPolicyStartDate(String policyStartDate) {
		this.policyStartDate = policyStartDate;
	}
	public String getEngineCapacityAmount() {
		return engineCapacityAmount;
	}
	public void setEngineCapacityAmount(String engineCapacityAmount) {
		this.engineCapacityAmount = engineCapacityAmount;
	}
	public String getDrivingExperience() {
		return drivingExperience;
	}
	public void setDrivingExperience(String drivingExperience) {
		this.drivingExperience = drivingExperience;
	}
	public String getVehicleRegisteredInTheNameOf() {
		return vehicleRegisteredInTheNameOf;
	}
	public void setVehicleRegisteredInTheNameOf(String vehicleRegisteredInTheNameOf) {
		this.vehicleRegisteredInTheNameOf = vehicleRegisteredInTheNameOf;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getCompanyNameForCar() {
		return companyNameForCar;
	}
	public void setCompanyNameForCar(String companyNameForCar) {
		this.companyNameForCar = companyNameForCar;
	}
	public String getIsTwoWheelerFinanced() {
		return isTwoWheelerFinanced;
	}
	public void setIsTwoWheelerFinanced(String isTwoWheelerFinanced) {
		this.isTwoWheelerFinanced = isTwoWheelerFinanced;
	}
	public String getVehicleSubLine() {
		return vehicleSubLine;
	}
	public void setVehicleSubLine(String vehicleSubLine) {
		this.vehicleSubLine = vehicleSubLine;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getAverageMonthlyMileageRun() {
		return averageMonthlyMileageRun;
	}
	public void setAverageMonthlyMileageRun(String averageMonthlyMileageRun) {
		this.averageMonthlyMileageRun = averageMonthlyMileageRun;
	}
	public String getRegistrationchargesRoadtax() {
		return registrationchargesRoadtax;
	}
	public void setRegistrationchargesRoadtax(String registrationchargesRoadtax) {
		this.registrationchargesRoadtax = registrationchargesRoadtax;
	}
	public String getVechileOwnerShipChanged() {
		return vechileOwnerShipChanged;
	}
	public void setVechileOwnerShipChanged(String vechileOwnerShipChanged) {
		this.vechileOwnerShipChanged = vechileOwnerShipChanged;
	}
	public String getIsPreviousPolicyHolder() {
		return isPreviousPolicyHolder;
	}
	public void setIsPreviousPolicyHolder(String isPreviousPolicyHolder) {
		this.isPreviousPolicyHolder = isPreviousPolicyHolder;
	}
	public String getNoClaimBonusPercent() {
		return noClaimBonusPercent;
	}
	public void setNoClaimBonusPercent(String noClaimBonusPercent) {
		this.noClaimBonusPercent = noClaimBonusPercent;
	}
	public String getIsBiFuelKit() {
		return isBiFuelKit;
	}
	public void setIsBiFuelKit(String isBiFuelKit) {
		this.isBiFuelKit = isBiFuelKit;
	}
	public String getIsBiFuelKitYes() {
		return isBiFuelKitYes;
	}
	public void setIsBiFuelKitYes(String isBiFuelKitYes) {
		this.isBiFuelKitYes = isBiFuelKitYes;
	}
	public String getAddonValue() {
		return addonValue;
	}
	public void setAddonValue(String addonValue) {
		this.addonValue = addonValue;
	}
	public String getAutomobileAssociationMembership() {
		return automobileAssociationMembership;
	}
	public void setAutomobileAssociationMembership(String automobileAssociationMembership) {
		this.automobileAssociationMembership = automobileAssociationMembership;
	}
	public String getVoluntarydeductible() {
		return voluntarydeductible;
	}
	public void setVoluntarydeductible(String voluntarydeductible) {
		this.voluntarydeductible = voluntarydeductible;
	}
	public String getHdnDepreciation() {
		return hdnDepreciation;
	}
	public void setHdnDepreciation(String hdnDepreciation) {
		this.hdnDepreciation = hdnDepreciation;
	}
	public String getHdnInvoicePrice() {
		return hdnInvoicePrice;
	}
	public void setHdnInvoicePrice(String hdnInvoicePrice) {
		this.hdnInvoicePrice = hdnInvoicePrice;
	}
	public String getHdnKeyReplacement() {
		return hdnKeyReplacement;
	}
	public void setHdnKeyReplacement(String hdnKeyReplacement) {
		this.hdnKeyReplacement = hdnKeyReplacement;
	}
	public String getHdnProtector() {
		return hdnProtector;
	}
	public void setHdnProtector(String hdnProtector) {
		this.hdnProtector = hdnProtector;
	}
	public String getHdnRoadTax() {
		return hdnRoadTax;
	}
	public void setHdnRoadTax(String hdnRoadTax) {
		this.hdnRoadTax = hdnRoadTax;
	}
	public String getHdnWindShield() {
		return hdnWindShield;
	}
	public void setHdnWindShield(String hdnWindShield) {
		this.hdnWindShield = hdnWindShield;
	}
	public String getHdnSpareCar() {
		return hdnSpareCar;
	}
	public void setHdnSpareCar(String hdnSpareCar) {
		this.hdnSpareCar = hdnSpareCar;
	}
	public String getSpareCarLimit() {
		return spareCarLimit;
	}
	public void setSpareCarLimit(String spareCarLimit) {
		this.spareCarLimit = spareCarLimit;
	}
	public String getHdnLossOfBaggage() {
		return hdnLossOfBaggage;
	}
	public void setHdnLossOfBaggage(String hdnLossOfBaggage) {
		this.hdnLossOfBaggage = hdnLossOfBaggage;
	}
	public String getValueOfLossOfBaggage() {
		return valueOfLossOfBaggage;
	}
	public void setValueOfLossOfBaggage(String valueOfLossOfBaggage) {
		this.valueOfLossOfBaggage = valueOfLossOfBaggage;
	}
	public String getCover_dri_othr_car_ass() {
		return cover_dri_othr_car_ass;
	}
	public void setCover_dri_othr_car_ass(String cover_dri_othr_car_ass) {
		this.cover_dri_othr_car_ass = cover_dri_othr_car_ass;
	}
	public String getAccidentcoverforpaiddriver() {
		return accidentcoverforpaiddriver;
	}
	public void setAccidentcoverforpaiddriver(String accidentcoverforpaiddriver) {
		this.accidentcoverforpaiddriver = accidentcoverforpaiddriver;
	}
	public String getPersonalaccidentcoverforunnamedpassengers() {
		return personalaccidentcoverforunnamedpassengers;
	}
	public void setPersonalaccidentcoverforunnamedpassengers(String personalaccidentcoverforunnamedpassengers) {
		this.personalaccidentcoverforunnamedpassengers = personalaccidentcoverforunnamedpassengers;
	}
	public String getLegalliabilitytopaiddriver() {
		return legalliabilitytopaiddriver;
	}
	public void setLegalliabilitytopaiddriver(String legalliabilitytopaiddriver) {
		this.legalliabilitytopaiddriver = legalliabilitytopaiddriver;
	}
	public String getFibreglass() {
		return fibreglass;
	}
	public void setFibreglass(String fibreglass) {
		this.fibreglass = fibreglass;
	}
	public String getCover_elec_acc() {
		return cover_elec_acc;
	}
	public void setCover_elec_acc(String cover_elec_acc) {
		this.cover_elec_acc = cover_elec_acc;
	}
	public String getValueofelectricalaccessories() {
		return valueofelectricalaccessories;
	}
	public void setValueofelectricalaccessories(String valueofelectricalaccessories) {
		this.valueofelectricalaccessories = valueofelectricalaccessories;
	}
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getIsCarFinanced() {
		return isCarFinanced;
	}
	public void setIsCarFinanced(String isCarFinanced) {
		this.isCarFinanced = isCarFinanced;
	}
	public String getIsCarFinancedValue() {
		return isCarFinancedValue;
	}
	public void setIsCarFinancedValue(String isCarFinancedValue) {
		this.isCarFinancedValue = isCarFinancedValue;
	}
	public String getFinancierName() {
		return financierName;
	}
	public void setFinancierName(String financierName) {
		this.financierName = financierName;
	}
	public String getCover_non_elec_acc() {
		return cover_non_elec_acc;
	}
	public void setCover_non_elec_acc(String cover_non_elec_acc) {
		this.cover_non_elec_acc = cover_non_elec_acc;
	}
	public String getValueofnonelectricalaccessories() {
		return valueofnonelectricalaccessories;
	}
	public void setValueofnonelectricalaccessories(String valueofnonelectricalaccessories) {
		this.valueofnonelectricalaccessories = valueofnonelectricalaccessories;
	}
	public String getPolicyED() {
		return policyED;
	}
	public void setPolicyED(String policyED) {
		this.policyED = policyED;
	}
	public String getPolicySD() {
		return policySD;
	}
	public void setPolicySD(String policySD) {
		this.policySD = policySD;
	}
	public String getPreviousInsurerName() {
		return previousInsurerName;
	}
	public void setPreviousInsurerName(String previousInsurerName) {
		this.previousInsurerName = previousInsurerName;
	}
	public String getPreviousPolicyExpiryDate() {
		return previousPolicyExpiryDate;
	}
	public void setPreviousPolicyExpiryDate(String previousPolicyExpiryDate) {
		this.previousPolicyExpiryDate = previousPolicyExpiryDate;
	}
	public String getPreviousPolicyType() {
		return previousPolicyType;
	}
	public void setPreviousPolicyType(String previousPolicyType) {
		this.previousPolicyType = previousPolicyType;
	}
	public String getPreviousinsurersCorrectAddress() {
		return previousinsurersCorrectAddress;
	}
	public void setPreviousinsurersCorrectAddress(String previousinsurersCorrectAddress) {
		this.previousinsurersCorrectAddress = previousinsurersCorrectAddress;
	}
	public String getPreviuosPolicyNumber() {
		return previuosPolicyNumber;
	}
	public void setPreviuosPolicyNumber(String previuosPolicyNumber) {
		this.previuosPolicyNumber = previuosPolicyNumber;
	}
	public String getClaimAmountReceived() {
		return claimAmountReceived;
	}
	public void setClaimAmountReceived(String claimAmountReceived) {
		this.claimAmountReceived = claimAmountReceived;
	}
	public String getClaimsMadeInPreviousPolicy() {
		return claimsMadeInPreviousPolicy;
	}
	public void setClaimsMadeInPreviousPolicy(String claimsMadeInPreviousPolicy) {
		this.claimsMadeInPreviousPolicy = claimsMadeInPreviousPolicy;
	}
	public String getClaimsReported() {
		return claimsReported;
	}
	public void setClaimsReported(String claimsReported) {
		this.claimsReported = claimsReported;
	}
	public String getIsCarOwnershipChanged() {
		return isCarOwnershipChanged;
	}
	public void setIsCarOwnershipChanged(String isCarOwnershipChanged) {
		this.isCarOwnershipChanged = isCarOwnershipChanged;
	}
	public String getTypeOfCover() {
		return typeOfCover;
	}
	public void setTypeOfCover(String typeOfCover) {
		this.typeOfCover = typeOfCover;
	}
	public ElectricalAccessories getElectricalAccessories() {
		return electricalAccessories;
	}
	public void setElectricalAccessories(ElectricalAccessories electricalAccessories) {
		this.electricalAccessories = electricalAccessories;
	}
	public ElectronicAccessoriesDetails getElectronicAccessoriesDetails() {
		return electronicAccessoriesDetails;
	}
	public void setElectronicAccessoriesDetails(ElectronicAccessoriesDetails electronicAccessoriesDetails) {
		this.electronicAccessoriesDetails = electronicAccessoriesDetails;
	}
	public NonElectricalAccesories getNonElectricalAccesories() {
		return nonElectricalAccesories;
	}
	public void setNonElectricalAccesories(NonElectricalAccesories nonElectricalAccesories) {
		this.nonElectricalAccesories = nonElectricalAccesories;
	}
	public NonElectronicAccessoriesDetails getNonElectronicAccessoriesDetails() {
		return nonElectronicAccessoriesDetails;
	}
	public void setNonElectronicAccessoriesDetails(NonElectronicAccessoriesDetails nonElectronicAccessoriesDetails) {
		this.nonElectronicAccessoriesDetails = nonElectronicAccessoriesDetails;
	}
	@Override
	public String toString() {
		return "vehicleDetails [carRegisteredCity=" + carRegisteredCity + ", vehicleModelCode=" + vehicleModelCode
				+ ", yearOfManufacture=" + yearOfManufacture + ", vehicleManufacturerName=" + vehicleManufacturerName
				+ ", vehicleMostlyDrivenOn=" + vehicleMostlyDrivenOn + ", vehicleRegDate=" + vehicleRegDate
				+ ", vehicleregDate=" + vehicleregDate + ", idv=" + idv + ", previousPolicyNo=" + previousPolicyNo
				+ ", policyStartDate=" + policyStartDate + ", engineCapacityAmount=" + engineCapacityAmount
				+ ", drivingExperience=" + drivingExperience + ", vehicleRegisteredInTheNameOf="
				+ vehicleRegisteredInTheNameOf + ", modelName=" + modelName + ", ProductName=" + ProductName
				+ ", productname=" + productname + ", companyNameForCar=" + companyNameForCar
				+ ", isTwoWheelerFinanced=" + isTwoWheelerFinanced + ", vehicleSubLine=" + vehicleSubLine
				+ ", fuelType=" + fuelType + ", region=" + region + ", averageMonthlyMileageRun="
				+ averageMonthlyMileageRun + ", registrationchargesRoadtax=" + registrationchargesRoadtax
				+ ", vechileOwnerShipChanged=" + vechileOwnerShipChanged + ", isPreviousPolicyHolder="
				+ isPreviousPolicyHolder + ", noClaimBonusPercent=" + noClaimBonusPercent + ", isBiFuelKit="
				+ isBiFuelKit + ", isBiFuelKitYes=" + isBiFuelKitYes + ", addonValue=" + addonValue
				+ ", automobileAssociationMembership=" + automobileAssociationMembership + ", voluntarydeductible="
				+ voluntarydeductible + ", hdnDepreciation=" + hdnDepreciation + ", hdnInvoicePrice=" + hdnInvoicePrice
				+ ", hdnKeyReplacement=" + hdnKeyReplacement + ", hdnProtector=" + hdnProtector + ", hdnRoadTax="
				+ hdnRoadTax + ", hdnWindShield=" + hdnWindShield + ", hdnSpareCar=" + hdnSpareCar + ", spareCarLimit="
				+ spareCarLimit + ", hdnLossOfBaggage=" + hdnLossOfBaggage + ", valueOfLossOfBaggage="
				+ valueOfLossOfBaggage + ", cover_dri_othr_car_ass=" + cover_dri_othr_car_ass
				+ ", accidentcoverforpaiddriver=" + accidentcoverforpaiddriver
				+ ", personalaccidentcoverforunnamedpassengers=" + personalaccidentcoverforunnamedpassengers
				+ ", legalliabilitytopaiddriver=" + legalliabilitytopaiddriver + ", fibreglass=" + fibreglass
				+ ", cover_elec_acc=" + cover_elec_acc + ", valueofelectricalaccessories="
				+ valueofelectricalaccessories + ", quoteId=" + quoteId + ", registrationNumber=" + registrationNumber
				+ ", chassisNumber=" + chassisNumber + ", engineNumber=" + engineNumber + ", isCarFinanced="
				+ isCarFinanced + ", isCarFinancedValue=" + isCarFinancedValue + ", financierName=" + financierName
				+ ", cover_non_elec_acc=" + cover_non_elec_acc + ", valueofnonelectricalaccessories="
				+ valueofnonelectricalaccessories + ", policyED=" + policyED + ", policySD=" + policySD
				+ ", previousInsurerName=" + previousInsurerName + ", previousPolicyExpiryDate="
				+ previousPolicyExpiryDate + ", previousPolicyType=" + previousPolicyType
				+ ", previousinsurersCorrectAddress=" + previousinsurersCorrectAddress + ", previuosPolicyNumber="
				+ previuosPolicyNumber + ", claimAmountReceived=" + claimAmountReceived
				+ ", claimsMadeInPreviousPolicy=" + claimsMadeInPreviousPolicy + ", claimsReported=" + claimsReported
				+ ", isCarOwnershipChanged=" + isCarOwnershipChanged + ", typeOfCover=" + typeOfCover
				+ ", electricalAccessories=" + electricalAccessories + ", electronicAccessoriesDetails="
				+ electronicAccessoriesDetails + ", nonElectricalAccesories=" + nonElectricalAccesories
				+ ", nonElectronicAccessoriesDetails=" + nonElectronicAccessoriesDetails + "]";
	}
	
	
	}
	

