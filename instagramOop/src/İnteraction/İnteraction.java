package �nteraction;

import User.*;

public class �nteraction {
	
	private User poster;
	private User idler;
	
	
	
	public �nteraction() {
		super();
	}
	
	public �nteraction(User poster, User idler) {
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
