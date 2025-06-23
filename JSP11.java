//Test.java
package myPack;

import java.io.Serializable;

public class Test implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Test()
	{
		
	}
	private String uname,upass;
	
	public void set(String uname,String upass)
	{
		this.uname=uname;
		this.upass=upass;
	}
	
	public String showName()
	{
		return uname;
	}
	
	public String showPass()
	{
		return upass;
	}
}



//Demo.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="tt" class="myPack.Test" />

<%
tt.set("kajal","1234");
out.print(tt.showName());
out.print("<br>");
out.print(tt.showPass());
%>

</body>
</html>