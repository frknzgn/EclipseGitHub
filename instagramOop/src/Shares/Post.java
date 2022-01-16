package Shares;

import java.sql.Date;

import User.User;
import �nteraction.Comment;
import �nteraction.Like;

public class Post extends Share {
	
	private String location;
	
	public Post() {
		super();
	}


	public Post(String[] media, Comment[] comments, Like[] likes, User poster, String description, Date sharingTime,String location) {
		super(media,comments,likes,poster,description,sharingTime);
		this.location = location;
	}



	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}	

}
