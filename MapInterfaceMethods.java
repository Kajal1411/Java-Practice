import java.util.Map;
import java.util.HashMap;   
class MapInterfaceMethods
{
public static void main(String args[])
{

//put()
HashMap<Integer,String> hm1=new HashMap<Integer,String>();
hm1.put(1,"Kajal");
hm1.put(2,"Vaishnavi");
hm1.put(3,"Yukta");
hm1.put(4,"Sakshi");
hm1.put(5,"Aishwarya");
System.out.println(hm1);

HashMap<Integer,String> hm2=new HashMap<Integer,String>();
hm2.put(6,"Sanket");
hm2.put(7,"Vighnesh");
hm2.put(8,"Shreeraj");
hm2.put(9,"Mayur");
hm2.put(10,"Ansh");
System.out.println(hm2);

//putAll()
hm1.putAll(hm2);
System.out.println(hm1);

//get()
System.out.println(hm1.get(2));

//containsKey()
System.out.println(hm1.containsKey(4));
System.out.println(hm1.containsKey(11));

//containsValue()
System.out.println(hm1.containsValue("Kajal"));
System.out.println(hm1.containsValue("Pawar"));

//replace()
hm1.replace(1,"Pawar");
System.out.println(hm1);

//replace(key,oldvalue,newvalue)
hm1.replace(3,"Yukta","Hiware");
System.out.println(hm1);

//remove()
hm1.remove(5);
System.out.println(hm1);

//keySet()
System.out.println(hm1.keySet());

//values
System.out.println(hm1.values());

//entrySet()
System.out.println(hm1.entrySet());

for(Map.Entry m:hm1.entrySet())
{
System.out.println(m.getKey()+" "+m.getValue());
}
}
}