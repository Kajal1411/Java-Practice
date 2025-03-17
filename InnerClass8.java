import java.util.Scanner;
class Person  
{
String name;
Person(String nm)
{
name=nm;
}
void display()    
{
String city,state,pincode;
Scanner sc=new Scanner(System.in);
System.out.println("Enter city:");
city=sc.next();
System.out.println("Enter pincode:");
pincode=sc.next();
System.out.println("Enter state:");
state=sc.next();
class Address
{
void show()    
{
System.out.println("Name:"+name);
System.out.println("City:"+city);
System.out.println("Pincode:"+pincode);
System.out.println("State:"+state);
System.out.println();
}
}
Address a1=new Address();
a1.show();
}
}

class InnerClass8
{
public static void main(String args[])
{
Person p1=new Person("kajal");
p1.display();

Person p2=new Person("Vaishnavi");
p2.display();

Person p3=new Person("Yukta");
p3.display();
}
}