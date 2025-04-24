import java.util.*;
class ArrayList7
{
public static void main(String args[])
{
ArrayList<Integer> AL=new ArrayList<Integer>();
AL.add(1);
AL.add(2);
AL.add(3);
AL.add(4);
AL.add(5);
Iterator itr=AL.iterator();

while(itr.hasNext())
{
int fact=1;
int num=(int)itr.next();
System.out.print("Factorial of "+num+":");
while(num>=1)
{
fact=fact*num;
num--;
}
System.out.println(fact);
}

}
}