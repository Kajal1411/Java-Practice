import java.util.regex.*;
class RegularExp6
{
public static void main(String args[])
{
Pattern p=Pattern.compile("[abc]+");
Matcher m=p.matcher("abcbca");
boolean b=m.matches();
System.out.println(b);
}
}