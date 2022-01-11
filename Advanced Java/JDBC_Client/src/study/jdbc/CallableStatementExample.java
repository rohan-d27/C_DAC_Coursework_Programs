package study.jdbc;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
public class CallableStatementExample {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection con = ClientExample2.makeConnection();

		String sql = " {call pro7[(?,?,?)]}";
		CallableStatement cstmt = con.prepareCall(sql);

		cstmt.registerOutParameter(3, Types.INTEGER);

		//In parameter values is set
		cstmt.setInt(1, 12);
		cstmt.setInt(2, 100);

		cstmt.execute();

		int sum = cstmt.getInt(3);
		System.out.println(sum);

	}

}
