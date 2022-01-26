package gameMarketingDemo.core.adapters.abstracts;

import java.rmi.RemoteException;

import gameMarketingDemo.entities.concretes.Gamer;

public interface GamerCheckService {
	public boolean ifCheckRealPerson(Gamer gamer) throws NumberFormatException, RemoteException;
}
