package banking;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
	static Connection con;
	public static Connection getConnection()
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Sonu832899@");		

		}
		catch (Exception e) {
			System.out.println("Connection Failed!");
		}

		return con;
	}
}