package workShop3;

public class Categorie {
	
	private int id;
	private String name;
	private Course[] courses;
	
	
	public Categorie() {
		super();
	}
	
	public Categorie(int id, String name, Course[] courses) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
	
	
	

}
