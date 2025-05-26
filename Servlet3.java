//Add.html 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DisplayAddition">
<lable for="num1">Enter first number:</lable>
<input type="number" name="num1"> 
<lable for="num2">Enter second number:</lable>
<input type="number" name="num2">
<button type="submit">Add</button>
</form>
</body>
</html>

//Addition.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addition extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ServletConfig config=null;
	public void init(ServletConfig config)
	{
		this.config=config;
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		String n1=request.getParameter("num1");  //getParameter() used to get data from html page
		String n2=request.getParameter("num2");
		int a=Integer.parseInt(n1);
		int b=Integer.parseInt(n2);
		int c=a+b;
		out.print("<h1>Sum:"+c+"</h1>");
		out.print("</body></html>");
	}
	
	public void destroy()
	{
		System.out.println("Servlet is destroyed");
	}
	
	public ServletConfig getServletConfig()
	{
		return config;		
	}
	
	public String getServletInfo()
	{
		return null;
		
	}

}


//web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>DynamicProjAddition</display-name>
  <welcome-file-list>
    <welcome-file>index.html</welcome-file>
    <welcome-file>index.htm</welcome-file>
    <welcome-file>index.jsp</welcome-file>
    <welcome-file>default.html</welcome-file>
    <welcome-file>default.htm</welcome-file>
    <welcome-file>default.jsp</welcome-file>
  </welcome-file-list>

<servlet>
  <servlet-name>DisplayAddition</servlet-name>
  <servlet-class>myPack.Addition</servlet-class>
  </servlet>
  
  <servlet-mapping>
   <servlet-name>DisplayAddition</servlet-name>
   <url-pattern>/DisplayAddition</url-pattern>
   </servlet-mapping>
</web-app>