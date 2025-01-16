import java.util.Scanner;
class Student
{
int rollno;
float m1,m2,m3,total,per;
String name;
Student(int r,String nm)
{
rollno=r;
name=nm;
}
public void display()
{
System.out.println(rollno);
System.out.println(name);
}
public void percentage()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks for c++:");
m1=sc.nextFloat();
System.out.println("Enter marks for Java:");
m2=sc.nextFloat();
System.out.println("Enter marks for SQL:");
m3=sc.nextFloat();
total=m1+m2+m3;
System.out.println("Toatal:"+total);
per=total/3;
System.out.println("percentage:"+per);
}
public void grade()
{
if(per>=60)
{
System.out.println("A Grade");
}
else if(per>=40&&per<=59)
{
System.out.println("B Grade");
}
else
{
System.out.println("Fail");
}
}
}

class Grade
{
public static void main(String args[])
{
Student s=new Student(101,"Kajal");
s.display();
s.percentage();
s.grade();
}
}
