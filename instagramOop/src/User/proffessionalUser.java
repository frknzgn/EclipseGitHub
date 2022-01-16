package User;

public class proffessionalUser extends User {
	
	private String companyName;
	private String companyAdress;
	
	
	
	
	public proffessionalUser() {
		super();
	}


	public proffessionalUser(String userID, String password, String[] profilePicture, String eMail, String phoneNumber,User[] closeFriends,String companyName, String companyAdress) {
		super(userID,password, profilePicture, companyAdress, companyAdress, closeFriends);
		this.companyName = companyName;
		this.companyAdress = companyAdress;
	}
	
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAdress() {
		return companyAdress;
	}
	public void setCompanyAdress(String companyAdress) {
		this.companyAdress = companyAdress;
	}
	
	
	

}
