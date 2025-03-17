//custom exception to check balance is suffieient or not to debit the money.Also check cid is valid or not.

import java.io.*;
import java.util.Scanner;
class InsufficientBalanceException extends Exception
{
public InsufficientBalanceException(String str1)
{
super(str1);
}
}

class CidNotFoundException extends Exception
{
public CidNotFoundException(String str2)
{
super(str2);
}
}

class ExcepHandling17
{
public static void demo() throws InsufficientBalanceException,CidNotFoundException
{
int cid[]={101,102,103,104,105};
int balance[]={10000,25000,14000,20000,7000};
int id,amount,i;
boolean flag=false;
Scanner sc=new Scanner(System.in);
System.out.println("Enter customer id:");
id=sc.nextInt();
System.out.println("Enter amount to debit:");
amount=sc.nextInt();

for(i=0;i<cid.length;i++)
{
if(cid[i]==id)
{
flag=true;
break;
}
}


if(flag==true)
{
if(amount>balance[i])
{
throw new InsufficientBalanceException("your balance is not sufficient to debit money");
}
else
{
System.out.println("Sufficient! you can debit the money");
}

}
else
throw new CidNotFoundException("Given customer id is not valid");
}

public static void main(String args[])
{
try
{
ExcepHandling17.demo();
}
catch(InsufficientBalanceException e1)
{
System.out.println(e1);
}
catch(CidNotFoundException e2)
{
System.out.println(e2);
}
}
}












