class A
{
double pi=3.14;
void circumference(thisMethod t2)
{
System.out.println("Result:"+(pi*t2.d));
}
}
class thisMethod
{
int d=18;
public static void main(String args[])
{    
thisMethod t1=new thisMethod();
t1.m1();
}
void m1()
{
A a=new A();
a.circumference(this);
}
}
