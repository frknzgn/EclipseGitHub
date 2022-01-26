package gameMarketingDemo.entities.concretes;

import java.util.ArrayList;

import gameMarketingDemo.entities.abstracts.Entity;

public class Campaign implements Entity {
	
	private int id;
	private String name;
	private int duration;
	private ArrayList<Game> games;
	private double discount;
	
	public Campaign() {
		super();
	}
	public Campaign(int id, String name, int duration, ArrayList<Game> games, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.games = games;
		this.discount = discount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public ArrayList<Game> getGames() {
		return games;
	}
	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
}
