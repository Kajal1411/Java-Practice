//Test.java
ackage myPack;

import java.io.Serializable;

public class Test implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Test()
	{
		
	}
	public int cube(int num)
	{
		return num*num*num;
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

int cube=tt.cube(2);
out.print(cube);
%>

</body>
</html>