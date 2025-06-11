//index.html

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ActiveUserCount">
<label for="name"><b>Username:</b></label><br>
<input type="text" name="name"> <br><br>
<label for="password"><b>Password:</b></label><br>
<input type="password" name="password"> 
<br><br>
<button type="submit">Login</button><br><br><br>
</form>
</body>
</html>


//index.jsp
package myPack;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyListnerCount implements  HttpSessionListener{
	
	private static int activeUsers=0;
	
	public void sessionCreated(HttpSessionEvent e)
	{
		activeUsers++;
		System.out.println("Session created. Active Users:"+activeUsers);
	}
	
	public void sessionDestroyed(HttpSessionEvent e)
	{
		activeUsers--;
		System.out.println("Session destroyed. Active Users:"+activeUsers);
	}
	
	public static int getActiveUsers()
	{
		return activeUsers;
	}

}


//ActiveUserCount.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ActiveUserCount extends HttpServlet{
	
	private Object activeUsers;

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		String name=request.getParameter("name");
		out.print("Welcome "+name);
		out.print("</body></html>");
		
		HttpSession session=request.getSession();
		session.setAttribute("name", name);
		
		int activeUsers=MyListnerCount.getActiveUsers();
		request.setAttribute("activeUsers", activeUsers);
		RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
		rd.include(request, response);
	}

}
