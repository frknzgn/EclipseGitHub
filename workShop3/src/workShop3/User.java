package workShop3;

public class User {
	
	private int id;
	private String eMail;
	private String password;
	
	
	
	
	
	public User() {
		super();
	}
	
	public User(int id, String name, String lastName, String eMail, String password, String[] images) {
		super();
		this.id = id;
		this.eMail = eMail;
		this.password = password;
		
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
