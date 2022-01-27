package gameMarketingDemo;

import java.rmi.RemoteException;

import gameMarketingDemo.business.abstracts.GameService;
import gameMarketingDemo.business.abstracts.GamerService;
import gameMarketingDemo.business.concretes.GameManager;
import gameMarketingDemo.business.concretes.GamerManager;
import gameMarketingDemo.core.adapters.concretes.MernisAdapterManager;
import gameMarketingDemo.dataAccess.concretes.GamerSystemDao;
import gameMarketingDemo.entities.concretes.Game;
import gameMarketingDemo.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException, Exception {
		// TODO Auto-generated method stub
		GamerService gamerService = new GamerManager(new MernisAdapterManager(),new GamerSystemDao());
		
		
		gamerService.add(new Gamer(1, "furkan", "özgün", "frrf", "11111", "@@", "11576546588", "male", 1997, 150));
	}

}
