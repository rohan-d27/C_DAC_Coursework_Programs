package study.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	public BookPojo getBookInfo(int bookId)
	{
		Connection con = this.makeConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from book2 where book_id =?");
			pstmt.setInt(1, bookId);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				BookPojo obj = new BookPojo();
				obj.setBookid(rs.getInt(1));
				obj.setBookname(rs.getString(2));
				obj.setBookcost(rs.getInt(3));
				return obj;
			}
			else
			{
				return null;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public List<BookPojo>  getAllBooks()
	{
		Connection con = this.makeConnection();
		ArrayList<BookPojo> al = new ArrayList<BookPojo>();
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from book2");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				BookPojo obj = new BookPojo();
				obj.setBookid(rs.getInt(1));
				obj.setBookname(rs.getString(2));
				obj.setBookcost(rs.getInt(3));
				al.add(obj);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return al;
		
	}
	
	public  Connection makeConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			System.out.println("the driver class is not found in the classpath");
		}
		String jdbc_url = "jdbc:mysql://localhost:3306/db1";
		String uname ="root";
		String pass= "Rohan@16161035";
		
		Connection con=null;
		try {
			con = DriverManager.getConnection(jdbc_url, uname, pass);
		} catch (SQLException e) {
			
			System.out.println("could not connect to DB!!! "+e);
		}
		return con;
	}
	
	

}
