package oop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product();  //instance creation
									   //default constructor
		product1.setName("Iphone12");
		product1.setDiscount(1000);
		product1.setUnitPrice(12000);
		
		Product product2 = new Product(2,"Iphone 13",15000,1500,new String[] {},"128 GB");
									  //parametrized constructor method
		
		Customer furkan = new IndividualCustomer(1,1,"furkan","ozgun","123123123");
		Customer Turkcell = new CorporateCustomer(2, 2, "123123123","Turkcell");
		
		Customer[] customer= {furkan,turkcell};
		
		
		
		

}
