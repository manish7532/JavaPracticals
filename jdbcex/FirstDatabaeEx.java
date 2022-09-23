package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstDatabaeEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//register driver
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/temp", "root", "5652");
		
		//create stmt
		Statement statement = con.createStatement();
		
		//execute Statement
		ResultSet rSet = statement.executeQuery("select * from contact");
		
		// reterive result
		
		while(rSet.next()) {
			System.out.print(rSet.getInt("c_id") + "\t");
			System.out.print(rSet.getString("c_name") + "\t");
			System.out.print(rSet.getString("phone_no") + "\t");
			System.out.println();
		}
		
		//close connection
		statement.close();
		con.close();
	}

}
