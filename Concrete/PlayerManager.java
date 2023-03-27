package Concrete;


import Abstracts.PlayerService;
import Abstracts.PlayerValidatorService;
import Entities.Player;

public class PlayerManager implements PlayerService{
	
	private PlayerValidatorService playerValidator;

	public PlayerManager(PlayerValidatorService playerValidator) {
		super();
		this.playerValidator = playerValidator;
	}

	@Override
	public void register(Player player) {
		if(playerValidator.checkRealPerson(player)) {
			
			playerValidator.checkRealPerson(player);
			System.out.println("Verification successful and your registration is complete : " + player.getFirstName());
			
		}else {
			System.out.println("Not a valid person.");
		}
		
	}

	@Override
	public void playerInfoUpdate(Player player) {
		System.out.println("Player information updated: "+ player.getFirstName());
		
	}

	@Override
	public void playerDelete(Player player) {
		System.out.println("Player deleted: "+ player.getFirstName());
		
	}


}
