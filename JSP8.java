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
<form action="process.jsp">
<label for="num1">Num1:</label><br>
<input type="text" name="num1"><br><br>
<label for="num2">Num2:</label><br>
<input type="text" name="num2"><br><br>
<button type="submit">Submit</button>
</form>
</body>
</html>


//process.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page errorPage="error.jsp" %>
<%
String num1=request.getParameter("num1");
String num2=request.getParameter("num2");
int a=Integer.parseInt(num1);
int b=Integer.parseInt(num2);
int c=a/b;
out.print("Division:"+c);
%>
</body>
</html>


//error.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page isErrorPage="true" %>
<h3>Sorry an Exception occured!!!</h3>
Exception is: <%= exception %>
</body>
</html> 