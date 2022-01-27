package gameMarketingDemo.dataAccess.concretes;

import java.util.ArrayList;

import gameMarketingDemo.dataAccess.abstracts.CampaignDao;
import gameMarketingDemo.entities.concretes.Campaign;
import gameMarketingDemo.entities.concretes.Gamer;

public class CampaignSystemDao implements CampaignDao {

ArrayList<Campaign> campaigns = new ArrayList<Campaign>();
	
	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		if(campaigns.contains(campaign)) {
			System.out.println("Gamer exist.");
		}else {	
		campaigns.add(campaign);
		System.out.println(campaign.getName() + " added to system.");
		}	
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		for (Campaign iCampaign : campaigns) {
			if(campaign.getId()==iCampaign.getId()) {
				campaigns.remove(campaigns.indexOf(campaign));
				System.out.println(campaign.getName() + " deleted from system.");
			}else {
				System.out.println("Gamer not found.");
			}
		} 	
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stubfor (Gamer iGamer : gamers) {
		for (Campaign campaign2 : campaigns) {
			if(campaign.getId()==campaign2.getId()) {
				campaigns.set(campaigns.indexOf(campaign2),campaign);
				System.out.println(campaign.getName() + " updated.");
			}else {
				System.out.println("Gamer not found.");
				}	
			} 	
	}

}
