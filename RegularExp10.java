import java.util.regex.*;
class RegularExp10
{
public static void main(String args[])
{
Pattern p=Pattern.compile("X{2}");
Matcher m=p.matcher("XXX");
boolean b=m.matches();
System.out.println(b);
}
} 