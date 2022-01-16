package User;

public class User {
	
	private String userID;
	private String password;
	private String[] profilePicture;
	private String eMail;
	private String phoneNumber;
	private User[] closeFriends;
	
	public User() {
		super();
	}
	
	public User(String userID, String password, String[] profilePicture, String eMail, String phoneNumber,User[] closeFriends) {
		super();
		this.userID = userID;
		this.password = password;
		this.profilePicture = profilePicture;
		this.eMail = eMail;
		this.phoneNumber = phoneNumber;
		this.closeFriends = closeFriends;
	}
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String[] getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String[] profilePicture) {
		this.profilePicture = profilePicture;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public User[] getCloseFriends() {
		return closeFriends;
	}

	public void setCloseFriends(User[] closeFriends) {
		this.closeFriends = closeFriends;
	}
	
	

}
