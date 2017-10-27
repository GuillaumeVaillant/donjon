package fil.coo.TP2;

import java.util.ArrayList;
import java.util.List;

public abstract class Character {
	
	//Attributes 
	
	protected String name;
	protected int life=1;
	protected int strength=1;
	protected int gold=0;
	protected List<Item> items = new ArrayList <Item>();
	
	
	//Constructor
	
	/**
	 * Builds a new character 
	 * @param name the name of the character 
	 */
	public Character(String name){
		this.name=name;
	}
	
	//Methods 
	
	/**
	 * Returns the name of the character 
	 * @return the name of the character 
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * Returns true if the character is dead and false if not 
	 * @return true if the character is dead and false if not 
	 */
	
	public boolean isDead(){
		return life<=0;
	}
	
	/**
	 * Changes the life points of the character during the game 
	 * @param life the life point of the character 
	 */
	public void setLife(int life){
		this.life=life;
	}
	
	/**
	 * Access to the life points of the character 
	 * @return the life points of the character 
	 */
	
	public int getLife(){
		return life;
	}
	
	/**
	 * Changes the strength points of the character during the game
	 * @param strength the strength points of the character 
	 */
	
	public void setStrength(int strength){
		this.strength=strength;
	}
	
	/**
	 * Access to the strength points of the character 
	 * @return strength the strength points oh the character
	 */
	
	public int getStrength(){
		return strength;
	}
	
	/**
	 * Changes the amount of gold points of the character during the game
	 * @param gold the gold points of the character 
	 */
	public void setGold(int gold){
		this.gold=gold;
	}
	
	/**
	 * Access to the gold points of the character 
	 * @return the gold points of the character 
	 */
	
	public int getGold(){
		return gold;
	}
	
	/**
	 * Adds an the item that the character gained on his the stock 
	 * @param item the item added to the stock 
	 */
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	/**
	 * Access to the character items 
	 * @return the character's items
	 */
	public List<Item> getItems(){
		return items;
	}
	
	/**
	 * Removes the item from the character's stock 
	 * @param item the item removed from the stock 
	 */
	public void delItem(Item item){
		this.items.remove(this.items.indexOf(item));
	}
	
	public String toString(){
		return name+" "+life+" life points";
	}
}
