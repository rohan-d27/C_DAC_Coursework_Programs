package assignment_21dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q5_Client {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbc_url="jdbc:mysql://localhost:3306/db1";
		String uname="root";
		String pass= "Rohan@16161035";
		Connection con=DriverManager.getConnection(jdbc_url, uname, pass);
		System.out.println("Connection to DB is succesfull"+con);	
		Statement stmt =con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product id to update description");
		int pid=sc.nextInt();
		System.out.println("Enter new product description");
		String des=sc.next();
		updateRecord(con,pid,des);


	}
	private static void updateRecord(Connection con, int pid,String des) throws SQLException {

		Statement stmt=con.createStatement();
		
		String sql=("update product2 set product_desc='"+des+"' where product_id="+pid);
		stmt.executeUpdate(sql);
		showAllRecords(con);
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
