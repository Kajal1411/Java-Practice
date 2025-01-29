class Person
{
int id1;
String name1;
Person(int i,String n)
{
id1=i;
name1=n;
System.out.println("Id:"+id1);
System.out.println("Name:"+name1);
}
}
class Emp extends Person
{
int id2;
String name2;
float salary;
Emp(int i,String n,float s)
{
super(101,"kajal");
id2=i;
name2=n;
salary=s;
System.out.println("Id:"+id2);
System.out.println("Name:"+name2);
System.out.println("Salary:"+salary);
}
}
class SuperConstructor
{
public static void main(String args[])
{
Emp e=new Emp(102,"Dhanshree",20000);
}
}