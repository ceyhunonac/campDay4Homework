package Entities;

public class Campaign {
	
	private int campaignId;
	private String campaignName;
	private double campaignAmount;

	public Campaign() {
		
	}	
	
	public Campaign(int campaignId, String campaignName, double campaignAmount) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignAmount = campaignAmount;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getCampaignAmount() {
		return campaignAmount;
	}

	public void setCampaignAmount(double campaignAmount) {
		this.campaignAmount = campaignAmount;
	}

}
