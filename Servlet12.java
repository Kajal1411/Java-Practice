//Cookies

//login.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="first" method="get">
<label for="name"><b>Username:</b></label><br>
<input type="text" name="name"> <br><br>
<label for="pass"><b>Password:</b></label><br>
<input type="password" name="pass"> 
<br><br>
<button type="submit">Login</button><br><br><br>
</form>
</body>
</html>

//Test1.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test1 extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		String name=request.getParameter("name");	
		String pass=request.getParameter("pass");	
		out.print("Username:"+name);
		out.print("Password:"+pass);
		out.print("<a href='Test2'>Click</a>");
		
		Cookie ck=new Cookie("uname",name);
		response.addCookie(ck);
		ck=new Cookie("upass",pass);
		response.addCookie(ck);
		
		out.print("</body></html>");
		
	}

}

//Test2.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test2 extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		
		Cookie ck[]=request.getCookies();
		out.print("Your Username:"+ck[0].getValue());
		out.print("Your Password:"+ck[1].getValue());
		
		out.print("</body></html>");
		
	}

}

//web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>DynamicProjCookie</display-name>
  <welcome-file-list>
    <welcome-file>index.html</welcome-file>
    <welcome-file>index.htm</welcome-file>
    <welcome-file>index.jsp</welcome-file>
    <welcome-file>default.html</welcome-file>
    <welcome-file>default.htm</welcome-file>
    <welcome-file>default.jsp</welcome-file>
  </welcome-file-list>
  
  <servlet>
    <servlet-name>first</servlet-name>
    <servlet-class>myPack.Test1</servlet-class>
  </servlet>
  
  <servlet-mapping>
    <servlet-name>first</servlet-name>
    <url-pattern>/first</url-pattern>
  </servlet-mapping>
  
  
  
   <servlet>
    <servlet-name>second</servlet-name>
    <servlet-class>myPack.Test2</servlet-class>
  </servlet>
  
  <servlet-mapping>
    <servlet-name>second</servlet-name>
    <url-pattern>/Test2</url-pattern>
  </servlet-mapping>
  
</web-app>