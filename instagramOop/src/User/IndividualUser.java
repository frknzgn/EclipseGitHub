package User;

public class IndividualUser extends User{
	
	private String gender;
	private String birthDay;
	
	
	
	public IndividualUser() {
		super();
	}
	
	public IndividualUser(String userID,String password,String[] profilePicture,String eMail,String phoneNumber,User[] closeFriends,String gender, String birthDay) {
		super(userID,password,profilePicture,eMail,phoneNumber,closeFriends);
		this.gender = gender;
		this.birthDay = birthDay;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	
	
	
	

}
