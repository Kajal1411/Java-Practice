import java.util.regex.*;
class RegularExp8
{
public static void main(String args[])
{
Pattern p=Pattern.compile("[a-zA-Z]");
Matcher m=p.matcher("ab");
boolean b=m.matches();
System.out.println(b);
}
} 