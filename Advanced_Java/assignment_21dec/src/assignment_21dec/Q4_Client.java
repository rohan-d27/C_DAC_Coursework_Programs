package assignment_21dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q4_Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbc_url="jdbc:mysql://localhost:3306/db1";
		String uname="root";
		String pass= "Rohan@16161035";
		Connection con=DriverManager.getConnection(jdbc_url, uname, pass);
		System.out.println("Connection to DB is succesfull"+con);	
		Statement stmt=con.createStatement();
		showAllRecords(con);

	}
	private static void showAllRecords(Connection con) throws SQLException {

		Statement stmt=con.createStatement();
		String sql="select product_id,product_expiry_date from product2";
		ResultSet rs=stmt.executeQuery(sql);

		while(rs.next())
		{
			int id=rs.getInt("product_id");
			String date=rs.getString("product_expiry_date");
			System.out.println(id+" "+date);
		}
	}
}
