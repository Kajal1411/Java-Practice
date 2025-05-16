package MyPack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.OracleTypes;

public class CallableStatSararyAddProcedure {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		CallableStatement cs=con.prepareCall("{call AddSalary(?,?,?)}");
		cs.setInt(1,102);
		cs.setInt(2,103);
		cs.registerOutParameter(3, Types.NUMERIC);
		cs.execute();
		System.out.println(cs.getInt(3));
		con.close();
	}

}

//Procedure

/*
create or replace procedure AddSalary(eid1 in number,eid2 in number,total out number) is
begin
select sum(salary) into total from table1 where id=eid1 or id =eid2;
end;
*/