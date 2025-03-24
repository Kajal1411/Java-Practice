import java.io.*;
class UserInput5
{
public static void main(String args[])
{
try
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
System.out.println("Enter the rollno string:");
String rollno=br.readLine();
String r[]=rollno.split(" ");
int i;
System.out.println("Roll numbers are:");
for(i=0;i<=rollno.length();i++)
{
System.out.println(r[i]);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}





