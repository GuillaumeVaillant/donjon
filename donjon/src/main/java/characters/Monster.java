package characters;

import fil.coo.TP2.Character;
import fil.coo.TP2.Room;

public class Monster extends Character {

	//Constructor
	
	/**
	 * Builds a new Monster  
	 * @param name the name of the monster
	 */
	public Monster(String name) {
		super(name);
	}
	
	//Methods 
	
	/**
	 * The answer of the monster to the player's attack 
	 * @param player the player that will be attacked back 
	 * @param room the room where the action will happen
	 */
	
	public void ripost(Player player,Room room){
		System.out.println(player.toString()+" loose "+strength+" life points because the monster has riposted");
		player.setLife(player.getLife()-this.strength);
	}
}
