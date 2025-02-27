//program to compaire 2 strings using == operator.
import java.lang.String;
class String4
{
public static void main(String args[])
{
String s1="kajal";
String s2="kajal";
System.out.println(s1==s2);  //TRUE

String s3="kajal";
String s4="KAJAL";
System.out.println(s3==s4);  //FALSE

String s5="kajal";
String s6=new String("kajal");
System.out.println(s5==s6);  //false.because it checks memory and content.
}
}