package actions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import characters.Player;
import fil.coo.TP2.Action;
import fil.coo.TP2.AdventureGame;
import fil.coo.TP2.Item;
import fil.coo.TP2.Room;

public class Take implements Action {
	
	
	//Methods 
	/**
	 * Return true if it's possible to take an item and false if not 
	 * @param room the room where the player is 
	 * @param player the player who will execute the action to take an item
	 * @return true if it's possible to take an item and false if not 
	 */
	public boolean isPossible(Room room, Player player) {
		if(room.getItems().isEmpty()){
			return false;
		}
		return true;
	}

	/**
	 * execute the action to take on an item that the player chooses by him self
	 * @param game the game where the actions are happening 
	 */
	public void use(AdventureGame game) {
		Item taked;
		System.out.println("What item do you want to take ?");
		int i=1;
		Map<String,Item> correspondance=new HashMap<String,Item>();
		for(Item item:game.currentRoom().getItems()){
			correspondance.put(Integer.toString(i),item);
			System.out.println(Integer.toString(i)+" : "+item.toString());
			i++;
		}
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String choice=scan.nextLine();
		if(correspondance.containsKey(choice)){
			taked=correspondance.get(choice);
			if(taked.canBeStocked()){
				game.getPlayer().addItem(taked);
				game.currentRoom().delItem(taked);
				System.out.println(taked.toString()+" has been added to inventory");
			}else{
				taked.use(game.getPlayer());
				game.currentRoom().delItem(taked);
				System.out.println(taked.toString()+" has been used");
			}
		}else{
			System.out.println("unavailable choice.");
		}
	}
	
	public String toString(){
		return "take" ;
	}

}
