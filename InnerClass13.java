abstract class Person
{
abstract void display();
}
class InnerClass13
{
public static void main(String args[])
{
Person p=new Person()
{
void display()
{
System.out.println("Hello");
}
};
p.display();
}
}