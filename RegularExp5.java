import java.util.regex.*;
class RegularExp5
{
public static void main(String args[])
{
Pattern p=Pattern.compile("[abc]");
Matcher m=p.matcher("ab");
boolean b=m.matches();
System.out.println(b);
}
}