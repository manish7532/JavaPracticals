package jdbcex;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class StudentManagementSystem {

	Connection con;
	PreparedStatement preparedStatement;
	ResultSet rs;
	CallableStatement callableStatement;
	
	public StudentManagementSystem()  throws ClassNotFoundException, SQLException {
		con = MyConnection.getMyConnection();
		System.out.println("Conncetion get open");
	}
	
	public void insertStudent(int rollNo , String sName,LocalDate dob,float percentage,String city,String email_id,String phone_no) throws SQLException {
		callableStatement = con.prepareCall("{call Student_Records(?,?,?,?,?,?,?)}");
		callableStatement.setInt(1, rollNo);
		callableStatement.setString(2, sName);
		callableStatement.setObject(3, dob);
		callableStatement.setFloat(4, percentage);
		callableStatement.setString(5, city);
		callableStatement.setString(6, email_id);
		callableStatement.setString(7, phone_no);
		callableStatement.execute();
		System.out.println("Inserted succesfully");
	}
	
	public void displayStudent() throws SQLException {
		preparedStatement = con.prepareStatement("select * from StudentR");
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getDate(3)+"\t");
			System.out.print(rs.getFloat(4)+"\t");
			System.out.print(rs.getString(5)+"\t");
			System.out.print(rs.getString(6)+"\t");
			System.out.print(rs.getString(7));
		}
	}
	
	public void displayStudentByCity(String City) throws SQLException {
		preparedStatement = con.prepareStatement("Select * from StudentR where city = ?");
		preparedStatement.setString(1, City);
		rs= preparedStatement.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getDate(3)+"\t");
			System.out.print(rs.getFloat(4)+"\t");
			System.out.print(rs.getString(5)+"\t");
			System.out.print(rs.getString(6)+"\t");
			System.out.print(rs.getString(7));
		}
	}
	
	public void updateStudent(int rollNo , String sName,LocalDate dob,float percentage,String city,String email_id,String phone_no) throws SQLException {
		preparedStatement = con.prepareStatement("update StudentR set sname = ? ,dob=?,percentage=?,city=?,email_id=?,phone_no=? where rollno=?");
		preparedStatement.setString(1,sName);
		preparedStatement.setObject(2,dob);
		preparedStatement.setFloat(3,percentage);
		preparedStatement.setString(4,city);
		preparedStatement.setString(5,email_id);
		preparedStatement.setString(6,phone_no);
		preparedStatement.setInt(7,rollNo);
		int n =preparedStatement.executeUpdate();
		System.out.println(n+" records updated successfully");
	}
	
	public void deleteStudent(int rollNo) throws SQLException {
		preparedStatement = con.prepareStatement("delete from StudentR where rollno=?");
		preparedStatement.setInt(1, rollNo);
		int n = preparedStatement.executeUpdate();
		System.out.println(n+" record deleted.");
	}
	
	public void searchStudentByPercentage(float minPercentage,float maxPercentage) throws SQLException {
		preparedStatement = con.prepareStatement("select * from StudentR where percentage between ? and ?");
		preparedStatement.setFloat(1, minPercentage);
		preparedStatement.setFloat(2, maxPercentage);
		rs = preparedStatement.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getDate(3)+"\t");
			System.out.print(rs.getFloat(4)+"\t");
			System.out.print(rs.getString(5)+"\t");
			System.out.print(rs.getString(6)+"\t");
			System.out.print(rs.getString(7));
		}
		
	}
	
	public void topper() throws SQLException {
		preparedStatement = con.prepareStatement("select * from StudentR where percentage=(select max(percentage)from StudentR)");
		rs = preparedStatement.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getDate(3)+"\t");
			System.out.print(rs.getFloat(4)+"\t");
			System.out.print(rs.getString(5)+"\t");
			System.out.print(rs.getString(6)+"\t");
			System.out.print(rs.getString(7));
		}
	}
	
	public void serachStudentById(int rollNo) throws SQLException 
	{
		preparedStatement = con.prepareStatement("select * from StudentR where rollno=?");
		preparedStatement.setInt(1, rollNo);
		rs = preparedStatement.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getDate(3)+"\t");
			System.out.print(rs.getFloat(4)+"\t");
			System.out.print(rs.getString(5)+"\t");
			System.out.print(rs.getString(6)+"\t");
			System.out.print(rs.getString(7));
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		StudentManagementSystem obj = new StudentManagementSystem();
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("1.add Student record\r\n"
				+ "2.View all Student details\r\n"
				+ "3.View Student by city name\r\n"
				+ "4.update student details by rollno\r\n"
				+ "5.delete student by rollno\r\n"
				+ "6.Search Student on the basis of Percentage\r\n"
				+ "7.display details of 1st Ranker\r\n"
				+ "8.search student details by id\r\n");
		int ch = sc.nextInt();
		
		switch(ch) {
			
		case 1:
			 	obj.insertStudent(101, "Ramesh", LocalDate.parse("2001-2-4"), 67.77f,"Mumbai","ramesh123@mail.com","986886868");
			 	break;
			 	
		  }
	   }	
	}
 }














