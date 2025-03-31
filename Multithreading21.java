class Multithreading21 extends Thread
{
public void run()
{
int i;
for(i=1;i<=5;i++)
{
System.out.println("Thread1:"+i);
}
}
public static void main(String args[])
{
Multithreading21 t7=new Multithreading21();
t7.start();
t7.interrupt();
}
}

