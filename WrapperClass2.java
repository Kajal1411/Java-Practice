class WrapperClass2
{
public void swap(Integer a,Integer b)
{
Integer c;
System.out.println("Before Swaping:");
System.out.println("a:"+a);
System.out.println("b:"+b);
c=a;
a=b;
b=c;
System.out.println("After Swaping:");
System.out.println("a:"+a);
System.out.println("b:"+b);
}

public static void main(String args[])
{
Integer m1=10;
Integer m2=20;
WrapperClass2 obj1=new WrapperClass2();
obj1.swap(m1,m2);
}
}