import java.lang.String;
class String24
{
public static void main(String args[])
{
String s="what you are doing";
int i;
char ch[]=s.toCharArray();
for(i=0;i<=s.length();i++)
{
if(ch[i]==' ')
{
System.out.println();
}
else
{
System.out.print(ch[i]);
}
}

}
}