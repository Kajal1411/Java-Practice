import java.lang.Thread.*;
class Demo1 extends Thread
{
public void run()
{
int num=123,rev=0,rem,originalno;
originalno=num;
while(num!=0)
{
rem=num%10;
rev=(rev*10)+rem;
num=num/10;
}
if(rev==originalno)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}

class Multithreading3
{
public static void main(String args[])
{
Demo1 t1=new Demo1();
t1.start();
}
}
