import java.io.*;
class Deserialization4
{
public static void main(String args[])
{
try
{
FileInputStream fin=new FileInputStream("A16.txt");
ObjectInputStream ins=new ObjectInputStream(fin);
Employee e=(Employee)ins.readObject();
System.out.println(e.id);
System.out.println(e.name);
System.out.println(e.salary);
System.out.println(e.mob);
System.out.println(e.d.dd+"/"+e.d.mm+"/"+e.d.yy);
fin.close();
ins.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}