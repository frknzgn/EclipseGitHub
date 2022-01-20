package oop1;

public class IndividualCustomer extends Customer {
	private String firtsName;
	private String lastName;
	private String nationalitId;
	
	
	public IndividualCustomer() {
		super(); //Base Class'ýn constructorý
	}
	
	public IndividualCustomer(int id, int customerNumber,String firtsName, String lastName, String nationalitId) {
		super(id,customerNumber);
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.nationalitId = nationalitId;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalitId() {
		return nationalitId;
	}

	public void setNationalitId(String nationalitId) {
		this.nationalitId = nationalitId;
	}

	
	
	

}
