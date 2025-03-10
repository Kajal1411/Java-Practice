import java.io.*;
class ExcepHandling4
{
public static void main(String args[])
{

try
{
FileInputStream f=new FileInputStream("abc.txt");
}

catch(Exception e)
{
System.out.println(e);
System.out.println("File not exist.please create the file");
}

}
}
