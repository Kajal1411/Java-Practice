class Emp
{
int eid[]={101,102,103,104,105};
float salary[]={10000,20000,30000,40000,25000};
class Account
{
void AnnualSal()
{
float AnuSal;
int i;
for(i=0;i<=4;i++)
{
System.out.println("Emp id:"+eid[i]);
System.out.println("Emp Salary:"+salary[i]);
AnuSal=salary[i]*12;
System.out.println("Emp Annual Salary:"+AnuSal);
System.out.println();
}
}
}
}
class InnerClass3
{
public static void main(String args[])
{
Emp e=new Emp();
Emp.Account a=e.new Account();
a.AnnualSal();
}
}