package study.servlet;

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
 * Servlet implementation class MyServlet6
 */
@WebServlet("/MyServlet6")
public class MyServlet6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet6() {
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
		response.setContentType("text/html");  
        PrintWriter pw = response.getWriter(); 
        String ageproperty=request.getParameter("ageproperty");
       
        String house="";
        String a[]=request.getParameterValues("house");
        for(int i=0;i<a.length;i++){
            house+=a[i]+"";}
        String type="";
        String b[]=request.getParameterValues("type");
        for(int i=0;i<b.length;i++){
            type+=b[i]+"";}
        String riskcovered="";
        String c[]=request.getParameterValues("riskcovered");
        for(int i=0;i<c.length;i++){
            riskcovered+=c[i]+"";}
        
        String structurecover=request.getParameter("structurecover");
        String furniture=request.getParameter("furniture");
        String appliances=request.getParameter("appliances");
        String cover="";
        String d[]=request.getParameterValues("cover");
        for(int i=0;i<d.length;i++){
            cover+=d[i]+"";}
        
        String name=request.getParameter("name");
        String day=request.getParameter("day");
        String month=request.getParameter("month");
        String year=request.getParameter("year");
        String dateStr = year + "-" + month + "-" + day;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = null;
		try {
			utilDate = format.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        String city=request.getParameter("city");
        String gender="";
        String e[]=request.getParameterValues("gender");
        for(int i=0;i<e.length;i++){
            gender+=e[i]+"";}
        String annualincome=request.getParameter("income");
        String email=request.getParameter("email");
        String phoneno=request.getParameter("phoneno");
        String status="";
        String f[]=request.getParameterValues("status");
        for(int i=0;i<f.length;i++){
            status+=f[i]+"";}
        try {
			Connection con = Db.myGetConnection();
			
			String s="insert into home(ageproperty,house,type,riskcovered,structurecover,furniture,appliances,cover,name,birthdate,city,gender,annualincome,email,phoneno,status) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(s);
			stmt.setString(1,ageproperty);
			stmt.setString(2,house);
			stmt.setString(3, type);
			stmt.setString(4, riskcovered);
			stmt.setString(5, structurecover);
			stmt.setString(6, furniture);
			stmt.setString(7, appliances);
			stmt.setString(8, cover);
			stmt.setString(9, name);
			stmt.setDate(10, sqlDate);
			stmt.setString(11, city);
			stmt.setString(12, gender);
			stmt.setString(13, annualincome);
			stmt.setString(14, email);
			stmt.setString(15, phoneno);
			stmt.setString(16, status);
			
			
			response.sendRedirect("termquotes");

			stmt.executeUpdate();
			
			stmt.close();
			pw.close();
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        
	}

}
