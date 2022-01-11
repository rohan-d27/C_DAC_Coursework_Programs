package assignment_22dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Q5_preps {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbc_url="jdbc:mysql://localhost:3306/db1";
		String uname="root";
		String pass= "Rohan@16161035";
		Connection con=DriverManager.getConnection(jdbc_url, uname, pass);
		System.out.println("Connection to DB is succesfull"+con);	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product id to update description");
		int pid=sc.nextInt();
		System.out.println("Enter new product description");
		String des=sc.next();
		updateRecord(con,pid,des);

	}
	private static void updateRecord(Connection con, int pid,String des) throws SQLException {
		String sql=("update product2 set product_desc=? where product_id=?");
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, pid);
		pstmt.setString(2, des);
		pstmt.executeUpdate();
		showAllRecords(con);
	}
	private static void showAllRecords(Connection con) throws SQLException {

		String sql=("select * from product2");
		PreparedStatement pstmt=con.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();
		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));
	}
}
