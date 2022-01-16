package Ýnteraction;

import User.User;

public class Like extends Ýnteraction {
	
	private int totalLikes;

	
	public Like() {
		super();
	}


	public Like(User poster, User idler,int totalLikes) {
		super(poster,idler);
		this.totalLikes = totalLikes;
	}


	public int getTotalLikes() {
		return totalLikes;
	}
	
	

}
