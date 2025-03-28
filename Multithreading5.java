import java.lang.Thread.*;
class Demo extends Thread
{
public void run()
{
System.out.println("Welcome");
}
}

class Multithreading5
{
public static void main(String args[])
{
System.out.println("Current thread name:"+Thread.currentThread().getName());
Thread.currentThread().setName("FirstThread");
System.out.println("Current thread New name:"+Thread.currentThread().getName());
System.out.println();
Demo d=new Demo();
d.start();
}
}
