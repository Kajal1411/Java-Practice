import java.lang.Thread.*;
class Demo2 extends Thread
{
public void run()
{

int number=153,sum=0,rem,originalno;
originalno=number;
while(number!=0)
{
rem=number%10;
sum=sum+(rem*rem*rem);
number=number/10;
}
if(sum==originalno)
System.out.println("Armstrong");
else
System.out.println("Not Armstrong");
}
}

class Multithreading4
{
public static void main(String args[])
{
Demo2 t2=new Demo2();
t2.start();
}
}
