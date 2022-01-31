import business.abstracts.UserService;
import business.concretes.UserManager;
import core.exceptions.BusinessException;
import dataAccess.concretes.InMemoryUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) throws BusinessException {
		// TODO Auto-generated method stub
		UserService userManager = new UserManager(new InMemoryUserDao());
		
		User user1 = new User(1, "f1", "a1", "18", "asd");
		User user2 = new User(1, "2", "oa", "112345648", "as1d@");
		
		try {
			userManager.add(user1);
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
			
		
		
		try {
			userManager.add(user2);
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
