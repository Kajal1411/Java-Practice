class GarbageCollector3 
{
public void show()
{
System.out.println("Hello");
}
protected void finalize()
{
System.out.println("memory released");  
}

public static void main(String args[])
{
GarbageCollector3 g=new GarbageCollector3();
g.show();
Thread t1=new Thread()
{
public void run()
{
System.gc();
}
};
t1.start();
}
}