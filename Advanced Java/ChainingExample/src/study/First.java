package study;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class First extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//response.getWriter().append("HAPPY NEW YEAR");
		String poem_line1 = "twinkle twinkle little star ";
		
		request.setAttribute("line1",poem_line1);
		
		ServletContext context =super.getServletContext(); //get container's reference
		RequestDispatcher rd = context.getRequestDispatcher("/Second");
		rd.forward(request, response);
		
		
	}

	

}
