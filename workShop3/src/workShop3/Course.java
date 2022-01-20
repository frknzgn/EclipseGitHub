package workShop3;

public class Course {
	
	private int id;
	private String name;
	private String statement;
	private String price;
	private String[] images;
	private Educator educator;
	
	
	public Course() {
		super();
	}
	public Course(int id, String name, String statement, String price, String[] images, Educator educator) {
		super();
		this.id = id;
		this.name = name;
		this.statement = statement;
		this.price = price;
		this.images = images;
		this.educator = educator;
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
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String[] getImages() {
		return images;
	}
	public void setImages(String[] images) {
		this.images = images;
	}
	public Educator getEducator() {
		return educator;
	}
	
	
	

}
