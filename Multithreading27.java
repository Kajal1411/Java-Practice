//Anonymous class that implements Runnable interface

class Test 
{
public void factorial()
{
int num=5,fact=1;
while(num>=1)
{
fact=fact*num;
num--;
}
System.out.println("Factorial:"+fact);
}
public void sumOfNum()
{
int sum=0;
for(int i=1;i<=10;i++)
{
sum=sum+i;
}
System.out.println("Sum:"+sum);
}
}

class Multithreading27
{
static Test tt;
public static void main(String args[])
{
tt=new Test();
Runnable r1=new Runnable()
{
public void run()
{
tt.factorial();
}
};

Runnable r2=new Runnable()
{
public void run()
{
tt.sumOfNum();
}
};

Thread t1=new Thread(r1);
t1.start();
Thread t2=new Thread(r2);
t2.start();

}
}
