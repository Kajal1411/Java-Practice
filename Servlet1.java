//Servlet1.java
package pack1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
public class Servlet1 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	ServletConfig config=null;
	public void init(ServletConfig config)
	{
		this.config=config;
	}
	
	public void service(ServletRequest req,ServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html><body>");  
		out.print("<b>Hello, this is first Servlet");
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


//Demo.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello</h1>
<a href="firstServlet">Click</a>
</body>
</html>


//web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>DynamicProjFirstProg</display-name>
  <welcome-file-list>
    <welcome-file>index.html</welcome-file>
    <welcome-file>index.htm</welcome-file>
    <welcome-file>index.jsp</welcome-file>
    <welcome-file>default.html</welcome-file>
    <welcome-file>default.htm</welcome-file>
    <welcome-file>default.jsp</welcome-file>
  </welcome-file-list>
  <servlet>
    <servlet-name>firstServlet</servlet-name>
    <servlet-class>pack1.Servlet1</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>firstServlet</servlet-name>
    <url-pattern>/firstServlet</url-pattern>
  </servlet-mapping>
</web-app>

