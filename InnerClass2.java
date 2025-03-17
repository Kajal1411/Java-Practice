class Emp
{
private int eid=101;
private float salary=20000; 
class Account
{
void AnnualSal()
{
float AnuSal=salary*12;
System.out.println("Emp id:"+eid);
System.out.println("Emp Salary:"+salary);
System.out.println("Emp Annual Salary:"+AnuSal);
}
}
}
class InnerClass2
{
public static void main(String args[])
{
Emp e=new Emp();
Emp.Account a=e.new Account();
a.AnnualSal();
}
}