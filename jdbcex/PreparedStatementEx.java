package jdbcex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementEx {

	Connection con;
	PreparedStatement pstStatement;
	ResultSet rSet;
	
	public PreparedStatementEx() throws ClassNotFoundException, SQLException {
		con = MyConnection.getMyConnection();
		System.out.println("Connection get open");
	}

	public void getData(float minSalary,float maxSalary) throws SQLException {
		pstStatement = con.prepareStatement("select * from employee where salary between ? and ? ");
		pstStatement.setFloat(1, minSalary);
		pstStatement.setFloat(2, maxSalary);
		rSet = pstStatement.executeQuery();
		while(rSet.next()) {
			System.out.print(rSet.getInt(1)+"\t");
			System.out.print(rSet.getString(2)+"\t");
			System.out.print(rSet.getDate(3)+"\t");
			System.out.print(rSet.getFloat(4)+"\t");
			System.out.print(rSet.getString(5));
			System.out.println();
		}
	}

	public void insertRecord(int custId,String custName,String address,String phone_no) throws SQLException {
		pstStatement = con.prepareStatement("insert into customer values(?,?,?,?)");
		pstStatement.setInt(1, custId);
		pstStatement.setString(2, custName);
		pstStatement.setString(3, address);
		pstStatement.setString(4, phone_no);
		int n = pstStatement.executeUpdate();
		System.out.println(n+"record is inserted");
	}

	public void updateRecord(String phone_no,int custId) throws SQLException {
		pstStatement = con.prepareStatement("update customer set phone_no=? where cust_id = ?");
		pstStatement.setString(1, phone_no);
		pstStatement.setInt(2, custId);
		int n = pstStatement.executeUpdate();
		System.out.println(n+"record is updated");
	}
	
	public void deleteRecord(int eId) throws SQLException {
		pstStatement = con.prepareStatement("delete from emp where eid = ?");
		pstStatement.setInt(1, eId);
		int n = pstStatement.executeUpdate();
		System.out.println(n+"record is deleted");
	}

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		PreparedStatementEx p1 = new PreparedStatementEx();
		p1.getData(10000, 50000);
		//p1.insertRecord(106,"Rohan", "Mumbai", "9988557799");
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter new Phone_no & customer id to update");
		String a = sc1.nextLine();
		int b = sc.nextInt();
		p1.updateRecord(a, b);
		
		System.out.println("Enter employee id to delete record");
		int c = sc.nextInt();
		p1.deleteRecord(c);
		sc.close();
		sc1.close();
	}
}
