class Person
{
int id=101;
String name="kajal";
void show()
{
System.out.println("Id:"+id);
System.out.println("Name:"+name);
}
}

class Emp extends Person
{
int id=102;
String name="Dhanshree";
void show()
{
System.out.println("Id:"+id);
System.out.println("Name:"+name);
}
void display()
{
show();
super.show();
}
}
class SuperMethod
{
public static void main(String args[])
{
Emp e=new Emp();
e.display();
}
}

