package ServeletBean;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import study.db.Db;



/**
 * Servlet implementation class LogServlet
 */
@WebServlet("/LogServlet")
public class LogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter(); 
        
		String u = request.getParameter("Mobile");
		String p = request.getParameter("pass");
		
		
		if(LoginDao.valiLog(u,p)) {
			 boolean status = false;
				HttpSession session=request.getSession();
				RequestDispatcher rd=request.getRequestDispatcher("user.jsp"); 
				rd.include(request, response);
				 Connection con;
				try {
					con = Db.myGetConnection();
					 PreparedStatement ps = con.prepareStatement("select Mobile,Name from reg where Mobile=? and Password=?");
					 ps.setString(1,u);
					 ps.setString(2,p);
					 ResultSet rs = ps.executeQuery();
					 status = rs.next();
					 String Mobile = rs.getString(1);
					 String Name = rs.getString(2);
					 
					session.setAttribute("Mobile",Mobile);   
					

					out.println("<script type=\"text/javascript\">");
					
					   out.println("alert('Successfully login');");
					   out.println("</script>");
					    
					   System.out.println("Welcome: "+ Name+" Mobile: "+Mobile);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				
				
			
			   /*out.println("<script type=\"text/javascript\">");
			   out.println("location='index.jsp';");
			    out.println("alert('Successfully login');");
			   out.println("</script>");*/
			    
		    }
		
		    	
		   else{
			   
			   RequestDispatcher rd=request.getRequestDispatcher("login.jsp");  
			 //servlet2 is the url-pattern of the second servlet  
			   
			 rd.include(request, response);//method may be include or forward
		    out.println("<script type=\"text/javascript\">");
		    out.println("alert('MobileNo. or password incorrect');");
		   out.println("</script>");
		   }
		
		out.close();
	}
	
}
	
	/*
	// Connect to mysql and verify username password
	 
	try {
		Connection con = DbConnection.myGetConnection();
		
		PreparedStatement stmt = con.prepareStatement("Select Uname, Password from reg where Uname=? and Password=?");
		stmt.setString(1,U);
		stmt.setString(2,P);
		
		
		ResultSet rs =stmt.executeQuery();
		
		while(rs.next()) {
			String Uname = rs.getString(1);
			String Password = rs.getString(2);
			
				response.sendRedirect("index.jsp");
				}
		  }
		
	
	catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	*/
	



	