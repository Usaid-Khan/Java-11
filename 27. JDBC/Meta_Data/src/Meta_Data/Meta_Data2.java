package Meta_Data;

import java.sql.*;

public class Meta_Data2 {

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
			DatabaseMetaData dbMetaData = con.getMetaData();
			
			String pName = dbMetaData.getDatabaseProductName();
			System.out.println("Database: " + pName);
			
			String pVer = dbMetaData.getDatabaseProductVersion();
			System.out.println("Version: " + pVer);
			
			String dName = dbMetaData.getDriverName();
			System.out.println("Driver: " + dName);
			
			boolean rOnly = dbMetaData.isReadOnly();
			System.out.println("Read-Only: " + rOnly);
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
