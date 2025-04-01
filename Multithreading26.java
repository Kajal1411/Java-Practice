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

class Multithreading26
{
static Test tt;
 
public static void main(String args[])
{
 tt=new Test();
Thread t1=new Thread()
{
public void run()
{
tt.factorial();
}
};

Thread t2=new Thread()
{
public void run()
{
tt.sumOfNum();
}
};
t1.start();
t2.start();

}
}
