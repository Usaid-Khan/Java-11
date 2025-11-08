<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String url = "jdbc:mysql://localhost:3306/PersonInfo";	
		String username = "root";
		String pwd = "MySQL@321.1";
		String sql = "SELECT * FROM Person WHERE name=ali";
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url, username, pwd);
	    Statement stmt = con.createStatement();
	    
	    ResultSet rs = stmt.executeQuery(sql);
	    rs.next();
	%>
	
	ID: <%= rs.getString(1) %>
	Name: <%= rs.getString(2) %>
	Address: <%= rs.getString(3) %>
	Phone no. <%= rs.getString(4) %>
</body>
</html>