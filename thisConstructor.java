class A
{
thisConstructor b;
A(thisConstructor b)
{
this.b=b;  //A sathi ThisConstructor1 cha ref variable
}
void display()
{
System.out.println(b.data);
}
}
class thisConstructor
{
int data=10;
thisConstructor()
{
A a=new A(this);
a.display();
}
public static void main(String args[])
{
thisConstructor t=new thisConstructor();
}
}