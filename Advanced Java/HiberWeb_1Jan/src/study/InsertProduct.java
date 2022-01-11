package study;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertProduct")
public class InsertProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String desc=request.getParameter("desc");
		int unit=Integer.parseInt(request.getParameter("unit"));
		int cost=Integer.parseInt(request.getParameter("cost"));
		String date=request.getParameter("date");
		HibernateDAO dao=new HibernateDAO();
		dao.addProduct(id, name,desc,unit,cost,date);
		}
	

}
