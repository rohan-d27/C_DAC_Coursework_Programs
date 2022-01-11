package study;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EntertainmentServlet")
public class EntertainmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String nm=request.getParameter("name");
		String[] etr=request.getParameterValues("enm");
		String res="";
		res=nm+"";
		for (int i = 0; i <etr.length; i++) 
		{
			if(i==0)
			{
				res=res+" Likes "+etr[i];
			}
			else if(i>0) {
				res=res +" And "+etr[i];
			}
			
		}
		pw.append("<html>");
		pw.append("<body>");
		pw.append("<h2>");
		pw.append(res);
		pw.append("</h2>");
		pw.append("</body></html>");
		pw.close();	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
