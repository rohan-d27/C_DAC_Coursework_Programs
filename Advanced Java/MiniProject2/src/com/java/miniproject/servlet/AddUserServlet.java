package com.java.miniproject.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Hibernate;

import com.java.miniproject.DBManager;
import com.java.miniproject.HibernateDAO;
import com.java.miniproject.pojo.User;


@WebServlet("/AddUser")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
    public AddUserServlet() {
        super();
        
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User newuser=new User();
		newuser.setFname(request.getParameter("fname"));
		newuser.setLname(request.getParameter("lname"));
		newuser.setEmail(request.getParameter("email"));
		newuser.setMobile(request.getParameter("mobile"));
		newuser.setUname(request.getParameter("uname"));
		newuser.setPass(request.getParameter("pass"));
		
		HibernateDAO dao =new HibernateDAO();
		
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.append("<html><body>");
		
		//if(dbManager.createUser(firstname,lastname,email,mobile,uname,pass)==1)
		
		if(dao.addUser(newuser)==1)
		{
			pw.append("<center><h1>User Added Successfully</h1></center>");
			pw.append("</body></html>");
			pw.close();	
			};
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
