import java.util.Scanner;
interface BookMyShow
{
void BookTicket();
class Ticket
{
public void BookTicket()
{
int ticketsAvailable=10;
int ticketsWant;
Scanner sc=new Scanner(System.in);
System.out.println("How many tickets you want?:");
ticketsWant=sc.nextInt();
if(ticketsWant>ticketsAvailable)
{
System.out.println("Can't book more than 10 tickets");
}
else
{
System.out.println("Your tickets are booked!");
}
}
}
}
class ClassWithinInterface2
{
public static void main(String args[])
{
BookMyShow.Ticket e=new BookMyShow.Ticket(); 
try
{
e.BookTicket();
}
catch(Exception e1)
{
System.out.println(e1);
System.out.println("Invalid value.Please enter valid value!");
e.BookTicket();
}
}
}


