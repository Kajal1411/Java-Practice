import java.io.*;
class Emp implements Serializable
{
int id;
String name;
float salary;
Emp(int id,String name,float salary)
{
this.id=id;
this.name=name;
this.salary=salary;
}
}
class Serialization3
{
public static void main(String args[])
{
try
{
Emp e1=new Emp(101,"Sanket",20000);
FileOutputStream fout1=new FileOutputStream(e1.name+".txt");
ObjectOutputStream os1=new ObjectOutputStream(fout1);
os1.writeObject(e1);
fout1.close();
os1.close();

Emp e2=new Emp(102,"Ansh",21000);
FileOutputStream fout2=new FileOutputStream(e2.name+".txt");
ObjectOutputStream os2=new ObjectOutputStream(fout2);
os2.writeObject(e2);
fout2.close();
os2.close();

Emp e3=new Emp(103,"Vighnesh",22000);
FileOutputStream fout3=new FileOutputStream(e3.name+".txt");
ObjectOutputStream os3=new ObjectOutputStream(fout3);
os3.writeObject(e3);
fout3.close();
os3.close();

Emp e4=new Emp(104,"Shreeraj",23000);
FileOutputStream fout4=new FileOutputStream(e4.name+".txt");
ObjectOutputStream os4=new ObjectOutputStream(fout4);
os4.writeObject(e4);
fout4.close();
os4.close();

Emp e5=new Emp(105,"Raj",24000);
FileOutputStream fout5=new FileOutputStream(e5.name+".txt");
ObjectOutputStream os5=new ObjectOutputStream(fout5);
os5.writeObject(e5);
fout5.close();
os5.close();

}
catch(Exception e)
{
System.out.println(e);
}
}
}