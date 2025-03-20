import java.io.*;
class FileHandling4
{
public static void main(String args[])
{
try  
{
int i=0;
FileInputStream fin=new FileInputStream("abc.txt");
FileOutputStream fout=new FileOutputStream("PQR.txt");
while((i=fin.read())!=-1)
{
fout.write((byte)i);
}

fin.close();
fout.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}



