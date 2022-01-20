package oop1;

public class CorporateCustomer {
	
	private String taxNumber;
	private String companyName;
	
	
	public CorporateCustomer(String taxNumber, String companyName) {
		super();
		this.taxNumber = taxNumber;
		this.companyName = companyName;
	}
	public CorporateCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	

}
