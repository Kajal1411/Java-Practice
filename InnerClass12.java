class Outer
{
static String clg="YC";
static class Inner
{
String name;
int rollno;
Inner(String nm,int r)
{
name=nm;
rollno=r;
}
void display()
{
System.out.println("Name:"+name);
System.out.println("Rollno:"+rollno);
System.out.println("College name:"+clg);
System.out.println();
}
}
}
class InnerClass12
{
public static void main(String args[])
{
Outer.Inner in1=new Outer.Inner("kajal",101);
in1.display();

Outer.Inner in2=new Outer.Inner("Yukta",102);
in2.display();
}
}