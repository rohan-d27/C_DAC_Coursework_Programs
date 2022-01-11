package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NationalityServlet")
public class NationalityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nm = request.getParameter("name");
		String nt = request.getParameter("nation");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.append("<html><body>");
		if(nt.equalsIgnoreCase("indian"))
		{
			
			pw.append("<center><h1>"+nm+" is having "+nt+" nationality</h1></center>");

		}
		else if(nt.equalsIgnoreCase("australian"))
		{
			
			pw.append("<center><h1>"+nm+" is having "+nt+" nationality</h1></center>");
		}
		else if(nt.equalsIgnoreCase("canadian"))
		{
			
			pw.append("<center><h1>"+nm+" is having "+nt+" nationality</h1></center>");
		}
		
		pw.append("</body></html>");
		pw.close();	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
