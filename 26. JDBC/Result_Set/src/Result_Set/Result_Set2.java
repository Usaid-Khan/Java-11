package Result_Set;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Result_Set2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/PersonInfo";
		String usr = "root";
		String pwd = "MySQL@321.!";
		String sql = "SELECT * FROM Person";
		
		try
		{
			Connection con = DriverManager.getConnection(url, usr, pwd);
			PreparedStatement pStmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = pStmt.executeQuery();
			
			rs.absolute(2);
			
			//Updating address column of 2nd row in result set
			rs.updateString("address", "model town");
			
			//Updating the row in database
			rs.updateRow();
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
