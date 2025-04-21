import java.util.concurrent.*;
class Booking
{
static int TotalSeats=10;
synchronized static void movieBooking(int seats)
{
if(TotalSeats>=seats)
{
System.out.println("Tickets are booked");
TotalSeats=TotalSeats-seats;
}
else
{
System.out.println("Seats are not available");
}
}
}

class Synchronization7
{
int seats;
public static void main(String args[])
{

Thread t1=new Thread()
{
public void run()
{
Booking.movieBooking(9);
}
};

Thread t2=new Thread()
{
public void run()
{
Booking.movieBooking(1);
}
};

Thread t3=new Thread()
{
public void run()
{
Booking.movieBooking(5);
}
};

Thread t4=new Thread()
{
public void run()
{
Booking.movieBooking(7);
}
};
t1.start();
t2.start();
t3.start();
t4.start();
}
}