class ShallowCopy
{
int x,y;
ShallowCopy(int x,int y)
{
this.x=x;
this.y=y;
}
public void show()
{
System.out.println(x);
System.out.println(y);
}
public static void main(String args[])
{
ShallowCopy s1=new ShallowCopy(100,200);
System.out.println("obj1 data:");
s1.show(); 
ShallowCopy s2;
s2=s1;
System.out.println("obj2 data:");
s2.show(); 
s2.x=300;
System.out.println("After changing obj1 data:");
s1.show();
System.out.println("After changing obj2 data:");
s2.show();

}
}
