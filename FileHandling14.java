import java.io.*;
class FileHandling14
{
public static void main(String args[])
{
try
{
FileWriter fw=new FileWriter("A5.txt");
fw.write("K");
fw.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}