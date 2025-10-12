package jdbcex;

import java.sql.*;
import javax.sql.*;
public class DBUtil {
	
		private static Connection con;
		private static final String Driver="com.mysql.cj.jdbc.Driver";
		private static final String USERNAME = "root";
		private static final String PASSWORD = "root";
		private static final String URL = "jdbc:mysql://localhost:3306/teegala";
		
		public static Connection getConnection()
		{
			try {
				Class.forName(Driver);
				System.out.println("Driver loaded Successfully");
				
				con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
				System.out.println("Connection Established");
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return con;
			
		}
}
