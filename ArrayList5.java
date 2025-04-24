import java.util.*;
class ArrayList5
{
public static void main(String args[])
{
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(1);
al.add(2);
al.add(3);
al.add(4);
al.add(5);
Integer[] arr = al.toArray(new Integer[0]);
System.out.println(al);
for(int i=0;i<=4;i++)
{
System.out.println(arr[i]);
}
}
}
