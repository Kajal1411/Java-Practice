import java.io.*;
class UserInput4
{
public static void main(String args[])
{
try
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
int i=0;

for(i=0;i<=3;i++)
{
System.out.println("Enter your name:");
String name=br.readLine();

System.out.println("Enter your rollno:");
Integer rollno=Integer.parseInt(br.readLine());

System.out.println("Enter marks of first subject:");
Integer m1=Integer.parseInt(br.readLine());

System.out.println("Enter marks of second subject:");
Integer m2=Integer.parseInt(br.readLine());

System.out.println("Enter marks of third subject:");
Integer m3=Integer.parseInt(br.readLine());

float total=m1+m2+m3;
float per=total/3;                                      
if(per>=75)
{
System.out.println("A grade");
}
else if(per<=74&&per>55)
{
System.out.println("B grade");
}
else if(per>=36&&per<55)
{
System.out.println("c grade");
}
else
{
System.out.println("Fail");
}


}

}
catch(Exception e)
{
System.out.println(e);
}
}
}
