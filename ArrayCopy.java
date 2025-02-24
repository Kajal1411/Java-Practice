import java.lang.System;
class ArrayCopy
{
public static void main(String args[])
{
int[] A={1,2,3,4,5};
int[] B=new int[5];
int i;
System.arraycopy(A,0,B,0,5);
System.out.println("Array B:");
for(i=0;i<=4;i++)
{
System.out.println(B[i]);
}
}
}


