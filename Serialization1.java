import java.io.*;
class Student implements Serializable
{
int id;
String name;
Student(int id,String name)
{
this.id=id;
this.name=name;
}
}
class Serialization1
{
public static void main(String args[])
{
try
{
Student s=new Student(101,"kajal");
FileOutputStream fout=new FileOutputStream("A14.txt");
ObjectOutputStream os=new ObjectOutputStream(fout);
os.writeObject(s);
fout.close();
os.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}