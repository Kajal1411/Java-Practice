package MyPack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.OracleTypes;

public class CallableSalaryRangeProcedure {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		CallableStatement cs=con.prepareCall("{call SalaryRange(?,?,?)}");
		cs.setInt(1,10000);
		cs.setInt(2,25000);
		cs.registerOutParameter(3, OracleTypes.CURSOR);
		cs.execute();
		ResultSet RS=(ResultSet)cs.getObject(3);
		while(RS.next())
		{
			System.out.println(RS.getInt(1)+" "+RS.getString(2)+" "+RS.getInt(3));
		}
		con.close();
	}
}
