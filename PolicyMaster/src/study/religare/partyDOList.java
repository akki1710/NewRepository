package study.religare;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="partyDOList")
public class partyDOList {
	
	private String birthDt;
	private String firstName;
	private String genderCd;
	private String guid;
	private String lastName;
	private String relationCd;
	private String roleCd;
	private String titleCd;
	
	private partyAddressDOList partyAddressDOList;
	private partyContactDOList partyContactDOList;
	private partyEmailDOList partyEmailDOList;
	private partyIdentityDOList partyIdentityDOList;
	private partyQuestionDOList partyQuestionDOList;
	public partyDOList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public partyDOList(String birthDt, String firstName, String genderCd, String guid, String lastName,
			String relationCd, String roleCd, String titleCd, study.religare.partyAddressDOList partyAddressDOList,
			study.religare.partyContactDOList partyContactDOList, study.religare.partyEmailDOList partyEmailDOList,
			study.religare.partyIdentityDOList partyIdentityDOList,
			study.religare.partyQuestionDOList partyQuestionDOList) {
		super();
		this.birthDt = birthDt;
		this.firstName = firstName;
		this.genderCd = genderCd;
		this.guid = guid;
		this.lastName = lastName;
		this.relationCd = relationCd;
		this.roleCd = roleCd;
		this.titleCd = titleCd;
		this.partyAddressDOList = partyAddressDOList;
		this.partyContactDOList = partyContactDOList;
		this.partyEmailDOList = partyEmailDOList;
		this.partyIdentityDOList = partyIdentityDOList;
		this.partyQuestionDOList = partyQuestionDOList;
	}

	@XmlElement(name="partyAddressDOList",namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	private List<partyAddressDOList> padl=new ArrayList<partyAddressDOList>();
	
	
	public List<partyAddressDOList> getpartyAddressDOList(){
		return padl;
		
	}

	public void setPartyAddressDOList(List<partyAddressDOList> padl) {
		this.padl=padl;
	}
	
	public String getBirthDt() {
		return birthDt;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setBirthDt(String birthDt) {
		this.birthDt = birthDt;
	}
	public String getFirstName() {
		return firstName;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getGenderCd() {
		return genderCd;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setGenderCd(String genderCd) {
		this.genderCd = genderCd;
	}
	public String getGuid() {
		return guid;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getLastName() {
		return lastName;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRelationCd() {
		return relationCd;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setRelationCd(String relationCd) {
		this.relationCd = relationCd;
	}
	public String getRoleCd() {
		return roleCd;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setRoleCd(String roleCd) {
		this.roleCd = roleCd;
	}
	public String getTitleCd() {
		return titleCd;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setTitleCd(String titleCd) {
		this.titleCd = titleCd;
	}
	/*public partyAddressDOList getPartyAddressDOList() {
		return partyAddressDOList;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setPartyAddressDOList(partyAddressDOList partyAddressDOList) {
		this.partyAddressDOList = partyAddressDOList;
	}*/
	public partyContactDOList getPartyContactDOList() {
		return partyContactDOList;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setPartyContactDOList(study.religare.partyContactDOList partyContactDOList) {
		this.partyContactDOList = partyContactDOList;
	}
	public study.religare.partyEmailDOList getPartyEmailDOList() {
		return partyEmailDOList;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setPartyEmailDOList(study.religare.partyEmailDOList partyEmailDOList) {
		this.partyEmailDOList = partyEmailDOList;
	}
	public study.religare.partyIdentityDOList getPartyIdentityDOList() {
		return partyIdentityDOList;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setPartyIdentityDOList(study.religare.partyIdentityDOList partyIdentityDOList) {
		this.partyIdentityDOList = partyIdentityDOList;
	}
	public study.religare.partyQuestionDOList getPartyQuestionDOList() {
		return partyQuestionDOList;
	}
	@XmlElement(namespace="http://intf.insurance.symbiosys.c2lbiz.com/xsd")
	public void setPartyQuestionDOList(study.religare.partyQuestionDOList partyQuestionDOList) {
		this.partyQuestionDOList = partyQuestionDOList;
	}
	@Override
	public String toString() {
		return "partyDOList [birthDt=" + birthDt + ", firstName=" + firstName + ", genderCd=" + genderCd + ", guid="
				+ guid + ", lastName=" + lastName + ", relationCd=" + relationCd + ", roleCd=" + roleCd + ", titleCd="
				+ titleCd + ", partyAddressDOList=" + partyAddressDOList + ", partyContactDOList=" + partyContactDOList
				+ ", partyEmailDOList=" + partyEmailDOList + ", partyIdentityDOList=" + partyIdentityDOList
				+ ", partyQuestionDOList=" + partyQuestionDOList + "]";
	}
	
	
}
