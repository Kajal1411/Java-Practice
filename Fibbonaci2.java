import java.util.Scanner;
class Fibbonaci2
{	
int a,b,c,count;
static int terms;
public void fab(int x,int y)
{
a=x;
b=y;
c=a+b;
System.out.print(c+"\t");
a=b;
b=c;
count++;
if(count<=terms)
{
fab(a,b);
}
}	
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter terms of fabbonaci series:");
terms=sc.nextInt();
System.out.println("fabbonaci series:");
Fibbonaci2 d=new Fibbonaci2();
d.count=1;
d.fab(0,1);
}
}
