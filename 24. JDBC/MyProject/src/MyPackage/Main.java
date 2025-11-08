package MyPackage;
import java.sql.*;

public class Main {

	public static void main(String[] args)
	{
		/*Define Connection URL*/
		String url = "jdbc:mysql://localhost:3306/PersonInfo";
		String userName = "root";
		String password = "MySQL@321.!";
		String sql = "SELECT * FROM Person";
		
		try
		{
			/*Establish Connection*/
			Connection conn = DriverManager.getConnection(url, userName, password);
			
			/*Create Statement*/
			Statement stmt = conn.createStatement();
			
			/*Execute Query*/
			ResultSet rs = stmt.executeQuery(sql);
			
			/*Process Result*/
			while(rs.next())
			{
				String name = rs.getString("name");
				String add = rs.getString("address");
				String pNum = rs.getString("phoneNum");
				
				System.out.println(name + " " + add + " " + pNum);
			}
			
			/*Close Connection*/
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
