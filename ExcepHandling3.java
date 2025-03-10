import java.util.Scanner;
import java.io.*;
class ExcepHandling3
{
public static void main(String args[])
{
int age;
Scanner sc=new Scanner(System.in);

try
{
System.out.println("Enter age:");
age=sc.nextInt();
if(age>=18)
{
System.out.println("Eligible");
}
else
{
System.out.println("Not eligible");
}
}

catch(Exception e)
{
System.out.println(e);
System.out.println("Please enter valid age");
}

}
}