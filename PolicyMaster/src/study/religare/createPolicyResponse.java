package study.religare;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;

/*@XmlRootElement(name="createPolicyResponse",namespace="http://relinterface.insurance.symbiosys.c2lbiz.com")
@XmlAccessorType(XmlAccessType.FIELD)*/
public class createPolicyResponse {

	private Return Return;

	public createPolicyResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public createPolicyResponse(study.religare.Return return1) {
		super();
		Return = return1;
	}
	public Return getReturn() {
		return Return;
	}
	//@XmlElement(name="return")
	public void setReturn(Return return1) {
		Return = return1;
	}

	@Override
	public String toString() {
		return "createPolicyResponse [Return=" + Return + "]";
	}
	
}
/*@XmlRootElement(name="return")
@XmlAccessorType(XmlAccessType.FIELD)*/
class Return {
	

	//@XmlElement(name="int-policy-data-iO")
	private policy_data_iO policy_data_iO;

	public Return() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Return(study.religare.policy_data_iO policy_data_iO) {
		super();
		this.policy_data_iO = policy_data_iO;
	}
	public policy_data_iO getPolicy_data_iO() {
		return policy_data_iO;
	}
	public void setPolicy_data_iO(policy_data_iO policy_data_iO) {
		this.policy_data_iO = policy_data_iO;
	}

	@Override
	public String toString() {
		return "Return [policy_data_iO=" + policy_data_iO + "]";
	}
	
}
//@XmlAccessorType(XmlAccessType.FIELD)
class policy_data_iO{
	//@XmlElement
	private policy policy;
	//@XmlElement
	private policyAdditionalFieldsDOList policyAdditionalFieldsDOList;
	//@XmlElement
	private String ip_address;
	//@XmlElement(name="error-lists")
	private error_lists error_lists;
	//@XmlElement(name="list-error-list-list")
	private list_error_list_list list_error_list_list;
	public policy_data_iO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public policy_data_iO(study.religare.policy policy,
			study.religare.policyAdditionalFieldsDOList policyAdditionalFieldsDOList, String ip_address,
			study.religare.error_lists error_lists, study.religare.list_error_list_list list_error_list_list) {
		super();
		this.policy = policy;
		this.policyAdditionalFieldsDOList = policyAdditionalFieldsDOList;
		this.ip_address = ip_address;
		this.error_lists = error_lists;
		this.list_error_list_list = list_error_list_list;
	}
	
	public policy getPolicy() {
		return policy;
	}
	
	public void setPolicy(policy policy) {
		this.policy = policy;
	}
	public policyAdditionalFieldsDOList getPolicyAdditionalFieldsDOList() {
		return policyAdditionalFieldsDOList;
	}
	
	public void setPolicyAdditionalFieldsDOList(policyAdditionalFieldsDOList policyAdditionalFieldsDOList) {
		this.policyAdditionalFieldsDOList = policyAdditionalFieldsDOList;
	}
	public String getIp_address() {
		return ip_address;
	}
	
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public error_lists getError_lists() {
		return error_lists;
	}
	
	public void setError_lists(error_lists error_lists) {
		this.error_lists = error_lists;
	}
	public list_error_list_list getList_error_list_list() {
		return list_error_list_list;
	}

	public void setList_error_list_list(list_error_list_list list_error_list_list) {
		this.list_error_list_list = list_error_list_list;
	}
	@Override
	public String toString() {
		return "policy_data_iO [policy=" + policy + ", policyAdditionalFieldsDOList=" + policyAdditionalFieldsDOList
				+ ", ip_address=" + ip_address + ", error_lists=" + error_lists + ", list_error_list_list="
				+ list_error_list_list + "]";
	}
	
}
//@XmlAccessorType(XmlAccessType.FIELD)
class error_lists{
	//@XmlElement(name="err-description")
	private String err_description;
	//@XmlElement(name="version-iD")
	private String version_id;
	//@XmlElement(name="mark-delete")
	private String mark_delete;
	//@XmlElement(name="entity-number")
	private String entity_number;
	//@XmlElement(name="entity-location")
	private String entity_location;
	//@XmlElement(name="guid")
	private String guid;
	//@XmlElement(name="status")
	private String status;
	public error_lists() {
		super();
		// TODO Auto-generated constructor stub
	}
	public error_lists(String err_description, String version_id, String mark_delete, String entity_number,
			String entity_location, String guid, String status) {
		super();
		this.err_description = err_description;
		this.version_id = version_id;
		this.mark_delete = mark_delete;
		this.entity_number = entity_number;
		this.entity_location = entity_location;
		this.guid = guid;
		this.status = status;
	}
	public String getErr_description() {
		return err_description;
	}
	
	public void setErr_description(String err_description) {
		this.err_description = err_description;
	}
	public String getVersion_id() {
		return version_id;
	}
	
	public void setVersion_id(String version_id) {
		this.version_id = version_id;
	}
	public String getMark_delete() {
		return mark_delete;
	}
	
	public void setMark_delete(String mark_delete) {
		this.mark_delete = mark_delete;
	}
	public String getEntity_number() {
		return entity_number;
	}
	
	public void setEntity_number(String entity_number) {
		this.entity_number = entity_number;
	}
	public String getEntity_location() {
		return entity_location;
	}
	
	public void setEntity_location(String entity_location) {
		this.entity_location = entity_location;
	}
	public String getGuid() {
		return guid;
	}
	
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "error_lists [err_description=" + err_description + ", version_id=" + version_id + ", mark_delete="
				+ mark_delete + ", entity_number=" + entity_number + ", entity_location=" + entity_location + ", guid="
				+ guid + ", status=" + status + "]";
	}
	
}
//@XmlAccessorType(XmlAccessType.FIELD)
class list_error_list_list{
	//@XmlElement(name="err-description")
	private String err_description;
	//@XmlElement(name="version-iD")
	private String version_id;
	//@XmlElement(name="mark-delete")
	private String mark_delete;
	//@XmlElement(name="entity-number")
	private String entity_number;
	//@XmlElement(name="entity-location")
	private String entity_location;
	//@XmlElement(name="guid")
	private String guid;
	//@XmlElement(name="status")
	private String status;
	public list_error_list_list() {
		super();
		// TODO Auto-generated constructor stub
	}
	public list_error_list_list(String err_description, String version_id, String mark_delete, String entity_number,
			String entity_location, String guid, String status) {
		super();
		this.err_description = err_description;
		this.version_id = version_id;
		this.mark_delete = mark_delete;
		this.entity_number = entity_number;
		this.entity_location = entity_location;
		this.guid = guid;
		this.status = status;
	}
	public String getErr_description() {
		return err_description;
	}
	
	public void setErr_description(String err_description) {
		this.err_description = err_description;
	}
	public String getVersion_id() {
		return version_id;
	}

	public void setVersion_id(String version_id) {
		this.version_id = version_id;
	}
	public String getMark_delete() {
		return mark_delete;
	}
	
	public void setMark_delete(String mark_delete) {
		this.mark_delete = mark_delete;
	}
	public String getEntity_number() {
		return entity_number;
	}
	
	public void setEntity_number(String entity_number) {
		this.entity_number = entity_number;
	}
	public String getEntity_location() {
		return entity_location;
	}
	
	public void setEntity_location(String entity_location) {
		this.entity_location = entity_location;
	}
	public String getGuid() {
		return guid;
	}
	
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "list_error_list_list [err_description=" + err_description + ", version_id=" + version_id
				+ ", mark_delete=" + mark_delete + ", entity_number=" + entity_number + ", entity_location="
				+ entity_location + ", guid=" + guid + ", status=" + status + "]";
	}
	
}