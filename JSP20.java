//Fact.java
package myPack;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Fact extends TagSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int number;  
    
	public void setNumber(int number) 
	{  
	    this.number = number;  
	}  
	  
	public int doStartTag() throws JspException 
	{  
	    JspWriter out=pageContext.getOut();  //to print on jsp file
	    try
	    {  
	    	int fact=1;
	        while(number>=1)
	        {
	        	fact=fact*number;
	        	number--;
	        }
	        out.print(fact);
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
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
<%@ taglib uri="WEB-INF/myTag.tld" prefix="m" %>  
Factorial of 5 is: <m:fact number="5"></m:fact>  
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
    <name>fact</name>  
    <tag-class>myPack.Fact</tag-class>  
    <attribute>  
    <name>number</name>  
    <required>true</required>  
    </attribute>  
  </tag>  
  
</taglib>  
