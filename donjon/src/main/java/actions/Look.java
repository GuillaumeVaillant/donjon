package actions;

import characters.Monster;
import characters.Player;
import fil.coo.TP2.Action;
import fil.coo.TP2.AdventureGame;
import fil.coo.TP2.Item;
import fil.coo.TP2.Room;

public class Look implements Action {
	
	//Methods
	/**
	 * Returns if it's possible for the player to see what's in the room
	 * @param room the room where the player is 
	 * @param player the player who will execute the action to look   
	 */
	public boolean isPossible(Room room, Player player) {
		return true;
	}

	/**
	 * Execute the action to look on a room 
	 * @param game the game where the actions are happening  
	 */
	public void use(AdventureGame game) {
		System.out.println("Room : "+game.currentRoom().toString());
		System.out.println("");
		System.out.println("Items :");
		for(Item item:game.currentRoom().getItems()){
			System.out.println(item.toString());
		}
		System.out.println("");
		System.out.println("Monster :");
		for(Monster monster:game.currentRoom().getMonsters()){
			System.out.println(monster.toString());
		}
		System.out.println("");
		System.out.println("Directions :");
		for(String direction:(game.currentRoom().getNeighborsRoom().keySet())){
			System.out.println(direction);
		}
	}
	public String toString(){
		return "look" ;
	}
}
