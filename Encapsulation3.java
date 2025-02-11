import java.util.Scanner;
class Vowel
{
private char ch;
public void setter(char ch)
{
if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e')
{
this.ch=ch;
System.out.println("Entered character is vowel");
}
else
{
System.out.println("Not valid vowel");
}
}
}
class Encapsulation3
{
public static void main(String args[])
{
char ch1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter character:");
ch1=sc.next().charAt(0);
Vowel v1=new Vowel();
v1.setter(ch1);
}
}