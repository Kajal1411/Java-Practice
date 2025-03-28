class Demo extends Thread
{
public void run()
{
int i;
for(i=1;i<=5;i++)
{
System.out.println(i);
try
{
Thread.sleep(2000);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}
class Multithreading8 
{
public static void main(String args[])
{
Demo d=new Demo();
d.start();
}
}