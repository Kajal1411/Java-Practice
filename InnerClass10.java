import java.util.Scanner;
class Shopping
{
double totalAmount;
void display()    
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter total amount:");
totalAmount=sc.nextDouble();
class Discount
{
double discAmount;
double finalAmount;
public void show()
{
System.out.println("Total amount:"+totalAmount);
if(totalAmount<200)
{
System.out.println("No discount");
}
else if((totalAmount>=200)&&(totalAmount<=500))
{
discAmount=totalAmount*(5.0/100);
finalAmount=totalAmount-discAmount;
System.out.println("Discount:5%");
System.out.println("Discount amount:"+discAmount);
System.out.println("Final amount:"+finalAmount);
}
else
{
discAmount=totalAmount*(10.0/100);
finalAmount=totalAmount-discAmount;
System.out.println("Discount:10%");
System.out.println("Discount amount:"+discAmount);
System.out.println("Final amount:"+finalAmount);
}

}
}
Discount d=new Discount();
d.show();

}
}

class InnerClass10
{
public static void main(String args[])
{
Shopping s=new Shopping();
s.display();
}
}