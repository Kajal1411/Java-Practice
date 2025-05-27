//index.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registrationServlet">
<label for="name"><b>Name:</b></label><br>
<input type="text" name="name"> <br><br>
    
<label for="email"><b>Email:</b></label><br>
<input type="email" name="email"> <br><br>

<label for="mob"><b>Mobile No.:</b></label><br>
<input type="number" name="mob"> <br><br>
               
<label for="address"><b>Address:</label><br>
<input type="text" name="address"> <br><br>
                
<label for="password"><b>Password:</b></label><br>
<input type="password" name="password">  <br><br>
               
<button type="submit">Register</button>
</form>
</body>
</html>


//Registration.java
package myPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Registration extends HttpServlet{
ServletConfig config=null;
public void init(ServletConfig config)
{
	this.config=config;
}
public void service(ServletRequest request,ServletResponse response) throws IOException
{
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String mob=request.getParameter("mob");
	String address=request.getParameter("address");
	String password=request.getParameter("password");
	
	out.print("<html><body>");
	
	Pattern p1=Pattern.compile("[A-Za-z]{8,20}");
	Matcher m1=p1.matcher(name);
	boolean b1=m1.matches();
	if(b1==false)
	{
		out.print("Please enter valid name!");
	}
	
	Pattern p2=Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
	Matcher m2=p2.matcher(email);
	boolean b2=m2.matches();
	if(b2==false)
	{
		out.print("Please enter valid email!");
	}
	
	Pattern p3=Pattern.compile("[789][0-9]{9}");
	Matcher m3=p3.matcher(mob);
	boolean b3=m3.matches();
	if(b3==false)
	{
		out.print("Please enter valid Mobile number!");
	}
	
	Pattern p4=Pattern.compile("(?=.*[@#$])(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{6,8}");
	Matcher m4=p4.matcher(password);
	boolean b4=m4.matches();
	if(b4==false)
	{
		out.print("Please enter valid Password!");
	}
	
	if(b1==true && b2==true && b3==true &&b4==true)
	{
		out.print("Registration Successful!!!");
	}
	out.print("</html></body>");
	
}

public void destroy()
{
	System.out.println("Servlet is destroy");
}
}
