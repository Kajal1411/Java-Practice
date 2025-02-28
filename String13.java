import java.lang.String;
import java.util.Scanner;
class String13
{
public static void main(String args[])
{
String s;
int start,end,i,j=0;
char[] newstr=new char[10];

Scanner sc=new Scanner(System.in);

System.out.println("Enter any string:");
s=sc.next();
System.out.println("Enter start position:");
start=sc.nextInt();
System.out.println("Enter end position:");
end=sc.nextInt();

char ch[]=s.toCharArray(); //to convert string into char

for(i=0;i<s.length();i++)
{
if((i>=start)&&(i<=end))
{
newstr[j]=ch[i];
j++;
}
}

for(i=0;i<=j;i++)
{
System.out.print(newstr[i]);
}

}
}