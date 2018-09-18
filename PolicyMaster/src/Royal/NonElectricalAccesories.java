package Royal;

public class NonElectricalAccesories {
	NonElectronicAccessoriesDetails nonelectronicAccessoriesDetails;

	public NonElectronicAccessoriesDetails getNonElectronicAccessoriesDetails() {
		return nonelectronicAccessoriesDetails;
	}

	public void setNonElectronicAccessoriesDetails(NonElectronicAccessoriesDetails nonelectronicAccessoriesDetails) {
		this.nonelectronicAccessoriesDetails = nonelectronicAccessoriesDetails;
	}
	
	
}
 class NonElectronicAccessoriesDetails
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
			return "NonElectronicAccessoriesDetails [makeModel=" + makeModel + ", nameOfElectronicAccessories="
					+ nameOfElectronicAccessories + ", value=" + value + "]";
		}
		
		
 }