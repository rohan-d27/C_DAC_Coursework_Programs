package study.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection con = ClientExample2.makeConnection();
		String sql = "update account set balance=? where acct_number=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		con.setAutoCommit(false);  //temporary change 
		try {
		//withdraw 500
		pstmt.setInt(1, 8500);
		pstmt.setInt(2, 100);
		pstmt.executeUpdate();
		System.out.println("withdraw success");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any char to continue");
		sc.hasNext();
		//deposit 500
		pstmt.setInt(1,6000);
		pstmt.setInt(2, 109);
		int howmanyrowsupdated = pstmt.executeUpdate();
		if(howmanyrowsupdated == 0) {
			throw new SQLException();
		}
		System.out.println("deposit success");
		System.out.println("commiting");
		con.commit();
		}catch(SQLException e)
		{
			System.out.println("rolling back"+e);
			con.rollback();
		}
	}
}
