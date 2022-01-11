package assignment_21dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q1_Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbc_url="jdbc:mysql://localhost:3306/db1";
		String uname="root";
		String pass= "Rohan@16161035";
		Connection con=DriverManager.getConnection(jdbc_url, uname, pass);
		System.out.println("Connection to DB is succesfull"+con);	

		Statement stmt =con.createStatement();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Do you want to insert: yes to continue, no to exit and show records");
			String it=sc.nextLine();


			if(it.equalsIgnoreCase("no"))
			{
				showAllRecords(con);
				break;
			}
			else if(it.equalsIgnoreCase("yes"))
			{
				System.out.println("\nEnter values in format: product_id,product_name,product_cost,product_desc,product_expiry_date(yyyy-mm-dd)");
				String input=sc.nextLine();
				String[] values =input.split(",");
				//insert into product2 values(5,'ssd',4000,xyz,'2021-08-03');
				String sql="insert into product2 values("+values[0]+",'"+values[1]+"',"+values[2]+",'"+values[3]+",'"+values[4]+"')";
				stmt.executeUpdate(sql);
			}

		}


	}
	private static void showAllRecords(Connection con) throws SQLException {

		Statement stmt=con.createStatement();
		String sql="select * from product2";
		ResultSet rs=stmt.executeQuery(sql);

		while(rs.next())
		{
			int id=rs.getInt(1);
			String name=rs.getString(2);
			int cost=rs.getInt(3);
			String desc=rs.getString(4);
			String date=rs.getString(5);
			System.out.println(id+" "+name+" "+cost+" "+desc+" "+date);
		}
	}
}
