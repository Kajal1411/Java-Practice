class Person
{
String name;
Person(String nm)
{
name=nm;
}
class Address
{
String city,state,pincode;
Address(String c,String pc,String s)
{
city=c;
pincode=pc;
state=s;
}
void show()
{
System.out.println("Name:"+name);
System.out.println("City:"+city);
System.out.println("Pincode:"+pincode);
System.out.println("State:"+state);
System.out.println();
}
}
}
class InnerClass7
{
public static void main(String args[])
{
Person p1=new Person("Kajal");
Person.Address a1=p1.new Address("Satara","123456","Maharashtra");
a1.show();

Person p2=new Person("Vaishnavi");
Person.Address a2=p2.new Address("Ichalkranji","981427","Maharashtra");
a2.show();

Person p3=new Person("Yukta");
Person.Address a3=p3.new Address("Pune","234125","Maharashtra");
a3.show();

}
}
