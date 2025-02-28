import java.lang.String;
import java.util.Scanner;
class String12
{
public static void main(String args[])
{
String s;
char s1;
char s2;
int i;
boolean flag1=false;
boolean flag2=false;

Scanner sc=new Scanner(System.in);

System.out.println("Enter any string:");
s=sc.next();
System.out.println("Enter first char of string:");
s1=sc.next().charAt(0);
System.out.println("Enter last char of string:");
s2=sc.next().charAt(0);

char ch[]=s.toCharArray(); //to convert string into char

for(i=0;i<s.length();i++)
{
if(ch[i]==s1)
{
System.out.println("true");
flag1=true;
}
}
if(flag1==false)
{
System.out.println("false");
}

for(i=0;i<s.length();i++)
{
if(ch[i]==s2)
{
System.out.println("true");
flag2=true;
}
}
if(flag2==false)
{
System.out.println("false");
}

}
}