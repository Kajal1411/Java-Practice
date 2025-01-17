class demo
{
int a,b,c,x,y,z,r;
demo(int a,int b)
{
this.a=a;
this.b=b;
}
demo(int x,int y,int z)
{
this.x=x;
this.y=y;
this.z=z;
}
void add()
{
c=a+b;
System.out.println("Addition:"+c);
}
void mul()
{
r=x*y*z;
System.out.println("Multiplication:"+r);
}
}
class ConstructorOverloading
{
public static void main(String  args[])
{
demo d1=new demo(10,20);
demo d2=new demo(2,3,4);
d1.add();
d2.mul();
}
}
