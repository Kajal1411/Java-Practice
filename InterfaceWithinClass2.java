import java.util.Scanner;
class Outer
{
interface Inner
{
void getdata();
void show();
}
}
class InterfaceWithinClass2 implements Outer.Inner
{
String name;
int rollno;
Scanner sc=new Scanner(System.in);
public void getdata()
{
System.out.println("Enter name:");
name=sc.next();
System.out.println("Enter rollno:");
rollno=sc.nextInt();
}
public void show()
{
System.out.println(rollno);
System.out.println(name);
}
public static void main(String args[])
{
Outer.Inner e=new InterfaceWithinClass2();
e.getdata();
e.show();
}
}