class StaticMethod1
{
public static int cube(int a)
{
return a*a*a;
}
public static void main(String args[])
{
int result=StaticMethod1.cube(2);
System.out.println("Cube:"+result);
}
}
