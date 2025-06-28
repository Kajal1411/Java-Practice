//Test1.java
package myPack;
import java.io.Serializable;
public class Test1 implements Serializable {
    private static final long serialVersionUID = 1L;
    private String uname, upass;
    public Test1() {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }
}


//Test2.java
package myPack;
import java.io.Serializable;
public class Test2 implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name, pass;

    public Test2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}


//Registration.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DataStore.jsp">
<label for="firstname">First Name:</label><br>
<input type="text" name="firstname"><br><br>
<label for="lastname">Last name:</label><br>
<input type="text" name="lastname"><br><br>
<label for="mob">Mobile:</label><br>
<input type="text" name="mob"><br><br>
<label for="uname">UserName:</label><br>
<input type="text" name="uname"><br><br>
<label for="upass">Password:</label><br>
<input type="text" name="upass"><br><br>
<button type="submit">Submit</button>
</form>
</body>
</html>


//login.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="loginProcess.jsp">
<label for="uname">UserName:</label><br>
<input type="text" name="name"><br><br>
<label for="upass">Password:</label><br>
<input type="text" name="pass"><br><br>
<button type="submit">Submit</button>
</form>
</body>
</html>


//loginProcess.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="myPack.Test2" %>
<%@ page import="java.sql.*" %>

<jsp:useBean id="t2" class="myPack.Test2" scope="session" />
<jsp:setProperty property="*" name="t2" />

<%
String name=t2.getName();
String pass=t2.getPass();

try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
	PreparedStatement ps = con.prepareStatement("SELECT * FROM login WHERE username = ? AND password = ?");
    ps.setString(1, name);
    ps.setString(2, pass);
    ResultSet rs = ps.executeQuery();

    if(rs.next())
    {
        response.sendRedirect("profile.jsp"); // valid login
    }   
    else
    {
    	out.print("Invalid username or password!!! Try again!!!");
    	out.print("<br><br>");
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


//DataStore.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="myPack.Test1" %>
<%@ page import="java.sql.*" %>

<jsp:useBean id="t1" class="myPack.Test1" scope="session" />
<jsp:setProperty property="*" name="t1" />

<% 

String uname=t1.getUname();
String upass=t1.getUpass();

try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
	PreparedStatement pst=con.prepareStatement("insert into login values(?,?)");
	pst.setString(1,uname);
	pst.setString(2,upass);
	pst.executeUpdate();
	con.close();
}
catch(Exception e)
{
	System.out.println(e);
}

response.sendRedirect("login.html");

%>
</body>
</html>