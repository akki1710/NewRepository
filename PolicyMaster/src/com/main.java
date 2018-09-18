package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import com.poiji.bind.Poiji;

import study.db.Db;

public class main {
	private String strVehicleCode;
	
	public static void main(String[] args) throws IOException {
		/*List<ProdMasters> pm=Poiji.fromExcel(new File("E://API//Shriram//MASTER KITS/Prod Masters.xls"), ProdMasters.class);
		Integer a=pm.size();
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

	
	public static String byke(String Model) throws IOException {
		String fileName = "E://API//Shriram//MASTER KITS/TWO_WHEELER_TEST_MASTER_19_05_2018.xls";
        //String cellContent = "DREAM YUGA ELECTRIC START ALLOY";
        
        InputStream input = new FileInputStream(fileName);
        
        HSSFWorkbook wb = new HSSFWorkbook(input);
        HSSFSheet sheet = wb.getSheetAt(0); 	
		
	        for(Row row : sheet) {
	        	for (Cell cell : row) {
	        		if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
	        			if (cell.getRichStringCellValue().getString().trim().equals(Model)) {
	                        String strVehicleCode=row.getCell(0).getStringCellValue();
	                        return strVehicleCode;
	                    }
	        		}
	        	}
	        	
	        }
			return null;
			

	}
	public static String car(String Model,String FuelType) throws IOException {
		String fileName = "E://API//Shriram//MASTER KITS/test_private_car_vehicle1 (1) (1).xls";
        //String cellContent = "DREAM YUGA ELECTRIC START ALLOY";
        
        InputStream input = new FileInputStream(fileName);
        
        HSSFWorkbook wb = new HSSFWorkbook(input);
        HSSFSheet sheet = wb.getSheetAt(0); 	
		
	        for(Row row : sheet) {
	        	for (Cell cell : row) {
	        		if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
	        			if (cell.getRichStringCellValue().getString().trim().equals(Model) || cell.getRichStringCellValue().getString().trim().equals(FuelType)) {
	                        String strVehicleCode=row.getCell(0).getStringCellValue();
	                        return strVehicleCode;
	                    }
	        		}
	        	}
	        	
	        }
			return null;
			

	}
	public String ifCreta(String Model,String FuelType) {
		if(Model.equals("CRETA")) {
			strVehicleCode="UL7951";
		return strVehicleCode;
		}
		 else if(Model.equals("ACCENT") && FuelType.equals("Petrol")) {
			 strVehicleCode="UL11281";
	        	return strVehicleCode;
	        }
		 else if(Model.equals("ACCENT") && FuelType.equals("CNG")) {
				strVehicleCode="UL11352";
        	return strVehicleCode;
        }
		 else if(Model.equals("7 SERIES 730 LD SIGNATURE") && FuelType.equals("DIESEL")) {
			 strVehicleCode="UL9432";
			 return strVehicleCode;
		 }
		return null;
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
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
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
		if(Regyr.equals("Brandnew")) {
			String g[]=new String[6];
	    	    g[0]="MOT-PRD-001";
	    	    g[1]="FRESH";
	    	    g[2]="ADDON_01";
	    	    g[3]="Brandnew";
	    	    g[4]="0";
	    	    g[5]="0";
	    	    
	    	return g;    
		}
		else {
			String g[]=new String[6];
    	    g[0]="MOT-PRD-001";
    	    g[1]="RENEWAL OF OTHERS";
    	    g[2]="ADDON_01";
    	    g[3]=Regyr;
    	    g[4]="1";
    	    if(Claim.equals("YES")) {
    	    	g[5]="0";
    	    }else {
    	    	g[5]=Claim;
    	    }
    	    
    	   return g; 
		}
		
	}
	public String[] ifBykeRegyr(String Regyr,String Claim) {
		if(Regyr.equals("Brandnew")) {
			String g[]=new String[6];
	    	    g[0]="MOT-PRD-002";
	    	    g[1]="FRESH";
	    	    g[2]="ADDON_01";
	    	    g[3]="Brandnew";
	    	    g[4]="0";
	    	    g[5]="0";
	    	    
	    	return g;    
		}
		else {
			String g[]=new String[6];
    	    g[0]="MOT-PRD-002";
    	    g[1]="RENEWAL OF OTHERS";
    	    g[2]="ADDON_01";
    	    g[3]=Regyr;
    	    g[4]="1";
    	    if(Claim.equals("YES")) {
    	    	g[5]="0";
    	    }else {
    	    	g[5]=Claim;
    	    }
    	    
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
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
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
	public String[] libModel(String Bike_Model) {
			if(Bike_Model.equals("DISCOVER")) {
				String lib[]=new String[2];
	    	    lib[0]="1061";
	    	    lib[1]="31000095";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("PASSION XPRO")) {
				String lib[]=new String[2];
	    	    lib[0]="2509";
	    	    lib[1]="25172";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("SPLENDOR")) {
				String lib[]=new String[2];
	    	    lib[0]="2509";
	    	    lib[1]="25113";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("ACTIVA")) {
				String lib[]=new String[2];
	    	    lib[0]="1056";
	    	    lib[1]="31000066";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("CB UNICORN")) {
				String lib[]=new String[2];
	    	    lib[0]="1056";
	    	    lib[1]="31000103";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("SHINE")) {
				String lib[]=new String[2];
	    	    lib[0]="1056";
	    	    lib[1]="31000050";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("BULLET")) {
				String lib[]=new String[2];
	    	    lib[0]="1062";
	    	    lib[1]="31000085";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("CLASSIC")) {
				String lib[]=new String[2];
	    	    lib[0]="1062";
	    	    lib[1]="31000073";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("APACHE")) {
				String lib[]=new String[2];
	    	    lib[0]="1069";
	    	    lib[1]="31000129";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("FAZER")) {
				String lib[]=new String[2];
	    	    lib[0]="1072";
	    	    lib[1]="31000145";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("FZS")) {
				String lib[]=new String[2];
	    	    lib[0]="1072";
	    	    lib[1]="31000188";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("GLADIATOR")) {
				String lib[]=new String[2];
	    	    lib[0]="1072";
	    	    lib[1]="31000179";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("LIBERO")) {
				String lib[]=new String[2];
	    	    lib[0]="1072";
	    	    lib[1]="31000178";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("CD DELUXE")) {
				String lib[]=new String[2];
	    	    lib[0]="1068";
	    	    lib[1]="31000146";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("RODEO")) {
				String lib[]=new String[2];
	    	    lib[0]="2502";
	    	    lib[1]="31000142";
	    	    
			return lib;
			}
			else if(Bike_Model.equals("CENTURO")) {
				String lib[]=new String[2];
	    	    lib[0]="2502";
	    	    lib[1]="31000149";
	    	    
			return lib;
			}
			else {
				String lib[]=new String[2];
				 	lib[0]="";
		    	    lib[1]="";
				return lib;
			}
		}


	public String[] libCarModel(String Model) {
		String libcar[]=new String[2];
		if(Model.equals("SWIFT")) {
			
			libcar[0]="2405";
			libcar[1]="32001272";
			
		return libcar;
		}
		else if(Model.equals("CROSS POLO")) {
			
			libcar[0]="1011";
			libcar[1]="32001297";
			
		return libcar;
		}
		else if(Model.equals("PUNTO")) {
			
			libcar[0]="1021";
			libcar[1]="32000881";
			
		return libcar;
		}
		else if(Model.equals("WAGON R")) {
			
			libcar[0]="2405";
			libcar[1]="32001089";
			
		return libcar;
		}

		else {
			libcar[0]="";
			libcar[1]="";
			return libcar;
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
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ModelCode;
		
	}
	public String Royalcity(String royalRtoCode) {
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
			// TODO Auto-generated catch block
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
	
	
	
	
	
	}