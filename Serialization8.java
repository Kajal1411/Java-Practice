import java.io.*;
class Demo300 implements Serializable
{
private static final long serialVersionUID = 1L;
int id,price;
String name;
Demo300(int id,int price,String name)
{
this.id=id;
this.price=price;
this.name=name;
}
}

class Serialization8
{
public static void main(String args[])
{
try
{
String s1="no";
String s2;
InputStreamReader is=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(is);
FileOutputStream fout=new FileOutputStream("A21.txt"); 
ObjectOutputStream os=new ObjectOutputStream(fout);
while(true)
{
System.out.println("Enter product id:");
int id=Integer.parseInt(br.readLine());
System.out.println("Enter product name:");
String name=br.readLine();
System.out.println("Enter product price:");
int price=Integer.parseInt(br.readLine());
Demo300 s=new Demo300(id,price,name);
os.writeObject(s);
System.out.println("Can you want to add new products:");
s2=br.readLine();
boolean b=s1.equals(s2);
if(b==true)
{
break;
}
}
fout.close();
os.close();
is.close();
br.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}