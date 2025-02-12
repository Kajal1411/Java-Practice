import java.util.Scanner;
class Array5
{
public static void main(String args[])
{
int[] c=new int[10];
int[] cpp=new int[10];
int[] java=new int[10];
int i,j,k,l,nm=0;
float per;
String[] name=new String[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter name of students:");
for(i=0;i<=9;i++)
{
name[i]=sc.next();
}
System.out.println("Enter marks for c:");
for(i=0;i<=9;i++)
{
c[i]=sc.nextInt();
}
System.out.println("Enter marks for cpp:");
for(j=0;j<=9;j++)
{
cpp[j]=sc.nextInt();
}
System.out.println("Enter marks for java:");
for(k=0;k<=9;k++)
{
java[k]=sc.nextInt();
}
 
i=0;
j=0;
k=0;
for(l=1;l<=10;l++)
{
System.out.print("Roll no."+" "+l+":"+" ");
System.out.print("name:"+" "+name[nm]+" "+" ");
nm++;
per=(c[i]+cpp[j]+java[k])/3;
System.out.print("Percentage:"+per+" ");
if(per>=70)
{
System.out.print("A grade");
}
else if(per>=35&&per<70)
{
System.out.print("B grade");
}
else
{
System.out.print("Fail");
}
System.out.println();
i++;
j++;
k++;
}
}
}





