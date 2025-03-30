class Multithreading20 extends Thread
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
public static void main(String args[])
{
Multithreading20 t5=new Multithreading20();
t5.start();
t5.interrupt();

}
}

