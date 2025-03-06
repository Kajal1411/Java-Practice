import java.util.regex.*;
class RegularExp16
{
public static void main(String args[])
{
boolean b1=Pattern.compile(".s").matcher("as").matches();  
System.out.println(b1);
boolean b2=Pattern.compile(".k").matcher("as").matches();  
System.out.println(b2);
}
} 