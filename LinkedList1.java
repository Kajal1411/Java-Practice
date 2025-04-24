import java.util.*;
class LinkedList1 
{
public static void main(String args[])
{
LinkedList LI=new LinkedList();
LI.add("KDN");
LI.add(1.2);
LI.add('A');
LI.add(50);
LI.add(70);
System.out.println(LI);
Iterator itr=LI.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}