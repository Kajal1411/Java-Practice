class Outer    //outer class
{
void display()    //method of outer class
{
int data=100;
class Inner   //inner class
{
void msg()    //method of inner class
{
System.out.println("data:"+data);
}
}
Inner in=new Inner();
in.msg();
}
}
 
class InnerClass5
{
public static void main(String args[])
{
Outer out=new Outer();
out.display();
}
}