package study.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection con = ClientExample2.makeConnection();
		//String sql = "select * from book where book_cost<? ";
		String sql = "select * from book where book_id=? ";
		PreparedStatement pstmt =con.prepareStatement(sql);
		//pstmt.setInt(1,  600);
		pstmt.setInt(1, 2001);
		ResultSet rs = pstmt.executeQuery();
		//while(rs.next())
		if(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getString(3));

	}

}
