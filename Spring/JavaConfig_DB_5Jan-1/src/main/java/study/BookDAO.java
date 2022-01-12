package study;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;


@ImportResource("classpath:beans.xml")
public class BookDAO {
	
	@Autowired
	private DataSource  ds; 
	
	public void setDs(DataSource ds) {
		this.ds = ds;
	}
	
	public DataSource getDs() {
		return ds;
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
