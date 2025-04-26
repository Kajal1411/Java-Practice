import java.util.*;
class LinkedHashSet1
{
public static void main(String args[])
{
LinkedHashSet <String> lhs=new LinkedHashSet<String>();
lhs.add("Deepak");
lhs.add("KDN");
lhs.add("Infotech");
lhs.add("Amit");
lhs.add("Infotech");  //doesn't take duplicate value
System.out.println(lhs);
}
}