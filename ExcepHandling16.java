//custom exception to check given prodId is valid or not.

import java.io.*;
import java.util.regex.*;
import java.util.Scanner;
class ProductNotFoundException extends Exception
{
public ProductNotFoundException(String str)
{
super(str);
}
}
class ExcepHandling16
{
public static void getProdId() throws ProductNotFoundException
{
int prodId,i;
int prod[]={101,102,103,104,105};
String prodName[]={"Pen","Pencil","notebook","Shampoo","Tothpest"};
boolean flag=false;
Scanner sc=new Scanner(System.in);
System.out.println("Enter product id:");
prodId=sc.nextInt();
for(i=0;i<=4;i++)
{
if(prod[i]==prodId)
{
flag=true;
break;
}
}
if(flag==false)
{
throw new ProductNotFoundException("given product is not exist");
}
else
{
System.out.println(prod[i]+" "+prodName[i]);
}
}
public static void main(String args[])
{
try
{
ExcepHandling16.getProdId();
}
catch(ProductNotFoundException e1)
{
System.out.println(e1);
}
}
}