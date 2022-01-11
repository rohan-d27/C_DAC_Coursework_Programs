package study;

import org.hibernate.Transaction;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;


import study.entity.EmployeeEntity;

public class EmployeeDAO {

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
	
	public boolean validateUser(EmployeeEntity emp)
	{
		Session session =getSession();
		String query ="select * from employee_hibernate where username='"+emp.getUsername()+"' and password='"+emp.getPassword()+"'";
		Query<EmployeeEntity> nuser=session.createNativeQuery(query);
		List<EmployeeEntity> list=nuser.getResultList();
		if(list.isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
	
		
	}
	 public boolean addUser(EmployeeEntity newUser)
	 {
		 Session session=getSession();
		 Transaction t=session.beginTransaction();
		 session.save(newUser);
		 t.commit();
		return true;
		 
	 }

}
