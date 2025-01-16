class B
{
    int eid;
    String name;
    float salary;
    public void set(int e,String nm,float s)
    {
        eid=e;
        name=nm;
        salary=s;
    }
    public void get()
    {
        System.out.println(eid);
        System.out.println(name);
        System.out.println(salary);
    }
}
class Getset2
{
    public static void main(String args[])
    {
        B a=new B();
        a.set(101,"Kajal",25000);
        a.get();
    }
}