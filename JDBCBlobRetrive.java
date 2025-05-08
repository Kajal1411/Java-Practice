package MyPack1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCblobRetrive 
{


	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException
     {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		Statement st=con.createStatement();
		ResultSet RS=st.executeQuery("select * from image");
		while(RS.next())
		{
			System.out.println(RS.getString(1));
			Blob b=RS.getBlob(2);  //to take img
			FileOutputStream fout=new FileOutputStream("C:\\Users\\kajal\\OneDrive\\Desktop\\img.jpg");
			byte brr[]=b.getBytes(1, (int)b.length());  
			fout.write(brr);
			fout.close();
		}
		
		con.close();
	}

}
