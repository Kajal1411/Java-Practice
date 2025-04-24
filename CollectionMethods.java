import java.util.*;
class CollectionMethods
{
public static void main(String args[])
{

//add()
ArrayList AL1=new ArrayList();
AL1.add(40);
AL1.add("KDN");
AL1.add(1.2);
AL1.add('A');
AL1.add(50);
System.out.println(AL1);

ArrayList AL2=new ArrayList();
AL2.add(1);
AL2.add("kajal");
AL2.add("Pune");
AL2.add('B');
AL2.add(70);
System.out.println(AL2);

ArrayList AL3=new ArrayList();
AL3.add(2);
AL3.add("Vaishnavi");
AL3.add("Satara");
AL3.add('c');
AL3.add(100);
System.out.println(AL3);

ArrayList AL4=new ArrayList();
AL4.add(1);
AL4.add("kajal");
AL4.add("Pune");
AL4.add('B');
AL4.add(70);
System.out.println(AL4);

//addAll()
AL1.addAll(AL2);
System.out.println(AL1);

//contains()
System.out.println(AL1.contains(40));
System.out.println(AL1.contains(90));

//containsAll()
System.out.println(AL1.containsAll(AL2));
System.out.println(AL1.containsAll(AL3));

//equals()
System.out.println(AL2.equals(AL4));
System.out.println(AL2.equals(AL3));

//hashCode()
System.out.println(AL2.hashCode());
System.out.println(AL4.hashCode());
System.out.println(AL1.hashCode());

//remove()
AL3.remove(4);
System.out.println(AL3);


//removeAll()
System.out.println(AL1);
AL1.removeAll(AL2);
System.out.println(AL1);

//retainAll
AL1.addAll(AL2);
System.out.println(AL1);
AL1.retainAll(AL2);
System.out.println(AL1);

//size()
System.out.println(AL1.size());

//clear()
AL1.clear();
System.out.println(AL1);
}
}