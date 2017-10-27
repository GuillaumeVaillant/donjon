package actions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import characters.Player;
import fil.coo.TP2.Action;
import fil.coo.TP2.AdventureGame;
import fil.coo.TP2.Item;
import fil.coo.TP2.Room;

public class Consumes implements Action {

	
	//Methods 
	
	/**
	 * Returns if it's possible to Consumes an object or not 
	 * @param room the room where the object could be consumed or not 
	 * @param player the player who will consume the object if possible 
	 */
	public boolean isPossible(Room room, Player player) {
		return !player.getItems().isEmpty();
	}

	/**
	 * Execute the action to consume or not  an item that the player chooses by him self
	 * @param game the game where the action are happening  
	 */
	public void use(AdventureGame game) {
		System.out.println("What item want you consumes ?");
		int i=1;
		Map<String,Item> correspondance=new HashMap<String,Item>();
		for(Item item:game.getPlayer().getItems()){
			correspondance.put(Integer.toString(i),item);
			System.out.println(Integer.toString(i)+" : "+item.toString());
			i++;
		}
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String choice=scan.nextLine();
		if(correspondance.containsKey(choice)){
			correspondance.get(choice).use(game.getPlayer());;
			game.getPlayer().delItem(correspondance.get(choice));
		}else{
			System.out.println("unavailable choice.");
		}
	}
	public String toString(){
		return "consumes" ;
	}
}
