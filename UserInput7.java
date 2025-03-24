import java.io.*;
class UserInput7
{
public static void main(String args[])
{
try
{
Console c=System.console();
System.out.println("Enter username:");
String username=c.readLine();
System.out.println("Username:"+username);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
