package MyPack1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionManagenment2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","pass");
		try
		{
			String s1="yes";
			String s2;
			String s3="commit";
			String s4="rollback";
			boolean b;
			int id,m1,m2,m3,m4;
			Statement st=con.createStatement();
			InputStreamReader ir=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(ir);
			PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?,?,?)");
			while(true)
			{
				System.out.println("Do you want to enter data:");
				s2=br.readLine();
				b=s2.equals(s1);
				if(b==true)
				{
					System.out.println("Enter id:");
					id=Integer.parseInt(br.readLine());
					System.out.println("Enter marks for m1:");
					m1=Integer.parseInt(br.readLine());
					System.out.println("Enter marks for m2:");
					m2=Integer.parseInt(br.readLine());
					System.out.println("Enter marks for m3:");
					m3=Integer.parseInt(br.readLine());
					System.out.println("Enter marks for m4:");
					m4=Integer.parseInt(br.readLine());
					pst.setInt(1,id);
					pst.setInt(2,m1);
					pst.setInt(3,m2);
					pst.setInt(4,m3);
					pst.setInt(5,m4);
					pst.executeUpdate();
					System.out.println("Data is inserted successfully!");	
				}
				else
				{
					System.out.println("Do you want to commit or rollback the data:"); 
					s2=br.readLine();
					boolean b1=s2.equals(s3);
					boolean b2=s2.equals(s4);
					if(b1==true)
					{
						con.commit();
						break;
					}
					if(b2==true)
					{
						con.rollback();
					}
					
				}
			}		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		con.close();
	}

}