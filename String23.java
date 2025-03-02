import java.lang.String;
class String23
{
public static void main(String args[])
{
String s="what you are doing";
//String words[]=s.split("\\s"); //used to specify divide string at whitespase
String words[]=s.split(" ");  //also used for divide string at whitespase
for(String w:words)
{
System.out.println(w);
}
}
}