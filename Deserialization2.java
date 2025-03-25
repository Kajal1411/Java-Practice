import java.io.*;
class Deserialization2
{
public static void main(String args[])
{
try
{
FileInputStream fin=new FileInputStream("A15.txt");
ObjectInputStream ins=new ObjectInputStream(fin);
Address a=(Address)ins.readObject();
System.out.println(a.rollno);
System.out.println(a.name);
System.out.println(a.LaneNo+" "+a.HouseNo+" "+a.colony+" "+a.Pincode);
fin.close();
ins.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}