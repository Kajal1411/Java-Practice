class thisCallerStatment
{
int a,b,c;
thisCallerStatment()
{
System.out.println("Default constructor");
}
thisCallerStatment(int x)
{
this();
a=x;
System.out.println("a:"+a);
}
thisCallerStatment(int m,int n)
{
this(40);
b=m;
c=n;
System.out.println("b:"+b);
System.out.println("c:"+c);
}
public static void main(String args[])
{
thisCallerStatment t1=new thisCallerStatment(10,2);
}
}





