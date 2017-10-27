package characters;

import fil.coo.TP2.Room;

public class Healer extends Monster {

	//Constructor 
	
	/**
	 * Builds a new healer
	 * @param name the name of the character healer 
	 */
	public Healer(String name) {
		super(name);
	}
	
	//Methods
	
	/**
	 * The answer of the healer to the player's attack , which is to give all the characters more life points 
	 * @param player the player that will gain the points
	 * @param room the room where the action will happen
	 */
	public void ripost(Player player,Room room){
		System.out.println("the healer heals all the characters !");
		for(Monster monster:room.getMonsters()){
			System.out.println(monster.toString()+" win "+strength+" life points");
			monster.setLife(monster.getLife()+this.strength);
		}
		System.out.println(player.toString()+" win "+strength+" life points");
		player.setLife(player.getLife()+this.strength);
	}
}
