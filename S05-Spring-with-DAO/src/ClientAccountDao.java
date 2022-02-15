import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//ClientAccountDao.java
public class ClientAccountDao {
	public static void main(String[] args) {
ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext_Dao.xml");
		
AccountDao accDao = (AccountDao)factory.getBean("accountDao");

		Account account = new Account();
		account.setAccno(49);
		account.setAccName("Kiran");
		account.setAccType("Saving1");
		account.setBal(7777.00);
			//System.out.println(account);
			
		accDao.save(account); // save to database 
			
	    System.out.println("Account No : "+account.getAccno());
		System.out.println("Account Name : "+account.getAccName());
		System.out.println("Account Type :"+account.getAccType());
		System.out.println("Account Balance :"+account.getBal());
		
		
	}
}
