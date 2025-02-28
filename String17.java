//getBytes()

import java.lang.String;
class String17
{
public static void main(String args[])
{
String s="ABCDEF";
int i;
byte arr[]=s.getBytes();
for(i=0;i<=arr.length;i++)
{
System.out.println(arr[i]);
}
}
}
