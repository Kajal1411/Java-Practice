package MyPack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableUpdateProcedure {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","Pass");
		CallableStatement cs=con.prepareCall("{call UpdateData(?,?,?)}");
		cs.setInt(1, 104);
		cs.setString(2,"xyz");
		cs.setInt(3, 25000);
		cs.execute();
		con.close();
	}

}

//Procedure

/*
CREATE OR REPLACE PROCEDURE UpdateData(eid in number,ename in varchar,esalary in number) is 
begin
update table1 set name=ename,salary=esalary where id=eid;
end;
*/