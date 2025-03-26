import java.io.*;
class Deserialization6
{
public static void main(String args[])
{
try
{
FileInputStream fin=new FileInputStream("A18.txt");
ObjectInputStream ins=new ObjectInputStream(fin);
Book b=(Book)ins.readObject();
System.out.println(b.bid);
System.out.println(b.bname);
System.out.println(b.price);
fin.close();
ins.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}