package study.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Db {
	
	public static Connection myGetConnection() throws SQLException 
	{
		try {
			 Properties prop=new Properties();
			 InputStream in = Db.class.getClassLoader().getResourceAsStream("study/db/db.properties");
			 prop.load(in);
			 in.close();
			 
			 String drivers = prop.getProperty("jdbc.drivers");
	         String jdbc_url = prop.getProperty("jdbc.url");
	         String username = prop.getProperty("jdbc.username");
	         String password = prop.getProperty("jdbc.password");
			
				Class.forName(drivers);
				Connection con = DriverManager.getConnection(jdbc_url,username,password);
				return con;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			return null;
			
			
			
			
			
		}
		
	}

