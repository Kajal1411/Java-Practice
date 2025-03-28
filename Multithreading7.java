import java.lang.Thread.*;
class Demo extends Thread
{
public void run()
{
System.out.println("Welcome");
}
}

class Multithreading7
{
public static void main(String args[])
{
Demo d=new Demo();
d.start();
System.out.println("Thread id:"+d.getId());
}
}