import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PersonDAO {
	public PersonInfo searchPerson(String sName)
	{
		PersonInfo person = null;
		
		try
		{
			String url = "jdbc:mysql://localhost:3306/PersonInfo";
			String usr = "root";
			String pwd = "MySQL@321.!";
			String sql = "SELECT * FROM Person WHERE name = ?";
			String sqlUSE = "USE PersonInfo";
			
			Connection con = DriverManager.getConnection(url, usr, pwd);
			Statement stmt = con.createStatement();
			stmt.execute(sqlUSE);
			
			PreparedStatement pStmt = con.prepareStatement(sql);
			
			pStmt.setString(1, sName);
			
			ResultSet rs = pStmt.executeQuery();
			
			if(rs.next())
			{
				String name = rs.getString("name");
				String add = rs.getString("address");
				String pNum = rs.getString("phoneNum");
				
				person = new PersonInfo(name, add, pNum);
			}
			
			stmt.close();
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		return person;
	}
}
