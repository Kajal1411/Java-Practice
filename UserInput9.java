import java.io.*;
class UserInput9
{
public static void main(String args[]) 
{
try
{
DataInputStream di=new DataInputStream(System.in);
System.out.println("Enter username:");
String name=di.readLine();
System.out.println("Username:"+name);
System.out.println("Enter id:");
Integer id=Integer.parseInt(di.readLine());
System.out.println("Name:"+name);
System.out.println("Id:"+id);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
