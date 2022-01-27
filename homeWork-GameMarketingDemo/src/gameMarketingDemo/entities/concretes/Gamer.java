package gameMarketingDemo.entities.concretes;

import gameMarketingDemo.entities.abstracts.Entity;

public class Gamer implements Entity{
	
	private int id;
	private String firsName;
	private String lastName;
	private String userName;
	private String password;
	private String eMail;
	private String nationilityId;
	private String gender;
	private int birthYear;
	private double balance;
	
	
	public Gamer() {
		super();
	}
	
	public Gamer(int id, String firsName, String lastName, String userName, String password, String eMail,
			String nationilityId, String gender,int birthYear,double balance) {
		super();
		this.id = id;
		this.firsName = firsName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.eMail = eMail;
		this.nationilityId = nationilityId;
		this.gender = gender;
		this.birthYear=birthYear;
		this.balance=balance;
}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getNationilityId() {
		return nationilityId;
	}
	public void setNationilityId(String nationilityId) {
		this.nationilityId = nationilityId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}	
	