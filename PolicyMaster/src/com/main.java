package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Date;
import java.util.HashMap;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import study.db.Db;

public class main {
	private String strVehicleCode;
	
	public static void main(String[] args) throws IOException, ParseException {
		/*Integer age_self=Integer.parseInt(hm.get("age_self"));
		if(age_self>18 || age_self<35) {*/
			//productSubElem.setSumAssured("300000");
		//}
		/*String datestr="17-10-1994";
		 SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();  
		 Date utilDate1 = formatter.parse(datestr);
		 String PolicyFromDt=formatter.format(utilDate1);
		 Calendar c = Calendar.getInstance();
		
		    c.setTime(utilDate1);
		    c.add(Calendar.DAY_OF_MONTH, 1825);//1095 1825
		    Date end=c.getTime();
		    String PolicyToDt=formatter.format(end);
		    System.out.println(PolicyFromDt);
		    System.out.println(PolicyToDt);*/
		/*List<ProdMasters> pm=Poiji.fromExcel(new File("E://API//Shriram//MASTER KITS/Prod Masters.xls"), ProdMasters.class);
		Integer=pm.size();
		//System.out.println(a);
		ProdMasters pm1=pm.get(0);
		//System.out.println(pm1.getProdcode());
		//System.out.println(pm1.getProddesc());
		String[] s=pm1.toString().split(",");
		System.out.println(s[0]);
		System.out.println(s[1]);
		//System.out.println(s);
		//System.out.println(pm.get(1).toString());
		 * */	
		/*String fileName = "E://API//Shriram//MASTER KITS/TWO_WHEELER_TEST_MASTER_19_05_2018.xls";
        String cellContent = "DREAM YUGA ELECTRIC START ALLOY";
        
        InputStream input = new FileInputStream(fileName);
        
        HSSFWorkbook wb = new HSSFWorkbook(input);
        HSSFSheet sheet = wb.getSheetAt(0);
        String a=abc(sheet, cellContent);
        System.out.println(a);*/
	}
	public String BikeIDV(String Bike_RegNo,String Varient) {
		String idv=null;
		try {
			Connection con=Db.myGetConnection();
			if(Bike_RegNo.equals("2017")) {
				String query="select idv_1_yr from shriram_vehicle_master where model_desc=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_1_yr");
					System.out.println("bike_idv_1_yr: "+idv);
				}
				return idv;
			}
			else if(Bike_RegNo.equals("2016")) {
				String query="select idv_2_yr from shriram_vehicle_master where model_desc=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_2_yr");
					System.out.println("bike_idv_2_yr: "+idv);
				}
				return idv;
			}
			else if(Bike_RegNo.equals("2015")) {
				String query="select idv_3_yr from shriram_vehicle_master where model_desc=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_3_yr");
					System.out.println("bike_idv_3_yr: "+idv);
				}
				return idv;
			}
			else if(Bike_RegNo.equals("2014")) {
				String query="select idv_4_yr from shriram_vehicle_master where model_desc=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_4_yr");
					System.out.println("bike_idv_4_yr: "+idv);
				}
				return idv;
			}
			else if(Bike_RegNo.equals("2013")) {
				String query="select idv_5_yr from shriram_vehicle_master where model_desc=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_5_yr");
					System.out.println("bike_idv_5_yr: "+idv);
				}
				return idv;
			}
			else {
				idv="";
				return idv;
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return idv;
	}
	public String IDV(String RegYear,String Varient,String strInsuredState) {
		String idv=null;
		try {
			Connection con=Db.myGetConnection();
			if(RegYear.equals("2017")) {
				String query="select idv_1_yr from shriram_vehicle_master where model_desc=? && gic_state=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				stmt.setString(2, strInsuredState);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_1_yr");
					System.out.println("idv_1_yr: "+idv);
				}
				return idv;
			}
			else if(RegYear.equals("2016")) {
				String query="select idv_2_yr from shriram_vehicle_master where model_desc=? && gic_state=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				stmt.setString(2, strInsuredState);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_2_yr");
					System.out.println("idv_2_yr: "+idv);
				}
				return idv;
			}
			else if(RegYear.equals("2015")) {
				String query="select idv_3_yr from shriram_vehicle_master where model_desc=? && gic_state=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				stmt.setString(2, strInsuredState);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_3_yr");
					System.out.println("idv_3_yr: "+idv);
				}
				return idv;
			}
			else if(RegYear.equals("2014")) {
				String query="select idv_4_yr from shriram_vehicle_master where model_desc=? && gic_state=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				stmt.setString(2, strInsuredState);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_4_yr");
					System.out.println("idv_4_yr: "+idv);
				}
				return idv;
			}
			else if(RegYear.equals("2013")) {
				String query="select idv_5_yr from shriram_vehicle_master where model_desc=? && gic_state=?";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, Varient);
				stmt.setString(2, strInsuredState);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					idv= rs.getString("idv_5_yr");
					System.out.println("idv_5_yr: "+idv);
				}
				return idv;
			}
			else {
				idv="";
				return idv;
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return idv;
	}
	public String ifModel(String Varient,String FuelType,String strInsuredState) {
		String vehicle_code = null;
		try {
			Connection con=Db.myGetConnection();
			String query1 = "select vehicle_code from shriram_vehicle_master where model_desc=? && fuel_desc=? && gic_state=?";
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setString(1, Varient);
			stmt.setString(2, FuelType);
			stmt.setString(3, strInsuredState);
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				vehicle_code= rs.getString("vehicle_code");
				System.out.println("vehicle_code: "+vehicle_code);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return vehicle_code;
		
	}
	public String ifByke(String Variant) {
		String holdgetValue=null;
		try {
			Connection con=Db.myGetConnection();
			//String name="KINE";
			String query1 = "select vehicle_code from shriram_vehicle_master where model_desc=?";
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setString(1, Variant);
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				String vehicle_code = rs.getString("vehicle_code");
				holdgetValue=vehicle_code;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(holdgetValue.isEmpty())
		{
			return null;
		}
		else
		{
			return holdgetValue;	
		}
		
	}
	public String[] ifRegyr(String Regyr,String Claim) {
		String g[]=new String[7];
		if(Regyr.equals("Brandnew")) {
			
	    	    g[0]="MOT-PRD-001";
	    	    g[1]="FRESH";
	    	    g[2]="ADDON_01";
	    	    g[3]="Brandnew";
	    	    g[4]="0";
	    	    g[5]="0";
	    	    g[6]="W";
	    	return g;    
		}
		else {
    	    g[0]="MOT-PRD-001";
    	    g[1]="RENEWAL OF OTHERS";
    	    g[2]="ADDON_01";
    	    g[3]=Regyr;
    	    //should be changed
    	    if(Claim.equals("YES")) {
    	    	g[4]="1";
    	    	g[5]="0";
    	    }else {
    	    	g[4]="0";
    	    	g[5]=Claim;
    	    }
    	    g[6]="U";
    	   return g; 
		}
		
	}
	public String[] ifBykeRegyr(String Regyr,String Claim) {
		String g[]=new String[7];
		if(Regyr.equals("Brandnew")) {
	    	    g[0]="MOT-PRD-002";
	    	    g[1]="FRESH";
	    	    g[2]="ADDON_01";
	    	    g[3]="Brandnew";
	    	    g[4]="0";
	    	    g[5]="0";
	    	    g[6]="W";
	    	return g;    
		}
		else {
    	    g[0]="MOT-PRD-002";
    	    g[1]="RENEWAL OF OTHERS";
    	    g[2]="ADDON_01";
    	    g[3]=Regyr;
    	    g[4]="1";
    	    if(Claim.equals("YES")) {
    	    	g[4]="1";
    	    	g[5]="0";
    	    }else {
    	    	g[4]="1";
    	    	g[5]=Claim;
    	    }
    	    g[6]="U";
    	   return g; 
		}
		
	}

	public String[] Title(String prefix) {
		if(prefix.equals("Mr.")) {
			String g[]=new String[2];
			g[0]="1";
			g[1]="M";
			
			return g;
		}
		else if(prefix.equals("Mrs.")) {
			String g[]=new String[2];
			g[0]="2";
			g[1]="F";
			
			return g;
		}
		else if(prefix.equals("Miss.")) {
			String g[]=new String[2];
			g[0]="4";
			g[1]="F";
			
			return g;
		}
		return null;
		
	}
	public String city(String RTOCODE) {
		char ch=RTOCODE.charAt(4);
		if((ch >= 'A' && ch <= 'Z')){
			RTOCODE=RTOCODE.substring(0, 3)+"0"+RTOCODE.substring(3,4);
		}
		String holdgetValue=null;
		try {
			Connection con=Db.myGetConnection();
			//String name="KINE";
			String query1 = "select RTOCITY from shriram_rtomaster where RTOCODE= ?";
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setString(1, RTOCODE);
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				String RTOCITY = rs.getString("RTOCITY");
				holdgetValue=RTOCITY;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(holdgetValue.isEmpty())
		{
			holdgetValue="";
			return holdgetValue;
		}
		else
		{
			return holdgetValue;	
		}
		
		
	}
	public String state(String RTOCODE) {
		char ch=RTOCODE.charAt(4);
		if((ch >= 'A' && ch <= 'Z')){
			RTOCODE=RTOCODE.substring(0, 3)+"0"+RTOCODE.substring(3,4);
		}
		String holdgetValue=null;
		try {
			Connection con=Db.myGetConnection();
			//String name="KINE";
			String query1 = "select RTOSTATE from shriram_rtomaster where RTOCODE= ?";
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setString(1, RTOCODE);
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				String RTOSTATE = rs.getString("RTOSTATE");
				holdgetValue=RTOSTATE;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(holdgetValue.isEmpty())
		{
			holdgetValue="";
			return holdgetValue;
		}
		else
		{
			return holdgetValue;	
		}
		
		
	}
	public String insurer(String insurer) {
		String holdgetValue=null;
		try {
			Connection con=Db.myGetConnection();
			//String name="KINE";
			String query1 = "select CC_DESC from shriram_insurer where CC_DESC like ?";
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setString(1, insurer+"%");
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				String CC_DESC = rs.getString("CC_DESC");
				holdgetValue=CC_DESC;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(holdgetValue.isEmpty())
		{
			holdgetValue="";
			return holdgetValue;
		}
		else
		{
			return holdgetValue;	
		}
	}
	/*Liberty Start*/

	public String MakeModalLibCar(String VARIANT, String fuel_type, String VEHICLE_MODEL){
		System.out.println("VARIANT : "+VARIANT);
		System.out.println("fuel_type : "+fuel_type);
		System.out.println("VEHICLE_MODEL : "+VEHICLE_MODEL);
		String MANUFACTURER_CODE = null;
		String  VEHICLE_MODEL_CODE = null;
		try{
			System.out.println("Enter into db ");
			Connection con = Db.myGetConnection();
			String query1 = "Select MANUFACTURER_CODE, VEHICLE_MODEL_CODE from liberty_vehicle_master where VARIANT like ? && fuel_type = ? && VEHICLE_MODEL = ?";
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setString(1, "%"+VARIANT+"%");
			stmt.setString(2, fuel_type);
			stmt.setString(3, VEHICLE_MODEL);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("enter into to get code");
				MANUFACTURER_CODE = rs.getString("MANUFACTURER_CODE");
       			System.out.println("taken make code");
				VEHICLE_MODEL_CODE = rs.getString("VEHICLE_MODEL_CODE");
				 
				System.out.println("Make : "+MANUFACTURER_CODE);
				System.out.println("Model : "+VEHICLE_MODEL_CODE);
			}
			con.close();
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
           return MANUFACTURER_CODE+" "+VEHICLE_MODEL_CODE ;
		
	}
	
	public String MakeModelLibBike(String Variant){
		System.out.println("Bike Varient : "+Variant);
		String Make = null;
		String Model = null;
		
		try {
			Connection con = Db.myGetConnection();
			String query1 = "Select MANUFACTURER_CODE ,VEHICLE_MODEL_CODE from liberty_vehicle_master where VARIANT Like ? ";
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setString(1,"%"+ Variant);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()){
				String MANUFACTURER_CODE = rs.getString("MANUFACTURER_CODE");
				String  VEHICLE_MODEL_CODE = rs.getString("VEHICLE_MODEL_CODE");
				Make = MANUFACTURER_CODE ;
				Model = VEHICLE_MODEL_CODE;
			}
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(Make.isEmpty()){
			Make="";
			return Make;
		}
		else{
			return Make+" "+Model;
		
			
		}
	}
	
	
	public String libertyInsurer(String insurer){
		String holdgetValue = null;
		 
		try {
			Connection	con = Db.myGetConnection();
		    String query1 = "select LIBERTY_INSURER from shriram_insurer where CC_DESC like ?";
		    PreparedStatement stmt = con.prepareStatement(query1);
		    stmt.setString(1, insurer+"%");
		    ResultSet rs  = stmt.executeQuery();
		    while(rs.next()){
		    	String LIBERTY_INSURER = rs.getString("LIBERTY_INSURER");
		    	holdgetValue = LIBERTY_INSURER;
		    }
		    con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(holdgetValue.isEmpty())
		{
			holdgetValue="";
			return holdgetValue;
		}
		else
		{
			return holdgetValue;	
		}
		
	}


	public String[] Salutation(String prefix) {
		if(prefix.equals("Mr.")) {
			String g[]=new String[1];
			g[0]="MR";
			
			return g;
		}
		else if(prefix.equals("Mrs.")) {
			String g[]=new String[1];
			g[0]="MRS";
			
			return g;
		}
		else if(prefix.equals("Miss.")) {
			String g[]=new String[2];
			g[0]="MISS";
			
			return g;
		}
		return null;
		
	}
	/*Liberty End*/
	
	/*RoyalSundaram*/
	public String ifModel1(String Varient,String FuelType) {
		System.out.println("Varient ghghj"+Varient);
		System.out.println("FuelType is"+FuelType);
		String ModelCode = null;
		try {
			Connection con=Db.myGetConnection();
			String query1 = "select ModelCode from royalsundram where ModelName=? AND FuelType=?";
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setString(1, Varient);
			stmt.setString(2, FuelType);
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				ModelCode= rs.getString("ModelCode");
				System.out.println("hello ModelCode");
				System.out.println("ModelCode: "+ModelCode);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return ModelCode;
		
	}
	
	public  String ifModel2(String Bike_Model) {
		System.out.println("hello0000" +Bike_Model);
		
		String ModelCode = null;
		System.out.println("hello");
		try {
			Connection con=Db.myGetConnection();
			String query1 = "select ModelCode from bikeroyal where ModelName=? AND FuelType='petrol' ";
			PreparedStatement stmt1 = con.prepareStatement(query1);
			stmt1.setString(1, Bike_Model);
			
			ResultSet rs=stmt1.executeQuery();
			while (rs.next()) {
				ModelCode= rs.getString("ModelCode");
				System.out.println("hello ModelCode");
				System.out.println("ModelCode: "+ModelCode);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return ModelCode;
		
	}
	public String Royalcity(String royalRtoCode) {
		char ch=royalRtoCode.charAt(4);
		if((ch >= 'A' && ch <= 'Z')){
			royalRtoCode=royalRtoCode.substring(0, 3)+"0"+royalRtoCode.substring(3,4);
		}
		String holdgetValue=null;
		try {
			Connection con=Db.myGetConnection();
			//String name="KINE";
			String query1 = "select RTOCITY from shriram_rtomaster where RTOCODE= ?";
			PreparedStatement stmt = con.prepareStatement(query1);
			stmt.setString(1, royalRtoCode);
			ResultSet rs=stmt.executeQuery();
			while (rs.next()) {
				String RTOCITY = rs.getString("RTOCITY");
			
				holdgetValue=RTOCITY;
			
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(holdgetValue.isEmpty())
		{
			holdgetValue="";
			return holdgetValue;
		}
		else
		{
			return holdgetValue;	
		}
		
		
	}
	
	/*RoyalSundaram Code End*/
	
	//Religare
	
	public String[] TitleReligare(String title) {
		if(title.equals("Mr.")) {
			String g[]=new String[2];
			g[0]="MR";
			g[1]="MALE";
			
			return g;
		}
		else if(title.equals("Mrs.")) {
			String g[]=new String[2];
			g[0]="MS";
			g[1]="FEMALE";
			
			return g;
		}
		else if(title.equals("Miss.")) {
			String g[]=new String[2];
			g[0]="MS";
			g[1]="FEMALE";
			
			return g;
		}
		return null;
		
	}
	//---------------------apollo----------------------
	
		public static String[] Titleapollo(String salutation) {
			if (salutation.equals("Mr.")) {
				String g[] = new String[2];
				g[0] = "MR";
				g[1] = "1";

				return g;
			} else if (salutation.equals("Mrs.")) {
				String g[] = new String[2];
				g[0] = "MRS";
				g[1] = "2";

				return g;
			} else if (salutation.equals("Miss.")) {
				String g[] = new String[2];
				g[0] = "MISS";
				g[1] = "2";

				return g;
			} /*else if (salutation.equals("master.")) {
				String g[] = new String[2];
				g[0] = "MASTER";
				g[1] = "1";

				return g;
			}

			else if (salutation.equals("babygirl.")) {
				String g[] = new String[2];
				g[0] = "BABYGIRL";
				g[1] = "2";

				return g;
			} else if (salutation.equals("babyboy.")) {
				String g[] = new String[2];
				g[0] = "BABYBOY";
				g[1] = "1";

				return g;
			}
	*/
			return null;

		}
		public String State(String city) {
			String holdgetValue=null;
			try {
				Connection con=Db.myGetConnection();
				//String name="KINE";
				String query1 = "select state_one_code from apollo_master where city= ?";
				PreparedStatement stmt = con.prepareStatement(query1);
				stmt.setString(1, city);
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					String state_one_code = rs.getString("state_one_code");
					holdgetValue=state_one_code;
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			if(holdgetValue.isEmpty())
			{
				return null;
			}
			else
			{
				return holdgetValue;	
			}
			
			
		}
		
		public String town(String city) {
			String holdgetValue=null;
			try {
				Connection con=Db.myGetConnection();
				//String name="KINE";
				String query1 = "select city_code from apollo_master where city= ?";
				PreparedStatement stmt = con.prepareStatement(query1);
				stmt.setString(1, city );
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					String city_code = rs.getString("city_code");
					holdgetValue=city_code;
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			if(holdgetValue.isEmpty())
			{
				return null;
			}
			else
			{
				return holdgetValue;	
			}
			
			
		}
		public String nomineerelation(String nomrelation) {
			String holdgetValue=null;
			try {
				Connection con=Db.myGetConnection();
				//String name="KINE";
				String query1 = "select relationship_code from apollo_master where relationship= ?";
				PreparedStatement stmt = con.prepareStatement(query1);
				stmt.setString(1, nomrelation );
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					String relationship_code = rs.getString("relationship_code");
					holdgetValue=relationship_code;
					System.out.println(holdgetValue);
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			if(holdgetValue.isEmpty())
			{
				return null;
			}
			else
			{
				return holdgetValue;	
			}
			
			
		}
		public String occupation(String occupation) {
			String holdgetValue=null;
			try {
				Connection con=Db.myGetConnection();
				//String name="KINE";
				String query1 = "select occupation_code from apollo_master where occupation= ?";
				PreparedStatement stmt = con.prepareStatement(query1);
				stmt.setString(1, occupation );
				ResultSet rs=stmt.executeQuery();
				while (rs.next()) {
					String occupation_code = rs.getString("occupation_code");
					holdgetValue=occupation_code;
					System.out.println(holdgetValue);
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			if(holdgetValue.isEmpty())
			{
				return null;
			}
			else
			{
				return holdgetValue;	
			}
			
			
		}
		
		public String[] religare_disease(String disease) {
			String [] diseases=new String[3];
			if(disease.equals("asthma,")) {
				diseases[0]="H105";
				diseases[1]="HEDCFLEAFFOUR";
				diseases[2]="YES";
				return diseases;
			}
			else if(disease.equals("diabetes,")) {
				diseases[0]="H107";
				diseases[1]="HEDCFLEAFSIX";
				diseases[2]="YES";
				return diseases;
			}
			else if(disease.equals("heartailments,")) {
				diseases[0]="H103";
				diseases[1]="HEDCFLEAFTWO";
				diseases[2]="YES";
				return diseases;
			}
			else if(disease.equals("hypertension,")) {
				diseases[0]="H104";
				diseases[1]="HEDCFLEAFTHREE";
				diseases[2]="YES";
				return diseases;
			}
			else if(disease.equals("thyroid,")) {
				diseases[0]="H106";
				diseases[1]="HEDCFLEAFFIVE";
				diseases[2]="YES";
				return diseases;
			} else {
				diseases[0]="";
				diseases[1]="";
				diseases[2]="";
				return diseases;
			}
			
		}
		public Map<String,String>religareMembers(String member){
			Map< String,String> hm = new HashMap<>();
			try {
			String z=member.concat(",");
			String b[]=z.split("\\(");
			String c[]=b[1].split("\\)");
			String cover_type=null;
			
			hm.put("member_self", b[0]);
			hm.put("age_self", c[0]);
			
				if(c[1].equals(", spouse")) {
					String d[]=b[2].split("\\)");
					String e[]=c[1].split(",");
					
					cover_type="FAMILYFLOATER";
					
					hm.put("member_spouse", e[1]);
					hm.put("age_spouse", d[0]);
					
					 if(d[1].equals(", son")) {
                         String f[]=d[1].split(",");
                         String g[]=b[3].split("\\)");
                         
                         hm.put("member_son", f[1]);
                         hm.put("age_son", g[0]);
                         
                         if(g[1].equals(", daughter")) {
                                 String h[]=g[1].split(",");
                                 String i[]=b[4].split("\\)");
                                 
                                 hm.put("member_daughter", h[1]);
                                 hm.put("age_daughter", i[0]);
                         }
                 }
				}
				else {
					cover_type="INDIVIDUAL";
				}
				hm.put("cover_type", cover_type);
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			return hm;
		}
	
		
		
		
		

	//----------------------------------------------
	}

	
	
	
	