//Servlet1.java
package pack1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
public class Servlet1 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	ServletConfig config=null;
	public void init(ServletConfig config)
	{
		this.config=config;
	}
	
	public void service(ServletRequest req,ServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html><body>");  
		out.print("<b>Hello, this is first Servlet");
		out.print("</body></html>");
	}
	
	public void destroy()
	{
		System.out.println("Servlet is destroyed");
	}
	
	public ServletConfig getServletConfig()
	{
		return config;		
	}
	
	public String getServletInfo()
	{
		return null;
		
	}
}



//Demo.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello</h1>
<a href="firstServlet">Click</a>
</body>
</html>