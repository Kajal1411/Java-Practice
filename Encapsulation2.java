import java.util.Scanner;
class Voting
{
private int age;
public void setter(int age)
{
if(age>=18)
{
this.age=age;
System.out.println("Valid for voting");
}
else
{
System.out.println("Not valid for voting");
}
}
}
class Encapsulation2
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter age:");
n=sc.nextInt();
Voting v1=new Voting();
v1.setter(n);
}
}