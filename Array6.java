import java.util.Scanner;
class Array6
{
public static void main(String args[])
{
int[] A=new int[5];
int[] B=new int[5];
int i,j=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array elements:");
for(i=0;i<=4;i++)
{
A[i]=sc.nextInt();
}

for(i=0;i<=4;i++)
{
B[j]=A[i];
j++;
}
System.out.println("Array A elements:");
for(i=0;i<=4;i++)
{
System.out.println(A[i]);
}
System.out.println("Array B elements:");
for(i=0;i<=4;i++)
{
System.out.println(B[i]);
}
}
}