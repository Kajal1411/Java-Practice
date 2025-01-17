class demo
{
static demo instance;
int a;
private demo()
{
a=10;
}
void show()
{
System.out.println(a);
}
public static demo getobject()
{
instance=new demo();
return instance;
}
}
class PrivateConstructor1
{
public static void main(String args[])
{
demo dd=demo.getobject();
dd.show();
}
}