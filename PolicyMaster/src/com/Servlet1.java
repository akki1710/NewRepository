package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				response.setContentType("text/html");
				PrintWriter pw=response.getWriter();
				
				beans.main_data md=new beans.main_data();
				
				String RegNo=request.getParameter("RegNo");
				String Manufacturer=request.getParameter("Manufacturer");
				String Model=request.getParameter("b1");
				String FuelType=request.getParameter("FuelType");
				String Variant=request.getParameter("Variant");
				String Regyr=request.getParameter("Regyr");
				String PreIns=request.getParameter("PreIns");
				String Claim=request.getParameter("Claim");
				String ExpiryDate = request.getParameter("ExpiryDate");
				
				String bike_reg=request.getParameter("bike_reg");
				String manufacturer2=request.getParameter("manufacturer2");
				String bk1=request.getParameter("bk1");   //modal
				String bk2=request.getParameter("bk2");   //varient
				String bk3=request.getParameter("bk3");
				String bk4=request.getParameter("bk4");
				String Bike_Claim=request.getParameter("Bike_Claim");
				String BikeExpiryDate=request.getParameter("BikeExpiryDate");
				
				
				
					HttpSession session=request.getSession();
		// Car servlet starts here			
					if(RegNo!=null)
					{
		            session.setAttribute("RegNo", RegNo);
		            response.sendRedirect("car_page1.jsp");
					}
					if(Manufacturer!=null)
					{
		            session.setAttribute("Manufacturer", Manufacturer);
		            response.sendRedirect("car_page2.jsp");
		            System.out.println(Manufacturer);
					}
					if (Model!=null)
					{	
					session.setAttribute("Model", Model);
					response.sendRedirect("car_page3.jsp");
						
					}
					if (FuelType!=null)
					{	
						session.setAttribute("FuelType", FuelType);
						response.sendRedirect("car_page4.jsp");
						
					}
					if (Variant!=null)
					{
						session.setAttribute("Variant", Variant);
			            response.sendRedirect("car_page5.jsp");
					}
					if (Regyr!=null)
					{
						if(Regyr.equals("Brandnew"))
						{
							session.setAttribute("Regyr", Regyr);
							session.setAttribute("reg_year", Regyr);
				            response.sendRedirect("car_page9.jsp");
						}
						else
						{
							session.setAttribute("Regyr", Regyr);
							session.setAttribute("reg_year", Regyr);
				            response.sendRedirect("car_page6.jsp");
						}
						
					}
					if (PreIns!=null)
					{
						session.setAttribute("PreIns", PreIns);
			            response.sendRedirect("car_page7.jsp");
					}
					if (Claim!=null)
					{
						session.setAttribute("Claim", Claim);
			            if(Claim.equals("YES"))
			            {
			            	String ncb="";
			            	session.setAttribute("ncb", ncb);
			            }
			            else
			            {
			            	session.setAttribute("ncb", Claim);
			            }
			            response.sendRedirect("car_page8.jsp");
					}
					if (ExpiryDate!=null)
					{
						
						session.setAttribute("ExpiryDate", ExpiryDate);
			            response.sendRedirect("car_page9.jsp");
					}
					
		// Car servlet Ends here
					
					//Bike servlet starts here
					
					if(bike_reg!=null)
					{
		            session.setAttribute("bike_reg", bike_reg);
		            response.sendRedirect("bike_page1.jsp");
					}
					if(manufacturer2!=null)
					{
		            session.setAttribute("manufacturer2", manufacturer2);
		            response.sendRedirect("bike_page2.jsp");
		           
					}
					if (bk1!=null)
					{
						session.setAttribute("bk1", bk1);   //modal
			            response.sendRedirect("bike_page3.jsp");
					}
					if (bk2!=null)
					{
						session.setAttribute("bk2", bk2);   //varient
			            response.sendRedirect("bike_page4.jsp");
					}
					if (bk3!=null)     //bike regi year
					{
						if(bk3.equals("Brandnew"))
						{
							session.setAttribute("bk3", bk3);
							session.setAttribute("reg_year", bk3);
							 response.sendRedirect("bike_page7.jsp");
						}
						else
						{
							session.setAttribute("bk3", bk3);
							session.setAttribute("reg_year", bk3);
				            response.sendRedirect("bike_page5.jsp");
						}
						
					}
					if (bk4!=null)
					{
						session.setAttribute("bk4", bk4);  //insurance
			            response.sendRedirect("bike_page8.jsp");
					}
					if (Bike_Claim!=null) {
						
						session.setAttribute("Bike_Claim", Bike_Claim);
						if(Bike_Claim.equals("YES"))
			            {
			            	String ncb="";
			            	session.setAttribute("ncb", ncb);// 
			            }
			            else
			            {
			            	session.setAttribute("ncb", Bike_Claim);//ncb %
			            }
						
						response.sendRedirect("bike_page9.jsp"); 
					}
					if (BikeExpiryDate!=null) {   //previous policy expiry datre
						System.out.println(BikeExpiryDate);
						session.setAttribute("BikeExpiryDate", BikeExpiryDate);
						response.sendRedirect("bike_page7.jsp"); //fill details
					}
					
					
	}

}