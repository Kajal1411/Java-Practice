import java.util.Scanner;
class Array11
{
public static void main(String args[])
{
int[] A=new int[5];
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array elements:");
for(i=0;i<=4;i++)
{
A[i]=sc.nextInt();
}
System.out.println("Position of armstrong numbers in array:");

for(i=0;i<=4;i++)
{
armstrong(A[i],i);
}
}
public static void armstrong(int n,int i)
{
int sum=0,originalno,rem=0;

originalno=n;
while(n!=0)
{
rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}
if(originalno==sum)
{
System.out.println(i);
}
}
}

