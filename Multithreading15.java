import java.util.Scanner;
class Add extends Thread
{
public void run()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number:");
int a=sc.nextInt();
System.out.println("Enter second number:");
int b=sc.nextInt();
int result=a+b;
System.out.println("Addition:"+result);
}
}

class Sub extends Thread
{
public void run()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number:");
int a=sc.nextInt();
System.out.println("Enter second number:");
int b=sc.nextInt();
int result=a-b;
System.out.println("Substraction:"+result);

}
}

class Mul extends Thread
{
public void run()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number:");
int a=sc.nextInt();
System.out.println("Enter second number:");
int b=sc.nextInt();
int result=a*b;
System.out.println("Multiplication:"+result);
}
}

class Div extends Thread
{
public void run()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number:");
int a=sc.nextInt();
System.out.println("Enter second number:");
int b=sc.nextInt();
int result=a/b;
System.out.println("Division:"+result);
}
}

class Multithreading15
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter operator:");
char op=sc.next().charAt(0);
switch(op)
{
case '+' : Add c1=new Add();  
c1.start();
break;

case '-' : Sub c2=new Sub();  
c2.start();
break;

case '*' : Mul c3=new Mul();  
c3.start();
break;

case '/' : Div c4=new Div();  
c4.start();
break;

default : System.out.println("Invalid operator");
}
}
}







