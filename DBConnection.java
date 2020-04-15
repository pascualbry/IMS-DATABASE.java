package Database;

import java.sql.*;

public class DBConnection {
	
	public Connection get_connection(){
		
		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false", "root", "0929ayeyay");
			
		}catch (Exception e) {
			
			System.out.print("Data Displayed");
			
		}
		return connection;	
	}
	
}
