import java.lang.String;
class String3
{
public static void main(String args[])
{
String s1="kajal";
String s2="pawar";
System.out.println(s1.equals(s2));  //false

String s3="kajal";
String s4=new String("kajal");
System.out.println(s3.equals(s4));  //true

String s5="KAJAL";
String s6="kajal";
System.out.println(s5.equals(s6));  //false,case not ignore
System.out.println(s5.equalsIgnoreCase(s6)); //true,capiatal and small ignore i.e.case igmore krte,it checks only content

}
}