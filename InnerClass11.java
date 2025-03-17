//static inner class

class Outer
{
static int data=100;
static class Inner
{
void display()
{
System.out.println("Data:"+data);
}
}
}
class InnerClass11
{
public static void main(String args[])
{
Outer.Inner in=new Outer.Inner();
in.display();
}
}