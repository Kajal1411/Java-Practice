package MyPack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatAddSalaryFunction {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		CallableStatement cs=con.prepareCall("{?=call AddEmpSalary(?,?)}");
		cs.setInt(2, 101);
		cs.setInt(3, 102);
		cs.registerOutParameter(1,Types.INTEGER);
		cs.execute();
		System.out.println(cs.getInt(1));
        con.close();
	}

}

//Function

/*
create or replace function AddEmpSalary(eid1 number,eid2 number)
return number 
as
esal1 number;
esal2 number;
begin
select salary into esal1 from table1 where id=eid1;
select salary into esal2 from table1 where id=eid2;
return esal1+esal2;
end;
*/