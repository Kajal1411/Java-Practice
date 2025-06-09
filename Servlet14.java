//HiddenFormField

//login.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="first" method="get">
<lable for="name">Enter your name:</lable>
<input type="text" name="name"><br><br>
<button type="submit">Submit</button>
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

public class Test1 extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		out.print("<html><body>");
		out.print("Wecome"+name+"<br>");
		
		//Creating form that have invisible text field
		
		out.print("<form action='Test2'>");
		out.print("<input type='hidden' name='name' value="+name+">");
		out.print("<button type='submit'>Submit</button>");
		out.print("</form>");
		
		
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

public class Test2 extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//getting value from hidden field
		String name=request.getParameter("name");
		out.print("<html><body>");
		out.print("Hello"+name);
		out.print("</body></html>");	
	}

}
