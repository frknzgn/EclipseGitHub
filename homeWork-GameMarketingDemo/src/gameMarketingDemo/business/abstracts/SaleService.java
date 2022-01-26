package gameMarketingDemo.business.abstracts;

import gameMarketingDemo.entities.concretes.*;


public interface SaleService {
	
	void sold(Campaign campaign,Gamer gamer,Game game);
	
}
