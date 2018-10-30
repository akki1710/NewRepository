package Apollo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Client")
public class Client {
	private String Age;
	private String ClientCode;
	private String OccuptionCode;
	private String AnnualIncome;
	private String BirthDate;
	private String FamilySize;
	private String FirstName;
	private String GenderCode;
	private String GstinNumber;
	private String Height;
	private String IDProofNumber;
	private String IDProofTypeCode;
	private String LastName;
	private String MaritalStatusCode;
	private String MiddleName;
	private String NationalityCode;
	private String RelationshipCode;
	private String TitleCode;
	private String Weight;
	private Address	Address;
    private Product Product;
    private LifeStyleHabits LifeStyleHabits;
    private ContactInformation ContactInformation;
    private Dependants  Dependants;
    private ClientSubElement ClientSubElement;
    private DependantsSubElement DependantsSubElement;
    
	
	public DependantsSubElement getDependantsSubElement() {
		return DependantsSubElement;
	}
	@XmlElement(name="Dependants",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setDependantsSubElement(DependantsSubElement dependantsSubElement) {
		DependantsSubElement = dependantsSubElement;
	}
	public ClientSubElement getClientSubElement() {
		return ClientSubElement;
	}
	@XmlElement(name="Client",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setClientSubElement(ClientSubElement clientSubElement) {
		ClientSubElement = clientSubElement;
	}
	/*public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String age, String clientCode, String occuptionCode, Apollo.Address address, Apollo.Product product) {
		super();
		Age = age;
		ClientCode = clientCode;
		OccuptionCode = occuptionCode;
		Address = address;
		Product = product;
	}*/
	public String getAge() {
		return Age;
	}
	
	@XmlElement(name="Age",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setAge(String age) {
		Age = age;
	}
	public String getClientCode() {
		return ClientCode;
	}
	@XmlElement(name="ClientCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setClientCode(String clientCode) {
		ClientCode = clientCode;
	}
	public String getOccuptionCode() {
		return OccuptionCode;
	}
	@XmlElement(name="OccuptionCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setOccuptionCode(String occuptionCode) {
		OccuptionCode = occuptionCode;
	}
	public Address getAddress() {
		return Address;
	}
	@XmlElement(name="Address",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setAddress(Address address) {
		Address = address;
	}
	public Product getProduct() {
		return Product;
	}
	@XmlElement(name="Product",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setProduct(Product product) {
		Product = product;
	}
	public LifeStyleHabits getLifeStyleHabits() {
		return LifeStyleHabits;
	}
	@XmlElement(name="LifeStyleHabits",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setLifeStyleHabits(LifeStyleHabits LifeStyleHabits) {
			this.LifeStyleHabits = LifeStyleHabits;
		}
		public ContactInformation getContactInformation() {
			return ContactInformation;
		}
		@XmlElement(name="ContactInformation",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setContactInformation(ContactInformation ContactInformation) {
			this.ContactInformation = ContactInformation;
		}
		
		public String getAnnualIncome() {
			return AnnualIncome;
		}
		@XmlElement(name="AnnualIncome",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setAnnualIncome(String AnnualIncome) {
			this.AnnualIncome = AnnualIncome;
		}
		
		public String getBirthDate() {
			return BirthDate;
		}
		@XmlElement(name="BirthDate",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setBirthDate(String BirthDate) {
			this.BirthDate = BirthDate;
		}
		 
		public String getFamilySize() {
			return FamilySize;
		}
		@XmlElement(name="FamilySize",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setFamilySize(String FamilySize) {
			this.FamilySize = FamilySize;
		}
	
		public String getFirstName() {
			return FirstName;
		}
		@XmlElement(name="FirstName",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setFirstName(String FirstName) {
			this.FirstName = FirstName;
		}
		
			
		public String getGenderCode() {
			return GenderCode;
		}
		@XmlElement(name="GenderCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setGenderCode(String GenderCode) {
			this.GenderCode = GenderCode;
		}
		
		public String getGstinNumber() {
			return GstinNumber;
		}
		@XmlElement(name="GstinNumber",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setGstinNumber(String GstinNumber) {
			this.GstinNumber = GstinNumber;
		}
		
		public String getIDProofNumber() {
			return IDProofNumber;
		}
		@XmlElement(name="IDProofNumber",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setIDProofNumber(String IDProofNumber) {
			this.IDProofNumber = IDProofNumber;
		}
		
		public String getIDProofTypeCode() {
			return IDProofTypeCode;
		}
		@XmlElement(name="IDProofTypeCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setIDProofTypeCode(String IDProofTypeCode) {
			this.IDProofTypeCode = IDProofTypeCode;
		}
		
		public String getLastName() {
			return LastName;
		}
		@XmlElement(name="LastName",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setLastName(String LastName) {
			this.LastName = LastName;
		}
		
		public String getMaritalStatusCode() {
			return MaritalStatusCode;
		}
		@XmlElement(name="MaritalStatusCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setMaritalStatusCode(String MaritalStatusCode) {
			this.MaritalStatusCode = MaritalStatusCode;
		}
		
		public String getHeight() {
			return Height;
		}
		@XmlElement(name="Height",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setHeight(String Height) {
			this.Height = Height;
		}
		
		

		public String getMiddleName() {
			return MiddleName;
		}
		@XmlElement(name="MiddleName",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setMiddleName(String MiddleName) {
			this.MiddleName = MiddleName;
		}
		
		

		public String getNationalityCode() {
			return NationalityCode;
		}
		@XmlElement(name="NationalityCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setNationalityCode(String NationalityCode) {
			this.NationalityCode = NationalityCode;
		}
		

		public String getRelationshipCode() {
			return RelationshipCode;
		}
		@XmlElement(name="RelationshipCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setRelationshipCode(String RelationshipCode) {
			this.RelationshipCode = RelationshipCode;
		}
		
		

		public String getTitleCode() {
			return TitleCode;
		}
		@XmlElement(name="TitleCode",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setTitleCode(String TitleCode) {
			this.TitleCode = TitleCode;
		}
		

		public String getWeight() {
			return Weight;
		}
		@XmlElement(name="Weight",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
		public void setWeight(String Weight) {
			this.Weight = Weight;
		}
		
		
		public Dependants getDependants() {
			return Dependants;
		}
		@XmlElement(name="Dependants",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
			public void setDependants(Dependants Dependants) {
				this.Dependants = Dependants;
			}
		@Override
		public String toString() {
			return "Client [Age=" + Age + ", ClientCode=" + ClientCode + ", OccuptionCode=" + OccuptionCode
					+ ", AnnualIncome=" + AnnualIncome + ", BirthDate=" + BirthDate + ", FamilySize=" + FamilySize
					+ ", FirstName=" + FirstName + ", GenderCode=" + GenderCode + ", GstinNumber=" + GstinNumber
					+ ", Height=" + Height + ", IDProofNumber=" + IDProofNumber + ", IDProofTypeCode=" + IDProofTypeCode
					+ ", LastName=" + LastName + ", MaritalStatusCode=" + MaritalStatusCode + ", MiddleName="
					+ MiddleName + ", NationalityCode=" + NationalityCode + ", RelationshipCode=" + RelationshipCode
					+ ", TitleCode=" + TitleCode + ", Weight=" + Weight + ", Address=" + Address + ", Product="
					+ Product + ", LifeStyleHabits=" + LifeStyleHabits + ", ContactInformation=" + ContactInformation
					+ ", Dependants=" + Dependants + ", ClientSubElement=" + ClientSubElement
					+ ", DependantsSubElement=" + DependantsSubElement + "]";
		}
		
		}
		
		
	
	
	
	
	
	 
	

	

