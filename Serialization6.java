import java.io.*;
class Book implements Serializable
{
static int bid;
String bname;
float price;
Book(int bid,String bname,float price)
{
this.bid=bid;
this.bname=bname;
this.price=price;
}
}

class Serialization6
{
public static void main(String args[])
{
try
{
FileOutputStream fout=new FileOutputStream("A18.txt");
ObjectOutputStream os=new ObjectOutputStream(fout);
Book b=new Book(101,"Story",500);
os.writeObject(b);
fout.close();
os.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}

