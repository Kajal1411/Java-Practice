import java.util.concurrent.*;
class Books
{
int b1=101,b2=102,b3=103,b4=104,b5=105;
int[] arr=new int[5];
int j=0;
synchronized void demo(int bid)
{
boolean flag=false;
for(int i=0;i<5;i++)
{
if(bid==arr[i])
{
flag=true;
break;
}
}
if(flag==true)
{
System.out.println(bid +" book is taken by another student.");
}
else
{
System.out.println("You can get this book");
for(int i=0;i<5;i++)
{
if(bid!=arr[i])
{
arr[j]=bid;
j++;
break;
}
}
}
}
}

class Synchronization3 extends Thread
{
static Books b=new Books();
int bid;
public void run()
{
b.demo(bid);
}
public static void main(String args[])
{
Synchronization3 t1=new Synchronization3();
t1.bid=101;
Synchronization3 t2=new Synchronization3();
t2.bid=104;
Synchronization3 t3=new Synchronization3();
t3.bid=105;
Synchronization3 t4=new Synchronization3();
t4.bid=104;
Synchronization3 t5=new Synchronization3();
t5.bid=101;
t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
}
}

