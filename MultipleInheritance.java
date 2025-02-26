interface ABC
{
void add();
}
interface XYZ
{
void mul();
}
class Demo implements ABC,XYZ
{
public void add()
{
int a=10,b=10;
int c=a+b;
System.out.println("Addition:"+c);
}
public void mul()
{
int a=10,b=10;
int c=a*b;
System.out.println("Multiplication:"+c);
}
}
class MultipleInheritance
{
public static void main(String args[])
{
Demo d=new Demo();
d.add();
d.mul();
}
}