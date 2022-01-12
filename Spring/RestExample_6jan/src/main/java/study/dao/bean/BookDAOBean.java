package study.dao.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import study.BookPojo;

@Repository
public class BookDAOBean {
	
	@Autowired
	DataSource ds;
	
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	
	public DataSource getDs() {
		return ds;
	}
	
	public ArrayList<BookPojo> getAll()
	{
		ArrayList<BookPojo>  al = new ArrayList<BookPojo>();
	
		try {
			Connection  con = ds.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book");
			while(rs.next())
			{
				al.add(new BookPojo(rs.getInt(1),rs.getInt(2),rs.getString(3)));
				
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return al;
	}
	
	
	public void addBook(int id, int cost, String name)
	{
		try {
		Connection  con = ds.getConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into book values(?,?,?)");
		pstmt.setInt(1, id);
		pstmt.setInt(2, cost);
		pstmt.setString(3, name);
		pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


}
