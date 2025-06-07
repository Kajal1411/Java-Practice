//Cookies

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

//Servet1.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test1 extends HttpServlet{
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
		
		Cookie ck=new Cookie("uname",name);
		response.addCookie(ck);
		ck=new Cookie("upass",pass);
		response.addCookie(ck);
		
		out.print("</body></html>");
		
	}

}
