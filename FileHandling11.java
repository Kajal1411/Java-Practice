import java.io.*;
class FileHandling11
{
public static void main(String args[])
{
try
{
int i=0;
FileInputStream fin=new FileInputStream("A3.txt");
BufferedInputStream bin=new BufferedInputStream(fin);
while((i=bin.read())!=-1)
{
System.out.print((char)i);
}
fin.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
