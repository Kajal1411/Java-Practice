//Per.java
package myPack;

import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Per extends TagSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;  
    
	public void setId(String id) 
	{  
	    this.id = id;  
	}  
	  
	public int doStartTag() throws JspException 
	{  
	    JspWriter out=pageContext.getOut();  //to print on jsp file 
	    	try
	    	{
	    		Class.forName("oracle.jdbc.driver.OracleDriver");
	    		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
	    		PreparedStatement pst = con.prepareStatement("select * from student where id = ?");
	    		pst.setInt(1, Integer.parseInt(id));
	    		ResultSet RS = pst.executeQuery();

	    		while(RS.next())
	    		{
	    			int a1=RS.getInt(2);
	    			int a2=RS.getInt(3);
	    			int a3=RS.getInt(4);
	    			int a4=RS.getInt(5);
	    			float per=(a1+a2+a3+a4)/4;
	    			out.print(per);
	    		}
	    		con.close();
	    	}
	        catch(Exception e)
	    	{
	        	System.out.print(e);
	    	}  
	      
	    return SKIP_BODY;  
	}  
}



//index.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="WEB-INF/myTag.tld" prefix="p" %>  
Per of student 101 is: <p:per id="101"></p:per>  
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
    <name>per</name>  
    <tag-class>myPack.Per</tag-class>  
    <attribute>  
    <name>id</name>  
    <required>true</required>  
    </attribute>  
  </tag>  
  
</taglib>  