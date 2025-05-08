package MyPack1;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCblob 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		PreparedStatement pst=con.prepareStatement("insert into image values(?,?)");
		pst.setString(1,"cat");
		FileInputStream fin=new FileInputStream("C:\\Users\\kajal\\OneDrive\\Desktop\\Frontend\\img\\cat.jpg");  
		pst.setBinaryStream(2,fin,fin.available());
		int i;
		i=pst.executeUpdate();
		if(i>0)
		{
			System.out.println("img is successfully store!");
		}
		else
		{
			System.out.println("img is currept");
		}
		con.close();
	}

}
