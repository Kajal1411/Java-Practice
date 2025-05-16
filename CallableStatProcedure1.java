package MyPack1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatProcedure1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		CallableStatement cs=con.prepareCall("{call InsertRecord(?,?)}");
		
		cs.setInt(1, 101);
		cs.setString(2, "Kajal");
        cs.execute();
        
        cs.setInt(1, 102);
		cs.setString(2, "Vaishnavi");
        cs.execute();
        
        cs.setInt(1, 103);
		cs.setString(2, "Yukta");
        cs.execute();
        
        cs.setInt(1, 101);
		cs.setString(2, "Sakshi");
        cs.execute();
        
        cs.setInt(1, 101);
		cs.setString(2, "Aishwarya");
        cs.execute();
        
        con.close();
	}

}

//Procedure

/*
CREATE OR REPLACE PROCEDURE InsertRecord(id in number,name in varchar2) is 
begin
insert into procedure2 values(id,name);
end;
*/