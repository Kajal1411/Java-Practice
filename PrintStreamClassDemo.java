import java.io.*;
class PrintStreamClassDemo
{
public static void main(String args[]) 
{
try
{
FileOutputStream fout=new FileOutputStream("A11.txt");
PrintStream ps=new PrintStream(fout);
ps.println("KDN");
ps.close();
fout.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}



