package assignment_22dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Q2_preps {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbc_url="jdbc:mysql://localhost:3306/db1";
		String uname="root";
		String pass= "Rohan@16161035";
		Connection con=DriverManager.getConnection(jdbc_url, uname, pass);
		System.out.println("Connection to DB is succesfull"+con);	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product_id to show details");
		int pid=sc.nextInt();
		showRecord(con,pid);
	}
	private static void showRecord(Connection con,int pid) throws SQLException {

		
		String sql=("select * from product2 where product_id=?");
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, pid);
		ResultSet rs = pstmt.executeQuery();
		
			if(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));

	}
}
