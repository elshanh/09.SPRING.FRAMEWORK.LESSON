package eh.lesson.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eh.lesson.database.DBConnection;

public class ProgSpring {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection dbConnection4 = (DBConnection) configurableApplicationContext.getBean("dbConnection");
		
		dbConnection4.openConnection();
		dbConnection4.closeConnection();
		
		configurableApplicationContext.close();
	}	

}
