import java.io.*;
class UserInput2
{
public static void main(String args[])
{
try
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
System.out.println("Enter your rollno:");
Integer rollno=Integer.parseInt(br.readLine());
System.out.println("Rollno:"+rollno);
}
catch(Exception e)
{
System.out.println(e);
}
}
}