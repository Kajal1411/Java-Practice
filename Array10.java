import java.util.Scanner;
class Array10
{
public static void main(String args[])
{
int[] A=new int[5];
int i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array elements:");
for(i=0;i<5;i++)
{
A[i]=sc.nextInt();
}
for(i=0;i<5;i++)
{
fact(A[i]);
}
sc.close();
}
public static void fact(int num)
{
long fact=1;
System.out.print("\nFactorial of"+" "+num+":");
while(num>=1)
{
fact=fact*num;
num--;
}
System.out.print(fact);
}
}