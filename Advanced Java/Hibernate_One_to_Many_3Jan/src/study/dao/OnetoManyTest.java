package study.dao;



import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import study.entity.AccountEntity;
import study.entity.EmployeeEntity;

public class OnetoManyTest {

	public static void main(String[] args) {
	Session session=getSession();
	Transaction tr=session.beginTransaction();
	AccountEntity account1 = new AccountEntity();
	  account1.setAccountNumber("Account 1");
	  
	  AccountEntity account2 = new AccountEntity();
	  account2.setAccountNumber("Account 2");
	  
	  AccountEntity account3 = new AccountEntity();
	  account3.setAccountNumber("Account 3");

	  EmployeeEntity firstEmployee = new EmployeeEntity(); 
	  firstEmployee.setEmail("demofirst@mail.com");
	  firstEmployee.setFirstname("demoone");
	  firstEmployee.setLastname("userone");
	  
	  EmployeeEntity secondEmployee = new EmployeeEntity();
	  secondEmployee.setEmail("demosecond@mail.com");
	  secondEmployee.setFirstname("demotwo");
	  secondEmployee.setLastname("usertwo");
	  
	  Set<AccountEntity> accountsOfFirstEmployee = new HashSet<AccountEntity>();
	  accountsOfFirstEmployee.add(account1); 
	  accountsOfFirstEmployee.add(account2);
	  
	  Set<AccountEntity> accountsOfSecondEmployee = new HashSet<AccountEntity>();
	  accountsOfSecondEmployee.add(account3);
	  
	  firstEmployee.setAccounts(accountsOfFirstEmployee);
	  secondEmployee.setAccounts(accountsOfSecondEmployee); //Save Employee
	  
	  session.save(firstEmployee); 
	  session.save(secondEmployee);
	  
	  
	    
	
	 // EmployeeEntity ee =session.find(EmployeeEntity.class,1);
	
	  
	  //ee.getAccounts().stream().forEach((a)->{System.out.println(a.getAccountId());});
	  
	// session.delete(ee);
	  
	 
	 session.getTransaction().commit();
	  
		
	}
	public static Session getSession()
	{
		
		  StandardServiceRegistry registry =  new StandardServiceRegistryBuilder().configure().build();
	    MetadataSources sources = new MetadataSources(registry);
	  
	    Metadata metadata = sources.getMetadataBuilder().build();
	  
	    SessionFactory sessionFactory= metadata.getSessionFactoryBuilder().build();
	   
	    Session session = sessionFactory.openSession(); // start a transaction
		
	    return session;
	}
}
