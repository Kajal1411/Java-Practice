import java.util.Scanner;
abstract class Demo
{
abstract void area();
}
class Rectangle extends Demo
{
void area()
{
Scanner sc=new Scanner(System.in);
int length,width;
System.out.println("Enter length:");
length=sc.nextInt();
System.out.println("Enter width:");
width=sc.nextInt();
int result=length*width;
System.out.println("Area of rectangle:"+result);
}
}

class Circle extends Demo
{
void area()
{
Scanner sc=new Scanner(System.in);
double r;
System.out.println("Enter radius:");
r=sc.nextDouble();
double result=2*3.14*r;
System.out.println("Area of circle:"+result);
}
}

class Abstraction extends Demo
{
void area()
{
Scanner sc=new Scanner(System.in);
int side;
System.out.println("Enter side:");
side=sc.nextInt();
int result=side*side;
System.out.println("Area of square:"+result);
}
public static void main(String args[])
{
Demo d1=new Rectangle();
d1.area();
Demo d2=new Circle();
d2.area();
 Demo d3=new Abstraction();
d3.area();
}

}

