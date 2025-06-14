//sendRedirect() method

//Demo.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="first">
<label for="data">Type something which want to search:</label>
<input type="text" name="data">
<button type="submit">Search</button>
</form>
</body>
</html>

//Test.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet{
	private static final long serialVersionUID = 1L;
	ServletConfig config=null;
	public void init(ServletConfig config)
	{
		this.config=config;
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		String data=request.getParameter("data");
		response.sendRedirect("https://www."+data+".com");		
		out.print("</body></html>");
	}
	
	public void destroy()
	{
		System.out.println("Servlet is destroyed");
	}
	

}


//web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>DynamicProjSendRedirect</display-name>
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
    <servlet-class>myPack.Test</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>first</servlet-name>
    <url-pattern>/first</url-pattern>
  </servlet-mapping>
  
</web-app>