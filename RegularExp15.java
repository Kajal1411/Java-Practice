import java.util.regex.*;
import java.util.Scanner;
class RegularExp15
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
System.out.println("Enter string:");
str=sc.nextLine();

Pattern p=Pattern.compile(str);
Matcher m=p.matcher("KDN Infotech");

if(m.find(6))
{
System.out.println("String is found");
}
else
{
System.out.println("String is not found");
}

}
} 