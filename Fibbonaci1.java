import java.util.Scanner;
class Fibbonaci1
{		
public static void main(String args[])
{
int a=0,b=1,c,i,terms;
Scanner sc=new Scanner(System.in);
System.out.println("Enter terms of fabbonaci series:");
terms=sc.nextInt();
System.out.println("fabbonaci series:");
for(i=1;i<=terms;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}
