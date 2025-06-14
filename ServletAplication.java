//Registration.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="first">
<label for="fn"><b>First Name:</b></label> <br>
<input type="text" name="fn"> <br><br>
<label for="ln"><b>Last Name:</b></label> <br>
<input type="text" name="ln"> <br><br>
<label for="mob"><b>Mobile Number:</b></label> <br>
<input type="number" name="mob"> <br><br>
<label for="uname"><b>UserName:</b></label> <br>
<input type="text" name="uname"> <br><br>
<label for="upass"><b>Password:</b></label> <br>
<input type="password" name="upass"> <br><br>
<button type="submit">Register</button>
</form>
</body>
</html>

//Login.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet{

	/**
	 * 
	 */
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
		
		String firstname=request.getParameter("fn");
		String lastname=request.getParameter("ln");
		String mob=request.getParameter("mob");
		String username=request.getParameter("uname");
		String password=request.getParameter("upass");
		
		Pattern p1=Pattern.compile("[A-Za-z]{2,20}");
		Matcher m1=p1.matcher(firstname);
		boolean b1=m1.matches();
		
		Pattern p2=Pattern.compile("[A-Za-z]{2,20}");
		Matcher m2=p2.matcher(lastname);
		boolean b2=m2.matches();
		
		Pattern p3=Pattern.compile("[789][0-9]{9}");
		Matcher m3=p3.matcher(mob);
		boolean b3=m3.matches();
		
		Pattern p4=Pattern.compile("[A-Za-z0-9]{6,14}");
		Matcher m4=p4.matcher(username);
		boolean b4=m4.matches();
		
		Pattern p5=Pattern.compile("(?=.*[@#$])(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{6,8}");
		Matcher m5=p5.matcher(password);
		boolean b5=m5.matches();
		
		if(b1==false)
		{
			out.print("Please enter valid first name!<br>");
		}
		
		if(b2==false)
		{
			out.print("Please enter valid last name!<br>");
		}
		
		
		if(b3==false)
		{
			out.print("Please enter valid Mobile number!<br>");
		}
		
		
		if(b4==false)
		{
			out.print("Please enter valid Username!<br>");
		}
		
		
		if(b5==false)
		{
			out.print("Please enter valid Password!<br>");
		}
		
		if(b1==false || b2==false || b3==false || b4==false || b5==false)
		{
			RequestDispatcher rd=request.getRequestDispatcher("/Registration.html");
			rd.include(request, response);
		}
		
		out.print("<html><body>");
		
		if(b1==true && b2==true && b3==true && b4==true && b5==true)
		{
			HttpSession session=request.getSession();
			session.setAttribute("firstname", firstname);
			session.setAttribute("lastname",lastname );
			session.setAttribute("mob", mob);
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			
			try 
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
				PreparedStatement pst=con.prepareStatement("insert into servlet (firstname,lastname,mob,username,password) values(?,?,?,?,?)");
				pst.setString(1, firstname);
				pst.setString(2, lastname);
				pst.setString(3, mob);
				pst.setString(4, username);
				pst.setString(5, password);
				pst.executeUpdate();
				con.close();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			out.print("Registration Successful!!!");
			out.print("<br><br>");
			out.print("<form action='Student'>");
			out.print("<lable for='uname'><b>Username:</b></lable><br>");
			out.print("<input type='text' name='uname'><br><br>");
			out.print("<lable for='upass'><b>Password:</b></lable><br>");	
			out.print("<input type='password' name='upass'><br><br>");	
			out.print("<button type='submit'>Login</button>");
			out.print("</form>");
			
		
			
		}
		
		out.print("</body></html>");
	}
	
	
	public void destroy()
	{
		System.out.println("Servlet is destroyed");
	}

}


//Student.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Student extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		
		HttpSession session=request.getSession();
		String firstname=(String) session.getAttribute("firstname");
		String lastname=(String) session.getAttribute("lastname");
		String username=(String) session.getAttribute("username");
		String password=(String) session.getAttribute("password");
		
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		
		
		if(username.equals(uname) && password.equals(upass))
		{
			out.print("Wecome! "+firstname+" "+lastname);
		    out.print("<br><br>");
			out.print("<form action='Marks'>");
		    out.print("<button type='submit'>Enter Marks</button>");
		    out.print("</form>");
	        	
		}
		else
		{
			out.print("Invalid username or password!!! Please try again!!!");
		    out.print("<br><br>");
			out.print("<form action='Student'>");
			out.print("<lable for='uname'><b>Username:</b></lable><br>");
			out.print("<input type='text' name='uname'><br><br>");
			out.print("<lable for='upass'><b>Password:</b></lable><br>");	
			out.print("<input type='password' name='upass'><br><br>");	
			out.print("<button type='submit'>Login</button>");
			out.print("</form>");
		}
		
		
		out.print("</body></html>");
	}

}

