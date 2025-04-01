class GarbageCollector2
{
public void show()
{
System.out.println("Hello");
}
protected void finalize()
{
System.out.println("d1 and d2 released");  
}
public static void main(String args[])
{
GarbageCollector2 d1=new GarbageCollector2();
d1.show();
GarbageCollector2 d2=new GarbageCollector2();
d2=d1;
System.gc();
}
}