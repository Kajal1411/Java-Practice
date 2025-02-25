class CallByReference
{
int data=50;
public void change(CallByReference d2)
{
d2.data=d2.data+100;
}
public static void main(String args[])
{
CallByReference d1=new CallByReference();
System.out.println("Data before change:"+d1.data);
d1.change(d1);
System.out.println("Data after change:"+d1.data);
}
}
