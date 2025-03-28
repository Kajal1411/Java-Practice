class Demo extends Thread
{
static Thread mt;
public void run()
{
try
{
mt.join();
}
catch(Exception e)
{
System.out.println(e);
}
int i;
for(i=1;i<=5;i++)
{
System.out.println("New Thread:"+i);
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
}
class Multithreading10 extends Demo
{
public static void main(String args[])
{
mt=Thread.currentThread();
Demo d=new Demo();
d.start();

int i;
for(i=1;i<=5;i++)
{
System.out.println("main Thread:"+i);
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
}