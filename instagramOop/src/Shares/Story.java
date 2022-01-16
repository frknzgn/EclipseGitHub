package Shares;

import java.util.Date;

import User.User;
import �nteraction.Comment;
import �nteraction.Like;

public class Story extends Share{
	
	private Date endTime;

	public Story() {
		super();
	}
	
	public Story(String[] media, Comment[] comments, Like[] likes, User poster, String description,
			java.sql.Date sharingTime,Date endTime) {
		super(media, comments, likes, poster, description, sharingTime);
		// TODO Auto-generated constructor stub
		this.endTime = endTime;
	}

	public Date getEndTime() {
		return endTime;
	}
	
	
	
	

}
