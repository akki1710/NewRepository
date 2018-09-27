package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
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
 * Servlet implementation class Servlet2
 */
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				PrintWriter pw = response.getWriter();
				HttpSession session=request.getSession();
				String Car_RegNo=(String)session.getAttribute("RegNo");
		        String Manufacturer=(String) session.getAttribute("Manufacturer");
		        String Model=(String)session.getAttribute("Model");
		        String FuelType=(String)session.getAttribute("FuelType");
		        String Varient=(String)session.getAttribute("Variant");
		        String RegYear=(String)session.getAttribute("Regyr");
		        String Insurer=(String)session.getAttribute("PreIns");
		        String AnyClaim=(String)session.getAttribute("Claim");
		        String date=(String)session.getAttribute("ExpiryDate");
				
		        
		        String Bike_RegNo=(String)session.getAttribute("bike_reg");
		        String Bike_Manufacturer=(String) session.getAttribute("manufacturer2");
		        String Bike_Model=(String)session.getAttribute("bk1");
		        String Variant=(String)session.getAttribute("bk2");
		        String Bike_RegYear=(String)session.getAttribute("bk3");
		        String Bike_Insurer=(String)session.getAttribute("bk4");
		        String Bike_Claim=(String)session.getAttribute("Bike_Claim");
		        String BikeExpiryDate=(String)session.getAttribute("BikeExpiryDate");
		        java.sql.Date ExpiryDate = null;
		        
				String Fullname=request.getParameter("Name");
				session.setAttribute("Fullname", Fullname);
				String Email=request.getParameter("Email");
				session.setAttribute("Email", Email);
				String Mobile=request.getParameter("Mobile");
				session.setAttribute("Mobile", Mobile);
				String FullAddress=request.getParameter("fulladdress"); // added
				String PinCode=request.getParameter("pincode"); // added
				session.setAttribute("FullAddress", FullAddress); // added
				session.setAttribute("PinCode1", PinCode); // added
		        
				System.out.println(Car_RegNo);
				System.out.println(Bike_RegNo);
				
				
				String yearOfManufacture = "";
				String registrationNumber = Car_RegNo;
				
				String rname = Fullname;
				String remail = Email;
				String rmobile = Mobile;
				String rpinCode = PinCode;
				
				
				//session.setAttribute("serv2ToRolSunDTOComman", serv2ToRolSunDTOComman);

				/*if (registrationNumber == null) {
					registrationNumber = "";
					System.out.println("registrationNumber: " + registrationNumber);
				}*/
				
				
				
				
				
				if(Car_RegNo!=null)
				{
					User userpoj=new User();
					userpoj.setVehicleType("Car");
					userpoj.setRegNo(Car_RegNo);
					Proposal1 propprevpojo=new Proposal1();
					propprevpojo.setPinCode(PinCode);
					Serv2ToRolSunDTO serv2ToRolSunDTOComman = new Serv2ToRolSunDTO();

					serv2ToRolSunDTOComman.setRname(rname);
					serv2ToRolSunDTOComman.setRmobile(rmobile);
					serv2ToRolSunDTOComman.setRemail(remail);
					serv2ToRolSunDTOComman.setRpinCode(rpinCode);
					try {
					session.removeAttribute("bike_reg");
					System.out.println("Entered into car page");
					
					String a=Car_RegNo.substring(0,4);
					String strRTOCode=a.substring(0,2)+"-"+a.substring(2, a.length());
					userpoj.setStrRTOCode(strRTOCode);
					userpoj.setRegyr(RegYear);
					
					String strInsuredState=Car_RegNo.substring(0,2);
					userpoj.setStrInsuredState(strInsuredState);
					 main m=new main();
					 
					 String strVehicleCode=m.ifModel(Varient, FuelType,strInsuredState);
					 userpoj.setStrVehicleCode(strVehicleCode);
					 String IDV_of_Vehicle=m.IDV(RegYear, Varient, strInsuredState);
					 
					 String g[]=m.ifRegyr(RegYear,AnyClaim);
					 	String strProductCode=g[0];
				 	   	String ProposalType=g[1];
				 	   	String strADDONCover=g[2];
				 	   	String strFirstRegDt=g[3];
				 	   	String strPrevPolClaimYN=g[4];
				 	   	String strPrevPolNCB=g[5];
				 	   	String VehicleType=g[6];
				 	   	
				 	
				 	  userpoj.setStrProductCode(strProductCode);
				 	  userpoj.setStrADDONCover(strADDONCover);
				 	  userpoj.setStrPrevPolClaimYN(strPrevPolClaimYN);
				 	  userpoj.setStrPrevPolNCB(strPrevPolNCB);
				 	  propprevpojo.setProposalType(ProposalType);
				 	  propprevpojo.setVehicleType(VehicleType);
						

						//Royal code
						String previousPolicyno = "";
						String rproductName = "";
						String regDate = "";
						//royal city code
						String royalRegNum = registrationNumber.substring(0, 4);
						String royalRtoCode =royalRegNum.substring(0, 2)+"-"+royalRegNum.substring(2, 4);
						System.out.println(royalRtoCode);
						String rcity= m.Royalcity(royalRtoCode);
						serv2ToRolSunDTOComman.setRcity(rcity);
						//session.setAttribute("serv2ToRolSunDTOCommanSetCity", serv2ToRolSunDTOCommanSetCity);

						
						
						if(RegYear.equals("Brandnew")) {
							 
							Insurer=null;
							date=null;
				        	ExpiryDate=null;
				        	AnyClaim=null;
							String strPrevPolExpDt="";
							strFirstRegDt="";
							String PreviousPolicyToDt="";
							String PreviousPolicyFromDt="";
							String PreviousPolicyUWYear="";
							String VehicleManufactureYear=RegYear;
							String PreviousInsurer="";
							propprevpojo.setPreviousInsurer(PreviousInsurer);
							propprevpojo.setPreviousPolicyFromDt(PreviousPolicyFromDt);
							propprevpojo.setPreviousPolicyToDt(PreviousPolicyToDt);
							propprevpojo.setPreviousPolicyUWYear(PreviousPolicyUWYear);
							propprevpojo.setVehicleManufactureYear(VehicleManufactureYear);
							userpoj.setStrPrevPolExpDt(strPrevPolExpDt);
							userpoj.setStrFirstRegDt(strFirstRegDt);
						
							/* Royal code Start */
							/* Current Date Code */
							DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
							LocalDateTime currentdate = LocalDateTime.now();
							LocalDateTime nextYear = currentdate.plusYears(1).minusDays(1);
							// RoyalSundaram
							yearOfManufacture = "2018";
							
							String rstrPrevPolExpDt = "";
							String rPreviousPolicyToDt = "";
							String rPreviousPolicyFromDt = "";
							String claimsReported = "";
							String claimsMadeInPreviousPolicy = "";
							String claimAmountReceived = "";
							String isCarOwnershipChanged = "";
							rproductName = "BrandNewCar";
							/*if (rproductName == null) {
								rproductName = "";
								System.out.println("rproductName176: " + rproductName);
							}*/
							
							previousPolicyno = "";
							regDate = dtf.format(currentdate);
							serv2ToRolSunDTOComman.setrPreviousPolicyToDt(rPreviousPolicyToDt);
							serv2ToRolSunDTOComman.setrPreviousPolicyFromDt(rPreviousPolicyFromDt);

							serv2ToRolSunDTOComman.setRstrPrevPolExpDt(rstrPrevPolExpDt);
							serv2ToRolSunDTOComman.setClaimsReported(claimsReported);
							serv2ToRolSunDTOComman.setClaimsMadeInPreviousPolicy(claimsMadeInPreviousPolicy);
							serv2ToRolSunDTOComman.setClaimAmountReceived(claimAmountReceived);
							serv2ToRolSunDTOComman.setIsCarOwnershipChanged(isCarOwnershipChanged);
							serv2ToRolSunDTOComman.setYearOfManufacture(yearOfManufacture);
							serv2ToRolSunDTOComman.setRproductName(rproductName);
							serv2ToRolSunDTOComman.setPreviousPolicyno(previousPolicyno);
							serv2ToRolSunDTOComman.setRegDate(regDate);
							
							//session.setAttribute("serv2ToRolSunRolloverCarSet", serv2ToRolSunRolloverCarSet);

							/* Royal code End */


						
						}
						else {
							String PreviousInsurer=m.insurer(Insurer);
							/*String PreviousInsurer="";*/
							
							session.setAttribute("PreviousInsurer", PreviousInsurer);
							
						 SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");	
						 SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
						 String OrDate=null;
						 try {
							java.util.Date date1= format.parse(date);
							OrDate=format1.format(date1);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						 
							java.util.Date utilDate1 = null;
							try {
								utilDate1 = format1.parse(OrDate);
							} catch (ParseException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
							String PreviousPolicyToDt=format1.format(utilDate1);
							 Calendar c = Calendar.getInstance();
							    c.setTime(utilDate1);
							    c.add(Calendar.DAY_OF_MONTH, -364);
							    java.util.Date end=c.getTime();
							    String PreviousPolicyFromDt=format1.format(end);
							    
							    String strPrevPolExpDt=PreviousPolicyToDt;
								 strFirstRegDt=PreviousPolicyFromDt;
								 String PreviousPolicyUWYear=RegYear;
								 String VehicleManufactureYear=RegYear;
								 
								 	propprevpojo.setPreviousInsurer(PreviousInsurer);
									propprevpojo.setPreviousPolicyFromDt(PreviousPolicyFromDt);
									propprevpojo.setPreviousPolicyToDt(PreviousPolicyToDt);
									propprevpojo.setPreviousPolicyUWYear(PreviousPolicyUWYear);
									propprevpojo.setVehicleManufactureYear(VehicleManufactureYear);
									userpoj.setStrPrevPolExpDt(strPrevPolExpDt);
									userpoj.setStrFirstRegDt(strFirstRegDt);
					
									/* Current Date Code */
									DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
									LocalDateTime currentdate = LocalDateTime.now();
									LocalDateTime nextYear = currentdate.plusYears(1).minusDays(1);

									// RoyalSundaram
									yearOfManufacture = RegYear;
									rproductName = "RolloverCar";
									/*if (rproductName == null) {
										rproductName = "";
										System.out.println("rproductName1: " + rproductName);
									}*/
									previousPolicyno = "12344";
									regDate = "01/01/" + RegYear;
									DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
									
									
									DateFormat originalFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
									DateFormat targetFormat = new SimpleDateFormat("dd/MM/yyyy");
									java.util.Date date1 = null;
									try {
										date1 = originalFormat.parse(strPrevPolExpDt);
									} catch (ParseException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									String formattedDate = targetFormat.format(date1);
									
									
									
									
									String rstrPrevPolExpDt = formattedDate;
									String rPreviousPolicyToDt = dtf.format(nextYear);
									String rPreviousPolicyFromDt = dtf.format(currentdate);
									String rstrFirstRegDt = strFirstRegDt;
									String rPreviousInsurer = PreviousInsurer;
									String carclaim= AnyClaim;
									String noClaimBonusPercent="";
									String claimsReported ="";
									String claimAmountReceived ="";
									String claimsMadeInPreviousPolicy="";
									if (carclaim.equals("YES")) {
										 claimsReported = "1";
										 claimAmountReceived = "18618";
										 noClaimBonusPercent="";
										 claimsMadeInPreviousPolicy="yes";
									}
									else 
									{	
										claimsMadeInPreviousPolicy="NO";
										claimsReported = "";
									 claimAmountReceived = "";
									 noClaimBonusPercent=carclaim;
									}
									
									String isCarOwnershipChanged = "No";

									
									serv2ToRolSunDTOComman.setrPreviousPolicyToDt(rPreviousPolicyToDt);
									serv2ToRolSunDTOComman.setrPreviousPolicyFromDt(rPreviousPolicyFromDt);
									serv2ToRolSunDTOComman.setrPreviousInsurer(rPreviousInsurer);
									serv2ToRolSunDTOComman.setRstrFirstRegDt(rstrFirstRegDt);
									serv2ToRolSunDTOComman.setRstrPrevPolExpDt(rstrPrevPolExpDt);
									serv2ToRolSunDTOComman.setClaimsReported(claimsReported);
									serv2ToRolSunDTOComman.setClaimsMadeInPreviousPolicy(claimsMadeInPreviousPolicy);
									serv2ToRolSunDTOComman.setClaimAmountReceived(claimAmountReceived);
									serv2ToRolSunDTOComman.setIsCarOwnershipChanged(isCarOwnershipChanged);
									serv2ToRolSunDTOComman.setRproductName(rproductName);
									serv2ToRolSunDTOComman.setPreviousPolicyno(previousPolicyno);
									serv2ToRolSunDTOComman.setNoClaimBonusPercent(noClaimBonusPercent);
									serv2ToRolSunDTOComman.setRegDate(regDate);
									// EndRoyalSundaram
						
						
						
						
						}

					
					//Liberty
			 	    String libcar[]=m.libCarModel(Model);
			 	   	String MakeCode=libcar[0];
			 	   	String ModelCode=libcar[1];
			 	   	String BuyerState=m.state(strRTOCode);
			 	   String productCode="3151";
			 	   session.setAttribute("productCode", productCode);
			 	   session.setAttribute("MakeCode", MakeCode);
			 	   session.setAttribute("ModelCode", ModelCode);
			 	   session.setAttribute("insurer", Insurer);
			 	  session.setAttribute("BuyerState", BuyerState);
			 	   
			 	  
			 	  
				 if(RegYear.equals("Brandnew")) {
					 
					 String BusinessType="New Business";
					 session.setAttribute("BusinessType", BusinessType);
					 }
				 	String reg1=Car_RegNo.substring(0,2);
					String reg2=Car_RegNo.substring(2,4);
					String reg3=Car_RegNo.substring(4,6);
					String reg4=Car_RegNo.substring(6,10);
				 	session.setAttribute("reg1", reg1);
					session.setAttribute("reg2", reg2);
					session.setAttribute("reg3", reg3);
					session.setAttribute("reg4", reg4);
					
					if(date!=null)
					{
			 	   SimpleDateFormat formatt = new SimpleDateFormat("yyyy-MM-dd");
			        java.util.Date utilDate1 = null;
					try {
						utilDate1 = formatt.parse(date);
						
						Calendar calendar = Calendar.getInstance();
						calendar.setTime(utilDate1);
						calendar.add(Calendar.YEAR, -1);
						calendar.add(Calendar.DATE, +1);
						java.util.Date later = calendar.getTime();
						
						Calendar calendar2 = Calendar.getInstance();
						calendar2.setTime(utilDate1);
						calendar2.add(Calendar.DATE, +1);
						java.util.Date later2 = calendar2.getTime();
						
						Calendar calendar1 = Calendar.getInstance();
						calendar1.setTime(later2);
						calendar1.add(Calendar.YEAR, +1);
						calendar1.add(Calendar.DATE, -1);
						java.util.Date later1 = calendar1.getTime();
						
						SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");


						String PrevPolStartDate = format1.format(later.getTime());
						String NewPolEndDate = format1.format(later1.getTime());
						String NewPolStartDate = format1.format(later2.getTime());
						System.out.println("PrevPolExpDate : "+date);
						System.out.println("PrevPolStartDate : "+PrevPolStartDate);
						System.out.println("NewPolEndDate : "+NewPolEndDate);
						System.out.println("NewPolStartDate : "+NewPolStartDate);
						
						
						session.setAttribute("prePolendDate", date);
						session.setAttribute("prevPolStartDate", PrevPolStartDate);
						session.setAttribute("newPolStartDate", NewPolStartDate);
						session.setAttribute("newPolEndDate", NewPolEndDate);
						
						 
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				//Liberty
					
					if(date!=null) {
						SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				        java.util.Date utilDate = null;

				        try {
							utilDate = format.parse(date);
				        } catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				         ExpiryDate = new java.sql.Date(utilDate.getTime());
				         System.out.println(ExpiryDate);
					}
				        if(RegYear.equals("Brandnew"))
				        {
				        	Insurer=null;
				        	AnyClaim=null;
				        	ExpiryDate=null;
				        }
				        
				        /*RoyalSundaram ModelCode Here*/

						String vehicleManufacturerName =Manufacturer ;
						String fuelType1 = FuelType;
						/* modelCode */
						String vehicleModelCode = m.ifModel1(Varient, FuelType);
						System.out.println("vehicleModelCode" +vehicleModelCode);
						serv2ToRolSunDTOComman.setVehicleManufacturerName(vehicleManufacturerName);
						serv2ToRolSunDTOComman.setVehicleModelCode(vehicleModelCode);
						serv2ToRolSunDTOComman.setYearOfManufacture(yearOfManufacture);
						serv2ToRolSunDTOComman.setFuelType1(fuelType1);
						serv2ToRolSunDTOComman.setRegistrationNumber(registrationNumber);
				        
				        session.setAttribute("userpoj", userpoj);
				        session.setAttribute("propprevpojo", propprevpojo);
				        session.setAttribute("serv2ToRolSunDTOComman", serv2ToRolSunDTOComman);
					
		       
					Connection con = Db.myGetConnection();
					String s="insert into main_data(RegNo,Manufacturer,Model,FuelType,Varient,RegYear,Insurer,AnyClaim,ExpiryDate,name,email,Phoneno) values(?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement stmt = con.prepareStatement(s);
					stmt.setString(1, Car_RegNo);
					stmt.setString(2, Manufacturer);
					stmt.setString(3, Model);
					stmt.setString(4, FuelType);
					stmt.setString(5, Varient);
					stmt.setString(6, RegYear);
					stmt.setString(7, Insurer);
					stmt.setString(8, AnyClaim);
					stmt.setDate(9, ExpiryDate);
					stmt.setString(10, Fullname);
					stmt.setString(11, Email);
					stmt.setString(12, Mobile);
					
					response.sendRedirect("shri");
					
					stmt.executeUpdate();
					stmt.close();
					
					
					
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        catch(NullPointerException e) {
		        	e.printStackTrace();
		        }
		        catch (Exception s) {
		        	s.printStackTrace();
		        } 
					
				}
				
				/* Royal Bike Code Here */

				
				//session.setAttribute("serv2ToRolSunbike", serv2ToRolSunbike);

				/*String bikeregistrationNumber = Bike_RegNo;
				if (bikeregistrationNumber == null) {
					bikeregistrationNumber = "";
				}*/
				
				
				if(Bike_RegNo!=null)
				{
					User userpoj=new User();
					userpoj.setVehicleType("Bike");
					userpoj.setRegNo(Bike_RegNo);
					Proposal1 propprevpojo=new Proposal1();
					propprevpojo.setPinCode(PinCode);
					
					//royal
					String bikeregistrationNumber = Bike_RegNo;
					Serv2ToRolSunDTO serv2ToRolSunDTOComman = new Serv2ToRolSunDTO();

					serv2ToRolSunDTOComman.setRname(rname);
					serv2ToRolSunDTOComman.setRmobile(rmobile);
					serv2ToRolSunDTOComman.setRemail(remail);
					serv2ToRolSunDTOComman.setRpinCode(rpinCode);
					serv2ToRolSunDTOComman.setBikeregistrationNumber(bikeregistrationNumber);
					serv2ToRolSunDTOComman.setRegistrationNumber(registrationNumber);
					System.out.println("registrationNumber" + serv2ToRolSunDTOComman.getBikeregistrationNumber());
					//royalend
					try {
					String a=Bike_RegNo.substring(0,4);
					String strRTOCode=a.substring(0,2)+"-"+a.substring(2, a.length());
					//session.setAttribute("strRTOCode", strRTOCode);
					userpoj.setStrRTOCode(strRTOCode);
					userpoj.setRegyr(Bike_RegYear);
					String strInsuredState=Bike_RegNo.substring(0,2);
					//session.setAttribute("strInsuredState", strInsuredState);
					userpoj.setStrInsuredState(strInsuredState);
					
					 main m=new main();
					 String strVehicleCode=m.ifByke(Variant);
					 userpoj.setStrVehicleCode(strVehicleCode);
					 String IDV_of_Vehicle=m.BikeIDV(Bike_RegNo, Variant);
					 //String strVehicleCode=m.byke(Bike_Model);
					 String g[]=m.ifBykeRegyr(Bike_RegYear,Bike_Claim);
					 	String strProductCode=g[0];
				 	   	String ProposalType=g[1];
				 	   	String strADDONCover=g[2];
				 	   	String strFirstRegDt=g[3];
				 	   	String strPrevPolClaimYN=g[4];
				 	   	String strPrevPolNCB=g[5];
				 	   	String VehicleType=g[6];
				 	   	
				 	    /*session.setAttribute("strVehicleCode", strVehicleCode);
				 	  	session.setAttribute("strProductCode", strProductCode);
						session.setAttribute("strPolicyType", strPolicyType);
						session.setAttribute("strADDONCover", strADDONCover);
						session.setAttribute("strPrevPolClaimYN", strPrevPolClaimYN);
						session.setAttribute("strPrevPolNCB", strPrevPolNCB);*/
				 	   	  userpoj.setStrProductCode(strProductCode);
					 	  userpoj.setStrADDONCover(strADDONCover);
					 	  userpoj.setStrPrevPolClaimYN(strPrevPolClaimYN);
					 	  userpoj.setStrPrevPolNCB(strPrevPolNCB);
					 	  propprevpojo.setProposalType(ProposalType);
					 	  propprevpojo.setVehicleType(VehicleType);

						/* Royal Bike Code here */
						String previousPolicyno = "";
						String rproductName = "";
						String regDate = "";
						String BikeManufacturerName = Bike_Manufacturer;
						String BikeModelCode = m.ifModel2(Bike_Model);
						System.out.println("BikeModelCode" +BikeModelCode);
						String BikeModelName = Bike_Model;
						String royalRegNum = bikeregistrationNumber.substring(0, 4);
						String royalRtoCode =royalRegNum.substring(0, 2)+"-"+royalRegNum.substring(2, 4);
						String rcity= m.Royalcity(royalRtoCode);
						serv2ToRolSunDTOComman.setBikeManufacturerName(BikeManufacturerName);
						serv2ToRolSunDTOComman.setBikeModelCode(BikeModelCode);
						serv2ToRolSunDTOComman.setBikeModelName(BikeModelName);
						serv2ToRolSunDTOComman.setRcity(rcity);
						session.setAttribute("serv2ToRolSunbikeModelInfo", serv2ToRolSunDTOComman);

						/*Royal Bike Code End */
						
						
					if(Bike_RegYear.equals("Brandnew"))
			        {
			        	Bike_Insurer=null;
			        	BikeExpiryDate=null;
			        	ExpiryDate=null;
			        	Bike_Claim=null;
			        	String strPrevPolExpDt="";
						strFirstRegDt="";
						String PreviousPolicyToDt="";
						String PreviousPolicyFromDt="";
						String PreviousPolicyUWYear="";
						String VehicleManufactureYear=Bike_RegYear;
						String PreviousInsurer="";
						propprevpojo.setPreviousInsurer(PreviousInsurer);
						propprevpojo.setPreviousPolicyFromDt(PreviousPolicyFromDt);
						propprevpojo.setPreviousPolicyToDt(PreviousPolicyToDt);
						propprevpojo.setPreviousPolicyUWYear(PreviousPolicyUWYear);
						propprevpojo.setVehicleManufactureYear(VehicleManufactureYear);
						userpoj.setStrPrevPolExpDt(strPrevPolExpDt);
						userpoj.setStrFirstRegDt(strFirstRegDt);
						/*session.setAttribute("PreviousInsurer", PreviousInsurer);
						session.setAttribute("PreviousPolicyToDt", PreviousPolicyToDt);
						session.setAttribute("PreviousPolicyFromDt", PreviousPolicyFromDt);
						session.setAttribute("PreviousPolicyUWYear", PreviousPolicyUWYear);
						session.setAttribute("VehicleManufactureYear", VehicleManufactureYear);
						session.setAttribute("strPrevPolExpDt", strPrevPolExpDt);
						session.setAttribute("strFirstRegDt", strFirstRegDt);*/
			       
						/* Royal bike code Here */

						// date code here
						DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						LocalDateTime currentdate = LocalDateTime.now();
						LocalDateTime nextYear = currentdate.plusYears(1).minusDays(1);

						String yearOfManufacturebike = "2018";

						String bikePreviousInsurerName = "";
						String bikeclaimsMadeInPreviousPolicy = "";
						String bikeNoClaimBonusPercent = "";
						String bikePreviousPolicyExpiryDate = "";
						String bikeRegistrationChargesRoadTax = "";
						String bikeVehicleOwnershipChanged = "";
						previousPolicyno = "";
						rproductName = "BrandnewTwoWheeler";
						regDate = dtf.format(currentdate);
						serv2ToRolSunDTOComman.setBikePreviousInsurerName(bikePreviousInsurerName);
						serv2ToRolSunDTOComman.setBikeclaimsMadeInPreviousPolicy(bikeclaimsMadeInPreviousPolicy);
						serv2ToRolSunDTOComman.setBikePreviousPolicyExpiryDate(bikePreviousPolicyExpiryDate);
						serv2ToRolSunDTOComman.setBikeNoClaimBonusPercent(bikeNoClaimBonusPercent);
						serv2ToRolSunDTOComman.setBikeRegistrationChargesRoadTax(bikeRegistrationChargesRoadTax);
						serv2ToRolSunDTOComman.setBikeVehicleOwnershipChanged(bikeVehicleOwnershipChanged);
						serv2ToRolSunDTOComman.setYearOfManufacturebike(yearOfManufacturebike);
						//serv2ToRolSunRolloverBikeSet.setRproductName(rproductName);
						serv2ToRolSunDTOComman.setRegDate(regDate);
						serv2ToRolSunDTOComman.setPreviousPolicyno(previousPolicyno);
						
						serv2ToRolSunDTOComman.setRproductName(rproductName);

						
						serv2ToRolSunDTOComman.setBikeregistrationNumber(bikeregistrationNumber);

						

			        
			        
			        }
					else {
						String PreviousInsurer=m.insurer(Bike_Insurer);
						/*String PreviousInsurer="";*/
						
						//session.setAttribute("PreviousInsurer", PreviousInsurer);
						
						SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");	
						 SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
						 String OrDate=null;
						 try {
							java.util.Date date1= format.parse(BikeExpiryDate);
							OrDate=format1.format(date1);
						} catch (ParseException e) {
							
							e.printStackTrace();
						}
						 
							java.util.Date utilDate1 = null;
							try {
								utilDate1 = format1.parse(OrDate);
							} catch (ParseException e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
							String PreviousPolicyToDt=format1.format(utilDate1);
							 Calendar c = Calendar.getInstance();
							    c.setTime(utilDate1);
							    c.add(Calendar.DAY_OF_MONTH, -364);
							    java.util.Date end=c.getTime();
							    String PreviousPolicyFromDt=format1.format(end);
							    String strPrevPolExpDt=PreviousPolicyToDt;
							  
								 strFirstRegDt=PreviousPolicyFromDt;
								 String PreviousPolicyUWYear=Bike_RegYear;
								 String VehicleManufactureYear=Bike_RegYear;
								 
								 	propprevpojo.setPreviousInsurer(PreviousInsurer);
									propprevpojo.setPreviousPolicyFromDt(PreviousPolicyFromDt);
									propprevpojo.setPreviousPolicyToDt(PreviousPolicyToDt);
									propprevpojo.setPreviousPolicyUWYear(PreviousPolicyUWYear);
									propprevpojo.setVehicleManufactureYear(VehicleManufactureYear);
									userpoj.setStrPrevPolExpDt(strPrevPolExpDt);
									userpoj.setStrFirstRegDt(strFirstRegDt);
					
									/* Royal Code here */

									DateFormat originalFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
									DateFormat targetFormat = new SimpleDateFormat("dd/MM/yyyy");
									java.util.Date date1 = null;
									try {
										date1 = originalFormat.parse(strPrevPolExpDt);
										System.out.println("date1" +date1);
									} catch (ParseException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									String formattedDate = targetFormat.format(date1);
									
									

									
									
									
									System.out.println(formattedDate );

									regDate = "01/01/" + Bike_RegYear;
									String yearOfManufacturebike = Bike_RegYear;
									String bikePreviousInsurerName = PreviousInsurer;
									String bikeclaimsMadeInPreviousPolicy = "";
									String bikeNoClaimBonusPercent = "";
									if (Bike_Claim.equals("Yes")) {
										 bikeclaimsMadeInPreviousPolicy = "Yes";
										 bikeNoClaimBonusPercent = "";
									}
									else {
										 bikeclaimsMadeInPreviousPolicy = "NO";
										 bikeNoClaimBonusPercent = Bike_Claim;
									}
									
									String bikePreviousPolicyExpiryDate = formattedDate;
									
									String bikeRegistrationChargesRoadTax = "off";
									String bikeVehicleOwnershipChanged = "Yes";
									previousPolicyno = "1234";
									rproductName = "RolloverTwoWheeler";
									
									
									serv2ToRolSunDTOComman.setBikePreviousInsurerName(bikePreviousInsurerName);
									serv2ToRolSunDTOComman.setBikeclaimsMadeInPreviousPolicy(bikeclaimsMadeInPreviousPolicy);
									serv2ToRolSunDTOComman.setBikePreviousPolicyExpiryDate(bikePreviousPolicyExpiryDate);
									serv2ToRolSunDTOComman.setBikeNoClaimBonusPercent(bikeNoClaimBonusPercent);
									serv2ToRolSunDTOComman.setBikeRegistrationChargesRoadTax(bikeRegistrationChargesRoadTax);
									serv2ToRolSunDTOComman.setBikeVehicleOwnershipChanged(bikeVehicleOwnershipChanged);
									serv2ToRolSunDTOComman.setYearOfManufacturebike(yearOfManufacturebike);
									//serv2ToRolSunRolloverBikeSet.setRproductName(rproductName);
									serv2ToRolSunDTOComman.setRegDate(regDate);
									serv2ToRolSunDTOComman.setPreviousPolicyno(previousPolicyno);
									
									
									
									
									serv2ToRolSunDTOComman.setRproductName(rproductName);
									//
					
					

					
					
					}
					
					// Liberty		 
					session.setAttribute("Bike_RegNo", Bike_RegNo); // added
					 String lib[]=m.libModel(Bike_Model);
				 	   	String MakeCode=lib[0];
				 	   	String ModelCode=lib[1];
				 	   String BuyerState=m.state(strRTOCode);
				 	   String productCode="3152";
				 	   session.setAttribute("productCode", productCode);
				 	   session.setAttribute("MakeCode", MakeCode);
				 	  session.setAttribute("ModelCode", ModelCode);
				 	 session.setAttribute("insurer", Bike_Insurer); 
				 	session.setAttribute("BuyerState", BuyerState); 
				 	 
					 if(Bike_RegYear.equals("Brandnew")) {
						 
						 String BusinessType="New Business";
						 session.setAttribute("BusinessType", BusinessType);
					 }
			
					 	String reg1=Bike_RegNo.substring(0,2);
						String reg2=Bike_RegNo.substring(2,4);
						String reg3=Bike_RegNo.substring(4,6);
						String reg4=Bike_RegNo.substring(6,10);
						
						session.setAttribute("reg1", reg1);
						session.setAttribute("reg2", reg2);
						session.setAttribute("reg3", reg3);
						session.setAttribute("reg4", reg4);   
						
						if(BikeExpiryDate!=null)
						{
						SimpleDateFormat formatt = new SimpleDateFormat("yyyy-MM-dd");
				        java.util.Date utilDate1 = null;
						try {
							utilDate1 = formatt.parse(BikeExpiryDate);
							
							Calendar calendar = Calendar.getInstance();
							calendar.setTime(utilDate1);
							calendar.add(Calendar.YEAR, -1);
							calendar.add(Calendar.DATE, +1);
							java.util.Date later = calendar.getTime();
							
							Calendar calendar2 = Calendar.getInstance();
							calendar2.setTime(utilDate1);
							calendar2.add(Calendar.DATE, +1);
							java.util.Date later2 = calendar2.getTime();
							
							Calendar calendar1 = Calendar.getInstance();
							calendar1.setTime(later2);
							calendar1.add(Calendar.YEAR, +1);
							calendar1.add(Calendar.DATE, -1);
							java.util.Date later1 = calendar1.getTime();
							
							SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");


							String PrevPolStartDate = format1.format(later.getTime());
							String NewPolEndDate = format1.format(later1.getTime());
							String NewPolStartDate = format1.format(later2.getTime());
							System.out.println("PrevPolExpDate : "+BikeExpiryDate);
							System.out.println("PrevPolStartDate : "+PrevPolStartDate);
							System.out.println("NewPolStartDate : "+NewPolStartDate);
							System.out.println("NewPolEndDate : "+NewPolEndDate);
							
							session.setAttribute("prePolendDate", BikeExpiryDate);
							session.setAttribute("prevPolStartDate", PrevPolStartDate);
							session.setAttribute("newPolStartDate", NewPolStartDate);
							session.setAttribute("newPolEndDate", NewPolEndDate);
							
							 
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						}
						
						// Liberty 
						
					if(BikeExpiryDate!=null) {
						SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				        java.util.Date utilDate = null;

				        try {
							utilDate = format.parse(BikeExpiryDate);
				        } catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				         ExpiryDate = new java.sql.Date(utilDate.getTime());
					}	
					
						session.setAttribute("userpoj", userpoj);
						session.setAttribute("propprevpojo", propprevpojo);
						session.setAttribute("serv2ToRolSunDTOComman", serv2ToRolSunDTOComman);
					
						Connection con = Db.myGetConnection();
						String s2="insert into main_data(RegNo,Manufacturer,Model,Varient,RegYear,Insurer,AnyClaim,ExpiryDate,name,email,Phoneno) values(?,?,?,?,?,?,?,?,?,?,?)";
						PreparedStatement stmt2 = con.prepareStatement(s2);
						stmt2.setString(1, Bike_RegNo);
						stmt2.setString(2, Bike_Manufacturer);
						stmt2.setString(3, Bike_Model);
						stmt2.setString(4, Variant);
						stmt2.setString(5, Bike_RegYear);
						stmt2.setString(6, Bike_Insurer);
						stmt2.setString(7, Bike_Claim);
						stmt2.setDate(8, ExpiryDate);
						stmt2.setString(9, Fullname);
						stmt2.setString(10, Email);
						stmt2.setString(11, Mobile);
						
						
						response.sendRedirect("shri");
						
						stmt2.executeUpdate();
						stmt2.close();
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			       
				}
				if(session!=null) {

					session.removeAttribute("bike_reg");
					session.removeAttribute("manufacturer2");
					session.removeAttribute("bk1");
					session.removeAttribute("bk2");
					session.removeAttribute("bk3");
					session.removeAttribute("bk4");
					session.removeAttribute("Bike_Claim");
					session.removeAttribute("BikeExpiryDate");
					
					session.removeAttribute("RegNo");
					session.removeAttribute("Manufacturer");
					session.removeAttribute("Model");
					session.removeAttribute("FuelType");
					session.removeAttribute("Variant");
					session.removeAttribute("Regyr");
					session.removeAttribute("Claim");
					session.removeAttribute("ExpiryDate");
					}
			}

			}

