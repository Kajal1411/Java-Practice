//HiddenFormField

//login.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="first" method="get">
<lable for="name">Enter your name:</lable>
<input type="text" name="name"><br><br>
<button type="submit">Submit</button>
</form>
</body>
</html>


//Test1.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test1 extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		out.print("<html><body>");
		out.print("Wecome"+name+"<br>");
		
		//Creating form that have invisible text field
		
		out.print("<form action='Test2'>");
		out.print("<input type='hidden' name='name' value="+name+">");
		out.print("<button type='submit'>Submit</button>");
		out.print("</form>");
		
		
		out.print("</body></html>");	
	}


}


//Test2.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test2 extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//getting value from hidden field
		String name=request.getParameter("name");
		out.print("<html><body>");
		out.print("Hello"+name);
		out.print("</body></html>");	
	}

}


//Web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>DynamicProjHiddenFormField</display-name>
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