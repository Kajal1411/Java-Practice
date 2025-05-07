package MyPack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCreate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		Statement st=con.createStatement();
		st.executeUpdate("create table studentjava(rollno number(10),name varchar2(20),marks number(10))");
		System.out.println("Table is created");
		con.close();	
	}
}