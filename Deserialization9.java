import java.io.*;
class Deserialization9
{
public static void main(String args[])
{
try
{
FileInputStream fin=new FileInputStream("A21.txt");
ObjectInputStream ins=new ObjectInputStream(fin);
while(true)
{
try
{
Demo300 s = (Demo300) ins.readObject();
System.out.println(s.id+" "+s.name+" "+s.price);
}
catch(EOFException e)
{
break;
}
}
fin.close();
ins.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}