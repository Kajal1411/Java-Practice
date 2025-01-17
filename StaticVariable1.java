class demo
{
public static int rollno=10;
void change()
{
rollno++;
System.out.println(rollno);
}
}
class StaticVariable1
{
public static void main(String args[])
{
demo d1=new demo();
d1.change();
demo d2=new demo();
d2.change();
demo d3=new demo();
d3.change();
}
}