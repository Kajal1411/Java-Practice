import java.util.regex.*;
class RegularExp12
{
public static void main(String args[])
{
Pattern p=Pattern.compile("[789][0-9]{9}");
Matcher m=p.matcher("7123456642");
boolean b=m.matches();
System.out.println(b);
}
} 