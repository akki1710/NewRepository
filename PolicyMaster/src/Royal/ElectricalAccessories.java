package Royal;

public class ElectricalAccessories {
	
	ElectronicAccessoriesDetails electronicAccessoriesDetails ;

	public ElectronicAccessoriesDetails getElectronicAccessoriesDetails() {
		return electronicAccessoriesDetails;
	}

	public void setElectronicAccessoriesDetails(ElectronicAccessoriesDetails electronicAccessoriesDetails) {
		this.electronicAccessoriesDetails = electronicAccessoriesDetails;
	}

	
	

}
class ElectronicAccessoriesDetails 
{
	private String makeModel;
private String nameOfElectronicAccessories;
private String value;
public String getMakeModel() {
	return makeModel;
}
public void setMakeModel(String makeModel) {
	this.makeModel = makeModel;
}
public String getNameOfElectronicAccessories() {
	return nameOfElectronicAccessories;
}
public void setNameOfElectronicAccessories(String nameOfElectronicAccessories) {
	this.nameOfElectronicAccessories = nameOfElectronicAccessories;
}
public String getValue() {
	return value;
}
public void setValue(String value) {
	this.value = value;
}
@Override
public String toString() {
	return "ElectronicAccessoriesDetails [makeModel=" + makeModel + ", nameOfElectronicAccessories="
			+ nameOfElectronicAccessories + ", value=" + value + "]";
}







}

