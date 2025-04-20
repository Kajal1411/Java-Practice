import java.util.concurrent.*;
class Booking
{
int TotalSeats=10;
synchronized void movieBooking(int seats)
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

class Synchronization1 extends Thread
{
static Booking b=new Booking();
int seats;
public void run()
{
b.movieBooking(seats);
}
public static void main(String args[])
{
Synchronization1 deepak=new Synchronization1();
deepak.seats=7;
Synchronization1 amit=new Synchronization1();
amit.seats=6;
deepak.start();
amit.start();
}
}