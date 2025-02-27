//program to compaire 2 strings using compaireTo() method.
import java.lang.String;
class String5
{
public static void main(String args[])
{
String s1="kajal";
String s2="kajal";
System.out.println(s1.compareTo(s2));  //0

String s3="kajal";
String s4="KAJAL";
System.out.println(s3.compareTo(s4)); //32

String s5="KAJAL";
String s6="kajal";
System.out.println(s5.compareTo(s6));  //-32

}
}