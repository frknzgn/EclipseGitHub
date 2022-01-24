package RentACar.entities.concretes;

import java.util.List;

import RentACar.entities.abstracts.Entity;


public class Color implements Entity{
	private int id;
	private String colorName;
	private List<Car> cars;
	
	public Color() {
		super();
	}


	public Color(int id, String colorName,List<Car> cars) {
		super();
		this.id = id;
		this.colorName = colorName;
		this.cars=cars;
	}


	public List<Car> getCars() {
		return cars;
	}


	public void setCars(List<Car> cars) {
		this.cars = cars;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getColorName() {
		return colorName;
	}


	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
}
