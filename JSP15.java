//login.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form</title>
</head>
<body>
<form action="BeanClass.jsp" method="get">
    <label for="name"><b>Name:</b></label><br>
    <input type="text" name="name" required><br><br>

    <label for="email"><b>Email:</b></label><br>
    <input type="email" name="email" required><br><br>

    <button type="submit">Submit</button>
</form>
</body>
</html>


//Test.java
package myPack;
import java.io.Serializable;
public class Test implements Serializable
 {

	private static final long serialVersionUID = 1L;

    private String name;
    private String email;

    public Test() 
    {
    	
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }
}


//get.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>User Details:</h2>
Name:      <jsp:getProperty property="name" name="u" /></p>
Email:     <jsp:getProperty property="email" name="u" /></p>
</body>
</html>


//BeanClass.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="u" class="myPack.Test" scope="page" />
<jsp:setProperty property="*" name="u" />
Name: ${u.name}
Email: ${u.email}
</body>
</html>