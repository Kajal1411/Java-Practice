import java.io.*;
class FileHandling15
{
public static void main(String args[])
{
try
{
int i=0;
FileReader fr=new FileReader("A5.txt");
while((i=fr.read())!=-1)
{
System.out.print((char)i);
}
fr.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}