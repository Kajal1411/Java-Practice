import java.util.Scanner;
class Array14
{
public static void main(String args[])
{
int[][] a=new int[3][3];
int i,j,target;
boolean flag=false;
Scanner sc=new Scanner(System.in);
System.out.println("Enter array elements:");
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
{
a[i][j]=sc.nextInt();
}
}

System.out.println("Enter element to search:");
target=sc.nextInt();

for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
{
if(a[i][j]==target)
{
flag=true;
System.out.println("Element is found at row:"+i+" "+"coloumn:"+j);
}
}
}
if(flag==false)
{
System.out.println("Element is not present");
}
}
}