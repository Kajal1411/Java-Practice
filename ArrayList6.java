import java.util.*;
class Student
{
String name,add;
int rollno;
Student(String name,int rollno,String add)
{
this.name=name;
this.rollno=rollno;
this.add=add;
}
}

class ArrayList6
{
public static void main(String args[])
{
Student s1=new Student("kajal",1,"Pune");
Student s2=new Student("Vaishnavi",2,"Mumbai");
Student s3=new Student("Yukta",3,"Satara");
Student s4=new Student("Aishwarya",4,"Karad");
Student s5=new Student("Sakshi",5,"Kolhapur");
ArrayList al=new ArrayList();
al.add(s1);
al.add(s2);
al.add(s3);
al.add(s4);
al.add(s5);
Iterator itr=al.iterator();
while(itr.hasNext())
{
Student s=(Student)itr.next();  
System.out.println(s.name+" "+s.rollno+" "+s.add);
}
}
}