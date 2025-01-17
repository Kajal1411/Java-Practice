class demo
{
public static int a=5;
int b=5;
void sum()
{
int sum=a+b;
a++;
System.out.println("Sum:"+sum);
}
}
class StaticVariable2
{
public static void main(String args[])
{
demo d1=new demo();
d1.sum();
demo d2=new demo();
d2.sum();
demo d3=new demo();
d3.sum();  
}
}
