import java.io.*;
class FileHandling10
{
public static void main(String args[]) 
{
try
{
FileOutputStream fout=new FileOutputStream("A3.txt");
BufferedOutputStream bout=new BufferedOutputStream(fout);
String s="Kajal Pawar";
byte[] b=s.getBytes();
bout.write(b);
bout.flush();
fout.close();
}
catch(Exception e)
{
System.out.println(e);
}

}
}