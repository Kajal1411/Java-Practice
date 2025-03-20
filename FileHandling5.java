import java.io.*;
class FileHandling5
{
public static void main(String args[])
{
try
{
//write data into A1
FileOutputStream fout=new FileOutputStream("A1.txt"); 
String name="Kajal Pawar\n";
String grade="A";
byte[] b1=name.getBytes();
byte[] b2=grade.getBytes();
fout.write(b1);
fout.write(b2);

//read from A1 and store into A2
int i=0;
FileInputStream fin=new FileInputStream("A1.txt");
FileOutputStream fout1=new FileOutputStream("A2.txt"); 

while((i=fin.read())!=-1)
{
System.out.print((char)i);
fout1.write((byte)i);
}
fout.close();
fin.close();
fout1.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}                     



