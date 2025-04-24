import java.util.*;
class StackMethods
{
public static void main(String args[])
{
Stack<String> st=new Stack<String>();
st.push("one");
st.push("two");
st.push("three");
st.push("four");
System.out.println(st);
System.out.println(st.empty());
System.out.println(st.peek());
st.pop();
System.out.println(st);
System.out.println(st.search("two"));
}
}