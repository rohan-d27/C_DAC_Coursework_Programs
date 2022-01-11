package study;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchBook")
public class SearchBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		Connection con = LoginServlet3.makeConnection();
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.append("<html><link rel='stylesheet' href='external.css'><body>");
		pw.append("<div><h1> <i><center>Search Book by ID</center></i> </h1></div>");
		pw.append("<form action='SearchInput' method='post'><div class='div'><center>");
		
		
		try {
			Statement stmt = con.createStatement();
			String sql = "select book_id from book2";
			ResultSet rs =stmt.executeQuery(sql);
			
			
			pw.append("<p>Book ID:"+"<select name='operation'></p>");
			while(rs.next())
			{
				String bkid = rs.getString(1);
				int bid=Integer.parseInt(bkid);
				pw.append("<option value="+bid+">"+bid+"</option>");
			}	
			pw.append("</select>&nbsp");
			pw.append("<br><br>");
			pw.append("<input type='submit' value='Show Details'> &nbsp");
			pw.append("</center></div></form>");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		pw.append("</body></html>");
		pw.close();	
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
