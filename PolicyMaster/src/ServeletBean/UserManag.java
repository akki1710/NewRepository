package ServeletBean;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import study.db.Db;

/**
 * Servlet implementation class UserManag
 */
@WebServlet("/UserManag")
public class UserManag extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserManag() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 boolean status = false;
		HttpSession session=request.getSession();
		PrintWriter out = response.getWriter(); 
		String Mobile=(String) session.getAttribute("Mobile");
		String param=request.getParameter("param");
		
		Connection con;
		if(param.equals("myprofile")) {
		try {
			if(Mobile!=null) {
			con = Db.myGetConnection();
			 PreparedStatement ps = con.prepareStatement("select Name,City,Dob,Email from reg where Mobile=?");
			 ps.setString(1,Mobile);
			 ResultSet rs = ps.executeQuery();
			 status = rs.next();
			 String Name=rs.getString(1);
			 String city=rs.getString(2);
			 Date dob=rs.getDate(3);
			 String email=rs.getString(4);
			 
			 ps.close();
			 rs.close();
			 
			 
			   System.out.println("Welcome: "+" name: "+Name+" state: "+city+" dob: "+dob+" email: "+email+" pno: "+Mobile);
			   
			   RegPJ rp=new RegPJ();
			   rp.setName(Name);
			   rp.setBirthdate(dob);
			   rp.setCity(city);
			   rp.setEmail(email);
			   rp.setPhoneno(Mobile);
			   
			   session.setAttribute("rp", rp);
			   response.sendRedirect("MyProfile.jsp");
			}
		else {
			request.getRequestDispatcher("login.jsp").include(request, response);
			out.println("<script type=\"text/javascript\">");
		    out.println("alert('Please login first!');");
		    out.println("</script>"); 
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		}
		else if(param.equals("mypolicies")) {
			try {
				if(Mobile!=null) {
				
				List<RegPJ> rp2=new ArrayList<RegPJ>();
				con = Db.myGetConnection();
				 PreparedStatement ps = con.prepareStatement("select ProposalNo,ApprovePolNo,TotalPremium,PolicyName,FullName,Email,Mobile from final_details where Mobile=?");
				 ps.setString(1,Mobile);
				 ResultSet rs = ps.executeQuery();
				 while(rs.next()) {
					 RegPJ rp1=new RegPJ();
					 String ProposalNo=rs.getString(1);
					 rp1.setProposalNo(ProposalNo);
					 rp1.setApprovePolNo(rs.getString(2));
					 rp1.setTotalPremium(rs.getString(3));
					 rp1.setPolicyName(rs.getString(4));
					 rp1.setName(rs.getString(5));
					 rp1.setEmail(rs.getString(6));
					 rp1.setPhoneno(rs.getString(7));
					 
					 
					 rp2.add(rp1);
					 
					
					 session.setAttribute("rp2", rp2);
					 
				 }
				 ps.close();
				 rs.close();
				 con.close();
				 response.sendRedirect("MyPolicy.jsp");
				}
				else {
					request.getRequestDispatcher("login.jsp").include(request, response);
					out.println("<script type=\"text/javascript\">");
				    out.println("alert('Please login first!');");
				    out.println("</script>"); 
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}catch (NullPointerException e) {
				e.printStackTrace();
			}
			
		} 
		out.close();  
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
	}

}
