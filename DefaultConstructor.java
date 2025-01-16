class emp
{
    int eid;
    String name;
    float salary;
    emp()
    {
        eid=101;
        name="Kajal";
        salary=25000;
    }
    public void show()
    {
        System.out.println(eid);
        System.out.println(name);
        System.out.println(salary);
    }
}
class DefaultConstructor
{
    public static void main(String args[])
    {
        emp e=new emp();
        e.show();
    }
}