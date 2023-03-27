package Concrete;

import Abstracts.PlayerValidatorService;
import Entities.Player;

public class PlayerValidatorManager implements PlayerValidatorService{

	@Override
	public boolean checkRealPerson(Player player) {
		
		return true;
	}

}
