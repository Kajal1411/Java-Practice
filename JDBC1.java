package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC1 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		Statement st=con.createStatement();
		ResultSet RS=st.executeQuery("select * from JDBCemp");
		while(RS.next())
		{
			System.out.println(RS.getInt(1)+" "+RS.getString(2)+" "+RS.getInt(3));
		}
		con.close();
	}

}
