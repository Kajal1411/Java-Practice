import java.util.*;
class PriorityQueue1
{
public static void main(String args[])
{
PriorityQueue pq=new PriorityQueue();
//System.out.println(pq.element());   
System.out.println(pq.peek());        

System.out.println(pq.add(10));  
System.out.println(pq.offer(20));  
pq.add(30);
pq.add(40);
pq.add(50);
pq.add(60);
pq.add(70);

System.out.println(pq.element());   
System.out.println(pq.peek()); 

System.out.println(pq);
pq.remove();
pq.poll();
System.out.println(pq);
}
}