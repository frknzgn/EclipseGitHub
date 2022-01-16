package Following;

import User.*;

public class Following {
	
	private User follower;
	private User toFollow;
	
	public Following() {
		super();
	}
	
	public Following(User follower, User toFollow) {
		super();
		this.follower = follower;
		this.toFollow = toFollow;
	}
	
	public User getFollower() {
		return follower;
	}
	public void setFollower(User follower) {
		this.follower = follower;
	}
	public User getToFollow() {
		return toFollow;
	}
	public void setToFollow(User toFollow) {
		this.toFollow = toFollow;
	}

	
}
