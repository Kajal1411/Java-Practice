//index.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:forward page="welcome.jsp">
<jsp:param value="John" name="username"/>
</jsp:forward>

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

<h1>Welcome!!!</h1>

<%
String username=request.getParameter("username");
out.print("Hello "+username);
%>

<h1>Hello ${param.username}</h1>

</body>
</html>