import java.io.*;
class FileHandling17
{
public static void main(String args[])
{
try
{
CharArrayWriter out=new CharArrayWriter();
out.write("KDN");    
//store into buffer
FileWriter fw1=new FileWriter("A7.txt");
FileWriter fw2=new FileWriter("A8.txt");
FileWriter fw3=new FileWriter("A9.txt");
FileWriter fw4=new FileWriter("A10.txt");
//Send or write to multiple files
out.writeTo(fw1);
out.writeTo(fw2);
out.writeTo(fw3);
out.writeTo(fw4);
out.flush();
fw1.close();
fw2.close();
fw3.close();
fw4.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}