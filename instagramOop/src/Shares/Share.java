package Shares;
import java.sql.Date;

import User.*;
import Ýnteraction.*;

public class Share {
	
	private String[] media;
	private Comment[] comments;
	private Like[] likes;
	private User poster;
	private String description;
	private Date sharingTime;
	
	public Share() {
		super();
	}
	
	
	
	public Share(String[] media, Comment[] comments, Like[] likes, User poster, String description, Date sharingTime) {
		super();
		this.media = media;
		this.comments = comments;
		this.likes = likes;
		this.poster = poster;
		this.description = description;
		this.sharingTime = sharingTime;
	}

	public String[] getMedia() {
		return media;
	}
	public void setMedia(String[] media) {
		this.media = media;
	}
	public Comment[] getComments() {
		return comments;
	}
	public void setComments(Comment[] comments) {
		this.comments = comments;
	}
	public Like[] getLikes() {
		return likes;
	}
	public void setLikes(Like[] likes) {
		this.likes = likes;
	}
	public User getPoster() {
		return poster;
	}
	public void setPoster(User poster) {
		this.poster = poster;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getSharingTime() {
		return sharingTime;
	}

	public void setSharingTime(Date sharingTime) {
		this.sharingTime = sharingTime;
	}
	
	
	
	
}
