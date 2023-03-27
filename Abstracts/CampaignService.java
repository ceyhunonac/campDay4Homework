package Abstracts;

import Entities.*;

public interface CampaignService {
	
	void addCampaign(Campaign campaign);
	
	void deleteCampaign(Campaign campaign);
	
	void updateCampaignInfo(Campaign campaign);
	
	double applyCampaign(Game game,Campaign campaign);
	
	

}
