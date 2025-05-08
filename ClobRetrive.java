package MyPack1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClobRetrive 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException 
    {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		Statement st=con.createStatement();
		ResultSet RS=st.executeQuery("select * from clobexample");
		while(RS.next())
		{
			System.out.println(RS.getString(1));
			Clob c=RS.getClob(2);
			Reader r=c.getCharacterStream();
			FileWriter fw=new FileWriter("F:\\NewFile.txt");
			int i;
			while((i=r.read())!=-1)
			{
				fw.write((char)i);
			}
			fw.close();
		}
		con.close();
		
	}

}
