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
