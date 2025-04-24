import java.util.*;
class LinkedList2
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
ListIterator litr=LI.listIterator();
System.out.println("Forward direction:");
while(litr.hasNext())
{
System.out.println(litr.next());
}
System.out.println("Backward direction:");
while(litr.hasPrevious())
{
System.out.println(litr.previous());
}
}
}