class MethodOverLoading
{
int l,b;
void area()
{
l=10;
b=20;
int area=l*b;
System.out.println("Area:"+area);
}
void area(int l,int b)
{
this.l=l;
this.b=b;
int area=l*b;
System.out.println("Area:"+area);
}
public static void main(String args[])
{
MethodOverLoading a=new MethodOverLoading();
a.area(10,10);
}
}  
