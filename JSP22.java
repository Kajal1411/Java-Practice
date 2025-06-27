//Test.java
package myPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Test extends TagSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userid;  
    
	public void setUserid(String userid) 
	{  
	    this.userid = userid;  
	}  
	  
	public int doStartTag() throws JspException 
	{  
	    JspWriter out=pageContext.getOut();  
	    	try
	    	{
	    		int count=0;
	    		Class.forName("oracle.jdbc.driver.OracleDriver");
	    		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
	    		PreparedStatement pst = con.prepareStatement("select * from OrderHistory where userid = ?");
	    		pst.setInt(1, Integer.parseInt(userid));
	    		ResultSet RS = pst.executeQuery();

	    		out.print("<br>");
    			out.print("<br>");
    			
	    		out.print("<table border='2px solid black'>");
    			out.print("<fieldset>");
    			out.print("<tr>");
    			out.print("<th>Userid</th>");
    			out.print("<th>Uname</th>");
    			out.print("<th>Upass</th>");
    			out.print("<th>Pid</th>");
    			out.print("<th>Pname</th>");
    			out.print("<th>Price</th>");
    			out.print("</tr>");
    			
	    		while(RS.next())
	    		{
	    			count++;
	    			out.print("<tr>");
	    			out.print("<td>"+RS.getInt(1)+"</td>");
	    			out.print("<td>"+RS.getString(2)+"</td>");
	    			out.print("<td>"+RS.getString(3)+"</td>");
	    			out.print("<td>"+RS.getInt(4)+"</td>");
	    			out.print("<td>"+RS.getString(5)+"</td>");
	    			out.print("<td>"+RS.getInt(6)+"</td>");
	    			out.print("</tr>");  		    
	    		    out.print("<br>");
	    		}
	    		out.print("</fieldset>");
    			out.print("</table>");
	    		out.print("<br><br>");
	    		out.print("You are ordered total "+count+" products!!!");
	    		con.close();
	    	}
	        catch(Exception e)
	    	{
	        	System.out.print(e);
	    	}  
	      
	    return SKIP_BODY;  
	}  
}
