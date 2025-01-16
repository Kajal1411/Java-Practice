class emp
{
    int eid;
    String name;
    float salary;
    emp(int e,String nm,float s)
    {
        eid=e;
        name=nm;
        salary=s;
    }
    public void show()
    {
        System.out.println(eid);
        System.out.println(name);
        System.out.println(salary);
    }
}
class ParameterisedConstructor
{
    public static void main(String args[])
    {
        emp e=new emp(101,"kajal",25000);
        e.show();
    }
}
