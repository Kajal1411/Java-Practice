import java.util.Scanner;
class Avg extends Thread
{
float[] m1=new float[10];
float[] m2=new float[10];
float[] m3=new float[10];
float[] avg=new float[10];
float Total;

public void run()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks for first subject:");
for(int i=0;i<10;i++)
{
m1[i]=sc.nextFloat();
}
System.out.println("Enter marks for second subject:");
for(int j=0;j<10;j++)
{
m2[j]=sc.nextFloat();
}
System.out.println("Enter marks for third subject:");
for(int k=0;k<10;k++)
{
m3[k]=sc.nextFloat();
}
System.out.println();
System.out.println("Average of 10 students:");
for(int x=0;x<10;x++)
{
Total=(m1[x]+m2[x]+m3[x]);
System.out.println("Student "+(x+1)+":"+Total);
avg[x]=Total;
}
Per p=new Per(avg);
p.start();
}
}

class Per extends Thread
{
float percentage;
float[] per=new float[10];
float[] avg=new float[10];
Per(float avg[])
{
this.avg=avg;
}
public void run()
{
System.out.println();
System.out.println("Percentage of 10 students:");
for(int i=0;i<10;i++)
{
percentage=avg[i]/3;
System.out.println("Student "+(i+1)+":"+percentage);
per[i]=percentage;
}
System.out.println();
PassFail g=new PassFail(per);
g.start();
}
}

class PassFail extends Thread
{
float[] per=new float[10];
PassFail(float per[])
{
this.per=per;
}
public void run()
{
for(int i=0;i<10;i++)
{
if(per[i]<35)
{
System.out.println("Student "+(i+1)+":Fail");
}
else
{
System.out.println("Student "+(i+1)+":Pass");
}
}
}
}

class Multithreading16
{
public static void main(String args[])
{
Avg a=new Avg();
a.start();
}
}
