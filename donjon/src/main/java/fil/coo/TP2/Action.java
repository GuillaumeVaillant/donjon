package fil.coo.TP2;

import characters.Player;

public interface Action {
	public boolean isPossible(Room room, Player player);
	public void use(AdventureGame game);
}
