package workShop4;

public class Student {
		
	private int id;
	private String firstName;
	private String lastName;
	private String indentityNumber;

	
	
	public Student() {
		super();
	}
	
	public Student(int id, String firstName, String lastName, String indentityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.indentityNumber = indentityNumber;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIndentityNumber() {
		return indentityNumber;
	}
	public void setIndentityNumber(String indentityNumber) {
		this.indentityNumber = indentityNumber;
	}
	
	
}
