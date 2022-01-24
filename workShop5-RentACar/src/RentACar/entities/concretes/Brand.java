package RentACar.entities.concretes;

import java.util.List;

import RentACar.entities.abstracts.Entity;


public class Brand implements Entity{
	private int id;
	private String brandName;
	private List<Car> cars;
	
	
	
	

	public Brand() {
		super();
	}


	public Brand(int id, String brandName,List<Car> cars) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.cars = cars;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public List<Car> getCars() {
		return cars;
	}


	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
}
