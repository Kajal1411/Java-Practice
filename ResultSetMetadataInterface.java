package MyPack1;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;	

public class ResultSetMetaDataInterface 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		Statement st= con.createStatement();
		ResultSet RS= st.executeQuery("select * from teacher");
		ResultSetMetaData RSMT=RS.getMetaData();
		System.out.println(RSMT.getColumnCount());
		System.out.println(RSMT.getColumnName(1));
		System.out.println(RSMT.getColumnTypeName(1));
		System.out.println(RSMT.getTableName(2));
		con.close();
	}
}
