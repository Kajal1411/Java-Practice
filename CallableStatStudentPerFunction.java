package MyPack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatStuPerFunction {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		CallableStatement cs=con.prepareCall("{?=call studentPer(?)}");
		cs.setInt(2,102);
		cs.registerOutParameter(1,Types.FLOAT);
		cs.execute();
		System.out.println(cs.getFloat(1));
		con.close();
	}

}

//Function

/*
create or replace function studentPer(eid number)
return number
as
a1 number;
a2 number;
a3 number;
a4 number;
begin
select m1 into a1 from student where id=eid;
select m2 into a2 from student where id=eid;
select m3 into a3 from student where id=eid;
select m4 into a4 from student where id=eid;
return (a1+a2+a3+a4)/4;
end;
*/