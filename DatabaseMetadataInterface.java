package MyPack1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseMetaDataInterface 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getDriverVersion());
		System.out.println(dbmd.getUserName());
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println(dbmd.getDatabaseProductVersion());
		String table[]= {"TABLE"};   //always write with capital
		ResultSet RS=dbmd.getTables(null,null,null,table);
		while(RS.next())
		{
			System.out.println(RS.getString("TABLE_NAME"));  
		}
		con.close();

	}

}
