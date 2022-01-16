package Ýnteraction;

import User.User;

public class Comment extends Ýnteraction{
	
	private String desbriction;
	private Like[] likes;
	
	
	
	public Comment() {
		super();
	}

	public Comment(User poster, User idler,String desbriction, Like[] likes) {
		super(poster,idler);
		this.desbriction = desbriction;
		this.likes = likes;
	}
	
	public String getDesbriction() {
		return desbriction;
	}
	public void setDesbriction(String desbriction) {
		this.desbriction = desbriction;
	}
	public Like[] getLikes() {
		return likes;
	}
	public void setLikes(Like[] likes) {
		this.likes = likes;
	}
	
	
	
	
	
	
}
