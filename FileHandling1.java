import java.io.*;
class FileHandling1
{
public static void main(String args[])
{
try
{
FileOutputStream fout=new FileOutputStream("abc.txt");
String s="KDN Infotech"; 
byte[] b=s.getBytes();
fout.write(b); 
fout.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
