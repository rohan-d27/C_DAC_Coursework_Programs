package com.java.miniproject.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.miniproject.DBManager;
import com.java.miniproject.pojo.User;

@WebServlet("/ViewHobbyServlet")
public class ViewHobbyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ViewHobbyServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session=request.getSession();
		User nuser=(User)session.getAttribute("user");
		 DBManager mgr =new DBManager();
		 ArrayList list=mgr.viewHobbies(nuser);
		 PrintWriter pw =response.getWriter();
			response.setContentType("text/html");
			pw.append("<html><body>" );
			
			for(int i=0;i<list.size();i++)
			{
			pw.append("<h2>"+list.get(i)+"</h2>" );
			}
			pw.append("</body></html>" );
			pw.close();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
