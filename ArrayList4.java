import java.util.*;
class ArrayList4
{
public static void main(String args[])
{
ArrayList al=new ArrayList();
al.add(40);
al.add("KDN");
al.add(1.2);
al.add('A');
al.add(50);
for(Object obj:al)  
{
System.out.println(obj);
}
}
}