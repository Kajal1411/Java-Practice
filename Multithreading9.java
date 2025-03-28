class Demo extends Thread
{
public void run()
{
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
class Multithreading9
{
public static void main(String args[])
{
Demo d=new Demo();
d.start();
try
{
d.join();
}
catch(Exception e)
{
System.out.println(e);
}
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