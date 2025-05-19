package MyPack1;

import java.sql.SQLException;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class EventHandling1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		RowSetFactory factory=RowSetProvider.newFactory();
		JdbcRowSet rowset=factory.createJdbcRowSet();
		rowset.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		rowset.setUsername("hr");
		rowset.setPassword("pass");
		rowset.setCommand("select * from student");
		rowset.execute();
		rowset.addRowSetListener(new MyListener());
		while(rowset.next())
		{
			System.out.println(rowset.getInt(1)+" "+rowset.getInt(2)+" "+rowset.getInt(3)+" "+rowset.getInt(4)+" "+rowset.getInt(5));
		}
	}

}

class MyListener implements RowSetListener
{
	@Override
	public void cursorMoved(RowSetEvent arg0) {
		System.out.println("Cursor moved");
	}
	@Override
	public void rowChanged(RowSetEvent arg0) {
		System.out.println("Row Changed");
	}
	@Override
	public void rowSetChanged(RowSetEvent arg0) {
		System.out.println("ResultSet Changed");
	}
}
