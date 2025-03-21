import java.io.*;
class FileHandling12
{
public static void main(String args[])
{
try
{
FileWriter fw=new FileWriter("A4.txt");
fw.write("Kajal");
fw.close();
}
catch(Exception e)
{
System.out.println(e);                 
}
}
}