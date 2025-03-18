import java.util.regex.*;
import java.util.Scanner;
class InvalidUsernameException extends Exception
{
public InvalidUsernameException(String str1)
{
super(str1);
}
}


class InvalidPasswordException  extends Exception
{
public InvalidPasswordException(String str2)
{
super(str2);
}
}


interface Login
{
void show() throws InvalidUsernameException,InvalidPasswordException;
}


class InnerClass15
{
public static void main(String args[]) throws InvalidUsernameException,InvalidPasswordException
{


Login obj=new Login() 
{
public void show() throws InvalidUsernameException,InvalidPasswordException
{
String username,password;
boolean b1,b2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter username:");
username=sc.next();
b1=Pattern.compile("[A-Za-z]{2,20}").matcher(username).matches();
if(b1==false)
{
throw new InvalidUsernameException("Please enter valid username.");
}
System.out.println("Enter password:");
password=sc.next();
b2=Pattern.compile("[A-Za-z0-9@#$*]{6,8}").matcher(password).matches();
if(b2==false)
{
throw new InvalidPasswordException("Please enter valid password");
}
if(b1==true&&b2==true)
{
System.out.println("Login Ssuccessful!");
}
}
}; 

try
{
obj.show();
}
catch(InvalidUsernameException e1)
{
System.out.println(e1);
}
catch(InvalidPasswordException e2)
{
System.out.println(e2);
}

}
}
