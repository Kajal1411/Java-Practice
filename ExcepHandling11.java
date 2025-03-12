import java.io.*;
class ExcepHandling11
{
int c;
void m1() //throws ArithmeticException
{
c=100/0;
System.out.println("Division"+c);
}
void m2()
{
try{
m1();
}
catch(Exception e)
{
System.out.println(e);

}
}
void m3()
{
m2();
}
public static void main(String args[]) 
{
ExcepHandling17 e=new ExcepHandling17();
e.m3();
}
}


