import java.util.Scanner;
class Array8
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
}
for(i=0;i<=4;i++)
{
if(i==0)
{
System.out.println("Min element in array:"+A[i]);
}
if(i==4)
{
System.out.println("Max element in array:"+A[i]);
}
}
}
}