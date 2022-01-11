package assignment_22dec;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;



public class CallableStatement_pro7 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = makeConnection();

		String sql = " {call pro7(?,?,?)}";
		CallableStatement cstmt = con.prepareCall(sql);

		cstmt.registerOutParameter(3, Types.INTEGER);

		//In parameter values is set
		cstmt.setInt(1, 100);
		cstmt.setInt(2, 200);

		cstmt.execute();

		int sum = cstmt.getInt(3);
		System.out.println("Sum: "+sum);


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
