import java.util.Scanner;
class Array2
{
public static void main(String args[])
{
int[] A=new int[5];
int i,j,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array elements:");
for(i=0;i<=4;i++)
{
A[i]=sc.nextInt();
}
System.out.println("Array elements in ascending order:");
for(i=0;i<=4;i++)
{
for(j=i+1;j<=4;j++)
{
if(A[i]>A[j])
{
c=A[i];
A[i]=A[j];
A[j]=c;
}
}
System.out.println(A[i]);
}
System.out.println("Array elements in descending order:");
for(i=0;i<=4;i++)
{
for(j=i+1;j<=4;j++)
{
if(A[i]<A[j])
{
c=A[i];
A[i]=A[j];
A[j]=c;
}
}
System.out.println(A[i]);
}
}
}