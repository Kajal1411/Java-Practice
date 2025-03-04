import java.util.regex.*;
class RegularExp11
{
public static void main(String args[])
{
Pattern p=Pattern.compile("X{3,5}");
Matcher m=p.matcher("XXXXXX");
boolean b=m.matches();
System.out.println(b);
}
} 