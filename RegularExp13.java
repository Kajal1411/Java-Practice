import java.util.regex.*;
import java.util.Scanner;
class RegularExp13
{
public static void main(String args[])
{

String username,password;
Scanner sc=new Scanner(System.in);

System.out.println("Enter username:");
username=sc.next();
System.out.println("Enter password:");
password=sc.next();

Pattern p1=Pattern.compile("[A-Za-z0-9]{8,20}");
Matcher m1=p1.matcher(username);
boolean b1=m1.matches();
System.out.println(b1);

Pattern p2=Pattern.compile("(?=.*[@#$])(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{6,8}");
Matcher m2=p2.matcher(password);
boolean b2=m2.matches();
System.out.println(b2);

}
} 

