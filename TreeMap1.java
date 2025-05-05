import java.util.*;
class TreeMap1
{
public static void main(String args[])
{
TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
tm.put(4,"Kajal");
tm.put(1,"Vaishnavi");
tm.put(3,"Yukta");
tm.put(5,"Sakshi");
tm.put(2,"Aishwarya");
System.out.println(tm);
for(Map.Entry m:tm.entrySet())
{
System.out.println(m.getKey()+" "+m.getValue());
}


}
}
