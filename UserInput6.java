import java.io.*;
import java.util.Scanner;
class UserInput6
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter username:");
String username=sc.next();
System.out.println("Enter password:");
String password=sc.next();
System.out.println("Username:"+username);
System.out.println("Password:"+password);
}
catch(Exception e)
{
System.out.println(e);
}
}
}


