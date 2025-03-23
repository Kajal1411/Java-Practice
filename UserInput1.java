import java.io.*;
class UserInput1
{
public static void main(String args[])
{
try
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
System.out.println("Enter your name:");
String name=br.readLine();
System.out.println("Name:"+name);

}
catch(Exception e)
{
System.out.println(e);
}
}
}