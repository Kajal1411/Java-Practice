import java.lang.Thread.*;
class Demo extends Thread
{
public void run()
{
System.out.println("Welcome");
}
}

class Multithreading6
{
public static void main(String args[])
{
System.out.println("Current thread priority:"+Thread.currentThread().getPriority());
Thread.currentThread().setPriority(7);
System.out.println("Current thread New priority:"+Thread.currentThread().getPriority());
Demo d=new Demo();
d.start();
}
}
