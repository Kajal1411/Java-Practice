import java.io.*;
class FileHandling8
{
public static void main(String args[])
{
try
{
FileInputStream fin1=new FileInputStream ("F3.txt");
FileInputStream fin2=new FileInputStream ("F4.txt");
SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
int i=0;
while((i=sis.read())!=-1)
{
System.out.print((char)i);
}
fin1.close();
fin2.close();
}
catch(Exception e)
{
System.out.println(e);
}

}
}