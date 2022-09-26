package eh.lesson.test;

import eh.lesson.database.DBConnection;

public class Prog {
	
	public static void main(String[] args) {
		 
		DBConnection dbConn = new DBConnection();
		
		dbConn.openConnection();
		dbConn.closeConnection();
	}	

}
