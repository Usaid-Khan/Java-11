package MyPackage;
import java.sql.*;

public class JDBC_Ex {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*Define Connection URL*/
		String url = "jdbc:mysql://localhost:3306/PersonInfo";
		String userName = "root";
		String password = "MySQL@321.!";
		
		try
		{
			/*Establish Connection*/
			Connection conn = DriverManager.getConnection(url, userName, password);
			
			/*Create Statement*/
			Statement stmt = conn.createStatement();
			
			/*Execute Query*/
			String addVar = args[0];
			String nameVar = args[1];
			
			String sql = "UPDATE Person " +
		                 "SET address = '" + addVar + "' " +
					     "WHERE name = '" + nameVar + "' ";
			
			int num = stmt.executeUpdate(sql);
			System.out.println(num + " Records updated.");
			
			/*Close Connection*/
			conn.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
