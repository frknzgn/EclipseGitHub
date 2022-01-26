package gameMarketingDemo.entities.concretes;

import gameMarketingDemo.entities.abstracts.Entity;

public class Game implements Entity {
	
	private String id;
	private String name;
	private String company;
	private String year;
	private double price;
	
	public Game() {
		super();
	}

	public Game(String id, String name, String company, String year, double price) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.year = year;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
