package study.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	
	public static Connection myGetConnection() throws SQLException 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbc_url = "jdbc:mysql://localhost/db1";
		Connection con = DriverManager.getConnection(jdbc_url,"root","admin");
		return con;
		
		/*String jdbc_url = "jdbc:mysql://192.168.10.62:3306/db";
		Connection con = DriverManager.getConnection(jdbc_url,"root","Jai@@##2017");
		return con;
		*/
		
	}

}
