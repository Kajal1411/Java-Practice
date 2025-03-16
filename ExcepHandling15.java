import java.io.*;
import java.util.regex.*;
import java.util.Scanner;
class InvalidMobNumberException extends Exception
{
public InvalidMobNumberException(String str)
{
super(str);
}
}
class ExcepHandling15
{
public static void Mobile() throws InvalidMobNumberException
{
Scanner sc=new Scanner(System.in);
String mob;
System.out.println("Enter mob number:");
mob=sc.next();
boolean b=Pattern.compile("[789][0-9]{9}").matcher(mob).matches();
if(b==false)
{
throw new InvalidMobNumberException("Mobile number is not valid");
}
else
{
System.out.println("Valid");
}
}
public static void main(String args[])
{
try
{
ExcepHandling15.Mobile();
}
catch(InvalidMobNumberException e1)
{
System.out.println(e1);
}
}
}