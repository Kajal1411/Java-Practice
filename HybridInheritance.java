import java.util.Scanner;
class A
{
int rollno,age;
String name,mob,email,address;
Scanner sc=new Scanner(System.in);
void getdata()
{
System.out.println("Enter roll no:");
rollno=sc.nextInt();
System.out.println("Enter name:");
name=sc.next();
}
void showdata()
{
System.out.println("roll no:"+rollno);
System.out.println("name:"+name);
}
}

class B extends A
{
int m1,m2,m3;
Scanner sc=new Scanner(System.in);
void getmarks()
{
System.out.println("Enter marks for first sub:");
m1=sc.nextInt();
System.out.println("Enter marks for second sub:");
m2=sc.nextInt();
System.out.println("Enter marks for third sub:");
m3=sc.nextInt();
}
}

class C extends B
{
float per;
void calPer()
{
per=(m1+m2+m3)/3;
System.out.println("Percentage:"+per);
}
}

class D extends C
{
void displayGrade()
{
if(per>=60)
{
System.out.println("A grade");
}
else if(per>=40&&per<=59)
{
System.out.println("B grade");
}
else
{
System.out.println("Fail");
}
}
}

class HybridInheritance extends A
{
Scanner sc=new Scanner(System.in);
void getPersonalDetails()
{
System.out.println("Enter age:");
age=sc.nextInt();
System.out.println("Enter mob:");
mob=sc.next();
System.out.println("Enter email:");
email=sc.next();
System.out.println("Enter address:");
address=sc.next();
}
void ShowPersonalDetails()
{
System.out.println("Age:"+age);
System.out.println("Mob:"+mob);
System.out.println("Email:"+email);
System.out.println("Address:"+address);
}
public static void main(String args[])
{
D d=new D();
HybridInheritance h=new HybridInheritance();
d.getdata();
d.getmarks();
h.getPersonalDetails();
d.showdata();
d.calPer();
d.displayGrade();
h.ShowPersonalDetails();
}
}















