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
