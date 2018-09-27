package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Royal.Serv2ToRolSunDTO;
import study.db.Db;

/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String Prefix=request.getParameter("title");
		String Car_RegNo= request.getParameter("Car_RegNo");
		String appointee_name= request.getParameter("appointee_name");
		String appointee_relation= request.getParameter("appointee_relation");
		String PanNo=request.getParameter("pan");
		/*if(appointee_name==null && appointee_relation==null) {
			appointee_name="";
			appointee_relation="";
		}*/
		Proposal1 proppojo=new Proposal1();
		
		String Owner_Name = request.getParameter("Owner_Name");
		String Car_Registration_Address=request.getParameter("Registration_Address");
		String day=request.getParameter("day");
        String month=request.getParameter("month");
        String year=request.getParameter("year");
        String dateStr = year + "-" + month + "-" + day;
        String dateStr1= day + "-" + month + "-" + year; 
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = null;
		try {
			utilDate = format.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

	        String nomines_name = request.getParameter("nomines_name");
	        String nomines_relation =  request.getParameter("nomines_relation");
	        String selectage = request.getParameter("selectage");
	       
	        String engine_number = request.getParameter("engine_number");
	        String chassis_number = request.getParameter("chassis_number");
	       
	        String selectime = request.getParameter("selectime");
	        String driving = request.getParameter("driving");
	        String evening = request.getParameter("evening");
	        String financed="";
	        String a[]=request.getParameterValues("financed");
	        for(int i=0;i<a.length;i++){
	            financed+=a[i]+"";}
	     
	        
	        String title = request.getParameter("title");
	        String email = request.getParameter("email");
	        String pno = request.getParameter("pno");
	        String month1= request.getParameter("month"); //edit
	        
	        String year1= request.getParameter("year"); //edit
	        
	        main m=new main();
	        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	        String DateOfBirth=dateStr1;
			 Date date = new Date();  
			 String PolicyFromDt=formatter.format(date);
			 Calendar c = Calendar.getInstance();
			    c.setTime(date);
			    c.add(Calendar.DAY_OF_MONTH, 364);
			    Date end=c.getTime();
			    String PolicyToDt=formatter.format(end); 
			    String PolicyIssueDt=PolicyFromDt;
			    String[] g=m.Title(Prefix);
			    String InsuredPrefix=g[0];
			    String Gender=g[1];
			    String Address1=Car_Registration_Address;
			    String State=Car_RegNo.substring(0,2);
			    String rto=Car_RegNo.substring(0,4);
				String RTOCODE=rto.substring(0,2)+"-"+rto.substring(2, rto.length());
			    
			    String City=m.city(RTOCODE);
			    String PinCode="110056";
			    String PolicyType="MOT-PLT-001";
			    String EngineNo=engine_number;
			    String FirstRegDt=PolicyIssueDt;
			    String ChassisNo=chassis_number;
			    String RegNo1=State;
			    String RegNo2=Car_RegNo.substring(2,4);
			    String RegNo3=Car_RegNo.substring(4,6);
			    String RegNo4=Car_RegNo.substring(6,10);
			    String NomineeNameforPAOwnerDriver=nomines_name;
			    String NomineeAgeforPAOwnerDriver=selectage;
			    String NomineeRelationforPAOwnerDriver=nomines_relation;
			    String VehicleManufactureYear1="2018";
			    
			    proppojo.setPolicyFromDt(PolicyFromDt);
			    proppojo.setPolicyToDt(PolicyToDt);
			    proppojo.setPolicyIssueDt(PolicyIssueDt);
			    proppojo.setInsuredPrefix(InsuredPrefix);
			    proppojo.setGender(Gender);
			    proppojo.setAddress1(Address1);
			    proppojo.setState(State);
			    proppojo.setCity(City);
			    proppojo.setPanNo(PanNo);
			    proppojo.setDateOfBirth(DateOfBirth);
			    proppojo.setEngineNo(EngineNo);
			    proppojo.setFirstRegDt(FirstRegDt);
			    proppojo.setChassisNo(ChassisNo);
			    proppojo.setRegNo1(RegNo1);
			    proppojo.setRegNo2(RegNo2);
			    proppojo.setRegNo3(RegNo3);
			    proppojo.setRegNo4(RegNo4);
			    proppojo.setNomineeNameforPAOwnerDriver(NomineeNameforPAOwnerDriver);
			    proppojo.setNomineeRelationforPAOwnerDriver(NomineeRelationforPAOwnerDriver);
			    proppojo.setNomineeAgeforPAOwnerDriver(NomineeAgeforPAOwnerDriver);
			    if(appointee_name==null) {
			    	appointee_name="";
			    	appointee_relation="";
			    }
			    proppojo.setAppointeeNameforPAOwnerDriver(appointee_name);
			    proppojo.setAppointeeRelationforPAOwnerDriver(appointee_relation);
			    session.setAttribute("proppojo", proppojo);
			    
			 //Lib added
			 String[] g1=m.Salutation(Prefix);
			 String Salutation=g1[0];
			 session.setAttribute("month1", month1);
			 session.setAttribute("year1", year1);
			 session.setAttribute("Car_Registration_Address", Car_Registration_Address);
			 session.setAttribute("Salutation", Salutation); //Lib added
			 
			//RoyalSundaram//
			/* try {
				 Serv2ToRolSunDTO serv2ToRolSunDTOComman = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunDTOComman");
					String yearOfManufacture = serv2ToRolSunDTOComman.getYearOfManufacture();
					String vehicleManufacturerName = serv2ToRolSunDTOComman.getVehicleManufacturerName();
					String fuelType1 = serv2ToRolSunDTOComman.getFuelType1();
					String vehicleModelCode = serv2ToRolSunDTOComman.getVehicleModelCode();
					
			 }
			 catch (NullPointerException e) {
				// TODO: handle exception
			}
			  */
				
				/*Serv2ToRolSunDTO serv2ToRolSunDTOCommanUpdate = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunDTOComman");
				String rtitle = serv2ToRolSunDTOCommanUpdate.getRtitle();
				String rname = serv2ToRolSunDTOCommanUpdate.getRname();
				String rmobile = serv2ToRolSunDTOCommanUpdate.getRmobile();
				String remail = serv2ToRolSunDTOCommanUpdate.getRemail();
				*/
				/*Serv2ToRolSunDTO serv2ToRolSunDTOReg = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunbike");
				String registrationNumber = serv2ToRolSunDTOReg.getRegistrationNumber();
				String bikeregistrationNumber =	serv2ToRolSunDTOReg.getBikeregistrationNumber();
				
				Serv2ToRolSunDTO Serv2ToRolSunDTObike5 = (Serv2ToRolSunDTO) session.getAttribute("Serv2ToRolSunDTOBikecalu");
				try
				{
					String YearOfManufacturebike = Serv2ToRolSunDTObike5.getYearOfManufacturebike();
					System.out.println("year" +YearOfManufacturebike);
					
				}catch (NullPointerException e) {
					// TODO: handle exception
				}
				
				
				
				System.out.println("rg"+registrationNumber);
				System.out.println("breg"+bikeregistrationNumber);*/
		
			  String rnomines_name = nomines_name;
			  String rnomines_relation = nomines_relation;
			  String rselectage=selectage;
			  String rengine_number=engine_number;
			  String rchassis_number=chassis_number;
			  String rtitle=title;
			  String rfinanced=financed;
			  String raddress =Car_Registration_Address;
			//Roal DOB
		        
		        DateFormat originalFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
				DateFormat targetFormat = new SimpleDateFormat("dd/MM/yyyy");
				java.util.Date date2 = null;
				try {
					date2 = originalFormat.parse(dateStr1);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String royalBirthdate = targetFormat.format(date2);
				
				if(rtitle.equals("Mr."))
				{
					rtitle="Mr";
				}else if(rtitle.equals("Mrs."))
				{
					rtitle="Ms";
				}else if(rtitle.equals("Miss."))
				{
					rtitle="Ms";
				}
			
			
			Royal.DATA data1 =(Royal.DATA) session.getAttribute("data");
			 //Serv2ToRolSunDTO serv2ToRolSunDTO4 = (Serv2ToRolSunDTO) session.getAttribute("serv2ToRolSunDTO");
			 Serv2ToRolSunDTO serv2ToRolSunDTOComman1 = new Serv2ToRolSunDTO();
			 serv2ToRolSunDTOComman1.setRnomines_name(rnomines_name);
			 serv2ToRolSunDTOComman1.setRnomines_relation(rnomines_relation);
			 serv2ToRolSunDTOComman1.setRselectage(rselectage);
			 serv2ToRolSunDTOComman1.setRengine_number(rengine_number);
			 serv2ToRolSunDTOComman1.setRchassis_number(rchassis_number);
			 serv2ToRolSunDTOComman1.setRtitle(rtitle);
			 serv2ToRolSunDTOComman1.setRfinanced(rfinanced);
			 serv2ToRolSunDTOComman1.setRaddress(raddress);
			 serv2ToRolSunDTOComman1.setRoyalBirthdate(royalBirthdate);
			  session.setAttribute("serv2ToRolSunDTOComman1", serv2ToRolSunDTOComman1);
			  
			
			 
			 
			 
			 
			 
	        try {
				Connection con = Db.myGetConnection();
				String s="insert into details(title, Owner_Name, pno, email, Car_Registration_Address, BirthDate, nomines_name, nomines_relation, selectage, Car_RegNo, engine_number, chassis_number, month1, year1, selectime, driving, evening, financed) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement stmt = con.prepareStatement(s);
			
				stmt.setString(1, title);
				stmt.setString(2, Owner_Name);
				stmt.setString(3, pno);
				stmt.setString(4, email);
				stmt.setString(5, Car_Registration_Address);
				stmt.setDate(6, sqlDate);
				stmt.setString(7, nomines_name);
				stmt.setString(8, nomines_relation);
				stmt.setString(9, selectage);
				stmt.setString(10,Car_RegNo);
				stmt.setString(11,engine_number);
				stmt.setString(12,chassis_number );
				stmt.setString(13,month1);
				stmt.setString(14,year1 );
				stmt.setString(15,selectime );
				stmt.setString(16,driving );
				stmt.setString(17,evening );
				 
				stmt.setString(18,financed );
				
				response.sendRedirect("shri1"); 
				stmt.executeUpdate();
				  
				stmt.close();
				
				
				 
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        catch(NullPointerException e1) {
	        	e1.printStackTrace();
	        }
	        catch (Exception s) {
	        	s.printStackTrace();
	        }
			
	}


}
