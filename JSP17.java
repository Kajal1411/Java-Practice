//login.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="welcome.jsp" method="get">
    <label for="name"><b>Name:</b></label><br>
    <input type="text" name="name" required><br><br>

    <label for="email"><b>Email:</b></label><br>
    <input type="email" name="email" required><br><br>

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
String email=request.getParameter("email");
session.setAttribute("name",name);
session.setAttribute("email",email);
%>
Name:   ${sessionScope.name}
Email:  ${sessionScope.email}
</body>
</html>