package com.java.miniproject.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Hibernate;

import com.java.miniproject.DBManager;
import com.java.miniproject.HibernateDAO;
import com.java.miniproject.pojo.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		User nuser=new User();
		nuser.setUname( request.getParameter("uname"));
		nuser.setPass(request.getParameter("pass"));
		HibernateDAO dao=new HibernateDAO();
		if(dao.validateUser(nuser)==true){
			HttpSession session =request.getSession();
			session.setAttribute("user", nuser);
			ServletContext context = super.getServletContext();
			RequestDispatcher rd=context.getRequestDispatcher("/welcome.jsp");
			rd.forward(request, response); 
		}
		else
		{
			ServletContext context = super.getServletContext();
			RequestDispatcher rd=context.getRequestDispatcher("/error.jsp");
			rd.forward(request, response); 
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
