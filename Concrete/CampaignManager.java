package Concrete;

import Abstracts.CampaignService;

import Entities.*;

public class CampaignManager implements CampaignService {
	
	

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Campaign added: "+ campaign.getCampaignName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Campaign deleted: "+ campaign.getCampaignName());
		
	}

	@Override
	public void updateCampaignInfo(Campaign campaign) {
		System.out.println("Campaign information updated: "+ campaign.getCampaignName());
		
	}

	@Override
	public double applyCampaign(Game game,Campaign campaign) {
		return (game.getPrice() - campaign.getCampaignAmount());
		
	}

}
