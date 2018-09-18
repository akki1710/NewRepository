package com;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="objPolicyEntryETT")
public class Proposal1 {
	
	private String ReferenceNo;
	private String ProdCode;
	private String PolicyFromDt;
	private String PolicyToDt;
	private String PolicyIssueDt;
	private String InsuredPrefix;
	private String InsuredName;
	private String Gender;
	private String Address1;
	private String Address2;
	private String Address3;
	private String State;
	private String City;
	private String PinCode;
	private String PanNo;
	private String GSTNo;
	private String TelephoneNo;
	private String FaxNo;
	private String EMailID;
	private String PolicyType;
	private String ProposalType;
	private String MobileNo;
	private String DateOfBirth;
	private String POSAgentName;
	private String POSAgentPanNo;
	private String CoverNoteNo;
	private String CoverNoteDt;
	private String VehicleCode;
	private String EngineNo;
	private String FirstRegDt;
	private String VehicleType;
	private String ChassisNo;
	private String RegNo1;
	private String RegNo2;
	private String RegNo3;
	private String RegNo4;
	private String RTOCode;
	private String IDV_of_Vehicle;
	private String Colour;
	private String NoEmpCoverLL;
	private String VehiclePurposeYN;
	private String DriverAgeYN;
	 private String LimitOwnPremiseYN;
	 private String CNGKitYN;
	 private String CNGKitSI;
	 private String LimitedTPPDYN;
	 private String InBuiltCNGKitYN;
	 private String VoluntaryExcess;
	 private String Bangladesh;
	 private String Bhutan;
	 private String SriLanka;
	 private String Pakistan;
	 private String Nepal;
	 private String Maldives;
	 private String DeTariff;
	 private String PreInspectionReportYN;
	 private String PreInspection;
	 private String BreakIn;
	 private String AddonPackage;
	 private String NilDepreciationCoverYN;
	 private String PAforUnnamedPassengerYN;
	 private String PAforUnnamedPassengerSI;
	 private String ElectricalaccessYN;
	 private String ElectricalaccessSI;
	 private String ElectricalaccessRemarks;
	 private String NonElectricalaccessYN;
	 private String NonElectricalaccessSI;
	 private String NonElectricalaccessRemarks;
	 private String PAPaidDriverConductorCleanerYN;
	 private String PAPaidDriverConductorCleanerSI;
	 private String PAPaidDriverCount;
	 private String PAPaidConductorCount;
	 private String PAPaidCleanerCount;
	 private String NomineeNameforPAOwnerDriver;
	 private String NomineeAgeforPAOwnerDriver;
	 private String NomineeRelationforPAOwnerDriver;
	 private String AppointeeNameforPAOwnerDriver;
	 private String AppointeeRelationforPAOwnerDriver;
	 private String LLtoPaidDriverYN;
	 private String AntiTheftYN;
	 private String PreviousPolicyNo;
	 private String PreviousInsurer;
	 private String PreviousPolicyFromDt;
	 private String PreviousPolicyToDt;
	 private String PreviousPolicyUWYear;
	 private String PreviousPolicySI;
	 private String PreviousPolicyClaimYN;
	 private String PreviousPolicyNCBPerc;
	 private String PreviousPolicyType;
	 private String PreviousNilDepreciation;
	 private String HypothecationType;
	 private String HypothecationBankName;
	 private String HypothecationAddress1;
	 private String HypothecationAddress2;
	 private String HypothecationAddress3;
	 private String HypothecationAgreementNo;
	 private String	HypothecationCountry;
	 private String	HypothecationState;
	 private String	HypothecationCity;
	 private String	HypothecationPinCode;
	 private String SpecifiedPersonField;
	 private String PAOwnerDriverExclusion;
	 private String	PAOwnerDriverExReason;
	 private String	DepDeductWaiverYN;
	 private String DailyExpRemYN;
	 private String InvReturnYN;
	 private String	LossOfPersonBelongYN;
	 private String	EmergencyTranHotelExpRemYN;
	 private String KeyReplacementYN;
	 private String MultiCarBenefitYN;
	 private String AadharNo;
	 private String AadharEnrollNo;
	 private String Form16;
	 private String VehicleManufactureYear;
	 
