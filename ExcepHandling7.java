import java.util.Scanner;
import java.io.*;
class ExcepHandling7
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);

try
{
System.out.println("Enter value for a:");
a=sc.nextInt();
System.out.println("Enter value for b:");
b=sc.nextInt();
System.out.println("Addition"+(a+b));
}

catch(Exception e)
{
System.out.println(e);
System.out.println("Please enter valid numbers");
}

finally
{
System.out.println("Finally block executes");
}

System.out.println("remaining code");

}
}