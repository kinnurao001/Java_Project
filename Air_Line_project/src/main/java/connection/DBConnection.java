package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection
{
	static Connection con=null;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Air_Tickket","root","Himanshu@7988");		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return con;
	}
}
