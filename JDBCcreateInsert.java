package MyPack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCcreateInsert {

	
	public static void main(String[] args)  throws ClassNotFoundException, SQLException, NumberFormatException, IOException{
		int id;
		String name;
		String s1="yes";
		String s2;
		boolean b;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		Statement st=con.createStatement();
		st.executeUpdate("create table teacher(id number(10),name varchar2(20))");
		System.out.println("Table is created successfully!");
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		PreparedStatement pst=con.prepareStatement("insert into teacher values(?,?)");
		while(true)
		{
		System.out.println("Do you want to enter data:");
		s2=br.readLine();
		b=s2.equals(s1);
		if(b==true)
		{
			System.out.println("Enter id:");
			id=Integer.parseInt(br.readLine());
			System.out.println("Enter name:");
			name=br.readLine();
			pst.setInt(1,id);
			pst.setString(2,name);
			pst.executeUpdate();
			System.out.println("Data is inserted successfully!");	
		}
		else
		{
			ResultSet RS=st.executeQuery("select * from teacher");
			while(RS.next())
			{
				System.out.println(RS.getInt(1)+" "+RS.getString(2));
			}
			con.close();
			break;
		}
		}
		
	}

}
