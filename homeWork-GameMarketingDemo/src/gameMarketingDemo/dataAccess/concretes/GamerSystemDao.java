package gameMarketingDemo.dataAccess.concretes;

import java.util.ArrayList;

import gameMarketingDemo.dataAccess.abstracts.GamerDao;
import gameMarketingDemo.entities.concretes.Gamer;

public class GamerSystemDao implements GamerDao {
	
	ArrayList<Gamer> gamers = new ArrayList<Gamer>();
	
	@Override
	public void add(Gamer gamer) {
		// TODO Auto-generated method stub
		if(gamers.contains(gamer)) {
			System.out.println("Gamer exist.");
		}else {	
		gamers.add(gamer);
		System.out.println(gamer.getUserName() + " added to system.");
		}	
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		for (Gamer iGamer : gamers) {
			if(gamer.getId()==iGamer.getId()) {
				gamers.remove(gamers.indexOf(gamer));
				System.out.println(gamer.getUserName() + " deleted from system.");
			}else {
				System.out.println("Gamer not found.");
			}
		} 	
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stubfor (Gamer iGamer : gamers) {
		for (Gamer iGamer : gamers) {
			if(gamer.getId()==iGamer.getId()) {
				gamers.set(gamers.indexOf(iGamer),gamer);
				System.out.println(gamer.getUserName() + " updated.");
			}else {
				System.out.println("Gamer not found.");
				}	
			} 	
	}
}
