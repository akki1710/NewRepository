package ServeletBean;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.db.Db;



/**
 * Servlet implementation class BeanRegis
 */
@WebServlet("/BeanRegis")
public class BeanRegis extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeanRegis() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {response.setContentType("text/html");  
    PrintWriter pw = response.getWriter(); 
    String Uname=request.getParameter("Uname");
    
    String Fname =request.getParameter("Fname");
    String Lname=request.getParameter("Lname");
    String Country=request.getParameter("country");
    String State=request.getParameter("state");
    String day=request.getParameter("day");
    String month=request.getParameter("month");
    String year=request.getParameter("year");
    String Dob= year + "-" + month + "-" + day;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date utilDate = null;
	try {
		utilDate = format.parse(Dob);
	} catch (ParseException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    String Email=request.getParameter("Email");
   
    String Password=request.getParameter("Password");
    
    String Pno=request.getParameter("Pno");
    
    try {
		Connection con = Db.myGetConnection();
		
		String s="insert into reg(Uname,Fname,Lname,Country,State,Dob,Email,Password,Pno) values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(s);
		stmt.setString(1,Uname);
		stmt.setString(2,Fname);
		stmt.setString(3,Lname );
		stmt.setString(4,Country );
		stmt.setString(5,State);
		stmt.setDate(6,sqlDate);
		stmt.setString(7,Email );
		stmt.setString(8,Password);
		stmt.setString(9,Pno);
		
		
		

		stmt.executeUpdate();
		response.sendRedirect("login");
		
		stmt.close();
		pw.close();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
      
}


		
}
