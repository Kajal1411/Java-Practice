import java.util.Scanner;
class Calculator
{
public static void main(String args[])
{
int a,b,c;
char op;
Scanner sc=new Scanner(System.in);
System.out.println("Enter value for a:");
a=sc.nextInt();
System.out.println("Enter value for b:");
b=sc.nextInt();
System.out.println("Enter operator:");
op=sc.next().charAt(0);
switch(op)
{
case '+':c=a+b;
System.out.println("Addition:"+c);
break;

case '-':c=a-b;
System.out.println("Substraction:"+c);
break;

case '*':c=a*b;
System.out.println("Multiplication:"+c);
break;

case '/':c=a/b;
System.out.println("Division:"+c);
break;

case '%':c=a%b;
System.out.println("Modulo:"+c);
break;

default:System.out.println("Invalid operator!");
}
}
}