//Marks.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Marks extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		
		HttpSession session=request.getSession();
		String firstname=(String) session.getAttribute("firstname");
		String lastname=(String) session.getAttribute("lastname");

		out.print("Wecome! "+firstname+" "+lastname);
	    out.print("<br><br>");
		
		out.print("<form action='Result'>");
		out.print("<lable for='java'><b>Enter marks for Java:</b></lable><br>");
		out.print("<input type='number' name='java'><br><br>");
		out.print("<lable for='cpp'><b>Enter marks for Cpp:</b></lable><br>");
		out.print("<input type='number' name='cpp'><br><br>");
		out.print("<lable for='python'><b>Enter marks for Python:</b></lable><br>");
		out.print("<input type='number' name='python'><br><br>");
		out.print("<lable for='javascript'><b>Enter marks for Javascript:</b></lable><br>");
		out.print("<input type='number' name='javascript'><br><br>");
    	out.print("<button type='submit'>Calculate Percentage</button>");
    	out.print("</form>");
		
		out.print("</body></html>");

	}
}

//Result.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Result extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		
		HttpSession session=request.getSession();
		String firstname=(String) session.getAttribute("firstname");
		String lastname=(String) session.getAttribute("lastname");
		String username=(String) session.getAttribute("username");
		
		out.print("Wecome! "+firstname+" "+lastname);
	    out.print("<br><br>");
		
		String s1=request.getParameter("java");  
		String s2=request.getParameter("cpp");
		String s3=request.getParameter("python");  
		String s4=request.getParameter("javascript");
		
		int java=Integer.parseInt(s1);
		int cpp=Integer.parseInt(s2);
		int python=Integer.parseInt(s3);
		int javascript=Integer.parseInt(s4);
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
			PreparedStatement pst = con.prepareStatement("UPDATE servlet SET java=?, cpp=?, python=?, javascript=? WHERE username=?");
			pst.setInt(1, java);
			pst.setInt(2, cpp);
			pst.setInt(3, python);
			pst.setInt(4, javascript);
			pst.setString(5, username);
			pst.execute();
			
			CallableStatement cs=con.prepareCall("{?=call per(?)}");
			cs.setString(2, username);
			cs.registerOutParameter(1, Types.FLOAT);
			cs.execute();
			out.print("Percentage:"+cs.getFloat(1));
			out.print("<br>");
			if(cs.getFloat(1)>=35)
			{
				out.print("Result:Pass");
				out.print("<br>");
				out.print("You are Eligible for Government Exam");
				out.print("<br>");
				out.print("<br>");
				out.print("<a href='https://www.india.gov.in'><button>Fill the Form</button></a>");
				//out.print("<a href='https://www.india.gov.in'>Fill the Form</a>");
			}
			else
			{
				out.print("Result:Fail");
				out.print("<br>");
				out.print("You are Not Eligible for GovernmentExam!!!");
				out.print("<br>");
				out.print("<br>");
				out.print("<a href='logout.html'><button>Logout</button></a>");
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

//Logout.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>You are Logout!!!</h1>
</body>
</html>

//web.xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>ServletApplication</display-name>
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
    <servlet-class>myPack.Login</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>first</servlet-name>
    <url-pattern>/first</url-pattern>
  </servlet-mapping>
  
  <servlet>
    <servlet-name>Student</servlet-name>
    <servlet-class>myPack.Student</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>Student</servlet-name>
    <url-pattern>/Student</url-pattern>
  </servlet-mapping>
  
  
  <servlet>
    <servlet-name>Marks</servlet-name>
    <servlet-class>myPack.Marks</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>Marks</servlet-name>
    <url-pattern>/Marks</url-pattern>
  </servlet-mapping>
  
  <servlet>
    <servlet-name>Result</servlet-name>
    <servlet-class>myPack.Result</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>Result</servlet-name>
    <url-pattern>/Result</url-pattern>
  </servlet-mapping>
  
</web-app>