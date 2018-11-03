package study.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.apollo_proposal_pojo;

import Apollo.apollo;
//import Apollo.apollo;
import study.db.Db;
import study.religare.Religare;

/**
 * Servlet implementation class HealthSer
 */
@WebServlet("/HealthSer")
public class HealthSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HealthSer() {
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
	@SuppressWarnings({ "static-access", "unused" })
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter(); 
		HttpSession session=request.getSession();	

		 String health_policy=request.getParameter("health_policy");
		 if(health_policy==null) {
			 health_policy="";
		 }
		 session.setAttribute("health_policy", health_policy);
		 
		 String member_disease="";
		 String[] a=request.getParameterValues("member_disease");
		 try {
       if(health_policy.equals("Carefreedom")) {
    	   	
   			response.sendRedirect("member_details.jsp");
       }

       else if(health_policy.equals("Optima_Restore")) {
    	  
    	   response.sendRedirect("member_details.jsp");
       }
       else if(health_policy.equals("Optima_Restore_Floater")) {
     	  
    	   response.sendRedirect("member_details.jsp");
       }
       
    	   
    	   if(session!=null) {
    		   session.removeAttribute("b3");
    		   session.removeAttribute("b2");
    	   }
    	  
    	  
       
       if(a!=null) {
    	   for(int i=0;i<a.length;i++)
           {
    		   member_disease+=a[i]+",";
           }
    	   System.out.println("member_disease: "+member_disease);
    	 	response.sendRedirect("Religare");
       }
       else {
     	   RequestDispatcher rd=request.getRequestDispatcher("disease.jsp"); 
 			 rd.include(request, response);
 		    out.println("<script type=\"text/javascript\">");
 		    out.println("alert('Please select a checkbox');");
 		    
 		   out.println("</script>");
     	   
        }
       out.close();
       
	} 
		
	
	catch (NullPointerException e) {
		e.printStackTrace();
	}
	
		 finally {
		 }
	}
}
