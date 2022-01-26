package gameMarketingDemo.business.concretes;

import gameMarketingDemo.business.abstracts.SaleService;
import gameMarketingDemo.entities.concretes.*;


public class SaleManager implements SaleService{

	@Override
	public void sold(Campaign campaign, Gamer gamer, Game game) {
		// TODO Auto-generated method stub
		double salePrice;
		if(campaign.getGames().contains(game)) {
			salePrice = game.getPrice()*(1-campaign.getDiscount());
			}
			else {
				salePrice=game.getPrice();
			}
		
		System.out.println(game.getName()+ " bought by "+gamer.getUserName()+" via " + campaign.getName()+ " campaing.");
		
	}


}
