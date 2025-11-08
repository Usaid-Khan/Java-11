package Result_Set;

import java.sql.*;

public class Result_Set {

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
			
			rs.next();
			System.out.println("Moving cursor forward");
			String name = rs.getString("name");
			System.out.println(name + "\n");
			
			rs.next();
			System.out.println("Moving cursor again forward");	
			name = rs.getString("name");
			System.out.println(name + "\n");
			
			rs.previous();
			System.out.println("Moving cursor backward");
			name = rs.getString("name");
			System.out.println(name + "\n");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
