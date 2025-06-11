//index.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Test">
<label for="name"><b>Username:</b></label><br>
<input type="text" name="name"> <br><br>
<label for="password"><b>Password:</b></label><br>
<input type="password" name="password"> 
<br><br>
<button type="submit">Login</button><br><br><br>
</form>
</body>
</html>

//Test.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Test extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,  HttpServletResponse response) throws IOException  
	{
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
      
        String name=request.getParameter("name");  
        out.print("Welcome "+name);  
          
        HttpSession session=request.getSession();  
        session.setAttribute("name",name);  
          
      //retrieving data from ServletContext object  
        ServletContext context=getServletContext();  
        int totalusers=(Integer)context.getAttribute("totalusers");  
        int currentusers=(Integer)context.getAttribute("currentusers");  
        out.print("<br>total users= "+totalusers);  
        out.print("<br>current users= "+currentusers);  
        out.print("<br><a href='Logout'>logout</a>");  
	}

}


//Event.java
package myPack;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class Event implements HttpSessionListener{
    
    ServletContext context=null;  
    static int total=0,current=0;  
      
    public void sessionCreated(HttpSessionEvent e) {  
    total++;  
    current++;  
      
    context=e.getSession().getServletContext();  
    context.setAttribute("totalusers", total);  
    context.setAttribute("currentusers", current);  
      
    }  
  
    public void sessionDestroyed(HttpSessionEvent e) {  
        current--;  
        context.setAttribute("currentusers",current);  
    }  

}


//logout.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout extends HttpServlet {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request,  HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
      
        HttpSession session=request.getSession(false);  
        session.invalidate();//invalidating session  
          
        out.print("You are successfully logged out");   
        
        RequestDispatcher rd=request.getRequestDispatcher("/index.html");
		rd.include(request, response);
	}
}


//web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>DynamicProjHttpSessionEvent2</display-name>
  <welcome-file-list>
    <welcome-file>index.html</welcome-file>
    <welcome-file>index.htm</welcome-file>
    <welcome-file>index.jsp</welcome-file>
    <welcome-file>default.html</welcome-file>
    <welcome-file>default.htm</welcome-file>
    <welcome-file>default.jsp</welcome-file>
  </welcome-file-list>
  
  <servlet>
  <servlet-name>Test</servlet-name>
  <servlet-class>myPack.Test</servlet-class>
  </servlet>
  
  <servlet-mapping>
   <servlet-name>Test</servlet-name>
   <url-pattern>/Test</url-pattern>
  </servlet-mapping>
  
  
  <servlet>
  <servlet-name>Logout</servlet-name>
  <servlet-class>myPack.Logout</servlet-class>
  </servlet>
  
  <servlet-mapping>
   <servlet-name>Logout</servlet-name>
   <url-pattern>/Logout</url-pattern>
  </servlet-mapping>
  
   <listener>
        <listener-class>myPack.Event</listener-class>
    </listener>
    
</web-app>