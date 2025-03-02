import java.util.regex.*;
class RegularExp1
{
public static void main(String args[])
{
Pattern p=Pattern.compile("S");
Matcher m=p.matcher("ABCD");
boolean b=m.matches();
System.out.println(b);
}
}