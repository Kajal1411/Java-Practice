//program to read data from keyboard and stop reading data when we enter "stop"

import java.io.*;
class UserInput3
{
public static void main(String args[])
{
try
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
while(true)
{
System.out.println("Enter your data:");
String data=br.readLine();
System.out.println("Name:"+data);
String s="stop";
boolean b=data.equals(s);
if(b==true)
{
break;
}
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}  