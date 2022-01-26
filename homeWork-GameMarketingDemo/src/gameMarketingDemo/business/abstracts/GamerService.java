package gameMarketingDemo.business.abstracts;

import java.rmi.RemoteException;

import gameMarketingDemo.entities.concretes.Gamer;

public interface GamerService {
	
	void add(Gamer gamer) throws NumberFormatException, RemoteException, Exception;
	void update(Gamer gamer);
	void delete(Gamer gamer);
	
}
