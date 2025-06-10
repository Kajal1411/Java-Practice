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
