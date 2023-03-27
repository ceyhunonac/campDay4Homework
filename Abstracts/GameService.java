package Abstracts;

import Entities.Game;
import Entities.Player;

public interface GameService  {
	
	void buy(Game game,Player player);
	
	void add(Game game);
	
	void delete(Game game);
	
	void updateGameInfo(Game game);

}
