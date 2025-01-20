import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
int num,rev=0,rem,originalno;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number:");
num=sc.nextInt();
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
