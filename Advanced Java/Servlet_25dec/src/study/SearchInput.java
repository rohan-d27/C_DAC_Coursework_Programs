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




@WebServlet("/SearchInput")
public class SearchInput extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		Connection con = SearchInput.makeConnection();
		String bookid = request.getParameter("operation");
		int book_id=Integer.parseInt(bookid);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.append("<html><body>");
		
		try {
			
			Statement stmt=con.createStatement();
			String sql=("select * from book2 where book_id="+book_id);
			ResultSet rs=stmt.executeQuery(sql);

			while(rs.next())
			{
				int i=rs.getInt(1);
				String s=rs.getString(2);
				int c=rs.getInt(3);
				pw.append("<h2>Book Details: Book ID: "+i+"  Book Name: "+s+"  Book Cost:"+c+"</h2>");
			}
					
			
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
