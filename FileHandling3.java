import java.io.*;
class FileHandling3
{
public static void main(String args[])
{
try
{
int i=0;
FileInputStream fin=new FileInputStream("abc.txt");
while((i=fin.read())!=-1)
{
System.out.print((char)i);
}

fin.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}



