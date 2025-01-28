class Address
{
int laneNo;
String colony;
String city;
String nearBy;
int pincode;
Address(int laneNo,String colony,String city,String nearBy,int pincode)
{
this.laneNo=laneNo;
this.colony=colony;
this.city=city;
this.nearBy=nearBy;
this.pincode=pincode;

}
}
class Aggregation
{
int id;
String name;
float salary;
String mob;
Address add;
Aggregation(int id,String name,float salary,String mob,Address add)
{
this.id=id;
this.name=name;
this.salary=salary;
this.mob=mob;
this.add=add;
}
public void display()
{
System.out.println("Id:"+id);
System.out.println("Name:"+name);
System.out.println("Salary:"+salary);
System.out.println("Mobile No.:"+mob);
System.out.println("Address:"+add.laneNo+" "+add.colony+" "+add.city+" "+add.nearBy+" "+add.pincode);
}
public static void main(String args[])
{
Address add1=new Address(10,"Yashwantnager","Pune","Kharadi",1234);
Aggregation a2=new Aggregation(101,"kajal",20000,"123467890",add1);
a2.display();
}
}



