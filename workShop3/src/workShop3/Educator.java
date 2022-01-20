package workShop3;

public class Educator extends User {
	
	private Course[] courses;

	public Educator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Educator(int id, String name, String lastName, String eMail, String password, String[] images) {
		super(id, name, lastName, eMail, password, images);
		// TODO Auto-generated constructor stub
		this.courses = courses;
	}
	
	

}
