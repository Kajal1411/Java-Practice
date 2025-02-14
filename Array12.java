import java.util.Scanner;
class Array12
{
public static void main(String args[])
{
int[][] A=new int[3][3];
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array elements:");
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
{
A[i][j]=sc.nextInt();
}
}
System.out.println("Array elements:");
for(i=0;i<=2;i++)
{
System.out.println();
for(j=0;j<=2;j++)
{
System.out.print("  "+A[i][j]);
}
}
}
}