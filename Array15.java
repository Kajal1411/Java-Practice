import java.util.Scanner;
class Array15
{
public static void main(String args[])
{
int[][] a=new int[3][3];
int i,j;
Scanner sc=new Scanner(System.in);

System.out.println("Enter array elements:");
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
{
a[i][j]=sc.nextInt();
}
}

System.out.println("Array:");
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}

System.out.println("After changing the rows of  array:");
for(i=2;i>=0;i--)
{
for(j=0;j<=2;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
}