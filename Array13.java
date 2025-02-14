import java.util.Scanner;
class Array13
{
int[][] A=new int[3][3];
int[][] B=new int[3][3];
int[][] C=new int[3][3];
int i,j;
public void getarr()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array A elements:");
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
{
A[i][j]=sc.nextInt();
}
}
System.out.println("Enter array B elements:");
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
{
B[i][j]=sc.nextInt();
}
}
}
public void showarr()
{
System.out.println("Array A elements:");
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
{
System.out.print(A[i][j]+"\t");
}
System.out.println();
}
System.out.println("Array B elements:");
for(int i=0;i<=2;i++)
{
for(int j=0;j<=2;j++)
{
System.out.print(B[i][j]+"\t");
}
System.out.println();
}
}
public void Add()
{
for(int i=0;i<=2;i++)
{
for(int j=0;j<=2;j++)
{
System.out.print(A[i][j]+B[i][j]+"\t");
}
System.out.println();
}
}
public void sub()
{
for(int i=0;i<=2;i++)
{
for(int j=0;j<=2;j++)
{
System.out.print(A[i][j]-B[i][j]+"\t");
}
System.out.println();
}
}
public static void main(String args[])
{
Array13 a=new Array13();
a.getarr();
a.showarr();
System.out.println("Addition:");
a.Add();
System.out.println("Substraction:");
a.sub();
}
}