package Result_Set;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Result_Set3 {

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
			
			//Moving cursor to insert row buffer
			rs.moveToInsertRow();
			
			//Updating the values into the insert row
			rs.updateString("id", "1");
			rs.updateString("name", "ali");
			rs.updateString("address", "model town");
			rs.updateString("phoneNum", "9203256");
			
			//Inserting row into result set & database
			rs.insertRow();
			
			/******************************************************/
			
			//Moving cursor to insert row buffer
			rs.moveToInsertRow();
			
			//Updating the values into the insert row
			rs.updateString("id", "2");
			rs.updateString("name", "usman");
			rs.updateString("address", "gulberg");
			rs.updateString("phoneNum", "8219065");
			
			//Inserting row into result set & database
			rs.insertRow();
			
			/*****************************************************/
			
			//Moving cursor to insert row buffer
			rs.moveToInsertRow();
			
			//Updating the values into the insert row
			rs.updateString("id", "3");
			rs.updateString("name", "raza");
			rs.updateString("address", "defence");
			rs.updateString("phoneNum", "5173946");
			
			//Inserting row into result set & database
			rs.insertRow();
			
			/*****************************************************/
			
			//Printing the result set
			while(rs.next())
			{
				String name = rs.getString("name");
				String add = rs.getString("address");
				String pNum = rs.getString("phoneNum");
				
				System.out.println(name + " " + add + " " + pNum);
			}
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
