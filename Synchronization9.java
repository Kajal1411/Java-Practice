class Factorial extends Thread
{
int fact;
int result[]=new int[10];
int k=0;
public void run()
{
synchronized(this)
{
for(int i=1;i<=10;i++)
{
fact=1;
for(int j=i;j>=1;j--)
{
fact=fact*j;
}
result[k]=fact;
k++;
notify();
}
}
}
}

class Synchronization9
{
public static void main(String args[])
{
Factorial t=new Factorial();
t.start();
synchronized(t)
{
try
{
t.wait();
}
catch(Exception e)
{
System.out.println(e);
}
}
for(int i=0;i<=9;i++)
{
System.out.println("Factorial of "+(i+1)+":"+t.result[i]);
}
}
}