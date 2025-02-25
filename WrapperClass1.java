import java.lang.*;
class WrapperClass1
{
public void add(Integer a,Integer b)
{
Integer c;
c=a+b;
System.out.println(c);
}

public static void main(String args[])
{
Integer m1=10;
Integer m2=20;
WrapperClass1 obj1=new WrapperClass1();
obj1.add(m1,m2);
}
}