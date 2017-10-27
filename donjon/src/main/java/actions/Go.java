package actions;

import java.util.Scanner;

import characters.Player;
import fil.coo.TP2.Action;
import fil.coo.TP2.AdventureGame;
import fil.coo.TP2.Room;

public class Go implements Action {

	//Methods
	
	/**
	 * Returns whether it's possible to go from the current room or not 
	 * @param room the room where the player is 
	 * @param player the player who is in the room 
	 */
	
	public boolean isPossible(Room room, Player player) {
		return (room.getMonsters().isEmpty() && !room.getNeighborsRoom().isEmpty());
	}

	/**
	 * Makes the player go from the room if it's possible and choose the next room he will be playing on
	 * @param game the game where the actions are happening 
	 */
	public void use(AdventureGame game) {
		System.out.println("Where do you want to go ?");
		for(String direction:game.currentRoom().getNeighborsRoom().keySet()){
			System.out.println(direction);
		}
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String choice=scan.nextLine();
		if(game.currentRoom().getNeighborsRoom().containsKey(choice)){
			game.playerMoveTo(game.currentRoom().getNeighborsRoom().get(choice));
		}else{
			System.out.println("unavailable choice.");
		}
	}
	public String toString(){
		return "go" ;
	}
}
