import java.util.Scanner;
class Emp
{
int eid;
String name;
Emp(int empid,String nm)
{
eid=empid;
name=nm;
}
class Account
{
void AnnualSal()
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
}
class InnerClass4
{
public static void main(String args[])
{
Emp e1=new Emp(101,"abc");
Emp.Account a1=e1.new Account();
a1.AnnualSal();

Emp e2=new Emp(102,"xyz");
Emp.Account a2=e2.new Account();
a2.AnnualSal();

Emp e3=new Emp(103,"pqr");
Emp.Account a3=e3.new Account();
a3.AnnualSal();
}
}
