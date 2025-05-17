package MyPack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingStat1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
			Statement st=con.createStatement();   
			st.addBatch("insert into student values(115,47,44,57,45)");
			st.addBatch("insert into student values(116,62,90,70,70)");
			st.addBatch("insert into student values(117,87,56,76,35)");
			st.addBatch("insert into student values(118,45,87,24,86)");
			st.addBatch("insert into student values(119,56,44,76,45)");
			st.executeBatch();
		    con.close();
	}
}