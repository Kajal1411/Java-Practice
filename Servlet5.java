//Demo.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="first">
<lable for="uname">Username:</lable>
<input type="text" name="uname">
<lable for="upass">Password:</lable>
<input type="password" name="upass">
<button type="submit">Login</button>
</form>
</body>
</html>


//Test.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet{
	private static final long serialVersionUID = 1L;
	ServletConfig config;
	
	public void init(ServletConfig config)
	{
		this.config=config;
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		if(uname.equals("kajal")&&upass.equals("1234"))
		{
			out.print("Welcone!!!"+uname);
		}
		else
		{
			out.print("Login fail!!!");
		}
		out.print("</body></html>");
	}
	
	public void destroy()
	{
		System.out.println("Servlet destroyed!!!");
	}

}
