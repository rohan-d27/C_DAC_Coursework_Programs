package assignment_22dec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Transaction2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner sc=new Scanner(System.in);
		Connection con = makeConnection();
		System.out.println("Enter account no to withdraw from:");
		int acc=sc.nextInt();
		System.out.println("Enter amount to withdraw:");
		int amt=sc.nextInt();
		String sql = "update account set balance=balance-? where acc_no=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		con.setAutoCommit(false);  //temporary change 
		try {
			//withdraw 500
			pstmt.setInt(1, amt);
			pstmt.setInt(2, acc);
			pstmt.executeUpdate();
			System.out.println("withdraw successful");

			//deposit
			System.out.println("Enter account no to deposit to:");
			int acc1=sc.nextInt();
			System.out.println("Enter amount to deposit:");
			int amt1=sc.nextInt();
			String sql1 = "update account set balance=balance+? where acc_no=?";
			PreparedStatement pstmt1 = con.prepareStatement(sql1);
			pstmt1.setInt(1,amt1);
			pstmt1.setInt(2,acc1);


			int howmanyrowsupdated = pstmt1.executeUpdate();
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