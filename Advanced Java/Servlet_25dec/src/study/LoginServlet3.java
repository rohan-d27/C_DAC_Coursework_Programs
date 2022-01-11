package study;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/LoginServlet3")
public class LoginServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public HashMap<String,String>users=new HashMap<String,String>();	
	


	@Override
	public void init() throws ServletException{
		Connection con = LoginServlet3.makeConnection();	
		try {
			Statement stmt = con.createStatement();
			String sql = "select * from user_info";
			ResultSet rs =stmt.executeQuery(sql);
			
			while(rs.next())
			{
				String uname1 = rs.getString(1);
				String pwd1= rs.getString(2);
				users.put(uname1, pwd1);
			}		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.append("<html><body>");
		if(users.containsKey(username)) {
			if(password.equals(users.get(username)))
		{
			pw.append("<center><h1>Welcome "+username+"</h1></center>");

		}
			else
			{
				pw.append("<center><h1>Invalid Credentials!!!!</h1></center>");
			}
	}
		else
		{
			pw.append("<center><h1>You are not allowed "+username+"</h1></center>");
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
