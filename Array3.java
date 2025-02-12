import java.util.Scanner;
class Array3
{
public static void main(String args[])
{
int[] A=new int[5];
int i,j,count;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array elements:");
for(i=0;i<=4;i++)
{
A[i]=sc.nextInt();
}
System.out.println("Dublicate elements are:");
for(i=0;i<=4;i++)
{
count=0;
for(j=0;j<=4;j++)
{
if(A[i]==A[j])
{
count++;
}
}
if(count>1)
{
System.out.println("Element "+A[i]+" "+"is present at location "+i);
}
}
}
}




