package ServeletBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import study.db.Db;

public class LoginDao {
 public static boolean valiLog(String Mobile, String Password) {
	 boolean status = false;
	 try {
		 Connection con = Db.myGetConnection();
		 PreparedStatement ps = con.prepareStatement("select Mobile, Password from reg where Mobile=? and Password=?");
		 ps.setString(1,Mobile);
		 ps.setString(2,Password);
		 ResultSet rs = ps.executeQuery();
		 status = rs.next();
		 String u = rs.getString(1);
		 String p = rs.getString(2);
			
			
			
	 }
	 catch (Exception e) {
		 System.out.println(e);
		 
	}
	return status;
 }
 

}
