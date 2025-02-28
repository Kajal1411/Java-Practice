import java.lang.String;
import java.util.Scanner;
class String15
{
public static void main(String args[])
{
String s="kajal";
int i,index;
char ch[]=s.toCharArray();
index=2;
for(i=0;i<=s.length();i++)
{
if(i==index)
{
System.out.println(ch[i]);
}
}
}
}
