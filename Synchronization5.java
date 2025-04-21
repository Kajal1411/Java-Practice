import java.util.concurrent.*;
class Bank
{
int TotalAmount=50000;
void payment(int amount)
{
synchronized(this)
{
if(TotalAmount>=amount)
{
System.out.println("Succesfull!");
TotalAmount=TotalAmount-amount;
}
else
{
System.out.println("Insufficient balance");
}
}
}
}

class Synchronization5
{
static Bank b=new Bank();
int seats;
public static void main(String args[])
{

Thread t1=new Thread()
{
public void run()
{
b.payment(45000);
}
};

Thread t2=new Thread()
{
public void run()
{
b.payment(10000);
}
};

t1.start();
t2.start();

}
}