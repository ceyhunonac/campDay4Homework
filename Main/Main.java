package Main;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game();
		game1.setGameId(1);
		game1.setGameName("The Last Of Us");
		game1.setEsrbRate(17);
		game1.setPrice(350);
		
		Player player1 = new Player();
		player1.setPlayerId(1);
		player1.setFirstName("Ceyhun");
		player1.setLastName("Onaç");
		player1.setDateOfBirth(2003);
		player1.setNationalityId("00000000000");
		
		Campaign campaign1 = new Campaign();
		campaign1.setCampaignId(1);
		campaign1.setCampaignName("New Year Amount");
		campaign1.setCampaignAmount(100);
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.register(player1);
		playerManager.playerInfoUpdate(player1);
		

		GameManager gameManager = new GameManager(new MernisServiceAdapter());
		gameManager.add(new Game(1,"The Last Of Us",300,17));
		gameManager.buy(game1,player1);
				
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign1);
		
		System.out.println("Total(Discount included Price): "+campaignManager.applyCampaign(game1, campaign1));

	}

}
