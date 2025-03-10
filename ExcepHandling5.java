import java.io.*;
class ExcepHandling5
{
int a;
void div()
{
a=100/0;
System.out.println(a);
}
public static void main(String args[])
{
ExcepHandling9 obj=new ExcepHandling9();

try
{ 
obj.div();
}

catch(Exception e)
{
e.printStackTrace();
}

}
}
