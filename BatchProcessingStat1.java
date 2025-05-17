package MyPack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchProcessingPreparedStat1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		 PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?,?,?)");
		 pst.setInt(1,120);
		 pst.setInt(2,56);
		 pst.setInt(3,76);
		 pst.setInt(4,87);
		 pst.setInt(5,99);
		 pst.addBatch();
		 
		 pst.setInt(1,121);
		 pst.setInt(2,55);
		 pst.setInt(3,77);
		 pst.setInt(4,44);
		 pst.setInt(5,97);
		 pst.addBatch();
		 
		 pst.executeBatch();
		 con.close();

	}

}
