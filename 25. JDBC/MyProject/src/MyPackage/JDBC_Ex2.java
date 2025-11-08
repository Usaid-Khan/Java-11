package MyPackage;

import java.sql.*;

public class JDBC_Ex2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/PersonInfo";
		String usr = "root";
		String pwd = "MySQL@321.!";
		String sql = "UPDATE Person SET address = ? WHERE name = ?";
		
		try
		{
			/*Establish Connection*/
			Connection con = DriverManager.getConnection(url, usr, pwd);
			
			/*Creating PreparedStatement*/
			PreparedStatement pStmt = con.prepareStatement(sql);
			
			/*Executing Query*/
			String addVar = args[0];
			String nameVar = args[1];
			
			pStmt.setString(1, addVar);
			pStmt.setString(2, nameVar);
			
			int num = pStmt.executeUpdate();
			System.out.println(num + " record updated.");
			
			/*Closing Connection*/
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
