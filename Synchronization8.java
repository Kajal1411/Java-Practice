class Customer
{
int amount=10000;

synchronized void withdraw(int amt)
{
    System.out.println("going to withdraw...");  
    while(amt > amount)
    {
        System.out.println("Less balance, waiting for deposit...");  
        try
        {
            wait();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }  
    amount = amount - amt;
    System.out.println("withdraw completed...");  
}


synchronized void deposite(int amt)
{
System.out.println("going to deposit...");  
amount=amount+amt;  
System.out.println("deposit completed... ");  
notify();  
}
}

class Synchronization8
{
static Customer c= new Customer();
public static void main(String args[])
{

Thread t1=new Thread()
{
public void run()
{
c.withdraw(15000);
}
};
t1.start();

Thread t2=new Thread()
{
public void run()
{
c.deposite(10000);
}
};
t2.start();
}
}