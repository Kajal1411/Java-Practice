import java.util.regex.*;
class RegularExp7
{
public static void main(String args[])
{
Pattern p=Pattern.compile("[^abc]");
Matcher m=p.matcher("s");
boolean b=m.matches();
System.out.println(b);
}
}