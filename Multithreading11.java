class Demo1 extends Thread
{
public void run()
{
int i;
for(i=1;i<=5;i++)
{
System.out.println("Thread1:"+i);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}

class Demo2 extends Thread
{
public void run()
{
Demo1 d1=new Demo1();
d1.start();
try
{
d1.join();
}
catch(Exception e)
{
System.out.println(e);
}

int i;
for(i=1;i<=5;i++)
{
System.out.println("Thread2:"+i);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}

class Multithreading11
{
public static void main(String args[])
{
Demo2 d2=new Demo2();
d2.start();
try
{
d2.join();
}
catch(Exception e)
{
System.out.println(e);
}

int i;
for(i=1;i<=5;i++)
{
System.out.println("main:"+i);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}