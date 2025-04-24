import java.util.*;
class ListMethods
{
public static void main(String args[])
{
ArrayList AL1=new ArrayList();
AL1.add(40);
AL1.add("KDN");
AL1.add(1.2);
AL1.add('A');
AL1.add(50);
System.out.println(AL1);

ArrayList AL2=new ArrayList();
AL2.add(1);
AL2.add(2);
AL2.add(3);
AL2.add(4);
AL2.add(5);
System.out.println(AL2);

//add()
AL1.add(2,"infotech");
System.out.println(AL1);

//addAll()
AL1.addAll(0,AL2);
System.out.println(AL1);

//get()
System.out.println(AL1.get(7));

//set()
AL1.set(7,"Company");
System.out.println(AL1);

//remove()
AL1.remove(7);
System.out.println(AL1);

//listIterator()
System.out.println("Forward using ListIterator:");
ListIterator itr=AL1.listIterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}

System.out.println("Backward using ListIterator:");
while(itr.hasPrevious()) 
{
System.out.println(itr.previous());
}

//listIterator(int index)
System.out.println("Using ListIterator from index 4:");
ListIterator itr1=AL1.listIterator(4);
while(itr1.hasNext())
{
System.out.println(itr1.next());
}

}
}