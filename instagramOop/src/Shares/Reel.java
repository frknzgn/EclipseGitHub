package Shares;

import java.sql.Date;

import User.User;
import �nteraction.Comment;
import �nteraction.Like;

public class Reel extends Share{
	
	
	public Reel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reel(String[] media, Comment[] comments, Like[] likes, User poster, String description, Date sharingTime) {
		super(media, comments, likes, poster, description, sharingTime);
		// TODO Auto-generated constructor stub
	}

	
	
	

}
