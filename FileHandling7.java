import java.io.*;
class FileHandling7
{
public static void main(String args[])
{
try
{
String s="Kajal";
FileOutputStream fout1=new FileOutputStream ("F3.txt");
FileOutputStream fout2=new FileOutputStream ("F4.txt");
FileOutputStream fout3=new FileOutputStream ("F5.txt");
FileOutputStream fout4=new FileOutputStream ("F6.txt");
ByteArrayOutputStream bout=new ByteArrayOutputStream();
byte[] b1=s.getBytes();
bout.write(b1);
bout.writeTo(fout1);
bout.writeTo(fout2);
bout.writeTo(fout3);
bout.writeTo(fout4);
bout.flush(); 
bout.close(); 
fout1.close();
fout2.close();
}
catch(Exception e)
{
System.out.println(e);
}


}
}