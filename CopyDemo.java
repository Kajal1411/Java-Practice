class Student
{
int age;
String name;
Student()
{
age=10;
name="Akshay";
}
void display()
{
System.out.println(age);
System.out.println(name);
}
Student(Student s)
{
age=s.age;
name=s.name;
}
}
class CopyDemo
{
public static void main(String args[])
{
Student s1=new Student();
System.out.println("s1 object data:");
s1.display();
Student s2=new Student(s1);
System.out.println("s2 object data:");
s2.display();
}
}

