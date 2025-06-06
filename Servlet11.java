//HttpSession

//login.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="first" method="get">
<label for="name"><b>Username:</b></label><br>
<input type="text" name="name"> <br><br>
<label for="pass"><b>Password:</b></label><br>
<input type="password" name="pass"> 
<br><br>
<button type="submit">Login</button><br><br><br>
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
import javax.servlet.http.HttpSession;

public class Test extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		String name=request.getParameter("name");	
		String pass=request.getParameter("pass");	
		out.print("Username:"+name);
		out.print("Password:"+pass);
		out.print("<a href='Test2'>Click</a>");
		
		HttpSession session=request.getSession();
		session.setAttribute("uname", name);
		session.setAttribute("upass", pass);
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
import javax.servlet.http.HttpSession;

//Annotation
//@WebServlet("/Test2");
public class Test2 extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		HttpSession session=request.getSession();
		String n=(String) session.getAttribute("uname");
		String p=(String) session.getAttribute("upass");
		out.print("Your Username:"+n);
		out.print("Your Password:"+p);
		out.print("</body></html>");
		
	}

}
