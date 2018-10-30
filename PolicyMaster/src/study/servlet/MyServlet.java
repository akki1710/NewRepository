package study.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.apollo_proposal_pojo;
import com.main;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import study.db.Db;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public MyServlet() {
        super();
        
    }
    
	
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter pw = response.getWriter(); 
        HttpSession session=request.getSession();
        
        String cover=request.getParameter("cover");

        String day=request.getParameter("day");
        String month=request.getParameter("month");
        String year=request.getParameter("year");
        String dateStr = year + "-" + month + "-" + day;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = null;
		try {
			utilDate = format.parse(dateStr);
		} catch (ParseException e1) {
			
			e1.printStackTrace();
		}
		java.sql.Date sqlDate =null;
		if(utilDate!=null) {
			 sqlDate = new java.sql.Date(utilDate.getTime());
		}
        String smoke="";
        String a[]=request.getParameterValues("smoke");
        if(a!=null) {
        	for(int i=0;i<a.length;i++){
                smoke+=a[i]+"";}}
        else {
        	smoke=null;
        }
        String annualincome=request.getParameter("income");
        String name=request.getParameter("name");
       /* String word[]=name.split("\\s");
        
        String firstName=word[0];
        String lastName=word[1];*/
        String email=request.getParameter("email");

        String country=request.getParameter("country");
        String city=request.getParameter("city");

        String Mobile=request.getParameter("phoneno");
        
        String age=request.getParameter("age");
        
        String term=request.getParameter("term");
        
        String childage=request.getParameter("childage");
        String retirementage=request.getParameter("retirementage");
        
      //healthplans
        apollo_proposal_pojo ap=new apollo_proposal_pojo();
        ap.setCity(city);
        ap.setEmail(email);
        ap.setMobile(Mobile);
        String members=request.getParameter("members");
        session.setAttribute("members", members);
        System.out.println("members: "+members);
        String medical="";
        String a1[]=request.getParameterValues("medical");
        if(a1!=null) {
        for(int i=0;i<a1.length;i++){
            medical+=a1[i]+"";}}
        else {
        	medical=null;
        }
     
        String title=request.getParameter("title");
        ap.setFullname(name);
        ap.setSalutation(title);
        
        String birthDt = day + "/" + month + "/" + year;
        ap.setDob(birthDt);
        session.setAttribute("ap", ap);
        
        //healthplansend
        
        String InsurancePolicy=request.getParameter("InsurancePolicy");
        String companyname=request.getParameter("companyname");
        String contactperson=request.getParameter("contactperson");
        String policytype="";
        String a2[]=request.getParameterValues("policytype");
        if(a2!=null) {
        for(int i=0;i<a2.length;i++){
        	policytype+=a2[i]+"";}}
        else {
        	policytype=null;
        }
        
        String travellers=(String) session.getAttribute("travellers");
        String startdate = request.getParameter("startdate"); 
        java.util.Date date = null;
		try {
			date =format.parse(startdate);
		} catch (ParseException e1) {
			
			e1.printStackTrace();
		} catch (NullPointerException e1) {
			e1.printStackTrace();
		}
		java.sql.Date startdate1 = null;
		if(date!=null) {
			startdate1 = new java.sql.Date(date.getTime());   
		}
		
		String enddate = request.getParameter("enddate"); 
		 java.util.Date date1 = null;
			try {
				date1 = format.parse(enddate);
			} catch (ParseException e1) {
				
				e1.printStackTrace();
			} catch (NullPointerException e1) {
				
				e1.printStackTrace();
			}
			java.sql.Date enddate1 = null;
			if(date1!=null) {
				enddate1 = new java.sql.Date(date1.getTime());   
			}
        
        try {
        	Connection con = Db.myGetConnection();
        	if(smoke!=null) {
			
			String s="insert into main_data(cover,birthdate,smoke,annualincome,name,email,country,city,Mobile) values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(s);
			stmt.setString(1,cover);
			stmt.setDate(2,sqlDate);
			stmt.setString(3, smoke);
			stmt.setString(4, annualincome);
			stmt.setString(5, name);
			stmt.setString(6, email);
			stmt.setString(7, country);
			stmt.setString(8, city);
			stmt.setString(9, Mobile);
			
			response.sendRedirect("termquotes.jsp");
			stmt.executeUpdate();
			stmt.close();
			con.close();
			
			System.out.println("in terminsurance");
        	}
        	else if(term!=null) {
        		String s="insert into main_data(cover,age,term,annualincome,name,email,country,city,Mobile) values(?,?,?,?,?,?,?,?,?)";
    			PreparedStatement stmt = con.prepareStatement(s);
    			stmt.setString(1,cover);
    			stmt.setString(2,age);
    			stmt.setString(3, term);
    			stmt.setString(4, annualincome);
    			stmt.setString(5, name);
    			stmt.setString(6, email);
    			stmt.setString(7, country);
    			stmt.setString(8, city);
    			stmt.setString(9, Mobile);
    			
    			response.sendRedirect("termquotes.jsp");
    			stmt.executeUpdate();
    			stmt.close();
    			con.close();
    			
    			System.out.println("in investmentplan");
        	}
        	else if(childage!=null)
        	{
        		String s="insert into main_data(cover,age,childage,annualincome,name,email,country,city,Mobile) values(?,?,?,?,?,?,?,?,?)";
    			PreparedStatement stmt = con.prepareStatement(s);
    			stmt.setString(1,cover);
    			stmt.setString(2,age);
    			stmt.setString(3, childage);
    			stmt.setString(4, annualincome);
    			stmt.setString(5, name);
    			stmt.setString(6, email);
    			stmt.setString(7, country);
    			stmt.setString(8, city);
    			stmt.setString(9, Mobile);
    			
    			response.sendRedirect("termquotes.jsp");
    			stmt.executeUpdate();
    			stmt.close();
    			con.close();
    			
    			System.out.println("in childplans");
        	}
        	else if(retirementage!=null) {
        		String s="insert into main_data(cover,age,retirementage,annualincome,name,email,country,city,Mobile) values(?,?,?,?,?,?,?,?,?)";
    			PreparedStatement stmt = con.prepareStatement(s);
    			stmt.setString(1,cover);
    			stmt.setString(2,age);
    			stmt.setString(3, retirementage);
    			stmt.setString(4, annualincome);
    			stmt.setString(5, name);
    			stmt.setString(6, email);
    			stmt.setString(7, country);
    			stmt.setString(8, city);
    			stmt.setString(9, Mobile);
    			
    			response.sendRedirect("termquotes.jsp");
    			stmt.executeUpdate();
    			stmt.close();
    			con.close();
    			
    			System.out.println("in retirementplans");
        	}
        	else if(medical.equals("Yes")) {
        		System.out.println("In this loop, medical: "+medical);
            	/*RequestDispatcher rd=request.getRequestDispatcher("disease.jsp");  
   			 	rd.include(request, response);*/
        		response.sendRedirect("disease.jsp");
        		
        	}
        	else if(medical.equals("No")) {
        		String s="insert into main_data(members,city,annualincome,name,email,Mobile,medical,title,birthdate) values(?,?,?,?,?,?,?,?,?)";
    			PreparedStatement stmt = con.prepareStatement(s);
    			stmt.setString(1, members);
    			stmt.setString(2,city);
    			stmt.setString(3,annualincome);
    			stmt.setString(4, name);
    			stmt.setString(5, email);
    			stmt.setString(6, Mobile);
    			stmt.setString(7, medical);
    			stmt.setString(8, title);
    			stmt.setDate(9,sqlDate);
    			
    			stmt.executeUpdate();
    			stmt.close();
    			
    			
				
				String s1="insert into reg(Name,City,Dob,Email,Mobile) values(?,?,?,?,?)";
				PreparedStatement stmt1 = con.prepareStatement(s1);
				stmt1.setString(1, name);
    			stmt1.setString(2,city);
    			stmt1.setDate(3, sqlDate);
    			stmt1.setString(4, email);
    			stmt1.setString(5, Mobile);
    			
    			response.sendRedirect("Religare");
    			
    			stmt1.executeUpdate();
    			stmt1.close();
    			con.close();
    			
    			System.out.println("in healthplans");
        	
                }
        	
        	else if(policytype!=null) {
        		String s="insert into main_data(InsurancePolicy,companyname,contactperson,Mobile,email,city,policytype) values(?,?,?,?,?,?,?)";
    			PreparedStatement stmt = con.prepareStatement(s);
    			stmt.setString(1, InsurancePolicy);
    			stmt.setString(2, companyname);
    			stmt.setString(3, contactperson);
    			stmt.setString(4, Mobile);
    			stmt.setString(5, email);
    			stmt.setString(6, city);
    			stmt.setString(7, policytype);
    			
    			response.sendRedirect("termquotes.jsp");
    			stmt.executeUpdate();
    			stmt.close();
    			con.close();
    			
    			System.out.println("in groupmediclaim");
        	}
        	else if(startdate!=null) {
        		String s="insert into main_data(members,country,city,startdate,enddate) values(?,?,?,?,?)";
    			PreparedStatement stmt = con.prepareStatement(s);
    			stmt.setString(1, travellers);
    			stmt.setString(2,country);
    			stmt.setString(3,city);
    			stmt.setDate(4, startdate1);
    			stmt.setDate(5, enddate1);
    			
    			response.sendRedirect("termquotes.jsp");
    			stmt.executeUpdate();
    			stmt.close();
    			con.close();
    			
    			System.out.println("in travel");
        	}
        	/*else if(d!=null || d1!=null) {
        		for(int i=0;i<d.length;i++)
                {
             	   self_disease+=d[i]+",";
             	   }
         	   for(int i=0;i<d1.length;i++)
                {
             	   member_disease+=d1[i]+",";
             	   }
         	   if(d!=null) {
         		  for(int i=0;i<d.length;i++)
         	        {
         	     	   self_disease+=d[i]+",";
         	     	   member_disease=null;
         	     	   }
         	   }
         	  else if(d1!=null) {
         	        for(int i=0;i<d1.length;i++)
         	        {
         	     	   member_disease+=d1[i]+",";
         	     	   self_disease=null;
         	     	   }
         	        }
         	        else {
         	     	   RequestDispatcher rd=request.getRequestDispatcher("disease.jsp"); 
         	 			 rd.include(request, response);
         	 		    pw.println("<script type=\"text/javascript\">");
         	 		    pw.println("alert('Please select a checkbox');");
         	 		    
         	 		   pw.println("</script>");
         	     	   
         	        }

               System.out.println("self_disease: "+self_disease);
               System.out.println("member_disease: "+member_disease);
         	   
        	}*/
        	else {
        		String s="insert into main_data(name,Mobile,email,city,annualincome) values(?,?,?,?,?)";
    			PreparedStatement stmt = con.prepareStatement(s);
    			stmt.setString(1,name);
    			stmt.setString(2,Mobile);
    			stmt.setString(3, email);
    			stmt.setString(4, city);
    			stmt.setString(5, annualincome);
    			
    			response.sendRedirect("termquotes.jsp");
    			stmt.executeUpdate();
    			stmt.close();
    			con.close();
    			
    			System.out.println("in critical&personal");
        	}
        	
			pw.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        if(session!=null) {
			 session.removeAttribute("travellers");
		 }
		
	}

}
