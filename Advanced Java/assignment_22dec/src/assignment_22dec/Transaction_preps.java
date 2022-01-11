package assignment_22dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Transaction_preps {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection con = makeConnection();
		String sql = "update account set balance=? where acc_no=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		con.setAutoCommit(false);  //temporary change 
		try {
		//withdraw 500
		pstmt.setInt(1, 500);
		pstmt.setInt(2, 123);
		pstmt.executeUpdate();
		System.out.println("withdraw successful");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any char to continue");
		sc.hasNext();
		//deposit 500
		pstmt.setInt(1,1500);
		pstmt.setInt(2,456);
		int howmanyrowsupdated = pstmt.executeUpdate();
		if(howmanyrowsupdated == 0) {
			throw new SQLException();
		}
		System.out.println("deposit successful");
		System.out.println("commiting");
		con.commit();
		}catch(SQLException e)
		{
			System.out.println("rolling back"+e);
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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
