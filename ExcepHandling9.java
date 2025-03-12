import java.util.Scanner;
import java.io.*;
class ExcepHandling9
{
public static void main(String args[])
{
int a=0,b=0,c=0;
char op;
Scanner sc=new Scanner(System.in);

try
{
System.out.println("Enter value for a:");
a=sc.nextInt();
}

catch(Exception e1)
{
System.out.println("Please enter valid numbers");
sc.next(); // Clear invalid input
System.out.println("Enter value for a:");
a=sc.nextInt();
}

try
{
System.out.println("Enter value for b:");
b=sc.nextInt();
}

catch(Exception e1)
{
System.out.println("Please enter valid numbers");
sc.next(); // Clear invalid input
System.out.println("Enter value for b:");
b=sc.nextInt();
}

finally
{
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

case '/' : try{c=a/b; System.out.println("Division:"+c);break;}


catch(Exception e2)
{
System.out.println("can't divide by zero");
System.out.println("Enter another value for b:");
b=sc.nextInt();
c=a/b; 
System.out.println("Division:"+c);
break;
}

case '%':c=a%b;
System.out.println("Mod:"+c);
break;
default : System.out.println("invalid operator");
}
}

}
}