import java.util.concurrent.*;
class Booking
{
int TotalSeats=10;
String info="xyz";
void movieBooking(int seats)
{
synchronized(this)
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
}

class Synchronization4 extends Thread
{
static Booking b=new Booking();
int seats;
public void run()
{
b.movieBooking(seats);
}
public static void main(String args[])
{
Synchronization4 deepak=new Synchronization4();
deepak.seats=7;
Synchronization4 amit=new Synchronization4();
amit.seats=6;
deepak.start();
amit.start();
}
}