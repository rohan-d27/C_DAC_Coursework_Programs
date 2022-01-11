package study;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private HashMap<String,String> users;
	@Override
	public void init() throws ServletException{
		users =new HashMap<String,String>();
		users.put("John", "john123");
		users.put("Smith", "smith123");
		users.put("Clark", "clark123");
		users.put("Martin", "martin123");
		users.put("Chris", "chris123");		
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

}
