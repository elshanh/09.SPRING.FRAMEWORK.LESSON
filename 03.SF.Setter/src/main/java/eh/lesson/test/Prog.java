package eh.lesson.test;

import eh.lesson.database.DBConnection;

public class Prog {
	
	public static void main(String[] args) {
		 
		DBConnection dbConn = new DBConnection();
		
		dbConn.setUrl("jdbc:mysql://localhost:3306/IFA");
		dbConn.setUsername("root");
		dbConn.setPassword("");
		
		dbConn.openConnection();
		dbConn.closeConnection();
		
		
	}	

}
