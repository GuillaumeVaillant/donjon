package fil.coo.TP2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import characters.Monster;
import exceptions.AlreadyHasANeighborsException;

public class Room {
	
	//Attributes
	
	protected String direction ;
	protected List<Monster> monsters=new ArrayList<Monster>();
	protected List<Item> items=new ArrayList<Item>();
    protected String position ;
    protected Map<String,Room> neighborsRoom;
    protected boolean isExit = false;

	
	// Constructor 
	
    /**
     * Builds a new Room
     * @param position the position of the room 
     */
	public Room (String position ){
		this.position = position ;
		this.neighborsRoom = new HashMap <String,Room>();
	}
	
	// Methods
	
	/**
	 * Returns if a room is an exit room or not , by default a room isn't an exit room
	 * @return false by default because a room isn't an exiting room in general case . 
	 */
	public boolean isExit(){			
		return isExit ; 
	}
	/**
	 * Change the state of the room whether it's an exiting room or not
	 * @param b true if the room became an exiting room or false if it remains as a normal room 
	 */
	
	public void setIsExit(boolean b){
		isExit = b; 
	}
	
	/**
	 * Returns the list of the monster in the room 
	 * @return the list of the monsters in the room
	 */
	
	public List<Monster> getMonsters(){
		return this.monsters;
	}
	
	/**
	 * Returns the list of the Items in the Room 
	 * @return the list of the items in the room 
	 */
	public List<Item> getItems(){
		return this.items;
	}
	
	/**
	 * Returns the neighborsRoom of a room 
	 * @return the neighborsRoom of a room
	 */
	public Map<String,Room> getNeighborsRoom(){
		return this.neighborsRoom;
	}
	
	/**
	 * Returns the position of a room 
	 * @return the position of a room
	 */
	
	public String getPosition (){
		return this.position ;
	}
	
	/**
	 * Add a monster in the Room 
	 * @param newMonster the monster added in the room 
	 */
	
	public void addMonster(Monster newMonster){
		this.monsters.add(newMonster);
	}
	
	/**
	 * Add an Item in the room
	 * @param newItem the item added in the room
	 */
	public void addItem(Item newItem){
		this.items.add(newItem);
	}
	
	/**
	 * Remove a monster from the room
	 * @param monster the monster removed from the room
	 */
	
	public void delMonster(Monster monster){
		this.monsters.remove(this.monsters.indexOf(monster));
	}
	/**
	 * Remove an Item from the room
	 * @param item the item removed from the room
	 */
	
	public void delItem(Item item){
		this.items.remove(this.items.indexOf(item));
	}
	
	/**
	 * Check if a room can be added as a neighboRoom to an other room
	 * @param direction the direction to add the room
	 * @param neighroom the neighborRoom to add 
	 * @return true if we can the room as a neighborsRoom and false if not
	 */
	public boolean canAddNeightborsRoom(String direction,Room neighroom)  {
		if (!(this.neighborsRoom.containsKey(direction) && this.neighborsRoom.containsValue(neighroom))){
			return true ;
		}
		else {
			return false ;
		}
	} 
	/**
	 * Add a neighborRoom to an other room if it can and throws an exception if not
	 * @param direction the direction to add the room
	 * @param room the neighborsRoom to add
	 * @throws AlreadyHasANeighborsException throw an exception when the room already has a neighbors from that direction 
	 */
	public void addNeighborsRoom(String direction,Room room) throws AlreadyHasANeighborsException{
			if (canAddNeightborsRoom(direction,room)){
				this.neighborsRoom.put(direction,room);
			}
			else {
				throw new AlreadyHasANeighborsException();
			}

	}
	public String toString () {
		return "room";
	}
}

