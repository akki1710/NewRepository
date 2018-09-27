package study.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Royal.DATA;
import Royal.PremiumForOneYear;

import java.sql.*;
import java.util.Random;

import study.db.Db;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter pw = response.getWriter(); 
        
        String policy=request.getParameter("policy");
        
        HttpSession session=request.getSession();
        session.setAttribute("policy", policy);
       
        Random rand1 = new Random();
        int num = rand1.nextInt(9000000) + 1000000;
		String transid=Integer.toString(num);
        
        if(policy.equals("Motor Package"))
        {
        

			
			response.sendRedirect("Details2");
			
          
        if(session!=null) {
			session.removeAttribute("shrires");
			}
        }
        
        else if(policy.equals("Liberty Motor"))
        {
        	
        	response.sendRedirect("Details2.jsp");
        	
        	 if(session!=null)
     		{
     			session.removeAttribute("ProposalNumber");
     			session.removeAttribute("TotalPremium");
     		}
        }
        
        
        else if(policy.equals("Royal Motor")) {
        	response.sendRedirect("Details2.jsp");
        	/*try {
        	            	
        	            	DATA data =(Royal.DATA)session.getAttribute( "data" );
        	            	 String FullName=(String) session.getAttribute("Fullname");
        	        		 String Email=(String) session.getAttribute("Email");
        	        		 String Mobile=(String) session.getAttribute("Mobile");
        	        		 Connection con = Db.myGetConnection();	
        	            	if(data!=null)
        	            	{
        	            		
        	        			String s="insert into shri_final_details(ProposalNo,TotalPremium,FullName,Email,Mobile) values(?,?,?,?,?)";
        	        			PreparedStatement stmt = con.prepareStatement(s);
        	        			stmt.setString(1, data.getQUOTE_ID());
        	        			stmt.setString(2, data.getIDV());
        	        			stmt.setString(3, FullName);
        	        			stmt.setString(4, Email);
        	        			stmt.setString(5, Mobile);
        	        			response.sendRedirect("Details2");
        	        			
        	                    stmt.executeUpdate();
        	        			
        	        			stmt.close();
        	            	}
        	            	else {
        	            		PremiumForOneYear PremiumForOneYear = (Royal.PremiumForOneYear)session.getAttribute( "PremiumForOneYear" );
        	            		
        	            		String s="insert into shri_final_details(TotalPremium,FullName,Email,Mobile) values(?,?,?,?)";
        	            		PreparedStatement stmt = con.prepareStatement(s);
        	        			stmt.setString(1, PremiumForOneYear.getGROSS_PREMIUM());
        	        			stmt.setString(2, FullName);
        	        			stmt.setString(3, Email);
        	        			stmt.setString(4, Mobile);
        	            		response.sendRedirect("Details2");
        	        			stmt.executeUpdate();
        	        			stmt.close();
        	            	}
        	            	con.close();
        	            	pw.close();
        	    		} catch (Exception e) {
        	    			// TODO Auto-generated catch block
        	    			e.printStackTrace();
        	    		}*/
        	        	
        	    			
        	        	
        	        }
       
        
	}
        

}
