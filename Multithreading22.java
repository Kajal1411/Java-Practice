class Multithreading22 extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().interrupted());
System.out.println(Thread.currentThread().interrupted());
int i;
for(i=1;i<=5;i++)
{
System.out.println("Thread1:"+i);
}
}
public static void main(String args[])
{
Multithreading22 t1=new Multithreading22();
t1.start();
t1.interrupt();
}
}

