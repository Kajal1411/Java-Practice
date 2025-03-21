import java.io.*;
class FileHandling16
{
public static void main(String args[])
{
try
{
char b[]={'k','a','j','a','l'};
FileWriter fw=new FileWriter("A6.txt");
fw.write(b);
fw.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}