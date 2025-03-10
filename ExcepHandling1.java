import java.io.*;
class ExcepHandling1
{
public static void main(String args[])
{
try
{
double z=100/0;
System.out.println(z);
}
catch(Exception e)
{
System.out.println(e);
}
double x=100+10;
System.out.println(x);
}
}
