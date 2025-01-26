import java.util.Scanner;
class ABC
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

class SingleInheritance extends ABC
{
void CalAnualSal()
{
float AnuSal;
AnuSal=salary*12;
System.out.println("Annual salary of emp:"+AnuSal);
}
public static void main(String args[])
{
SingleInheritance s=new SingleInheritance();
s.getdata();
s.ShowData();                           
s.CalAnualSal();
}
}