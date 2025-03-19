class Outer
{
interface Inner
{
void msg();
}
}
class InterfaceWithinClass implements Outer.Inner
{
public void msg()
{
System.out.println("hello");
}
public static void main(String args[])
{
Outer.Inner e=new InterfaceWithinClass();
e.msg();
}
}