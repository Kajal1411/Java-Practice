import java.util.regex.*;
class RegularExp4
{
public static void main(String args[])
{
Pattern p=Pattern.compile(".a.");
Matcher m=p.matcher("kaa");
boolean b=m.matches();
System.out.println(b);
}
}