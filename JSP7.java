//login.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Test.jsp">
<label for="name">Enter name:</label><br>
<input type="text" name="name"><br><br>
<button type="submit">Submit</button>
</form>
</body>
</html>


//Test.jsp
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
String username=request.getParameter("name");
%>
<jsp:include page="login.jsp">
<jsp:param value="<%=username %>" name="tittle"/>
</jsp:include>
</body>
</html>


//login.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello! ${param.tittle}</h1>
</body>
</html>