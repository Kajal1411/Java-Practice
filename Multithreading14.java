class Demo extends Thread
{
public void run()
{
int i;
for(i=1;i<=5;i++)
{
Thread.yield();
System.out.println("New Thread:"+i);
}
}
}

class Multithreading14
{
public static void main(String args[])
{
Demo d=new Demo();
d.start();
int i;
for(i=1;i<=5;i++)
{
System.out.println("main Thread:"+i);
}
}
}
