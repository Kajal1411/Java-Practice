import java.util.regex.*;
class RegularExp9
{
public static void main(String args[])
{
Pattern p=Pattern.compile("X?");
Matcher m=p.matcher("XXX");
boolean b=m.matches();
System.out.println(b);
}
} 