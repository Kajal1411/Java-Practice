class demo
{
double l,b;
void area()
{
l=20;
b=20;
double area=l*b;
System.out.println("Area:"+area);
}
}
class MethodOverrinding1 extends demo
{
void area()
{
l=10;
b=10;
double area=0.5*l*b;
System.out.println("Area:"+area);
}
}
class InstanceOfOperator
{
public static void main(String args[])
{
MethodOverrinding1 a=new MethodOverrinding1();
a.area();
System.out.println(a instanceof demo);
System.out.println(a instanceof MethodOverrinding1);
}
}