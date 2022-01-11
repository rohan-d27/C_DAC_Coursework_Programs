package study.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.EmployeeDAO;
import study.entity.EmployeeEntity;


@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	EmployeeEntity emp=new EmployeeEntity();
	emp.setName(request.getParameter("name"));
	emp.setJob(request.getParameter("job"));
	String sal=request.getParameter("salary");
	int s=Integer.parseInt(sal);
	emp.setSalary(s);
	emp.setUsername(request.getParameter("uname"));
	emp.setPassword(request.getParameter("pass"));
	
	EmployeeDAO dao=new EmployeeDAO();
	
	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	pw.append("<html><body>");
	
	
	
	if(dao.addUser(emp))
	{
		pw.append("<center><h1>User Added Successfully</h1></center>");
		pw.append("</body></html>");
		pw.close();	
		};
	
	}

}
