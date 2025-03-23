import java.io.*;
import java.util.zip.*;
class Decompressing1
{
public static void main(String args[])
{
try
{
FileInputStream fin=new FileInputStream("Compress1.txt");
FileOutputStream fout=new FileOutputStream("A13.txt");
InflaterInputStream in=new InflaterInputStream(fin);
int i;

while((i=in.read())!=-1)
{
fout.write((byte)i);
fout.flush();
}
fin.close();
fout.close();
in.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}