package gameMarketingDemo.business.concretes;

import java.rmi.RemoteException;

import gameMarketingDemo.business.abstracts.GamerService;
import gameMarketingDemo.core.adapters.abstracts.GamerCheckService;
import gameMarketingDemo.dataAccess.abstracts.GamerDao;
import gameMarketingDemo.dataAccess.concretes.GamerSystemDao;
import gameMarketingDemo.entities.concretes.Gamer;

public class GamerManager implements GamerService{
	
	GamerCheckService gamerCheckService;
	GamerSystemDao gamerSystemDao;
	
	public GamerManager() {
		super();
	}

	public GamerManager(GamerCheckService gamerCheckService,GamerSystemDao gamerSystemDao) {
		super();
		this.gamerCheckService = gamerCheckService;
		this.gamerSystemDao = gamerSystemDao;
	}
	

	@Override
	public void add(Gamer gamer) throws Exception {
		// TODO Auto-generated method stub
		if(gamerCheckService.ifCheckRealPerson(gamer)) {
			System.out.println(gamer.getUserName() + "is real person.");
			gamerSystemDao.add(gamer);
		}else {
			throw new Exception("not valid.");
		}
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		gamerSystemDao.update(gamer);
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		gamerSystemDao.delete(gamer);
	}

}
