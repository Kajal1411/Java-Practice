package MyPack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCinsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		PreparedStatement pst=con.prepareStatement("insert into studentjava values(?,?,?)");
		
		pst.setInt(1,101);
		pst.setString(2,"Kajal");
		pst.setInt(3,90);
		int i;
		i=pst.executeUpdate();
		if(i<=0)
		{
			System.out.println("Data not inserted");
		}
		else
		{
			System.out.println("Data is inserted successfully!");
		}
		
		pst.setInt(1,102);
		pst.setString(2,"vaishnavi");
		pst.setInt(3,80);
		i=pst.executeUpdate();
		if(i<=0)
		{
			System.out.println("Data not inserted");
		}
		else
		{
			System.out.println("Data is inserted successfully!");
		}
		
		pst.setInt(1,103);
		pst.setString(2,"Yukta");
		pst.setInt(3,85);
		i=pst.executeUpdate();
		if(i<=0)
		{
			System.out.println("Data not inserted");
		}
		else
		{
			System.out.println("Data is inserted successfully!");
		}
		
		pst.setInt(1,104);
		pst.setString(2,"sakshi");
		pst.setInt(3,80);
		i=pst.executeUpdate();
		if(i<=0)
		{
			System.out.println("Data not inserted");
		}
		else
		{
			System.out.println("Data is inserted successfully!");
		}
		
		pst.setInt(1,105);
		pst.setString(2,"Aishwarya");
		pst.setInt(3,88);
		i=pst.executeUpdate();
		if(i<=0)
		{
			System.out.println("Data not inserted");
		}
		else
		{
			System.out.println("Data is inserted successfully!");
		}
		con.close();
		

	}

}
