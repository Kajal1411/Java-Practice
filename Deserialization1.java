import java.io.*;
class Deserialization1
{
public static void main(String args[])
{
try
{
FileInputStream fin=new FileInputStream("A14.txt");
ObjectInputStream ins=new ObjectInputStream(fin);
Student s=(Student)ins.readObject();
System.out.println(s.id);
System.out.println(s.name);
fin.close();
ins.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}