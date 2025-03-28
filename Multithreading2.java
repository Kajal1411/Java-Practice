import java.lang.Runnable.*;
class Demo implements Runnable
{
public void run()
{
int num=5,fact=1;
while(num>=1)
{
fact=fact*num;
num--;
}
System.out.println("Factorial:"+fact);
}
}

class Multithreading2
{
public static void main(String args[])
{
Demo d=new Demo();
Thread th=new Thread(d);
th.start();
}
}
