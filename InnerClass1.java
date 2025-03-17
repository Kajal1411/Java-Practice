class Outer
{
private int data=100;
class Inner
{
void display()
{
System.out.println("data:"+data);
}
}
}
class InnerClass1
{
public static void main(String args[])
{
Outer out=new Outer();
Outer.Inner in=out.new Inner();
in.display();
}
}