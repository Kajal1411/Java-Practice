import java.util.Scanner;
class ABC
{
int id;
Scanner sc=new Scanner(System.in);
void GetId()
{
System.out.println("Enter emp id:");
id=sc.nextInt();
}
void ShowId()
{
System.out.println("Emp id:"+id);
}
}

class XYZ extends ABC
{
float salary;
String name;
Scanner sc=new Scanner(System.in);
void getdata()
{
System.out.println("Enter emp name:");
name=sc.next();
System.out.println("Enter emp salary:");
salary=sc.nextFloat();
}
void ShowData()
{
System.out.println("Emp name:"+name);
System.out.println("Emp salary:"+salary);
}
}

class MultilevelInheritance1 extends XYZ
{
void CalAnualSal()
{
float AnuSal;
AnuSal=salary*12;
System.out.println("Annual salary of emp:"+AnuSal);
}
public static void main(String args[])
{
MultilevelInheritance1 m=new MultilevelInheritance1();
m.GetId();
m.getdata();
m.ShowId();
m.ShowData();
m.CalAnualSal();
}
}