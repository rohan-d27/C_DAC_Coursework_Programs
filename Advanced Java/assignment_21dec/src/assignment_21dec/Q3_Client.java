package assignment_21dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q3_Client {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbc_url="jdbc:mysql://localhost:3306/db1";
		String uname="root";
		String pass= "Rohan@16161035";
		Connection con=DriverManager.getConnection(jdbc_url, uname, pass);
		System.out.println("Connection to DB is succesfull"+con);	
		
		Statement stmt =con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product_id to delete record");
		int pid=sc.nextInt();
		deleteRecord(con,pid);
		System.out.println("After deletion All Records");
		showAllRecords(con);
		

	}

	private static void deleteRecord(Connection con, int pid) throws SQLException {
		
		Statement stmt=con.createStatement();
		String sql=("delete from product2 where product_id="+pid);
		stmt.executeUpdate(sql);

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
