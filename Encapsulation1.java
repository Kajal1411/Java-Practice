import java.util.Scanner;
class Encapsulation1
{
private int id;
private String name;
public void setter()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter id:");
id=sc.nextInt();
if(id>100)
{
System.out.println("Valid");
}
else
{
System.out.println("Invalid");
}
System.out.println("Enter name:");
name=sc.next();
}
public void getter()
{
System.out.println("Id:"+id);
System.out.println("Name:"+name);
}
public static void main(String args[])
{
Encapsulation1 e=new Encapsulation1();
e.setter();
e.getter();
}
}
