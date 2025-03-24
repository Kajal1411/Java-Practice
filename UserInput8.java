import java.io.*;
class UserInput8
{
public static void main(String args[])
{
try
{
Console c=System.console();
System.out.println("Enter password:");
char[] password=c.readPassword();
String pass=String.valueOf(password);
System.out.println("Password:"+pass);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
