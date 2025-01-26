import java.util.Scanner;
class ABC
{
float interestRate;
String BankName;
}

class XYZ extends ABC
{
float money,time;
Scanner sc=new Scanner(System.in);
void getdata()
{
System.out.println("Enter bank name:");
BankName=sc.next();
System.out.println("Enter interestRate:");
interestRate=sc.nextFloat();
System.out.println("Enter money:");
money=sc.nextFloat();
System.out.println("Enter time:");
time=sc.nextFloat();
}
void ShowData()
{
System.out.println("Bank name:"+BankName);
System.out.println("Bank Interest rate:"+interestRate);
System.out.println("Money:"+money);
System.out.println("Time:"+time);
}
}

class MultilevelInheritance2 extends XYZ
{
void CalInterestRate()
{
float interest;
interest=(money*interestRate*time)/100;
System.out.println("Interest is:"+interest);
}
public static void main(String args[])
{
MultilevelInheritance2 m=new MultilevelInheritance2();
m.getdata();
m.ShowData();
m.CalInterestRate();
}
}