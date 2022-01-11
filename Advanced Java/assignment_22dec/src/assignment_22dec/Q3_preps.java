package assignment_22dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Q3_preps {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbc_url="jdbc:mysql://localhost:3306/db1";
		String uname="root";
		String pass= "Rohan@16161035";
		Connection con=DriverManager.getConnection(jdbc_url, uname, pass);
		System.out.println("Connection to DB is succesfull"+con);	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product_id to delete record");
		int pid=sc.nextInt();
		deleteRecord(con,pid);
		System.out.println("After deletion All Records");
		showAllRecords(con);
	}
private static void deleteRecord(Connection con, int pid) throws SQLException {
		
		
		String sql=("delete from product2 where product_id=?");
		PreparedStatement pstmt =con.prepareStatement(sql);
		pstmt.setInt(1, pid);
		pstmt.executeUpdate();

	}
private static void showAllRecords(Connection con) throws SQLException {

		
		String sql="select * from product2";
		PreparedStatement pstmt =con.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery(sql);

		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
	}
}
