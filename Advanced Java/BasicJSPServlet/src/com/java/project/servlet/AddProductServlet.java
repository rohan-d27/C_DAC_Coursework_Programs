package com.java.project.servlet;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.project.dao.*;


@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection  connect;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String  id = request.getParameter("id");
		int pid=Integer.parseInt(id);
		String name = request.getParameter("name");
		String desc = request.getParameter("desc");
		String un = request.getParameter("unit");
		int unit=Integer.parseInt(un);
		String co = request.getParameter("cost");
		int cost=Integer.parseInt(co);
		String date = request.getParameter("date");
		HibernateDAO dao=new HibernateDAO();
		dao.addProduct(pid, name,desc,unit,cost,date);
		//openConnection();
		
		//String query="INSERT INTO PRODUCT3 VALUES(?,?,?,?,?,?)";
		
		//int v=0;
		//try {
		//	PreparedStatement pstmt =connect.prepareStatement(query);	
			//pstmt.setInt(1, pid);
			//pstmt.setString(2, name);
			//pstmt.setString(3,desc);
			//pstmt.setInt(4, unit);
			//pstmt.setInt(5,cost);
			//pstmt.setString(6,date);
			// v=pstmt.executeUpdate();
			//System.out.println(query);
			//System.out.println("done");
			response.sendRedirect("success.jsp");
		//} 
		//	catch (SQLException e) {
		
		//	e.printStackTrace();
		//}
		//finally {
			
		//	closeConnection();
		//}
		
	}
	public void openConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java","root","Rohan@16161035");
			System.out.println("Connection with Database Successful!!!");
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}
	public void closeConnection() {
		try {
			connect.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public Connection getConnect() {

		return connect;
	}
}
