//URLRewritting

//login.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="first" method="get">
<lable fot="name">Enter your name:</lable>
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
		//Appending name in query String
		out.print("<a href='Test2?name="+name+"'>AboutUs</a>");
		out.print("</body></html>");	
	}

}