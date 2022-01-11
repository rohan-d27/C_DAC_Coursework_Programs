package com.java.miniproject.servlet;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.miniproject.DBManager;
import com.java.miniproject.HibernateDAO;
import com.java.miniproject.pojo.Hobby;
import com.java.miniproject.pojo.User;


@WebServlet("/AddHobbyServlet")
public class AddHobbyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddHobbyServlet() {
        super();
     
    }

 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 HttpSession session=request.getSession();
	 User cuser=(User)session.getAttribute("user");
	 HibernateDAO dao=new HibernateDAO();
	 Set<Hobby> hobbies =new HashSet<Hobby>();
	 if(request.getParameter("hobby1").length()>0)
	 {
		 Hobby hb1=new Hobby();
		 hb1.setHobby(request.getParameter("hobby1"));
		 hb1.setUserID(cuser.getUid());
		 hobbies.add(hb1);
		 dao.addHobbies(hb1);
	 }
	 if(request.getParameter("hobby2").length()>0)
	 {
		 Hobby hb2=new Hobby();
		 hb2.setHobby(request.getParameter("hobby2"));
		 hb2.setUserID(cuser.getUid());
		 hobbies.add(hb2);
		 dao.addHobbies(hb2);
	 }
	 if(request.getParameter("hobby3").length()>0)
	 {
		 Hobby hb3=new Hobby();
		 hb3.setHobby(request.getParameter("hobby3"));
		 hb3.setUserID(cuser.getUid());
		 hobbies.add(hb3);
		 dao.addHobbies(hb3);
	 }
	 if(request.getParameter("hobby4").length()>0)
	 {
		 Hobby hb4=new Hobby();
		 hb4.setHobby(request.getParameter("hobby4"));
		 hb4.setUserID(cuser.getUid());
		 hobbies.add(hb4);
		 dao.addHobbies(hb4);
	 }
	cuser.setHobbies(hobbies);
	dao.addHobbies2(cuser);
	 
	 response.sendRedirect("welcome.jsp");
	 
	 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
