//1.Nested interface(interface within interface)

interface Outer
{
interface Inner
{
void msg();
}
}

class NestedInterface implements Outer.Inner
{
public void msg()
{
System.out.println("hello");
}
public static void main(String args[])
{
Outer.Inner e=new NestedInterface();
e.msg();
}
}