interface Person2
{
void display();
}
class InnerClass14
{
public static void main(String args[])
{
Person2 p=new Person2()
{
public void display()
{
System.out.println("Hello");
}
};
p.display();
}
}

