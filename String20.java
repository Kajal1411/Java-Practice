import java.lang.String;
import java.util.Scanner;
class String20
{
public static void main(String args[])
{
String s1="what do you know";
char str1[]=s1.toCharArray();
String s2="know";
char str2[]=s2.toCharArray();
int i;
for(i=0;i<=s1.length();i++)
{
if(str1[i]==str2[0])
{
System.out.println(i);
}
}
}
}