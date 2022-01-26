package gameMarketingDemo.entities.concretes;

import gameMarketingDemo.entities.abstracts.Entity;

public class Sale implements Entity{
	private int id;
	private Game game;
	private Gamer gamer;
	private Campaign campaign;
	private double price;
		
	public Sale() {
		super();
	}
	
	public Sale(int id, Game game, Gamer gamer, Campaign campaign, double price) {
		super();
		this.id = id;
		this.game = game;
		this.gamer = gamer;
		this.campaign = campaign;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Gamer getGamer() {
		return gamer;
	}
	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
