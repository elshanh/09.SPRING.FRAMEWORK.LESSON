package eh.lesson.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import eh.lesson.database.DBConnection;

@Configuration
public class AppConfig {
	
	@Bean
	public DBConnection dbConnectionMethod() {
		
		DBConnection dbConnection = new DBConnection();
		
		dbConnection.setUrl("jdbc:mysql://localhost:3306/IFA");
		dbConnection.setUsername("root");
		dbConnection.setPassword("");
		
		return dbConnection;
	}	

}
