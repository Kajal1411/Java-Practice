class Test extends Thread
{
public void run()
{
System.out.println("Welcome");
}
}
class Multithreading25
{
public static void main(String args[])
{
Test t1=new Test();
Runtime r=Runtime.getRuntime();  
r.addShutdownHook(t1);
try
{
Thread.sleep(2000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}