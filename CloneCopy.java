class CloneCopy implements Cloneable
{
int x,y;
CloneCopy()
{
x=100;
y=200;
}
public void show()
{
System.out.println(x);
System.out.println(y);
}
public static void main(String args[]) throws CloneNotSupportedException
{
CloneCopy d1=new CloneCopy();
System.out.println("obj1 data:");
d1.show(); 
CloneCopy d2=(CloneCopy)d1.clone();
System.out.println("obj2 data:");
d2.show(); 
d2.x=300;
System.out.println("After changing obj1 data:");
d1.show();
System.out.println("After changing obj2 data:");
d2.show();
}
}
