package assignment_21dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q2_Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbc_url="jdbc:mysql://localhost:3306/db1";
		String uname="root";
		String pass= "Rohan@16161035";
		Connection con=DriverManager.getConnection(jdbc_url, uname, pass);
		System.out.println("Connection to DB is succesfull"+con);	
		
		Statement stmt =con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product_id to show details");
		int pid=sc.nextInt();
		showRecord(con,pid);
	}
	private static void showRecord(Connection con,int pid) throws SQLException {

		Statement stmt=con.createStatement();
		String sql=("select * from product2 where product_id="+pid);
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
