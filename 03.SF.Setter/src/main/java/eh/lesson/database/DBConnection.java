package eh.lesson.database;

public class DBConnection {
	
	private String url;
	private String username;
	private String password;
	
	public void openConnection() {
		
		System.out.println("URL: " + url);
		System.out.println("UserName: " + username);
		System.out.println("Password: " + password);
		
		System.out.println("DataBase connection open");
	}

	public void closeConnection() {
		
		System.out.println("DataBase connection close");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		

}
