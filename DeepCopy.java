class DeepCopy
{
int x,y;
DeepCopy()
{
x=100;
y=200;
}
public void show()
{
System.out.println(x);
System.out.println(y);
}
public static void main(String args[])
{
DeepCopy d1=new DeepCopy();
System.out.println("obj1 data:");
d1.show(); 
DeepCopy d2=new DeepCopy();
d2.x=d1.x;
d2.y=d1.y;
System.out.println("obj2 data:");
d2.show(); 
d2.x=300;
System.out.println("After changing obj1 data:");
d1.show();
System.out.println("After changing obj2 data:");
d2.show();
}
}


