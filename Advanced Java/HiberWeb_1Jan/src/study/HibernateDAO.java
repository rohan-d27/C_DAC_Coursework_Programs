package study;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import study.entity.ProductEntity;
import study.entity.StudentEntity;

public class HibernateDAO {

	public static void main(String[] args) {
	

	}
	public void addStudent(int roll,String name)
	{
		Session session =getSession();
		Transaction t=session.beginTransaction();
		StudentEntity obj=new StudentEntity(roll,name);
		session.save(obj);
		t.commit();
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
	public void addProduct(int id, String name, String desc, int unit, int cost, String date) {

		Session session =getSession();
		Transaction t=session.beginTransaction();
		ProductEntity obj=new ProductEntity(id,name,desc,unit,cost,date);
		session.save(obj);
		t.commit();
		
	}
	public static List allProducts() {
		Session session=getSession();
		Transaction t=session.beginTransaction();
		List<ProductEntity> list=session.createQuery("select al from products2 al").getResultList();
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}t.commit();
		return list;
		
		
		
	}

}
