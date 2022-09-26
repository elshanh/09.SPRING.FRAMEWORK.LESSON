package eh.lesson.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eh.lesson.config.AppConfig;
import eh.lesson.database.DBConnection;

public class ProgAnnotation {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		DBConnection dbConnection = configurableApplicationContext.getBean(DBConnection.class);
		dbConnection.openConnection();
		dbConnection.closeConnection();
		configurableApplicationContext.close();
	}	

}
