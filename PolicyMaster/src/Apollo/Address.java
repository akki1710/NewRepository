package Apollo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Address")
public class Address {

	 AddressSubElement Address;

     public AddressSubElement getAddress() {
             return Address;
     }
     
     @XmlElement(name="Address",namespace="http://schemas.datacontract.org/2004/07/ServiceObjects")
	public void setAddress(AddressSubElement address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Address [Address=" + Address + "]";
	}
	
	
	public static void main(String arg[]) throws ParseException {
		/*String son1dob1 = "2015/04/04";
		
		
		

		 SimpleDateFormat format = new SimpleDateFormat("dd/yy/yyyy");
		  java.util.Date utilDate; 
		  Calendar dob = Calendar.getInstance(); 
		  Calendar sonage = null;
		  System.out.println(dob);
		  Calendar today = Calendar.getInstance();
		
		  try { utilDate = format.parse(son1dob1);
		  dob.setTime(utilDate); } catch
			  (ParseException e1) { // TODO Auto-generated catch block
			  e1.printStackTrace(); } 
		  
		  //calculating age from dob
		 
		  
		  int age = today.get(Calendar.YEAR) - sonage.get(Calendar.YEAR); if
		  (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) { age--;
		  System.out.println(age); } 
		  String custage = Integer.toString(age);
		  System.out.println(custage);*/
		
/*		String son1dob="12/06/1994";
		SimpleDateFormat format = new SimpleDateFormat("dd/yy/yyyy");
		java.util.Date utilDate;
		Calendar son1age = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		try {
			utilDate = format.parse(son1dob);
			son1age.setTime(utilDate);
			System.out.println("son1age : "+son1age);
			System.out.println("utilDate : "+utilDate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int age = today.get(Calendar.YEAR) - son1age.get(Calendar.YEAR); if
		  (today.get(Calendar.DAY_OF_YEAR) < son1age.get(Calendar.DAY_OF_YEAR)) { age--;
		  System.out.println(age); } 
		  String custage = Integer.toString(age);
		  System.out.println(custage);*/
		
		  DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	         
	        String dateString = "1996-11-25";
	        LocalDate today = LocalDate.now(); //Today's date
	         
	        //string to date
	        LocalDate localDate = LocalDate.parse(dateString, dateTimeFormatter);
		  
		  Period p = Period.between(localDate, today);
		   
		  //Now access the values as below
		  System.out.println(p.getYears());
		  System.out.println(String.format("%d", p.getYears()));

			
	  }
	
	

}


  