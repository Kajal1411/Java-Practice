import java.io.*;
import java.util.zip.*;
class Compressing1
{
public static void main(String args[])
{
try
{
FileInputStream fin=new FileInputStream("A10.txt");
FileOutputStream fout=new FileOutputStream("Compress1.txt");
DeflaterOutputStream dout=new DeflaterOutputStream(fout);
int i;
while((i=fin.read())!=-1)
{
dout.write((byte)i);
dout.flush();
}
dout.close();
fout.close();
fin.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}