class Multithreading23 extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().isInterrupted());
System.out.println(Thread.currentThread().isInterrupted());
int i;
for(i=1;i<=5;i++)
{
System.out.println("Thread1:"+i);
}
}
public static void main(String args[])
{
Multithreading23 t1=new Multithreading23();
t1.start();
t1.interrupt();
}
}
