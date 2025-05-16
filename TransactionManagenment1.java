package MyPack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionManagenment1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		try
		{
			Statement st=con.createStatement();
			con.setAutoCommit(false);
			st.executeUpdate("insert into student values(108,67,54,87,75)");
			st.executeUpdate("insert into student values(109,62,50,80,70)");
			con.commit();
			System.out.println("Data is inserted Successfully!");
		}
		catch(Exception e)
		{
			con.rollback();
		}
		con.close();
	}

}