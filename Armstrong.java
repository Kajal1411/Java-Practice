import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
int num,sum=0,rem,originalno;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number:");
num=sc.nextInt();
originalno=num;
while(num!=0)
{
rem=num%10;
sum=sum+(rem*rem*rem);
num=num/10;
}
if(sum==originalno)
System.out.println("Armstrong");
else
System.out.println("Not Armstrong");
}
}
