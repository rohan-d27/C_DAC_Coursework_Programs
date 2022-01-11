package study.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Connection con = ClientExample2.makeConnection();

		Scanner sc= new Scanner(System.in);
		//System.out.println("enter id,cost and name separated by a coma ");
		//String input = sc.nextLine();
		//String[] values = input.split(",");
		//String sql = "insert into book values("+values[0]+","+values[1]+",'"+values[2]+"')";
		String sql = "insert into book values(?,?,?)"; 
		//pstmt  is TIED UP with sql 
		PreparedStatement pstmt = con.prepareStatement(sql);
		//the 1 is the position of the  ? = parameterIndex
		//pstmt.setInt(1, Integer.parseInt(values[0]));
		//pstmt.setInt(2, Integer.parseInt(values[1]));
		//pstmt.setString(3, values[2]); //automatically if v
		while(true) {
			System.out.println("enter id");
			int id = sc.nextInt();
			System.out.println("enter cost");
			int cost = sc.nextInt();		
			System.out.println("enter name");
			String name = sc.next();
			pstmt.setInt(1, id);
			pstmt.setInt(2, cost);
			pstmt.setString(3, name);
			pstmt.executeUpdate(); //DONT pass anything 
		}

	}
}
