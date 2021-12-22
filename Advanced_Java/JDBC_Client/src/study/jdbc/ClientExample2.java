package study.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClientExample2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection connect=makeConnection();
		showAllRecords(connect);

	}

	private static void showAllRecords(Connection con) throws SQLException {
		
		Statement stmt=con.createStatement();
		String sql="select * from book";
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next())
		{
			int id=rs.getInt(1);
			int cost=rs.getInt("book_cost");
			String name=rs.getString(3);
			System.out.println(id+" "+name+" "+cost);
		}
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
