import java.lang.ThreadGroup.*;
class Test1 implements Runnable
{
public void run()
{
System.out.println(Thread.currentThread().getName());
}
}

class Test2 implements Runnable
{
public void run()
{
System.out.println(Thread.currentThread().getName());
}
}

class multithreading24
{
public static void main(String args[])
{
Test1 t1=new Test1();     
Test2 t2=new Test2();

ThreadGroup tg=new ThreadGroup("mygroup");

Thread th1=new Thread(tg,t1,"Thread1");
th1.start();

Thread th2=new Thread(tg,t2,"Thread2");
th2.start();

System.out.println(tg.getName());
tg.list();

System.out.println(tg.activeCount());
System.out.println(tg.activeGroupCount());
tg.interrupt(); 

}
}
