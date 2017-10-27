package characters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import actions.Attack;
import actions.Consumes;
import actions.Go;
import actions.Look;
import actions.State;
import actions.Take;
import fil.coo.TP2.Action;
import fil.coo.TP2.AdventureGame;
import fil.coo.TP2.Character;
import fil.coo.TP2.Room;

public class Player extends Character {
	
	//Constructor 
	
	/**
	 * Builds a new Player
	 * @param name the name of the player
	 */
	public Player(String name) {
		super(name);
	}
	
	
	//Methods 
	
	/**
	 * Propose all the action that the player can make to the player so that he can choose which one to execute
	 * @param game the game where the actions are happening
	 */
	@SuppressWarnings("resource")
	public void proposeAction(AdventureGame game){
		Room currentRoom=game.currentRoom();
		List<Action> actions=new ArrayList<Action>();
		actions.add(new Look());
		actions.add(new Take());
		actions.add(new Attack());
		actions.add(new Go());
		actions.add(new State());
		actions.add(new Consumes());
		Map<String,Action> correspondance=new HashMap<String,Action>();
		System.out.println("What do you want to do ?");
		for(Action action : actions){
			if(action.isPossible(currentRoom,this)){
				correspondance.put(action.toString(),action);
				System.out.println(" - "+action.toString());
			}
		}
		
		Scanner scan = new Scanner(System.in);
		String choice=scan.nextLine();
		if(correspondance.containsKey(choice)){
			correspondance.get(choice).use(game);
		}else{
			System.out.println("unavailable action.");
		}
	} 
	
	/**
	 * Returns true if the player is blocked and false if not
	 * @param currentRoom the room where the player is 
	 * @return true if the player is blocked and false if not 
	 */
	public boolean isBlocked(Room currentRoom) {
		if((new Attack()).isPossible(currentRoom,this)||(new Go()).isPossible(currentRoom,this)){
			return false;
		}
		return true;
	}
}
