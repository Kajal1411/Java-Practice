class Table
{  
synchronized static void printTable(int n)
{  
for(int i=1;i<=10;i++)
{  
System.out.println(n*i); 
}
System.out.println();
}
}
 
class Demo1 extends Thread
{  
public void run()
{  
Table.printTable(1);  
}  
} 

class Demo2 extends Thread
{  
public void run()
{  
Table.printTable(2);  
}  
} 

class Demo3 extends Thread
{  
public void run()
{  
Table.printTable(3);  
}  
} 

class Demo4 extends Thread
{  
public void run()
{  
Table.printTable(4);  
}  
} 

class Synchronization6 
{  
public static void main(String t[])
{ 
Demo1 t1=new Demo1();
Demo2 t2=new Demo2();
Demo3 t3=new Demo3();
Demo4 t4=new Demo4();
t1.start();
t2.start();
t3.start();
t4.start(); 
}
}