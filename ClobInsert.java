package MyPack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class clobInsert 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException 
    {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		PreparedStatement pst=con.prepareStatement("insert into clobexample values(?,?)");
		File f=new File("F:\\file.txt");
		FileReader fr=new FileReader(f);
		pst.setString(1, "KN");
		pst.setCharacterStream(2,fr,(int)f.length());
		int i=pst.executeUpdate();
		if(i>0)
		{
			System.out.println("File is stored successfully!");
		}
		else
		{
			System.out.println("File is not stored.");
		}
		
		con.close();

	}

}
