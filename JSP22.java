//Test.java
package myPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Test extends TagSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userid;  
    
	public void setUserid(String userid) 
	{  
	    this.userid = userid;  
	}  
	  
	public int doStartTag() throws JspException 
	{  
	    JspWriter out=pageContext.getOut();  
	    	try
	    	{
	    		int count=0;
	    		Class.forName("oracle.jdbc.driver.OracleDriver");
	    		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
	    		PreparedStatement pst = con.prepareStatement("select * from OrderHistory where userid = ?");
	    		pst.setInt(1, Integer.parseInt(userid));
	    		ResultSet RS = pst.executeQuery();

	    		out.print("<br>");
    			out.print("<br>");
    			
	    		out.print("<table border='2px solid black'>");
    			out.print("<fieldset>");
    			out.print("<tr>");
    			out.print("<th>Userid</th>");
    			out.print("<th>Uname</th>");
    			out.print("<th>Upass</th>");
    			out.print("<th>Pid</th>");
    			out.print("<th>Pname</th>");
    			out.print("<th>Price</th>");
    			out.print("</tr>");
    			
	    		while(RS.next())
	    		{
	    			count++;
	    			out.print("<tr>");
	    			out.print("<td>"+RS.getInt(1)+"</td>");
	    			out.print("<td>"+RS.getString(2)+"</td>");
	    			out.print("<td>"+RS.getString(3)+"</td>");
	    			out.print("<td>"+RS.getInt(4)+"</td>");
	    			out.print("<td>"+RS.getString(5)+"</td>");
	    			out.print("<td>"+RS.getInt(6)+"</td>");
	    			out.print("</tr>");  		    
	    		    out.print("<br>");
	    		}
	    		out.print("</fieldset>");
    			out.print("</table>");
	    		out.print("<br><br>");
	    		out.print("You are ordered total "+count+" products!!!");
	    		con.close();
	    	}
	        catch(Exception e)
	    	{
	        	System.out.print(e);
	    	}  
	      
	    return SKIP_BODY;  
	}  
}



//login.html
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="StoreSessionData.jsp">
<label for="userid">UserId:</label><br>
<input type="number" name="userid" required><br><br>
<label for="uname">UserName:</label><br>
<input type="text" name="uname"><br><br>
<label for="upass">Password:</label><br>
<input type="text" name="upass"><br><br>
<button type="submit">Login</button>
</form>
</body>
</html>


//ProcessProduct.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*" %>
<%
String pid=request.getParameter("pid");
String pname=request.getParameter("pname");
String price=request.getParameter("price");

String userid=(String) session.getAttribute("userid");
String uname=(String) session.getAttribute("uname");
String upass=(String) session.getAttribute("upass");

int userid1 = Integer.parseInt(userid);
int price1 = Integer.parseInt(price);
int pid1 = Integer.parseInt(pid);

out.print("<br><br>");

try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
	PreparedStatement pst=con.prepareStatement("insert into OrderHistory(USERID, UNAME, UPASS, PID, PNAME, PRICE) values(?,?,?,?,?,?)");
	pst.setInt(1, userid1);
	pst.setString(2,uname);
	pst.setString(3,upass);
	pst.setInt(4, pid1);
	pst.setString(5,pname);
	pst.setInt(6, price1);
	int i=pst.executeUpdate();
	if(i>0)
	{
		out.print("Do you want to order more Products?");
		out.print("<br><br>");
		out.print("<form action='OrderProduct.jsp'>");
		out.print("<button type='submit'>Order Product</button>");
		out.print("<br><br>");
		out.print("</form>");
		out.print("<form action='ViewHistory.jsp'>");
		out.print("<button type='submit'>View Order History</button>");
		out.print("</form>");     
	}
	con.close();
	
}
catch(Exception e)
{
	System.out.println(e);
}
%>
</body>
</html>



//StoreSessionData.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String userid=request.getParameter("userid");
String uname=request.getParameter("uname");
String upass=request.getParameter("upass");

session.setAttribute("userid",userid);
session.setAttribute("uname",uname);
session.setAttribute("upass",upass);

out.print("<br><br>");
out.print("<form action='OrderProduct.jsp'>");
out.print("<button type='submit'>Order Product</button>");
out.print("</form>");
%>
</body>
</html>


//OrderProduct.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ProcessProduct.jsp">
<label for="pid"></label>Product Id:<br>
<input type="number" name="pid" required><br><br>
<label for="pname"></label>Product Name:<br>
<input type="text" name="pname"><br><br>
<label for="price">Price</label><br>
<input type="number" name="price" required><br><br>
<button type="submit">Order</button>
</form>
</body>
</html>


//DisplayHistory.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String userid=request.getParameter("userid");
%>
<%@ taglib uri="WEB-INF/myTag.tld" prefix="h" %>  
<h:history userid="<%= userid %>" > </h:history>  
</body>
</html>


//ViewHistory.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DisplayHistory.jsp">
<label for="userid">UserId:</label><br>
<input type="text" name="userid"><br><br>
<button type="submit">View</button>
</form>
</body>
</html>


//myTag.tld
<?xml version="1.0" encoding="ISO-8859-1" ?>  
<!DOCTYPE taglib  
        PUBLIC "-//Sun Microsystems, Inc.//DTD JSP Tag Library 1.2//EN"  
        "http://java.sun.com/j2ee/dtd/web-jsptaglibrary_1_2.dtd">  
  
<taglib>  
  <tlib-version>1.0</tlib-version>  
  <jsp-version>1.2</jsp-version>  
  <short-name>simple</short-name>  
  <uri>http://tomcat.apache.org/example-taglib</uri>  
  <description>A simple tab library for the examples</description>  
  
  <tag>  
    <name>history</name>  
    <tag-class>myPack.Test</tag-class>  
    <attribute>  
    <name>userid</name>  
    <required>true</required>  
    <rtexprvalue>true</rtexprvalue>
    </attribute>  
  </tag>  
  
</taglib>  