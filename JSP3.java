//Login.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="first.jsp">
<label for="name"><b>Name:</b></label><br>
<input type="text" name="name"> <br><br>
<label for="pass"><b>Password:</b></label><br>
<input type="text" name="pass"> <br><br>
<button type="submit">Login</button><br><br><br>
</form>
</body>
</html>


//first.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="java.sql.*" %> 
<%
String name=request.getParameter("name");  
String pass=request.getParameter("pass");
%>

<%
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
PreparedStatement pst=con.prepareStatement("insert into login values(?,?)");
pst.setString(1,name);
pst.setString(2, pass);
pst.executeUpdate();
if(name.equals("aaa"))
{
	session.setAttribute("name",name);
	response.sendRedirect("welcome.jsp");
}
else
{
	out.print("Invalid username or password!!!");
	
%>

<%@ include file="login.html" %>

<% 
}
con.close();
}

catch(Exception e)
{
System.out.println(e);
}
%>

</body>
</html>



//welcome.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String name=(String) session.getAttribute("name");

if(name!=null)
{
	out.print("Welcome "+name);
}
else
{
   response.sendRedirect("Login.html");
}
%>

</body>
</html>