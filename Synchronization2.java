import java.util.concurrent.*;
class Demo
{
synchronized void table(int num)
{
for(int i=1;i<=10;i++)
{
System.out.println(num*i);
}
}
}

class Synchronization2 
{
static Demo d=new Demo();
int num;

public static void main(String args[])
{

Thread t1=new Thread()
{
public void run()
{
d.table(5);
System.out.println();
}
};

Thread t2=new Thread()
{
public void run()
{
d.table(9);
}
};

t1.start();
t2.start();
}
}