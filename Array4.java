import java.util.Scanner;
class Array4
{
public static void main(String args[])
{
int[] A=new int[5];
int i,target;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array elements:");
for(i=0;i<=4;i++)
{
A[i]=sc.nextInt();
}
System.out.println("Enter target:");
target=sc.nextInt();
for(i=0;i<=4;i++)
{
if(A[i]==target)
{
System.out.println("Element"+" "+A[i]+" "+"is found at position:"+i);
break;
}
}
}
}