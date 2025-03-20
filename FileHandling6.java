import java.io.*;
class FileHandling6
{
public static void main(String args[])
{
try
{
FileOutputStream fout1=new FileOutputStream ("F1.txt");
FileOutputStream fout2=new FileOutputStream ("F2.txt");
ByteArrayOutputStream bout=new ByteArrayOutputStream();
bout.write(65);
bout.writeTo(fout1);
bout.writeTo(fout2);
bout.flush(); //optional
bout.close();  //optional
fout1.close();
fout2.close();
}
catch(Exception e)
{
System.out.println(e);
}


}
}