//Servlet2.java
package pack2;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	ServletConfig config=null;
	public void init(ServletConfig config)
	{
		this.config=config;
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		String uname=request.getParameter("email");
		String upass=request.getParameter("password");
		if(uname.equals("kajal") && upass.equals("1234"))
		{
			out.println("<h1>Welcome!!!"+uname+"</h1>");
		}
		else
		{
			out.println("<h1>Login fail!!!</h1>");
		}
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

