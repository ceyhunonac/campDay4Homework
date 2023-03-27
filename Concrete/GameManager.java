package Concrete;

import Abstracts.GameService;
import Abstracts.PlayerValidatorService;
import Entities.*;

public class GameManager implements GameService {
	
	private PlayerValidatorService playerValidator;

	public GameManager(PlayerValidatorService playerValidator) {
		super();
		this.playerValidator = playerValidator;
	}

	@Override
	public void buy(Game game,Player player) {
		if (playerValidator.checkRealPerson(player)) {
			
			playerValidator.checkRealPerson(player);
			System.out.println("Verification successful: " + player.getFirstName() +" ,The game you purchased: " + game.getGameName() +" and Price(Discount Not Included): "+ game.getPrice());
			
		}else {
			System.out.println("Not a valid person.Game couldn't be purchased.");
		}
		
	}

	@Override
	public void add(Game game) {
		System.out.println("Game added: "+ game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted: "+ game.getGameName());
		
	}

	@Override
	public void updateGameInfo(Game game) {
		System.out.println("Game information updated: "+ game.getGameName());
		
	}

}
