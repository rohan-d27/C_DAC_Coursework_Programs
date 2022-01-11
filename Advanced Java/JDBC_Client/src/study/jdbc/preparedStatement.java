package study.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class preparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connect=makeConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values in format: id,cost,bookname");
		String input=sc.nextLine();
		String[] values =input.split(",");
		String sql="insert into book values(?,?,?)";
		PreparedStatement pstmt=connect.prepareStatement(sql);
		
		pstmt.setInt(1, Integer.parseInt(values[0]));
		pstmt.setInt(2, Integer.parseInt(values[1]));
		pstmt.setString(3, values[2]);
		
		pstmt.executeUpdate();
		
		
		
		
		
		
	}
	private static Connection makeConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbc_url="jdbc:mysql://localhost:3306/db1";
		String uname="root";
		String pass= "Rohan@16161035";

		Connection con=DriverManager.getConnection(jdbc_url, uname, pass);
		return con;

	}

}
