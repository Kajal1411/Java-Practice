import java.io.*;
class ExcepHandling8
{
public static void main(String args[])
{
try
{
int div=5/0;
System.out.println("Division:"+div);
}

catch(ArithmeticException e)
{
System.out.println("Catch block");
}

finally
{
System.out.println("Finally block executes");
}

System.out.println("remaining code");

}
}