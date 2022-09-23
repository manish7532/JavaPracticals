package jdbcex;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStatementEx {

	Connection connection;
	CallableStatement cStatement;
	
	public CallableStatementEx() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("Conncetion get open");
	}
	
	public void callingProcedure(int id , String userName) throws SQLException {
		cStatement = connection.prepareCall("{call insertRecord(?,?)}");
		cStatement.setInt(1, id);
		cStatement.setString(2, userName);
		cStatement.execute();
		System.out.println("Inserted succesfully");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
		CallableStatementEx c1 = new CallableStatementEx();
		c1.callingProcedure(101, "nupur");

	}

}
