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
class MethodOverriding extends demo
{
void area()
{
l=10;
b=10;
double area=0.5*l*b;
System.out.println("Area:"+area);
}
public static void main(String args[])
{
MethodOverriding a=new MethodOverriding();
a.area();
}
}
