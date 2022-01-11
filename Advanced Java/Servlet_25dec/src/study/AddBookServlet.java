package study;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String bookid = request.getParameter("bkid");
		int book_id=Integer.parseInt(bookid);
		String book_name = request.getParameter("bknm");
		String bookcost = request.getParameter("bkck");
		int book_cost=Integer.parseInt(bookcost);
		Connection con = AddBookServlet.makeConnection();
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.append("<html><body>");
		
		try {
			String sql="insert into book2 values(?,?,?)";
			PreparedStatement pstmt =con.prepareStatement(sql);
			pstmt.setInt(1, book_id);
			pstmt.setString(2, book_name);
			pstmt.setInt(3,book_cost);
			pstmt.executeUpdate();
					pw.append("<h1>Book Inserted Successfully</h1>");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		pw.append("</body></html>");
		pw.close();	
		try {
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static Connection makeConnection()
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
			
			System.out.println("could not counnect to DB "+e);
		}
		return con;
	}
}
