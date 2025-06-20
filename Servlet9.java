//ServletConfig interface

//login.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="first">
<label for="name"><b>Username:</b></label><br>
<input type="text" name="name"> <br><br>
<label for="password"><b>Password:</b></label><br>
<input type="password" name="pass"> 
<br><br>
<button type="submit">Login</button><br><br><br>
</form>
</body>
</html>


//Test.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet{
	private static final long serialVersionUID = 1L;
	ServletConfig config=null;
	String username,password;
	public void init(ServletConfig config)
	{
		this.config=config;
		username=config.getInitParameter("uname");
		password=config.getInitParameter("upass");
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		String name=request.getParameter("name");	
		String pass=request.getParameter("pass");	
		if(name.equals("kajal")&&pass.equals("1234"))
		{
			out.print("Login Successful!!!");
			try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",username,password);
				PreparedStatement pst=con.prepareStatement("insert into login values(?,?)");
				pst.setString(1, name);
				pst.setString(2, pass);
				pst.executeUpdate();
				con.close();
			}
			catch(Exception e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			out.print("Login fail!!!");
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
}


//web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>DynamicProjServletConfig</display-name>
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
    
    <init-param>
    <param-name>uname</param-name>
    <param-value>hr</param-value>
    </init-param>
    
    <init-param>
    <param-name>upass</param-name>
    <param-value>pass</param-value>
    </init-param>
    
  </servlet>
  
  <servlet-mapping>
    <servlet-name>first</servlet-name>
    <url-pattern>/first</url-pattern>
  </servlet-mapping>
  
</web-app>