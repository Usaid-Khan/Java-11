package Meta_Data;

import java.sql.*;

public class Meta_Data {

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
			PreparedStatement pStmt = con.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int numCols = rsmd.getColumnCount();
			
			System.out.println("Number of Columns: " + numCols);
			
			String cName;
			for(int i=1; i<=numCols; i++)
			{
				cName = rsmd.getColumnName(i);
				System.out.print(cName + "\t");
			}
			System.out.println();
			
			String id, name, add, ph;
			while(rs.next())
			{
				id = rs.getString(1);
				name = rs.getString(2);
				add = rs.getString(3);
				ph = rs.getString(4);
				
				System.out.println(id + "\t" + name + "\t" + add + "\t" + ph);
			}
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
