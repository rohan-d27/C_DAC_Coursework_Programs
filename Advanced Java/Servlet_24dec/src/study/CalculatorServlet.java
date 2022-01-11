package study;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String number1 = request.getParameter("num1");
		int n1=Integer.parseInt(number1);
		
		String number2 = request.getParameter("num2");
		int n2=Integer.parseInt(number2);
		String op = request.getParameter("operation");
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.append("<html><body>");
		if(op.equalsIgnoreCase("add"))
		{
			int res=n1+n2;
			pw.append("<center><h1>Result:"+res+"</h1></center>");

		}
		else if(op.equalsIgnoreCase("sub"))
		{
			int res=n1-n2;
			pw.append("<center><h1>Result:"+res+"</h1></center>");
		}
		else if(op.equalsIgnoreCase("mul"))
		{
			int res=n1*n2;
			pw.append("<center><h1>Result:"+res+"</h1></center>");
		}
		else if(op.equalsIgnoreCase("div"))
		{
			int res=n1/n2;
			pw.append("<center><h1>Result:"+res+"</h1></center>");
		}
		pw.append("</body></html>");
		pw.close();	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
