import java.io.*;
import java.util.Scanner;
import java.util.regex.*;
class InvalidGradeException extends Exception
{
public InvalidGradeException (String str1)
{
super(str1);
}
}

class InvalidRollNoException extends Exception
{
public InvalidRollNoException(String str2)
{
super(str2);
}
}

class InvalidNameException extends Exception
{
public InvalidNameException(String str3)
{
super(str3);
}
}

class ExcepHandling18
{
public static void demo() throws InvalidGradeException,InvalidRollNoException,InvalidNameException
{
String grade;
String rollno;
String name;
boolean b1,b2,b3;
Scanner sc=new Scanner(System.in);

System.out.println("Enter rollno:");
rollno=sc.next();
b1=Pattern.compile("[0-9]{1,5}").matcher(rollno).matches();
if(b1==false)
{
throw new InvalidRollNoException("Rollno is not valid");
}
else
{
System.out.println("Rollno:"+rollno);
}

System.out.println("Enter Name:");
name=sc.next();
b2=Pattern.compile("[A-Za-z]{2,20}").matcher(name).matches();
if(b2==false)
{
throw new InvalidNameException("Name is not valid");
}
else
{
System.out.println("Name:"+name);
}


System.out.println("Enter grade:");
grade=sc.next();
b3=Pattern.compile("[A-Z]").matcher(grade).matches();
if(b3==false)
{
throw new InvalidGradeException("Grade is not valid");
}
else
{
System.out.println("Grade:"+grade);
}
}



public static void main(String args[])
{
try
{
ExcepHandling18.demo();
}
catch(InvalidNameException e1)
{
System.out.println(e1);
}
catch(InvalidRollNoException e2)
{
System.out.println(e2);
}
catch(InvalidGradeException e3)
{
System.out.println(e3);
}
}
}


