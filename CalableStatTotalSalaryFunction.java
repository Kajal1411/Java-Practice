package MyPack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatTotalSalaryFunction {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		CallableStatement cs=con.prepareCall("{?=call AddSal()}");
		cs.registerOutParameter(1, Types.INTEGER);
		cs.execute();
		System.out.println(cs.getInt(1));
		con.close();
	}

}

//Function

/*
create or replace function AddSal 
return number
as
total number;
begin
select sum(salary) into total from table1;
return total;
end;
*/