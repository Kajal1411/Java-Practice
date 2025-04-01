class GarbageCollector1
{
protected void finalize()
{
System.out.println("d1 and d2 released");  
}
public static void main(String args[])
{
GarbageCollector1 d1=new  GarbageCollector1();
GarbageCollector1 d2=new  GarbageCollector1();
d1=null;
d2=null;
System.gc();
}
}