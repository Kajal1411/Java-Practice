//index.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Input Form</title>
</head>
<body>
    <form action="CustomException.jsp">
        <label for="name">Name:</label><br>
        <input type="text" name="name"><br><br>
        <button type="submit">Submit</button>
    </form> 
</body>
</html>


//CustomException.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Custom Exception</title>
</head>
<body>
<%@ page errorPage="error.jsp" %>
<%!
    class InvalidNameException extends RuntimeException {
        InvalidNameException(String message) {
            super(message);
        }
    }
%>
<%
    String name = request.getParameter("name");

    if (name.equals("kajal")) 
    {
        out.print("Success!!!");
    } 
    else 
    {
        throw new InvalidNameException("Name is not valid");
    }
%>
</body>
</html>


//error.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Error Page</title>
</head>
<body>
<%@ page isErrorPage="true" %>
<h3>Sorry, an Exception occurred!</h3>
<p>Exception is: <%= exception %></p>
</body>
</html>