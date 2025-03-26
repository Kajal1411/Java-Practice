import java.io.*;
class Deserialization5
{
public static void main(String args[])
{
try
{
FileInputStream fin=new FileInputStream("A17.txt");
ObjectInputStream ins=new ObjectInputStream(fin);
Product[] p=(Product[])ins.readObject();
int i;
for(i=0;i<=4;i++)
{
System.out.println(p[i].pid+" "+p[i].pname+" "+p[i].price);
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