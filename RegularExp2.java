import java.util.regex.*;
class RegularExp2
{
public static void main(String args[])
{
Pattern p=Pattern.compile(".a");
Matcher m=p.matcher("ka");
boolean b=m.matches();
System.out.println(b);
}
}