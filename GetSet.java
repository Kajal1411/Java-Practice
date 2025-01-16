class A
{
    int a,b;
    public void set(int x,int y)
    {
        a=x;
        b=y;
    }
    public void get()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
class Getset
{
    public static void main(String args[])
    {
        A a=new A();
        a.set(10,20);
        a.get();
    }
}