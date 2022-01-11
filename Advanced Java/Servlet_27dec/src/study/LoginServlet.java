package study;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	
	private HashMap<String, String> users;
	
	public void init()
	{
		Connection con=makeConection();
		String sql="Select * from user_info";
		
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			users=new HashMap<>();
			
			while(rs.next()) {
				String uname=rs.getString(1);
				String pass=rs.getString(2);
				
				users.put(uname, pass);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw =response.getWriter();
		response.setContentType("text/html");
		
		
		
		pw.append("<!DOCTYPE html>" + 
				"<html>" + 
				"<head>" + 
				"<title>Login</title>" + 
				"<link rel=\"stylesheet\" href=\"external.css\">"+
				"</head>" + 
				"<body>" + 
				"<div><h1><center>Login</center</h1></div>"+
				"<div class='div'>" + 
				"<form action=\"LoginServlet\" method=\"post\">" + 
				"<center>"+
				"UserName:  <input type=\"text\" name=\"Uname\"/><br>" + 
				"Password: <input type=\"password\" name=\"Pass\"/><br>" + 
				"<button type=\"submit\">Login</button>" + 
				"&nbsp"+
				"<button type=\"reset\">Reset</button>" + 
				"</center>"+
				"</form>" + 
				"</div>" + 
				"</body>" + 
				"</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw =response.getWriter();
		response.setContentType("text/html");
		pw.append("doPost called");
		

		String uname = request.getParameter("Uname");
		String pass = request.getParameter("Pass");
		String checkpass = users.get(uname);

		if (checkpass != null) {
			if (checkpass.equals(pass)) {

				request.setAttribute("uname", uname);
				
				ServletContext context = super.getServletContext();
				RequestDispatcher rd=context.getRequestDispatcher("/HomeServlet");
				rd.forward(request, response); 
			} else {
				ServletContext context = super.getServletContext();
				RequestDispatcher rd=context.getRequestDispatcher("/ErrorServlet");
				rd.forward(request, response); 
			}

		}

		pw.close();
	}
	public static Connection makeConection()
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/db1";
		String user="root";
		String password="Rohan@16161035";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
