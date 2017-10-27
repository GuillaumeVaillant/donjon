package fil.coo.TP2;

import characters.Player;

public class AdventureGame {
	
	//Attributes 
	
	protected Room initialRoom;
	protected Room currentRoom;
	protected Player player;
	
	//Constructor
	
	/**
	 * Builds an AdventureGame
	 * @param initialRoom the room where the game begin 
	 * @param player the player who plays the game
	 */
	public AdventureGame(Room initialRoom , Player player){
		this.initialRoom=initialRoom;
		this.currentRoom=initialRoom;
		this.player=player;
	}
	
	//Methods
	
	
	/**
	 * Returns the room where the game takes place 
	 * @return room the room where the game takes place  
	 */
	public Room currentRoom(){
		return currentRoom;
	}
	
	/**
	 * Access to the player in the game 
	 * @return the player who actually plays the game 
	 */
	public Player getPlayer(){
		return player;
	}
	
	/**
	 * Returns true if the game is finished and false if not 
	 * @return true if the game is finished and false if not 
	 */
	
	public boolean isFinished(){
		if(player.getLife()<=0 || currentRoom.isExit() || player.isBlocked(currentRoom)){
			return true;
		}
		return false;
	}
	
	/**
	 * Makes the player change the room 
	 * @param nextRoom the room where the player is moving  to 
	 */
	public void playerMoveTo(Room nextRoom){
		currentRoom=nextRoom;
	}
	
	/**
	 * The procedure of the game as long as the game isn't finished the player can choose an action to execute 
	 * @param player the player who's playing the game 
	 */
	public void play(Player player){
		this.player=player;
		while(!this.isFinished()){
			player.proposeAction(this);
		}
		if(currentRoom.isExit()){
			System.out.println("You win !");
		}else if(player.isBlocked(currentRoom)){
			System.out.println("You are blocked !");
		}else if(player.isDead()){
			System.out.println("You are dead !");
		}else{
			System.out.println("END.");
		}
	}
	
	
}
