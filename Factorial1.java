import java.util.Scanner;
class Factorial1
{
public static void main(String args[])
{
int num,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number:");
num=sc.nextInt();
while(num>=1)
{
fact=fact*num;
num--;
}
System.out.println("Factorial:"+fact);
}
}