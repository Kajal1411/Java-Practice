//custom exception for name to enter char for only name not digit or special char


import java.io.*;
import java.util.regex.*;
class InvalidNameException extends Exception
{
public InvalidNameException(String str)
{
super(str);
}
}
class ExcepHandling14
{
public static void username(String name) throws InvalidNameException
{
boolean b=Pattern.compile("[A-Za-z]{2,20}").matcher(name).matches();
if(b==false)
{
throw new InvalidNameException("Name is not valid");
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
ExcepHandling14.username("10");
}
catch(InvalidNameException e1)
{
System.out.println(e1);
}
}
}
