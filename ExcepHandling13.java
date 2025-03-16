import java.io.*;
class InvalidAgeException extends Exception
{
public InvalidAgeException(String str)
{
super(str);
}
}
class ExcepHandling13
{
public static void voting(int age) throws InvalidAgeException
{
if(age<18)
{
throw new InvalidAgeException("Age is not valid");
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
ExcepHandling13.voting(10);
} 
catch(InvalidAgeException e1)
{
System.out.println(e1);
}
}
}
