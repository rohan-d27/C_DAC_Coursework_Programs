package study.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ClientExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbc_url="jdbc:mysql://localhost:3306/db1";
		String uname="root";
		String pass= "Rohan@16161035";

		Connection con=DriverManager.getConnection(jdbc_url, uname, pass);
		System.out.println("Connection to DB is succesfull"+con);	

		Statement stmt =con.createStatement();
		//String sql= "insert into book values(1001,500,'BookName2')";

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values in format: id,cost,bookname");
		String input=sc.nextLine();
		String[] values =input.split(",");
		String sql="insert into book values("+Integer.parseInt(values[0])+","+Integer.parseInt(values[1])+",'"+values[2]+"')";
		stmt.executeUpdate(sql);



	}
}
