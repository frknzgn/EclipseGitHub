package Ýnteraction;

import User.*;

public class Ýnteraction {
	
	private User poster;
	private User idler;
	
	
	
	public Ýnteraction() {
		super();
	}
	
	public Ýnteraction(User poster, User idler) {
		super();
		this.poster = poster;
		this.idler = idler;
	}
	
	public User getIdler() {
		return idler;
	}
	public void setIdler(User idler) {
		this.idler = idler;
	}
	public User getPoster() {
		return poster;
	}
	
	
	
}
