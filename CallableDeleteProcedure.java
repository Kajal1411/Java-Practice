package MyPack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableDeleteProcedure {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		CallableStatement cs=con.prepareCall("{call DeleteRecord(?)}");
		cs.setInt(1, 103);
		cs.execute();
        con.close();
	}
}

//Procedure

/*
CREATE OR REPLACE PROCEDURE DeleteRecord(eid in number) is 
begin
delete from procedure2 where id=eid;
end;
*/