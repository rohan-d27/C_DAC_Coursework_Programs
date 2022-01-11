package study;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S2
 */
@WebServlet("/S2")
public class S2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Roses, Pocket full of foses");
		
		RequestDispatcher rd = super.getServletContext().getRequestDispatcher("/S3");
		rd.include(request, response);
		
	
	}

	

}
