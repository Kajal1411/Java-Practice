package MyPack1;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSet1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		RowSetFactory factory=RowSetProvider.newFactory();
		JdbcRowSet rowset=factory.createJdbcRowSet();
		rowset.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		rowset.setUsername("hr");
		rowset.setPassword("pass");
		rowset.setCommand("select * from student");
		rowset.execute();
		while(rowset.next())
		{
			System.out.println(rowset.getInt(1)+" "+rowset.getInt(2)+" "+rowset.getInt(3)+" "+rowset.getInt(4)+" "+rowset.getInt(5));
		}
		System.out.println();
		System.out.println("Reverse:");
		while(rowset.previous())
		{
			System.out.println(rowset.getInt(1)+" "+rowset.getInt(2)+" "+rowset.getInt(3)+" "+rowset.getInt(4)+" "+rowset.getInt(5));
		}
		
		}

}
