package Concrete;
import Abstract.IEntity;

public class Customer implements IEntity{
	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	private String nationalityId;
	private int birthYear;
	
	
	
	public Customer() {
		super();
	}
	
	public Customer(int id, String firstName, String lastName, String eMail, String nationalityId, int birthYear) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.nationalityId = nationalityId;
		this.birthYear = birthYear;
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
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
}
