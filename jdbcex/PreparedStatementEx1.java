package jdbcex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class PreparedStatementEx1 {

	Connection con;
	PreparedStatement pstStatement;
	ResultSet rSet;
	
	public PreparedStatementEx1() throws ClassNotFoundException, SQLException {
		con = MyConnection.getMyConnection();
		System.out.println("Connection get open");
	}

	public void getData(float minPercentage,float maxPercentage) throws SQLException {
		pstStatement = con.prepareStatement("select * from student1 where percentage between ? and ? ");
		pstStatement.setFloat(1, minPercentage);
		pstStatement.setFloat(2, maxPercentage);
		rSet = pstStatement.executeQuery();
		while(rSet.next()) {
			System.out.print(rSet.getInt(1)+"\t");
			System.out.print(rSet.getString(2)+"\t");
			System.out.print(rSet.getDate(3)+"\t");
			System.out.print(rSet.getString(4)+"\t");
			System.out.print(rSet.getString(5));
			System.out.print("\t"+rSet.getFloat(6));
			System.out.println();
		}
	}

	public void insertRecord(int s_Id,String s_Name,LocalDate Dob,String address,String phone_no,float percentage) throws SQLException {
		pstStatement = con.prepareStatement("insert into student1 values(?,?,?,?,?,?)");
		pstStatement.setInt(1, s_Id);
		pstStatement.setString(2, s_Name);
		pstStatement.setObject(3, Dob);
		pstStatement.setString(4, address);
		pstStatement.setString(5, phone_no);
		pstStatement.setFloat(6, percentage);
		int n = pstStatement.executeUpdate();
		System.out.println(n+"record is inserted");
	}


	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		PreparedStatementEx1 p1 = new PreparedStatementEx1();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Percentages to show records");
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		p1.getData(a, b);
		
		System.out.println("Enter Id,Name,Date of Birth,Address,Phone_no & Percentage to inert a record");
		int Id = sc.nextInt();
		String Name = sc1.nextLine();
		String  Dob = sc1.nextLine();
		LocalDate lDate = LocalDate.parse(Dob);
		String Address = sc1.nextLine();
		String Phone_no = sc1.nextLine();
		float Percentage = sc.nextFloat();
		p1.insertRecord(Id, Name, lDate, Address, Phone_no, Percentage);
		
		sc.close();
		sc1.close();
	}
}
