import java.io.*;
class Product implements Serializable
{
int pid;
String pname;
float price;
Product(int pid,String pname,float price)
{
this.pid=pid;
this.pname=pname;
this.price=price;
}
}
class Serialization5
{
public static void main(String args[])
{
try
{
FileOutputStream fout=new FileOutputStream("A17.txt");
ObjectOutputStream os=new ObjectOutputStream(fout);
Product p1=new Product(101,"laptop",50000);
Product p2=new Product(102,"Mobile",25000);
Product p3=new Product(103,"tab",5000);
Product p4=new Product(104,"PC",35000);
Product p5=new Product(105,"TV",25000);
Product[] arr={p1,p2,p3,p4,p5};
os.writeObject(arr);
fout.close();
os.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}


