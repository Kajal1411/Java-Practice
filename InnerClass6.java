import java.util.Scanner;
class Outer   
{
int eid;
String name;
Outer(int id,String nm)
{
eid=id;
name=nm;
}
void display()    
{
class Inner  
{
void msg()    
{
Scanner sc=new Scanner(System.in);
float salary;
float AnuSal;
System.out.println("Emp id:"+eid);
System.out.println("Emp name:"+name);
System.out.println("Enter salary for emp:");
salary=sc.nextFloat();
AnuSal=salary*12;
System.out.println("Emp Salary:"+salary);
System.out.println("Emp Annual Salary:"+AnuSal);
System.out.println();
}
}
Inner in1=new Inner();
in1.msg();
}
}

class InnerClass6
{
public static void main(String args[])
{
Outer out1=new Outer(101,"xyx");
out1.display();

Outer out2=new Outer(102,"abc");
out2.display();
}
}