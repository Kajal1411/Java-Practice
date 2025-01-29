class Person
{
int id=101;
String name="kajal";
}
class Emp extends Person
{
int id=102;
String name="Dhanshree";
void show()
{
System.out.println("Id:"+id);
System.out.println("Name:"+name);
System.out.println("Id:"+super.id);
System.out.println("Name:"+super.name);
}
}
class SuperVariable
{
public static void main(String args[])
{
Emp e=new Emp();
e.show();
}
}

