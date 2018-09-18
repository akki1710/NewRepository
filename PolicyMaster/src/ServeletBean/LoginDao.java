package ServeletBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import study.db.Db;

public class LoginDao {
 public static boolean valiLog(String Uname, String Password) {
	 boolean status = false;
	 try {
		 Connection con = Db.myGetConnection();
		 PreparedStatement ps = con.prepareStatement("select Uname, Password from reg where Uname=? and Password=?");
		 ps.setString(1,Uname);
		 ps.setString(2,Password);
		 ResultSet rs = ps.executeQuery();
		 status = rs.next();
		 String u = rs.getString(1);
		 String p = rs.getString(2);
			
			
			
	 }
	 catch (Exception e) {
		// TODO: handle exception
		 System.out.println(e);
		 
	}
	return status;
 }
 

}
