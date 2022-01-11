package study.entity;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Product_HiberApp {

	public static void main(String[] args) {

		Session session = getSession();
		
		menu(session);
		
		
	}
		public static void menu(Session session)
		{
			System.out.println("****************** Menu ****************");
			System.out.println("1. Add a new prod\n" + 
					"2. Change the product properties \n" + 
					"3. Delete a product\n" + 
					"4. Show details of a  product with a given id\n" + 
					"5. Show All ");
			System.out.println("************************************");
			Scanner sc =new Scanner(System.in);
			int ch=sc.nextInt();
			switch (ch) {
			case 1:
				addProduct(session,sc);
				menu(session);
				break;
			case 2:
				changeProductProperties(session,sc);
				menu(session);
				break;
			case 3:
				deleteProduct(session,sc);
				menu(session);
				break;
			case 4:
				findProductByID(session,sc);
				menu(session);
				break;
			case 5:
				allProducts(session);
				menu(session);
				break;
			default:
				break;
			}	
		}
		private static void allProducts(Session session) {
			Transaction t=session.beginTransaction();
			List<ProductEntity> list=session.createQuery("select al from products2 al").getResultList();
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i));
			}
			t.commit();
			
			
		}
		private static void findProductByID(Session session,Scanner sc) {
			System.out.println("Enter product id:");
			   int id=sc.nextInt();
			ProductEntity obj = session.find(ProductEntity.class, id); 
			if(obj !=null)
				System.out.println(obj);
			
		}
		private static void deleteProduct(Session session,Scanner sc) {
			Transaction t = session.beginTransaction();
			System.out.println("Enter product id:");
			   int id=sc.nextInt();
			ProductEntity obj = session.find(ProductEntity.class, id); 
			if(obj !=null)
				session.delete(obj); 
			
			t.commit();
			
		}
		private static void changeProductProperties(Session session,Scanner sc) {
			session.beginTransaction();
			System.out.println("Enter product id:");
			   int id=sc.nextInt();
			   ProductEntity fromDb = session.find(ProductEntity.class,id);
			   System.out.println("\nEnter coulumn to update: \n1.Product Name"
			   		+ "\n2.Product Cost"
			   		+ "\n3.Product Unit"
			   		+ "\n4.Product Desc"
			   		+ "\n5.Product Expiry Date");
				int ch=sc.nextInt();
				switch (ch) {
				case 1:
					 System.out.println("Enter  updated product name:");
					   String name=sc.next();
						fromDb.setProduct_name(name);
						session.getTransaction().commit(); 
					break;
				case 2:System.out.println("Enter  updated product cost:");
				   int cost=sc.nextInt();
					fromDb.setProduct_cost(cost);
					session.getTransaction().commit(); 
					
					break;
				case 3:
					System.out.println("Enter  updated product unit:");
					   int unit=sc.nextInt();
						fromDb.setProduct_unit(unit);
						session.getTransaction().commit(); 
					break;
				case 4:System.out.println("Enter  updated product desc:");
				   String desc=sc.next();
					fromDb.setProduct_desc(desc);
					session.getTransaction().commit(); 
					
					break;
				case 5:
					System.out.println("Enter  updated product expiryDate:");
					   String date=sc.next();
						fromDb.setProduct_expiryDate(date);
						session.getTransaction().commit(); 
					break;
				
				default:
					break;
			  
				}
			
			
		}
		private static void addProduct(Session session,Scanner sc) {
			Transaction t = session.beginTransaction();
			
			System.out.println("Enter product id:");
			   int id=sc.nextInt();
			   System.out.println("Enter product name:");
			   String name=sc.next();
			   System.out.println("Enter product desc:");
			   String desc=sc.next();
			   System.out.println("Enter product unit:");
			   int unit=sc.nextInt();
			   System.out.println("Enter product cost:");
			   int cost=sc.nextInt();
			   System.out.println("Enter product expirydate: ");
			   String date=sc.next();
			ProductEntity p1=new ProductEntity (id,name,desc,unit,cost,date);    
			 
			        
			    session.save(p1);  
			    t.commit();  
			
		}
		public static Session getSession()
		{
			
			  StandardServiceRegistry registry =  new StandardServiceRegistryBuilder().configure().build();
		   
		    MetadataSources sources = new MetadataSources(registry);
		   
		    Metadata metadata = sources.getMetadataBuilder().build();
		    
		    SessionFactory sessionFactory= metadata.getSessionFactoryBuilder().build();
		   
		    Session session = sessionFactory.openSession(); 
			
		    return session;
		}
			
}
