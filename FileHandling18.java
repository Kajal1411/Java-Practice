import java.io.*;
class FileHandling18
{
public static void main(String args[])
{
try
{
CharArrayWriter out1=new CharArrayWriter();
CharArrayWriter out2=new CharArrayWriter();
CharArrayWriter out3=new CharArrayWriter();
CharArrayWriter out4=new CharArrayWriter();

String emp1Name="Kajal";
String emp1Id="101";
String emp2Name="Vaishnavi";
String emp2Id="102";
String emp3Name="Yukta";
String emp3Id="103";
String emp4Name="Sakshi";
String emp4Id="104";

//store into buffer
out1.write(emp1Name+" "+emp1Id);
FileWriter fw1=new FileWriter(emp1Name+".txt");
out1.writeTo(fw1);
out1.flush();
fw1.close();

out2.write(emp2Name+" "+emp2Id);
FileWriter fw2=new FileWriter(emp2Name+".txt");
out2.writeTo(fw2);
out2.flush();
fw2.close();

out3.write(emp3Name+" "+emp3Id);
FileWriter fw3=new FileWriter(emp3Name+".txt");
out3.writeTo(fw3);
out3.flush();
fw3.close();

out4.write(emp4Name+" "+emp4Id);
FileWriter fw4=new FileWriter(emp4Name+".txt");
out4.writeTo(fw4);
out4.flush();
fw4.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}