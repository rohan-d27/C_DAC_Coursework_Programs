package com.java.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.java.project.pojo.Product;

public class HibernateDAO {
	
	public static Session getSession()
	{		
		  StandardServiceRegistry registry =  new StandardServiceRegistryBuilder().configure().build();	    
	    MetadataSources sources = new MetadataSources(registry);	    
	    Metadata metadata = sources.getMetadataBuilder().build();
	    SessionFactory sessionFactory= metadata.getSessionFactoryBuilder().build();	   
	    Session session = sessionFactory.openSession(); 	
	    return session;
	}
	public void addProduct(int id, String name, String desc, int unit, int cost, String date) {

		Session session =getSession();
		Transaction t=session.beginTransaction();
		Product obj=new Product(id,name,desc,unit,cost,date);
		session.save(obj);
		t.commit();
		
	}
	public static List allProducts() {
		Session session=getSession();
		Transaction t=session.beginTransaction();
		List<Product> list=session.createQuery("select d from product3 d").getResultList();
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}t.commit();
		return list;
		
		
		
	}

}
