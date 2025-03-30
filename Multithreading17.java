class Test extends Thread 
{
    public void run() 
    {
        System.out.println("Child thread - daemon");
    }
}

class Multithreading17 
{
    public static void main(String args[]) 
    {
        System.out.println("Main thread");
        Test t9 = new Test();
        t9.setDaemon(true); 
        t9.start();

        try 
        {
            Thread.sleep(100); 
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
