

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
//import org.hibernate.cfg.Configuration;


public class Employee_Cleint {
	
	public static void main(String[] args) { 
			
		
		
		 
SessionFactory sessionFactory = new AnnotationConfiguration().configure
            ("hibernate_annotation.cfg.xml").buildSessionFactory();
		
Session session = sessionFactory.openSession();   
		Transaction txn =  session.beginTransaction();
		try{
		 
		Employee employee=new Employee();
			
		employee.setFirstName("hari");
		employee.setLastName("vardhan");
		employee.setSalary(500);
		 session.save(employee);
		 txn.commit();
		 
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			txn.rollback();
			System.out.println("exception while creating employee " + e);
			 e.printStackTrace();
		}
		finally{
			session.close();
		}
}
		
		
	}
	

