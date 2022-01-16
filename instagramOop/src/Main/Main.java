package Main;

import javax.naming.CommunicationException;

import Communication.DirectMassage;
import Following.Following;
import Shares.Post;
import Shares.Share;
import Shares.Story;
import User.IndividualUser;
import User.User;
import User.proffessionalUser;
import Ýnteraction.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User furkan = new IndividualUser("furkan1", "1234", args, "furkan@null.com","1324null", new User[] {},"Male","19071997");
		User turkcell = new proffessionalUser("rttet", "1231", args, "asdasd@.com", "0545", new User[] {}, "Turkcell", "Ist");
		
		
		Following following = new Following(furkan, turkcell);
		Following following2 = new Following(turkcell, furkan);
		
		DirectMassage directMessage = new DirectMassage("Hi there,how have you been ?", "", "");
		
		Share post1 = new Story(args, null, null, furkan, null, null , null);
		Share post2 = new Post(args, new Comment[] {}, new Like[] {}, furkan , "Soðuk ve güneþli bir izmir pazarý", null, "Ýzmir");
	}

}
