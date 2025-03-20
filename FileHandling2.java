import java.io.*;
class FileHandling2
{
public static void main(String args[])
{
try
{
FileOutputStream fout=new FileOutputStream("PersonalInfo.txt");  
String name="Kajal Sanjay Pawar\n"; 
String email="kp668138@gmail.com\n"; 
String mob="1234567890\n"; 
String address="Kharadi,Pune\n"; 
String shortTermGoal="To get a job in a reputed IT company\n"; 
String longTermGoal="Get a higher position in a company"; 

byte[] b1=name.getBytes();
byte[] b2=email.getBytes();
byte[] b3=mob.getBytes();
byte[] b4=address.getBytes();
byte[] b5=shortTermGoal.getBytes();
byte[] b6=longTermGoal.getBytes();

fout.write(b1);
System.out.println(); 
fout.write(b2);
fout.write(b3);
fout.write(b4);
fout.write(b5);
fout.write(b6);

fout.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}                         

