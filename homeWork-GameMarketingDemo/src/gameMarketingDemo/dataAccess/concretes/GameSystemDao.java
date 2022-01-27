package gameMarketingDemo.dataAccess.concretes;

import java.util.ArrayList;

import gameMarketingDemo.dataAccess.abstracts.GameDao;
import gameMarketingDemo.entities.concretes.Game;
import gameMarketingDemo.entities.concretes.Gamer;

public class GameSystemDao implements GameDao{
	
ArrayList<Game> games = new ArrayList<Game>();
	
	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		if(games.contains(game)) {
			System.out.println("Game exist.");
		}else {	
		games.add(game);
		System.out.println(game.getName() + " added to system.");
		}	
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		for (Game iGame : games) {
			if(game.getId()==iGame.getId()) {
				games.remove(games.indexOf(game));
				System.out.println(game.getName() + " deleted from system.");
			}else {
				System.out.println("Gamer not found.");
			}
		} 	
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stubfor (Game iGame : games) {
		for (Game iGame : games) {
			if(game.getId()==iGame.getId()) {
				games.set(games.indexOf(iGame),game);
				System.out.println(game.getName() + " updated.");
			}else {
				System.out.println("Gamer not found.");
				}	
			} 	
	}

}
