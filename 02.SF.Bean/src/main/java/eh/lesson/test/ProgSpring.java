package eh.lesson.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eh.lesson.database.DBConnection;

public class ProgSpring {
	
	public static void main(String[] args) {
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection dbConnection1 = (DBConnection) beanFactory.getBean("dbConnection");
		dbConnection1.openConnection();
		dbConnection1.closeConnection();
		
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection dbConnection2 = abstractApplicationContext.getBean("dbConnection",DBConnection.class);
		dbConnection2.openConnection();
		dbConnection2.closeConnection();
		abstractApplicationContext.close();
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection dbConnection3 = applicationContext.getBean("dbConnection",DBConnection.class);
		dbConnection3.openConnection();
		dbConnection3.closeConnection();	
		
		
		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection dbConnection4 = (DBConnection) configurableApplicationContext.getBean("dbConnection");
		dbConnection4.openConnection();
		dbConnection4.closeConnection();
		configurableApplicationContext.close();
	}	

}
