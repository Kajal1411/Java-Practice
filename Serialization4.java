import java.io.*;
class Date1 implements Serializable
{
int dd,mm,yy;
Date1(int dd,int mm,int yy)
{
this.dd=dd;
this.mm=mm;
this.yy=yy;
}
}

class Employee implements Serializable
{
int id;
String name,mob;
float salary;
Date1 d;
Employee(int id,String name,String mob,float salary,Date1 d)
{
this.id=id;
this.name=name;
this.mob=mob;
this.salary=salary;
this.d=d;
}
}

class Serialization4
{
public static void main(String args[])
{
try
{
FileOutputStream fout=new FileOutputStream("A16.txt");
Date1 d=new Date1(1,1,2025);
Employee e=new Employee(101,"Kajal","1234567890",20000,d);
ObjectOutputStream os=new ObjectOutputStream(fout);
os.writeObject(e);
fout.close();
os.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}