package com.java.miniproject;

import java.util.List;


import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.java.miniproject.pojo.Hobby;
import com.java.miniproject.pojo.User;



public class HibernateDAO {

	public static void main(String[] args) {


	}
	public boolean validateUser(User newuser)
	{
		Session session =getSession();
		String query ="select * from user2 where uname='"+newuser.getUname()+"' and pass='"+newuser.getPass()+"'";
		Query<User> nuser=session.createNativeQuery(query);
		List<User> users=nuser.getResultList();
		if(users.isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
		

	}
	
	public static Session getSession()
	{
		//READING the hibernate.cfg.xml  from the classpath 
		StandardServiceRegistry registry =  new StandardServiceRegistryBuilder().configure().build();
		// Create MetadataSources
		MetadataSources sources = new MetadataSources(registry);
		// Create Metadata
		Metadata metadata = sources.getMetadataBuilder().build();
		// Create SessionFactory
		SessionFactory sessionFactory= metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession(); // start a transaction

		return session;
	}
	public int addUser(User newuser) {
		Session session=getSession();
		Transaction t=session.beginTransaction();
		session.save(newuser);
		t.commit();
		return 0;
	}
	public void addHobbies(Hobby hb) {
		Session session=getSession();
		Transaction t=session.beginTransaction();
		session.save(hb);
		t.commit();
		
	}
	public void addHobbies2(User cuser) {
		Session session=getSession();
		Transaction t=session.beginTransaction();
		session.save(cuser);
		t.commit();
		
	}
	


}
