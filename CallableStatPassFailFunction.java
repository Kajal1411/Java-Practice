package MyPack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatPassFailFunction {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		CallableStatement cs=con.prepareCall("{?=call StudentPassFail(?)}");
		cs.setInt(2,102);
		cs.registerOutParameter(1,Types.VARCHAR);
		cs.execute();
		System.out.println(cs.getString(1));
		con.close();

	}

}
