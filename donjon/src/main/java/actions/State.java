package actions;

import characters.Player;
import fil.coo.TP2.Action;
import fil.coo.TP2.AdventureGame;
import fil.coo.TP2.Item;
import fil.coo.TP2.Room;

public class State implements Action {
	
	//Methods
	
	/**
	 * Returns true because it's always possible for the player to access to his own state
	 * @param room the room where the player is at this very moment
	 * @param player the player who wants to check his own state  
	 * @return  true because it's possible to access the state of the player 
	 */
	public boolean isPossible(Room room, Player player) {
		return true;
	}

	/**
	 * Display the state of the player in the game 
	 * @param game the game 
	 */
	public void use(AdventureGame game) {

		System.out.println("Player "+game.getPlayer().getName()+" State : ");
		System.out.println("");
		System.out.println("Life : "+game.getPlayer().getLife());
		System.out.println("Strength : "+game.getPlayer().getStrength());
		System.out.println("Gold : "+game.getPlayer().getGold());
		System.out.println("");
		System.out.println("Items :");
		for(Item item:game.getPlayer().getItems()){
			System.out.println(item.toString());
		}
	}
	public String toString(){
		return "state" ;
	}
}
