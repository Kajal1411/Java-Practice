import java.util.Scanner;
import java.lang.Math;
class Armstrong2
{
public static void main(String args[])
{
int num,count=0,rem,result=0,originalno;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number:");
num=sc.nextInt();
originalno=num;
while(num!=0)
{
rem=num%10;
count++;
num=num/10;
}
num=originalno;
while(num!=0)
{
rem=num%10;
result=result+(int)Math.pow(rem,count);
num=num/10;
}
if(result==originalno)
System.out.println("Armstrong");
else
System.out.println("Not Armstrong");
}
}


