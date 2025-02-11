import java.util.Scanner;
class Array1
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
System.out.println("Array elements are:");
for(i=0;i<=4;i++)
{
System.out.println(A[i]);
}
}
}