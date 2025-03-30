import java.lang.Thread.*;
class Multithreading19 extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().isDaemon());
System.out.println("Hi");
}
public static void main(String args[])
{
System.out.println(Thread.currentThread().isDaemon());
System.out.println("main thread");
Multithreading19 t11=new Multithreading19();
t11.setDaemon(true);
t11.start();
try 
{           
Thread.sleep(100);
} 
catch (InterruptedException e) 
{
e.printStackTrace();
}
}
}

