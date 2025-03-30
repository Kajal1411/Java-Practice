import java.lang.Thread.*;
class Test extends Thread
{
public void run()
{
System.out.println("Child thread-deamon");
}
}
class Multithreading18
{
public static void main(String args[])
{
//System.out.println("main thread");
Test t=new Test();
t.setDaemon(true);
t.start();
}
}