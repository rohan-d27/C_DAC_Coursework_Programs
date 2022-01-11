package study.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HiberApp {

	public static void main(String[] args) {

		 Session session = getSession();
	
		update(session);
		 delete(session);
		
		  Transaction trx = session.beginTransaction();
		  
		  StudentEntity obj = new StudentEntity(4, "prachi"); //Transient StudentEntity
		// obj1 = new StudentEntity(5, "prashant"); //Transient StudentEntity obj2 = new
		// StudentEntity(6, "julie"); //Transient session.save(obj); //Managed
		//session.save(obj1); session.save(obj2);
		 
		 trx.commit();
		        
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
	


public static void update(Session session)
{
	session.beginTransaction();
	
	//here the object is auto filled with all columns as it is from db
	StudentEntity fromDb = session.find(StudentEntity.class,99);//PERSISTENT 

	//we may change one or two columns
	fromDb.setStudentName("prachee");
	
	/* NOT recommended = if we dont set all columns then the unset columns also get updated as null*/
	//StudentEntity trobj = new StudentEntity(4,"praci");
	//session.saveOrUpdate(trobj);
	
	session.getTransaction().commit(); //reflected in db
}
	

public static void delete(Session session)
{
	Transaction t = session.beginTransaction();
	
	StudentEntity obj = session.find(StudentEntity.class, 4); //Persistent 
	if(obj !=null)
		session.delete(obj); //after this removed state
	
	t.commit();
	
}


}




