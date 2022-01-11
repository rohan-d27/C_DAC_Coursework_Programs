package assignment_22dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Q1_preps {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbc_url="jdbc:mysql://localhost:3306/db1";
		String uname="root";
		String pass= "Rohan@16161035";
		Connection con=DriverManager.getConnection(jdbc_url, uname, pass);
		System.out.println("Connection to DB is succesfull"+con);	
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
				String sql="insert into product2 values(?,?,?,?,?)";
				PreparedStatement pstmt =con.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(values[0]));
				pstmt.setString(2, values[1]);
				pstmt.setInt(3, Integer.parseInt(values[2]));
				pstmt.setString(4, values[3]);
				pstmt.setString(5, values[4]);
				pstmt.executeUpdate();
			}
		}
	}
	private static void showAllRecords(Connection con) throws SQLException {

		String sql=("select * from product2");
		PreparedStatement pstmt=con.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();
		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));
	}
}