	 public Proposal1() {
			
		}
		public Proposal1(String ReferenceNo, String ProdCode, String PolicyFromDt, String PolicyToDt, String PolicyIssueDt,
				String InsuredPrefix, String InsuredName, String Gender, String Address1, String Address2, String Address3,
				String State, String City, String PinCode, String PanNo, String GSTNo, String TelephoneNo, String FaxNo,
				String EMailID, String PolicyType, String ProposalType, String MobileNo, String DateOfBirth,
				String POSAgentName, String POSAgentPanNo, String CoverNoteNo, String CoverNoteDt, String VehicleCode,
				String EngineNo, String FirstRegDt, String VehicleType, String ChassisNo, String RegNo1, String RegNo2,
				String RegNo3, String RegNo4, String RTOCode, String IDV_of_Vehicle, String Colour, String NoEmpCoverLL,
				String VehiclePurposeYN, String DriverAgeYN, String LimitOwnPremiseYN, String CNGKitYN, String CNGKitSI,
				String LimitedTPPDYN, String InBuiltCNGKitYN, String VoluntaryExcess, String Bangladesh, String Bhutan,
				String SriLanka, String Pakistan, String Nepal, String Maldives, String DeTariff,
				String PreInspectionReportYN, String PreInspection, String BreakIn, String AddonPackage,
				String NilDepreciationCoverYN, String PAforUnnamedPassengerYN, String PAforUnnamedPassengerSI,
				String ElectricalaccessYN, String ElectricalaccessSI, String ElectricalaccessRemarks,
				String NonElectricalaccessYN, String NonElectricalaccessSI, String NonElectricalaccessRemarks,
				String PAPaidDriverConductorCleanerYN, String PAPaidDriverConductorCleanerSI, String PAPaidDriverCount,
				String PAPaidConductorCount, String PAPaidCleanerCount, String NomineeNameforPAOwnerDriver,
				String NomineeAgeforPAOwnerDriver, String NomineeRelationforPAOwnerDriver,
				String AppointeeNameforPAOwnerDriver, String AppointeeRelationforPAOwnerDriver, String LLtoPaidDriverYN,
				String AntiTheftYN, String PreviousPolicyNo, String PreviousInsurer, String PreviousPolicyFromDt,
				String PreviousPolicyToDt, String PreviousPolicyUWYear, String PreviousPolicySI,
				String PreviousPolicyClaimYN, String PreviousPolicyNCBPerc, String PreviousPolicyType,
				String PreviousNilDepreciation, String HypothecationType, String HypothecationBankName,
				String HypothecationAddress1, String HypothecationAddress2, String HypothecationAddress3,
				String HypothecationAgreementNo, String HypothecationCountry, String HypothecationState,
				String HypothecationCity, String HypothecationPinCode, String SpecifiedPersonField,
				String PAOwnerDriverExclusion, String PAOwnerDriverExReason, String DepDeductWaiverYN, String DailyExpRemYN,
				String InvReturnYN, String LossOfPersonBelongYN, String EmergencyTranHotelExpRemYN, String KeyReplacementYN,
				String MultiCarBenefitYN, String AadharNo, String AadharEnrollNo, String Form16,
				String VehicleManufactureYear) {
			super();
			this.ReferenceNo = ReferenceNo;
			this.ProdCode = ProdCode;
			this.PolicyFromDt = PolicyFromDt;
			this.PolicyToDt = PolicyToDt;
			this.PolicyIssueDt = PolicyIssueDt;
			this.InsuredPrefix = InsuredPrefix;
			this.InsuredName = InsuredName;
			this.Gender = Gender;
			this.Address1 = Address1;
			this.Address2 = Address2;
			this.Address3 = Address3;
			this.State = State;
			this.City = City;
			this.PinCode = PinCode;
			this.PanNo = PanNo;
			this.GSTNo = GSTNo;
			this.TelephoneNo = TelephoneNo;
			this.FaxNo = FaxNo;
			this.EMailID = EMailID;
			this.PolicyType = PolicyType;
			this.ProposalType = ProposalType;
			this.MobileNo = MobileNo;
			this.DateOfBirth = DateOfBirth;
			this.POSAgentName = POSAgentName;
			this.POSAgentPanNo = POSAgentPanNo;
			this.CoverNoteNo = CoverNoteNo;
			this.CoverNoteDt = CoverNoteDt;
			this.VehicleCode = VehicleCode;
			this.EngineNo = EngineNo;
			this.FirstRegDt = FirstRegDt;
			this.VehicleType = VehicleType;
			this.ChassisNo = ChassisNo;
			this.RegNo1 = RegNo1;
			this.RegNo2 = RegNo2;
			this.RegNo3 = RegNo3;
			this.RegNo4 = RegNo4;
			this.RTOCode = RTOCode;
			this.IDV_of_Vehicle = IDV_of_Vehicle;
			this.Colour = Colour;
			this.NoEmpCoverLL = NoEmpCoverLL;
			this.VehiclePurposeYN = VehiclePurposeYN;
			this.DriverAgeYN = DriverAgeYN;
			this.LimitOwnPremiseYN = LimitOwnPremiseYN;
			this.CNGKitYN = CNGKitYN;
			this.CNGKitSI = CNGKitSI;
			this.LimitedTPPDYN = LimitedTPPDYN;
			this.InBuiltCNGKitYN = InBuiltCNGKitYN;
			this.VoluntaryExcess = VoluntaryExcess;
			this.Bangladesh = Bangladesh;
			this.Bhutan = Bhutan;
			this.SriLanka = SriLanka;
			this.Pakistan = Pakistan;
			this.Nepal = Nepal;
			this.Maldives = Maldives;
			this.DeTariff = DeTariff;
			this.PreInspectionReportYN = PreInspectionReportYN;
			this.PreInspection = PreInspection;
			this.BreakIn = BreakIn;
			this.AddonPackage = AddonPackage;
			this.NilDepreciationCoverYN = NilDepreciationCoverYN;
			this.PAforUnnamedPassengerYN = PAforUnnamedPassengerYN;
			this.PAforUnnamedPassengerSI = PAforUnnamedPassengerSI;
			this.ElectricalaccessYN = ElectricalaccessYN;
			this.ElectricalaccessSI = ElectricalaccessSI;
			this.ElectricalaccessRemarks = ElectricalaccessRemarks;
			this.NonElectricalaccessYN = NonElectricalaccessYN;
			this.NonElectricalaccessSI = NonElectricalaccessSI;
			this.NonElectricalaccessRemarks = NonElectricalaccessRemarks;
			this.PAPaidDriverConductorCleanerYN = PAPaidDriverConductorCleanerYN;
			this.PAPaidDriverConductorCleanerSI = PAPaidDriverConductorCleanerSI;
			this.PAPaidDriverCount = PAPaidDriverCount;
			this.PAPaidConductorCount = PAPaidConductorCount;
			this.PAPaidCleanerCount = PAPaidCleanerCount;
			this.NomineeNameforPAOwnerDriver = NomineeNameforPAOwnerDriver;
			this.NomineeAgeforPAOwnerDriver = NomineeAgeforPAOwnerDriver;
			this.NomineeRelationforPAOwnerDriver = NomineeRelationforPAOwnerDriver;
			this.AppointeeNameforPAOwnerDriver = AppointeeNameforPAOwnerDriver;
			this.AppointeeRelationforPAOwnerDriver = AppointeeRelationforPAOwnerDriver;
			this.LLtoPaidDriverYN = LLtoPaidDriverYN;
			this.AntiTheftYN = AntiTheftYN;
			this.PreviousPolicyNo = PreviousPolicyNo;
			this.PreviousInsurer = PreviousInsurer;
			this.PreviousPolicyFromDt = PreviousPolicyFromDt;
			this.PreviousPolicyToDt = PreviousPolicyToDt;
			this.PreviousPolicyUWYear = PreviousPolicyUWYear;
			this.PreviousPolicySI = PreviousPolicySI;
			this.PreviousPolicyClaimYN = PreviousPolicyClaimYN;
			this.PreviousPolicyNCBPerc = PreviousPolicyNCBPerc;
			this.PreviousPolicyType = PreviousPolicyType;
			this.PreviousNilDepreciation = PreviousNilDepreciation;
			this.HypothecationType = HypothecationType;
			this.HypothecationBankName = HypothecationBankName;
			this.HypothecationAddress1 = HypothecationAddress1;
			this.HypothecationAddress2 = HypothecationAddress2;
			this.HypothecationAddress3 = HypothecationAddress3;
			this.HypothecationAgreementNo = HypothecationAgreementNo;
			this.HypothecationCountry = HypothecationCountry;
			this.HypothecationState = HypothecationState;
			this.HypothecationCity = HypothecationCity;
			this.HypothecationPinCode = HypothecationPinCode;
			this.SpecifiedPersonField = SpecifiedPersonField;
			this.PAOwnerDriverExclusion = PAOwnerDriverExclusion;
			this.PAOwnerDriverExReason = PAOwnerDriverExReason;
			this.DepDeductWaiverYN = DepDeductWaiverYN;
			this.DailyExpRemYN = DailyExpRemYN;
			this.InvReturnYN = InvReturnYN;
			this.LossOfPersonBelongYN = LossOfPersonBelongYN;
			this.EmergencyTranHotelExpRemYN = EmergencyTranHotelExpRemYN;
			this.KeyReplacementYN = KeyReplacementYN;
			this.MultiCarBenefitYN = MultiCarBenefitYN;
			this.AadharNo = AadharNo;
			this.AadharEnrollNo = AadharEnrollNo;
			this.Form16 = Form16;
			this.VehicleManufactureYear = VehicleManufactureYear;
		}
		public String getReferenceNo() {
			return ReferenceNo;
		}
		@XmlElement(name="ReferenceNo")
		public void setReferenceNo(String ReferenceNo) {
			this.ReferenceNo = ReferenceNo;
		}
		public String getProdCode() {
			return ProdCode;
		}
		@XmlElement(name="ProdCode")
		public void setProdCode(String ProdCode) {
			this.ProdCode = ProdCode;
		}
		public String getPolicyFromDt() {
			return PolicyFromDt;
		}
		@XmlElement(name="PolicyFromDt")
		public void setPolicyFromDt(String PolicyFromDt) {
			this.PolicyFromDt = PolicyFromDt;
		}
		public String getPolicyToDt() {
			return PolicyToDt;
		}
		@XmlElement(name="PolicyToDt")
		public void setPolicyToDt(String PolicyToDt) {
			this.PolicyToDt = PolicyToDt;
		}
		public String getPolicyIssueDt() {
			return PolicyIssueDt;
		}
		@XmlElement(name="PolicyIssueDt")
		public void setPolicyIssueDt(String PolicyIssueDt) {
			this.PolicyIssueDt = PolicyIssueDt;
		}
		public String getInsuredPrefix() {
			return InsuredPrefix;
		}
		@XmlElement(name="InsuredPrefix")
		public void setInsuredPrefix(String InsuredPrefix) {
			this.InsuredPrefix = InsuredPrefix;
		}
		public String getInsuredName() {
			return InsuredName;
		}
		@XmlElement(name="InsuredName")
		public void setInsuredName(String InsuredName) {
			this.InsuredName = InsuredName;
		}
		public String getGender() {
			return Gender;
		}
		@XmlElement(name="Gender")
		public void setGender(String Gender) {
			this.Gender = Gender;
		}
		public String getAddress1() {
			return Address1;
		}
		@XmlElement(name="Address1")
		public void setAddress1(String Address1) {
			this.Address1 = Address1;
		}
		public String getAddress2() {
			return Address2;
		}
		@XmlElement(name="Address2")
		public void setAddress2(String Address2) {
			this.Address2 = Address2;
		}
		public String getAddress3() {
			return Address3;
		}
		@XmlElement(name="Address3")
		public void setAddress3(String Address3) {
			this.Address3 = Address3;
		}
		public String getState() {
			return State;
		}
		@XmlElement(name="State")
		public void setState(String State) {
			this.State = State;
		}
		public String getCity() {
			return City;
		}
		@XmlElement(name="City")
		public void setCity(String City) {
			this.City = City;
		}
		public String getPinCode() {
			return PinCode;
		}
		@XmlElement(name="PinCode")
		public void setPinCode(String PinCode) {
			this.PinCode = PinCode;
		}
		public String getPanNo() {
			return PanNo;
		}
		@XmlElement(name="PanNo")
		public void setPanNo(String PanNo) {
			this.PanNo = PanNo;
		}
		public String getGSTNo() {
			return GSTNo;
		}
		@XmlElement(name="GSTNo")
		public void setGSTNo(String GSTNo) {
			this.GSTNo = GSTNo;
		}
		public String getTelephoneNo() {
			return TelephoneNo;
		}
		@XmlElement(name="TelephoneNo")
		public void setTelephoneNo(String TelephoneNo) {
			this.TelephoneNo = TelephoneNo;
		}
		public String getFaxNo() {
			return FaxNo;
		}
		@XmlElement(name="FaxNo")
		public void setFaxNo(String FaxNo) {
			this.FaxNo = FaxNo;
		}
		public String getEMailID() {
			return EMailID;
		}
		@XmlElement(name="EMailID")
		public void setEMailID(String EMailID) {
			this.EMailID = EMailID;
		}
		public String getPolicyType() {
			return PolicyType;
		}
		@XmlElement(name="PolicyType")
		public void setPolicyType(String PolicyType) {
			this.PolicyType = PolicyType;
		}
		public String getProposalType() {
			return ProposalType;
		}
		@XmlElement(name="ProposalType")
		public void setProposalType(String ProposalType) {
			this.ProposalType = ProposalType;
		}
		public String getMobileNo() {
			return MobileNo;
		}
		@XmlElement(name="MobileNo")
		public void setMobileNo(String MobileNo) {
			this.MobileNo = MobileNo;
		}
		public String getDateOfBirth() {
			return DateOfBirth;
		}
		@XmlElement(name="DateOfBirth")
		public void setDateOfBirth(String DateOfBirth) {
			this.DateOfBirth = DateOfBirth;
		}
		public String getPOSAgentName() {
			return POSAgentName;
		}
		@XmlElement(name="POSAgentName")
		public void setPOSAgentName(String POSAgentName) {
			this.POSAgentName = POSAgentName;
		}
		public String getPOSAgentPanNo() {
			return POSAgentPanNo;
		}
		@XmlElement(name="POSAgentPanNo")
		public void setPOSAgentPanNo(String POSAgentPanNo) {
			this.POSAgentPanNo = POSAgentPanNo;
		}
		public String getCoverNoteNo() {
			return CoverNoteNo;
		}
		@XmlElement(name="CoverNoteNo")
		public void setCoverNoteNo(String CoverNoteNo) {
			this.CoverNoteNo = CoverNoteNo;
		}
		public String getCoverNoteDt() {
			return CoverNoteDt;
		}
		@XmlElement(name="CoverNoteDt")
		public void setCoverNoteDt(String CoverNoteDt) {
			this.CoverNoteDt = CoverNoteDt;
		}
		public String getVehicleCode() {
			return VehicleCode;
		}
		@XmlElement(name="VehicleCode")
		public void setVehicleCode(String VehicleCode) {
			this.VehicleCode = VehicleCode;
		}
		public String getEngineNo() {
			return EngineNo;
		}
		@XmlElement(name="EngineNo")
		public void setEngineNo(String EngineNo) {
			this.EngineNo = EngineNo;
		}
		public String getFirstRegDt() {
			return FirstRegDt;
		}
		@XmlElement(name="FirstRegDt")
		public void setFirstRegDt(String FirstRegDt) {
			this.FirstRegDt = FirstRegDt;
		}
		public String getVehicleType() {
			return VehicleType;
		}
		@XmlElement(name="VehicleType")
		public void setVehicleType(String VehicleType) {
			this.VehicleType = VehicleType;
		}
		public String getChassisNo() {
			return ChassisNo;
		}
		@XmlElement(name="ChassisNo")
		public void setChassisNo(String ChassisNo) {
			this.ChassisNo = ChassisNo;
		}
		public String getRegNo1() {
			return RegNo1;
		}
		@XmlElement(name="RegNo1")
		public void setRegNo1(String RegNo1) {
			this.RegNo1 = RegNo1;
		}
		public String getRegNo2() {
			return RegNo2;
		}
		@XmlElement(name="RegNo2")
		public void setRegNo2(String RegNo2) {
			this.RegNo2 = RegNo2;
		}
		public String getRegNo3() {
			return RegNo3;
		}
		@XmlElement(name="RegNo3")
		public void setRegNo3(String RegNo3) {
			this.RegNo3 = RegNo3;
		}
		public String getRegNo4() {
			return RegNo4;
		}
		@XmlElement(name="RegNo4")
		public void setRegNo4(String RegNo4) {
			this.RegNo4 = RegNo4;
		}
		public String getRTOCode() {
			return RTOCode;
		}
		@XmlElement(name="RTOCode")
		public void setRTOCode(String RTOCode) {
			this.RTOCode = RTOCode;
		}
		public String getIDV_of_Vehicle() {
			return IDV_of_Vehicle;
		}
		@XmlElement(name="IDV_of_Vehicle")
		public void setIDV_of_Vehicle(String IDV_of_Vehicle) {
			this.IDV_of_Vehicle = IDV_of_Vehicle;
		}
		public String getColour() {
			return Colour;
		}
		@XmlElement(name="Colour")
		public void setColour(String Colour) {
			this.Colour = Colour;
		}
		public String getNoEmpCoverLL() {
			return NoEmpCoverLL;
		}
		@XmlElement(name="NoEmpCoverLL")
		public void setNoEmpCoverLL(String NoEmpCoverLL) {
			this.NoEmpCoverLL = NoEmpCoverLL;
		}
		public String getVehiclePurposeYN() {
			return VehiclePurposeYN;
		}
		@XmlElement(name="VehiclePurposeYN")
		public void setVehiclePurposeYN(String VehiclePurposeYN) {
			this.VehiclePurposeYN = VehiclePurposeYN;
		}
		public String getDriverAgeYN() {
			return DriverAgeYN;
		}
		@XmlElement(name="DriverAgeYN")
		public void setDriverAgeYN(String DriverAgeYN) {
			this.DriverAgeYN = DriverAgeYN;
		}
		public String getLimitOwnPremiseYN() {
			return LimitOwnPremiseYN;
		}
		@XmlElement(name="LimitOwnPremiseYN")
		public void setLimitOwnPremiseYN(String LimitOwnPremiseYN) {
			this.LimitOwnPremiseYN = LimitOwnPremiseYN;
		}
		public String getCNGKitYN() {
			return CNGKitYN;
		}
		@XmlElement(name="CNGKitYN")
		public void setCNGKitYN(String CNGKitYN) {
			this.CNGKitYN = CNGKitYN;
		}
		public String getCNGKitSI() {
			return CNGKitSI;
		}
		@XmlElement(name="CNGKitSI")
		public void setCNGKitSI(String CNGKitSI) {
			this.CNGKitSI = CNGKitSI;
		}
		public String getLimitedTPPDYN() {
			return LimitedTPPDYN;
		}
		@XmlElement(name="LimitedTPPDYN")
		public void setLimitedTPPDYN(String LimitedTPPDYN) {
			this.LimitedTPPDYN = LimitedTPPDYN;
		}
		public String getInBuiltCNGKitYN() {
			return InBuiltCNGKitYN;
		}
		@XmlElement(name="InBuiltCNGKitYN")
		public void setInBuiltCNGKitYN(String InBuiltCNGKitYN) {
			this.InBuiltCNGKitYN = InBuiltCNGKitYN;
		}
		public String getVoluntaryExcess() {
			return VoluntaryExcess;
		}
		@XmlElement(name="VoluntaryExcess")
		public void setVoluntaryExcess(String VoluntaryExcess) {
			this.VoluntaryExcess = VoluntaryExcess;
		}
		public String getBangladesh() {
			return Bangladesh;
		}
		@XmlElement(name="Bangladesh")
		public void setBangladesh(String Bangladesh) {
			this.Bangladesh = Bangladesh;
		}
		public String getBhutan() {
			return Bhutan;
		}
		@XmlElement(name="Bhutan")
		public void setBhutan(String Bhutan) {
			this.Bhutan = Bhutan;
		}
		public String getSriLanka() {
			return SriLanka;
		}
		@XmlElement(name="SriLanka")
		public void setSriLanka(String SriLanka) {
			this.SriLanka = SriLanka;
		}
		public String getPakistan() {
			return Pakistan;
		}
		@XmlElement(name="Pakistan")
		public void setPakistan(String Pakistan) {
			this.Pakistan = Pakistan;
		}
		public String getNepal() {
			return Nepal;
		}
		@XmlElement(name="Nepal")
		public void setNepal(String Nepal) {
			this.Nepal = Nepal;
		}
		public String getMaldives() {
			return Maldives;
		}
		@XmlElement(name="Maldives")
		public void setMaldives(String Maldives) {
			this.Maldives = Maldives;
		}
		public String getDeTariff() {
			return DeTariff;
		}
		@XmlElement(name="DeTariff")
		public void setDeTariff(String DeTariff) {
			this.DeTariff = DeTariff;
		}
		public String getPreInspectionReportYN() {
			return PreInspectionReportYN;
		}
		@XmlElement(name="PreInspectionReportYN")
		public void setPreInspectionReportYN(String PreInspectionReportYN) {
			this.PreInspectionReportYN = PreInspectionReportYN;
		}
		public String getPreInspection() {
			return PreInspection;
		}
		@XmlElement(name="PreInspection")
		public void setPreInspection(String PreInspection) {
			this.PreInspection = PreInspection;
		}
		public String getBreakIn() {
			return BreakIn;
		}
		@XmlElement(name="BreakIn")
		public void setBreakIn(String BreakIn) {
			this.BreakIn = BreakIn;
		}
		public String getAddonPackage() {
			return AddonPackage;
		}
		@XmlElement(name="AddonPackage")
		public void setAddonPackage(String AddonPackage) {
			this.AddonPackage = AddonPackage;
		}
		public String getNilDepreciationCoverYN() {
			return NilDepreciationCoverYN;
		}
		@XmlElement(name="NilDepreciationCoverYN")
		public void setNilDepreciationCoverYN(String NilDepreciationCoverYN) {
			this.NilDepreciationCoverYN = NilDepreciationCoverYN;
		}
		public String getPAforUnnamedPassengerYN() {
			return PAforUnnamedPassengerYN;
		}
		@XmlElement(name="PAforUnnamedPassengerYN")
		public void setPAforUnnamedPassengerYN(String PAforUnnamedPassengerYN) {
			this.PAforUnnamedPassengerYN = PAforUnnamedPassengerYN;
		}
		public String getPAforUnnamedPassengerSI() {
			return PAforUnnamedPassengerSI;
		}
		@XmlElement(name="PAforUnnamedPassengerSI")
		public void setPAforUnnamedPassengerSI(String PAforUnnamedPassengerSI) {
			this.PAforUnnamedPassengerSI = PAforUnnamedPassengerSI;
		}
		public String getElectricalaccessYN() {
			return ElectricalaccessYN;
		}
		@XmlElement(name="ElectricalaccessYN")
		public void setElectricalaccessYN(String ElectricalaccessYN) {
			this.ElectricalaccessYN = ElectricalaccessYN;
		}
		public String getElectricalaccessSI() {
			return ElectricalaccessSI;
		}
		@XmlElement(name="ElectricalaccessSI")
		public void setElectricalaccessSI(String ElectricalaccessSI) {
			this.ElectricalaccessSI = ElectricalaccessSI;
		}
		public String getElectricalaccessRemarks() {
			return ElectricalaccessRemarks;
		}
		@XmlElement(name="ElectricalaccessRemarks")
		public void setElectricalaccessRemarks(String ElectricalaccessRemarks) {
			this.ElectricalaccessRemarks = ElectricalaccessRemarks;
		}
		public String getNonElectricalaccessYN() {
			return NonElectricalaccessYN;
		}
		@XmlElement(name="NonElectricalaccessYN")
		public void setNonElectricalaccessYN(String NonElectricalaccessYN) {
			this.NonElectricalaccessYN = NonElectricalaccessYN;
		}
		public String getNonElectricalaccessSI() {
			return NonElectricalaccessSI;
		}
		@XmlElement(name="NonElectricalaccessSI")
		public void setNonElectricalaccessSI(String NonElectricalaccessSI) {
			this.NonElectricalaccessSI = NonElectricalaccessSI;
		}
		public String getNonElectricalaccessRemarks() {
			return NonElectricalaccessRemarks;
		}
		@XmlElement(name="NonElectricalaccessRemarks")
		public void setNonElectricalaccessRemarks(String NonElectricalaccessRemarks) {
			this.NonElectricalaccessRemarks = NonElectricalaccessRemarks;
		}
		public String getPAPaidDriverConductorCleanerYN() {
			return PAPaidDriverConductorCleanerYN;
		}
		@XmlElement(name="PAPaidDriverConductorCleanerYN")
		public void setPAPaidDriverConductorCleanerYN(String PAPaidDriverConductorCleanerYN) {
			this.PAPaidDriverConductorCleanerYN = PAPaidDriverConductorCleanerYN;
		}
		public String getPAPaidDriverConductorCleanerSI() {
			return PAPaidDriverConductorCleanerSI;
		}
		@XmlElement(name="PAPaidDriverConductorCleanerSI")
		public void setPAPaidDriverConductorCleanerSI(String PAPaidDriverConductorCleanerSI) {
			this.PAPaidDriverConductorCleanerSI = PAPaidDriverConductorCleanerSI;
		}
		public String getPAPaidDriverCount() {
			return PAPaidDriverCount;
		}
		@XmlElement(name="PAPaidDriverCount")
		public void setPAPaidDriverCount(String PAPaidDriverCount) {
			this.PAPaidDriverCount = PAPaidDriverCount;
		}
		public String getPAPaidConductorCount() {
			return PAPaidConductorCount;
		}
		@XmlElement(name="PAPaidConductorCount")
		public void setPAPaidConductorCount(String PAPaidConductorCount) {
			this.PAPaidConductorCount = PAPaidConductorCount;
		}
		public String getPAPaidCleanerCount() {
			return PAPaidCleanerCount;
		}
		@XmlElement(name="PAPaidCleanerCount")
		public void setPAPaidCleanerCount(String PAPaidCleanerCount) {
			this.PAPaidCleanerCount = PAPaidCleanerCount;
		}
		public String getNomineeNameforPAOwnerDriver() {
			return NomineeNameforPAOwnerDriver;
		}
		@XmlElement(name="NomineeNameforPAOwnerDriver")
		public void setNomineeNameforPAOwnerDriver(String NomineeNameforPAOwnerDriver) {
			this.NomineeNameforPAOwnerDriver = NomineeNameforPAOwnerDriver;
		}
		public String getNomineeAgeforPAOwnerDriver() {
			return NomineeAgeforPAOwnerDriver;
		}
		@XmlElement(name="NomineeAgeforPAOwnerDriver")
		public void setNomineeAgeforPAOwnerDriver(String NomineeAgeforPAOwnerDriver) {
			this.NomineeAgeforPAOwnerDriver = NomineeAgeforPAOwnerDriver;
		}
		public String getNomineeRelationforPAOwnerDriver() {
			return NomineeRelationforPAOwnerDriver;
		}
		@XmlElement(name="NomineeRelationforPAOwnerDriver")
		public void setNomineeRelationforPAOwnerDriver(String NomineeRelationforPAOwnerDriver) {
			this.NomineeRelationforPAOwnerDriver = NomineeRelationforPAOwnerDriver;
		}
		public String getAppointeeNameforPAOwnerDriver() {
			return AppointeeNameforPAOwnerDriver;
		}
		@XmlElement(name="AppointeeNameforPAOwnerDriver")
		public void setAppointeeNameforPAOwnerDriver(String AppointeeNameforPAOwnerDriver) {
			this.AppointeeNameforPAOwnerDriver = AppointeeNameforPAOwnerDriver;
		}
		public String getAppointeeRelationforPAOwnerDriver() {
			return AppointeeRelationforPAOwnerDriver;
		}
		@XmlElement(name="AppointeeRelationforPAOwnerDriver")
		public void setAppointeeRelationforPAOwnerDriver(String AppointeeRelationforPAOwnerDriver) {
			this.AppointeeRelationforPAOwnerDriver = AppointeeRelationforPAOwnerDriver;
		}
		public String getLLtoPaidDriverYN() {
			return LLtoPaidDriverYN;
		}
		@XmlElement(name="LLtoPaidDriverYN")
		public void setLLtoPaidDriverYN(String LLtoPaidDriverYN) {
			this.LLtoPaidDriverYN = LLtoPaidDriverYN;
		}
		public String getAntiTheftYN() {
			return AntiTheftYN;
		}
		@XmlElement(name="AntiTheftYN")
		public void setAntiTheftYN(String AntiTheftYN) {
			this.AntiTheftYN = AntiTheftYN;
		}
		public String getPreviousPolicyNo() {
			return PreviousPolicyNo;
		}
		@XmlElement(name="PreviousPolicyNo")
		public void setPreviousPolicyNo(String PreviousPolicyNo) {
			this.PreviousPolicyNo = PreviousPolicyNo;
		}
		public String getPreviousInsurer() {
			return PreviousInsurer;
		}
		@XmlElement(name="PreviousInsurer")
		public void setPreviousInsurer(String PreviousInsurer) {
			this.PreviousInsurer = PreviousInsurer;
		}
		public String getPreviousPolicyFromDt() {
			return PreviousPolicyFromDt;
		}
		@XmlElement(name="PreviousPolicyFromDt")
		public void setPreviousPolicyFromDt(String PreviousPolicyFromDt) {
			this.PreviousPolicyFromDt = PreviousPolicyFromDt;
		}
		public String getPreviousPolicyToDt() {
			return PreviousPolicyToDt;
		}
		@XmlElement(name="PreviousPolicyToDt")
		public void setPreviousPolicyToDt(String PreviousPolicyToDt) {
			this.PreviousPolicyToDt = PreviousPolicyToDt;
		}
		public String getPreviousPolicyUWYear() {
			return PreviousPolicyUWYear;
		}
		@XmlElement(name="PreviousPolicyUWYear")
		public void setPreviousPolicyUWYear(String PreviousPolicyUWYear) {
			this.PreviousPolicyUWYear = PreviousPolicyUWYear;
		}
		public String getPreviousPolicySI() {
			return PreviousPolicySI;
		}
		@XmlElement(name="PreviousPolicySI")
		public void setPreviousPolicySI(String PreviousPolicySI) {
			this.PreviousPolicySI = PreviousPolicySI;
		}
		public String getPreviousPolicyClaimYN() {
			return PreviousPolicyClaimYN;
		}
		@XmlElement(name="PreviousPolicyClaimYN")
		public void setPreviousPolicyClaimYN(String PreviousPolicyClaimYN) {
			this.PreviousPolicyClaimYN = PreviousPolicyClaimYN;
		}
		public String getPreviousPolicyNCBPerc() {
			return PreviousPolicyNCBPerc;
		}
		@XmlElement(name="PreviousPolicyNCBPerc")
		public void setPreviousPolicyNCBPerc(String PreviousPolicyNCBPerc) {
			this.PreviousPolicyNCBPerc = PreviousPolicyNCBPerc;
		}
		public String getPreviousPolicyType() {
			return PreviousPolicyType;
		}
		@XmlElement(name="PreviousPolicyType")
		public void setPreviousPolicyType(String PreviousPolicyType) {
			this.PreviousPolicyType = PreviousPolicyType;
		}
		public String getPreviousNilDepreciation() {
			return PreviousNilDepreciation;
		}
		@XmlElement(name="PreviousNilDepreciation")
		public void setPreviousNilDepreciation(String PreviousNilDepreciation) {
			this.PreviousNilDepreciation = PreviousNilDepreciation;
		}
		public String getHypothecationType() {
			return HypothecationType;
		}
		@XmlElement(name="HypothecationType")
		public void setHypothecationType(String HypothecationType) {
			this.HypothecationType = HypothecationType;
		}
		public String getHypothecationBankName() {
			return HypothecationBankName;
		}
		@XmlElement(name="HypothecationBankName")
		public void setHypothecationBankName(String HypothecationBankName) {
			this.HypothecationBankName = HypothecationBankName;
		}
		public String getHypothecationAddress1() {
			return HypothecationAddress1;
		}
		@XmlElement(name="HypothecationAddress1")
		public void setHypothecationAddress1(String HypothecationAddress1) {
			this.HypothecationAddress1 = HypothecationAddress1;
		}
		public String getHypothecationAddress2() {
			return HypothecationAddress2;
		}
		@XmlElement(name="HypothecationAddress2")
		public void setHypothecationAddress2(String HypothecationAddress2) {
			this.HypothecationAddress2 = HypothecationAddress2;
		}
		public String getHypothecationAddress3() {
			return HypothecationAddress3;
		}
		@XmlElement(name="HypothecationAddress3")
		public void setHypothecationAddress3(String HypothecationAddress3) {
			this.HypothecationAddress3 = HypothecationAddress3;
		}
		public String getHypothecationAgreementNo() {
			return HypothecationAgreementNo;
		}
		@XmlElement(name="HypothecationAgreementNo")
		public void setHypothecationAgreementNo(String HypothecationAgreementNo) {
			this.HypothecationAgreementNo = HypothecationAgreementNo;
		}
		public String getHypothecationCountry() {
			return HypothecationCountry;
		}
		@XmlElement(name="HypothecationCountry")
		public void setHypothecationCountry(String HypothecationCountry) {
			this.HypothecationCountry = HypothecationCountry;
		}
		public String getHypothecationState() {
			return HypothecationState;
		}
		@XmlElement(name="HypothecationState")
		public void setHypothecationState(String HypothecationState) {
			this.HypothecationState = HypothecationState;
		}
		public String getHypothecationCity() {
			return HypothecationCity;
		}
		@XmlElement(name="HypothecationCity")
		public void setHypothecationCity(String HypothecationCity) {
			this.HypothecationCity = HypothecationCity;
		}
		public String getHypothecationPinCode() {
			return HypothecationPinCode;
		}
		@XmlElement(name="HypothecationPinCode")
		public void setHypothecationPinCode(String HypothecationPinCode) {
			this.HypothecationPinCode = HypothecationPinCode;
		}
		public String getSpecifiedPersonField() {
			return SpecifiedPersonField;
		}
		@XmlElement(name="SpecifiedPersonField")
		public void setSpecifiedPersonField(String SpecifiedPersonField) {
			this.SpecifiedPersonField = SpecifiedPersonField;
		}
		public String getPAOwnerDriverExclusion() {
			return PAOwnerDriverExclusion;
		}
		@XmlElement(name="PAOwnerDriverExclusion")
		public void setPAOwnerDriverExclusion(String PAOwnerDriverExclusion) {
			this.PAOwnerDriverExclusion = PAOwnerDriverExclusion;
		}
		public String getPAOwnerDriverExReason() {
			return PAOwnerDriverExReason;
		}
		@XmlElement(name="PAOwnerDriverExReason")
		public void setPAOwnerDriverExReason(String PAOwnerDriverExReason) {
			this.PAOwnerDriverExReason = PAOwnerDriverExReason;
		}
		public String getDepDeductWaiverYN() {
			return DepDeductWaiverYN;
		}
		@XmlElement(name="DepDeductWaiverYN")
		public void setDepDeductWaiverYN(String DepDeductWaiverYN) {
			this.DepDeductWaiverYN = DepDeductWaiverYN;
		}
		public String getDailyExpRemYN() {
			return DailyExpRemYN;
		}
		@XmlElement(name="DailyExpRemYN")
		public void setDailyExpRemYN(String DailyExpRemYN) {
			this.DailyExpRemYN = DailyExpRemYN;
		}
		public String getInvReturnYN() {
			return InvReturnYN;
		}
		@XmlElement(name="InvReturnYN")
		public void setInvReturnYN(String InvReturnYN) {
			this.InvReturnYN = InvReturnYN;
		}
		public String getLossOfPersonBelongYN() {
			return LossOfPersonBelongYN;
		}
		@XmlElement(name="LossOfPersonBelongYN")
		public void setLossOfPersonBelongYN(String LossOfPersonBelongYN) {
			this.LossOfPersonBelongYN = LossOfPersonBelongYN;
		}
		public String getEmergencyTranHotelExpRemYN() {
			return EmergencyTranHotelExpRemYN;
		}
		@XmlElement(name="EmergencyTranHotelExpRemYN")
		public void setEmergencyTranHotelExpRemYN(String EmergencyTranHotelExpRemYN) {
			this.EmergencyTranHotelExpRemYN = EmergencyTranHotelExpRemYN;
		}
		public String getKeyReplacementYN() {
			return KeyReplacementYN;
		}
		@XmlElement(name="KeyReplacementYN")
		public void setKeyReplacementYN(String KeyReplacementYN) {
			this.KeyReplacementYN = KeyReplacementYN;
		}
		public String getMultiCarBenefitYN() {
			return MultiCarBenefitYN;
		}
		@XmlElement(name="MultiCarBenefitYN")
		public void setMultiCarBenefitYN(String MultiCarBenefitYN) {
			this.MultiCarBenefitYN = MultiCarBenefitYN;
		}
		public String getAadharNo() {
			return AadharNo;
		}
		@XmlElement(name="AadharNo")
		public void setAadharNo(String AadharNo) {
			this.AadharNo = AadharNo;
		}
		public String getAadharEnrollNo() {
			return AadharEnrollNo;
		}
		@XmlElement(name="AadharEnrollNo")
		public void setAadharEnrollNo(String AadharEnrollNo) {
			this.AadharEnrollNo = AadharEnrollNo;
		}
		public String getForm16() {
			return Form16;
		}
		@XmlElement(name="Form16")
		public void setForm16(String Form16) {
			this.Form16 = Form16;
		}
		public String getVehicleManufactureYear() {
			return VehicleManufactureYear;
		}
		@XmlElement(name="VehicleManufactureYear")
		public void setVehicleManufactureYear(String VehicleManufactureYear) {
			this.VehicleManufactureYear = VehicleManufactureYear;
		}

}
