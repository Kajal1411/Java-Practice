interface Area
{
public static final double PI=3.14;
void area();
}

class Rectangle implements Area
{
public void area()
{
double length=10,width=40;
double area=length*width;
System.out.println("Area of rectangle:"+area);
}
}

class Circle implements Area
{
public void area()
{
double r=20;
double area=PI*r*r;
System.out.println("Area of circle:"+area);
}
}

class Square implements Area
{
public void area()
{
double side=20;
double area=side*side;
System.out.println("Area of square:"+area);
}
}

class Trianle implements Area
{
public void area()
{
double base=10,height=25;
double area=0.5*base*height;
System.out.println("Area of trianle:"+area);
}
}

class Trapozoidal implements Area
{
public void area()
{
double base1=10,base2=25,height=25;
double area=0.5*(base1+base2)*height;
System.out.println("Area of trapozoidal:"+area);
}
}

class Parallelogram implements Area
{
public void area()
{
double base=10,height=25;
double area=base*height;
System.out.println("Area of parallelogram:"+area);
}
}


class  Interface
{
public static void main(String args[])
{
 Rectangle r=new Rectangle();
 r.area();
 Circle c=new Circle ();
 c.area();
 Square s=new Square();
 s.area();
 Trianle t=new Trianle();
 t.area();
 Trapozoidal tp=new Trapozoidal();
 tp.area();
 Parallelogram p=new Parallelogram();
 p.area();
}
}