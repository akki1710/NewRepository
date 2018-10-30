package ServeletBean;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    boolean status = false;
    
    String name=request.getParameter("name");
    String Country=request.getParameter("country");
    String City=request.getParameter("city");
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
    
    String Mobile=request.getParameter("Pno");
    
    try {
		Connection con = Db.myGetConnection();
		
		PreparedStatement ps = con.prepareStatement("select Mobile from reg where Mobile=?");
		ps.setString(1,Mobile);
		ResultSet rs = ps.executeQuery();
		 status = rs.next();
		 String Pno = rs.getString(1);
		 rs.close();
		
		if(Pno.equals(Mobile)) {
			String s="update reg set Name = ?,"+"Country = ?,"+"Password = ?"+"where Mobile =?";
			PreparedStatement stmt = con.prepareStatement(s);
			stmt.setString(1, name);
			stmt.setString(2, Country);
			stmt.setString(3, Password);
			stmt.setString(4, Mobile);
			
			stmt.executeUpdate();
			stmt.close();
		}
		else {
		String s="insert into reg(Name,Country,City,Dob,Email,Password,Mobile) values(?,?,?,?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(s);
		stmt.setString(1,name);
		stmt.setString(2,Country );
		stmt.setString(3,City);
		stmt.setDate(4,sqlDate);
		stmt.setString(5,Email );
		stmt.setString(6,Password);
		stmt.setString(7,Mobile);
		
		
		

		stmt.executeUpdate();
		stmt.close();
		
		}
		response.sendRedirect("login");

		pw.close();
		con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
    
      
}


		
}
