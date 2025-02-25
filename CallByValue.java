class CallByValue
{
int data=50;
public void change(int data)
{
data=data+100;
}
public static void main(String args[])
{
CallByValue d=new CallByValue();
System.out.println("Data before change:"+d.data);
d.change(500);
System.out.println("Data after change:"+d.data);
}
}
