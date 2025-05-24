//Servlet2.java
package pack2;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
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
		String uname=request.getParameter("email");
		String upass=request.getParameter("password");
		if(uname.equals("kajal") && upass.equals("1234"))
		{
			out.println("<h1>Welcome!!!"+uname+"</h1>");
		}
		else
		{
			out.println("<h1>Login fail!!!</h1>");
		}
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

//Login.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="SecondServlet">
<label for="email"><b>Email:</b></label><br>
<input type="text" name="email" id="email" placeholder="Enter your email"> <br><br>
<label for="password"><b>Password:</b></label><br>
<input type="text" name="password" id="password" placeholder="Enter your Password"> 
<br><br>
<button type="submit">Login</button><br><br><br>
</form>
</body>
</html>

//web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>DynamicProjLogin</display-name>
  <welcome-file-list>
    <welcome-file>index.html</welcome-file>
    <welcome-file>index.htm</welcome-file>
    <welcome-file>index.jsp</welcome-file>
    <welcome-file>default.html</welcome-file>
    <welcome-file>default.htm</welcome-file>
    <welcome-file>default.jsp</welcome-file>
  </welcome-file-list>
  <servlet>
    <servlet-name>SecondServlet</servlet-name>
    <servlet-class>pack2.Servlet2</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>SecondServlet</servlet-name>
    <url-pattern>/SecondServlet</url-pattern>
  </servlet-mapping>
</web-app>