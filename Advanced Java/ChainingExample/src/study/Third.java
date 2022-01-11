package study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Third
 */
@WebServlet("/Third")
public class Third extends HttpServlet {
		//protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			String poem = (String)request.getAttribute("poem");
			
			String finalPoem = poem +"<br>"+"up above the world so high";
			
			response.setContentType("text/html");
			response.getWriter().append(finalPoem);
		
		
		}

	

}
