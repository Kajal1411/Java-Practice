import java.util.Scanner;
class A
{
int a,b;
Scanner sc=new Scanner(System.in);
void getdata()
{
System.out.println("Enter value for a:");
a=sc.nextInt();
System.out.println("Enter value for b:");
b=sc.nextInt();
}
}

class B extends A
{
int sum;
void sum()
{
sum=a+b;
}
}

class C extends A
{
int mul;
void mul()
{
mul=a*b;
}
}

class D extends B
{
void ShowSum()
{
System.out.println("Sum:"+sum);
}
}

class HierarchicalInheritance extends C
{
void ShowMul()
{
System.out.println("Multiplication:"+mul);
}
public static void main(String args[])
{
D d=new D();
d.getdata();
d.sum();
d.ShowSum();
HierarchicalInheritance h=new HierarchicalInheritance();
h.getdata();
h.mul();
h.ShowMul();
}
}








