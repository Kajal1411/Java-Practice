interface Outer
{
void msg();
class Inner
{
public void msg()
{
System.out.println("Hi");
}
}
}
class ClassWithinInterface
{
public static void main(String args[])
{
Outer.Inner e=new Outer.Inner(); 
e.msg();
}
}
