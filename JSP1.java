//index.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="welcome.jsp">
<label for="name">Name:</label>
<input type="text" name="name"><br><br>
<button type="submit">Submit</button>
</form>
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
String name=request.getParameter("name");
out.print("Welcome "+name);
%>
</body>
</html>