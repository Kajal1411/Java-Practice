import java.io.*;
class Student2 implements Serializable
{
int rollno;
String name;
Student2(int rollno,String name)
{
this.rollno=rollno;
this.name=name;
}
}
class Address extends Student2
{
int LaneNo,HouseNo,Pincode;
String colony;
Address(int LaneNo,int HouseNo,int Pincode,String colony)
{
super(101,"kajal");
this.LaneNo=LaneNo;
this.HouseNo=HouseNo;
this.Pincode=Pincode;
this.colony=colony;
}
}


class Serialization2
{
public static void main(String args[])
{
try
{
Address a=new Address(1,24,123456,"Kharadi");
FileOutputStream fout=new FileOutputStream("A15.txt");
ObjectOutputStream os=new ObjectOutputStream(fout);
os.writeObject(a);
fout.close();
os.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}