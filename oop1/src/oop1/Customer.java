package oop1;

public class Customer {
	private int id;
	private int customerNumber;
	
	public Customer(int id, int customerNumber) {
		super();
		this.id = id;
		this.customerNumber = customerNumber;
	}
	public Customer() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	

}
