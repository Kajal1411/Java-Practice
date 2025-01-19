import java.util.Scanner;
class Factorial2
{
public int factorial(int n)
{
if(n<1)
{
return 1;
}
else if(n==1)
{
return 1;
}
else
{
return n*factorial(n-1);
}
}
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number:");
num=sc.nextInt();
Factorial2 f=new Factorial2();
int result=f.factorial(num);
System.out.println("Factorial:"+result);
}
}

