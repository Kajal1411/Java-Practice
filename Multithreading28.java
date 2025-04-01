class Test extends Thread
{
public void run()
{
System.out.println("Hi");
}
}
class Multithreading28
{
public static void main(String args[])
{
Test t1=new Test();
t1.start();
Runtime r=Runtime.getRuntime();
try
{
r.exec("notepad");
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println(r.freeMemory());
System.out.println(r.totalMemory());
System.gc();
System.out.println(r.freeMemory());
}
}