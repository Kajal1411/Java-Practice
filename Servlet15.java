//ServletContextEvent

//Demo.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="MyServlet" method="get">
<button type="submit">Next</button>
</form>
</body>
</html>

//MyServlet.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		ServletContext context=getServletContext();
		String url=(String) context.getAttribute("url");
		String username=(String) context.getAttribute("username");
		String password=(String) context.getAttribute("password");
		
		System.out.println("Database Connection settings:");
		System.out.println("URL:"+url);
		System.out.println("Username:"+username);
		System.out.println("Password:"+password);
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,username,password);
			Statement st=con.createStatement();			
		    ResultSet RS=st.executeQuery("select * from table1");
		    while(RS.next())
		    {
		    	System.out.println(RS.getInt(1)+" "+RS.getString(2)+" "+RS.getInt(3));
		    	
		    	int data1=RS.getInt(1);
		    	String data2=RS.getString(2);
		    	int data3=RS.getInt(3);
		    	
		    	out.print(data1);
		    	out.print(data2);
		    	out.print(data3);
		    	
		    	out.print("<br><br>");
		    }
		    con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		out.print("</body></html>");
		
	}
}


//MyServletContextListener.java
package myPack;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListner implements ServletContextListener{

	public void  contextInitialized(ServletContextEvent event)
	{
		ServletContext context=event.getServletContext();
		System.out.println("Servlet Context Initialized");
		
		//Performs Initialization task here
		String url=context.getInitParameter("url");
		String username=context.getInitParameter("username");
		String password=context.getInitParameter("password");
		
		//Store DB Connection setting in servletContext
		context.setAttribute("url", url);
		context.setAttribute("username", username);
		context.setAttribute("password", password);
		
	}
	
	public void contextDestroyed(ServletContextEvent event)
	{
		    ServletContext context = event.getServletContext();

	        // Perform cleanup tasks here
	        context.removeAttribute("url");
	        context.removeAttribute("username");
	        context.removeAttribute("password");

	        System.out.println("ServletContext destroyed");
	        System.out.println("Database connection settings cleaned up");
	}
}


//web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>DynamicProjServletEventHandling</display-name>
  <welcome-file-list>
    <welcome-file>index.html</welcome-file>
    <welcome-file>index.htm</welcome-file>
    <welcome-file>index.jsp</welcome-file>
    <welcome-file>default.html</welcome-file>
    <welcome-file>default.htm</welcome-file>
    <welcome-file>default.jsp</welcome-file>
  </welcome-file-list>
  
<servlet>
    <servlet-name>MyServlet</servlet-name>
    <servlet-class>myPack.MyServlet</servlet-class>
</servlet>

<servlet-mapping>
    <servlet-name>MyServlet</servlet-name>
    <url-pattern>/MyServlet</url-pattern>
</servlet-mapping>

      <context-param>
        <param-name>url</param-name>
        <param-value>jdbc:oracle:thin:@localhost:1521:xe</param-value>
    </context-param>

    <context-param>
        <param-name>username</param-name>
        <param-value>hr</param-value>
    </context-param>

    <context-param>
        <param-name>password</param-name>
        <param-value>pass</param-value>
    </context-param>

    <listener>
        <listener-class>myPack.MyServletContextListner</listener-class>
    </listener>
    
</web-app>
