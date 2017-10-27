package items;

import java.util.ArrayList;
import java.util.List;

import fil.coo.TP2.Character;
import fil.coo.TP2.Item;

public class Bandit implements Item {
	
	//Attributes
	
	protected boolean stock=false;
	protected int cost=10;
	protected List<Item> possible = new ArrayList<Item>();

	
	//Constructor 
	/**
	 * Builds  a bandit 
	 * @param cost the cost of the bandit ,the number of points a character will have to spend to use the bandit 
	 */
	
	public Bandit(int cost){
		this.cost=cost;
	}
	
	//Methods 
	
	/**
	 * Returns the cost of the bandit 
	 * @return cost the cost of the bandit 
	 */
	public int getCost () {
		return this.cost ;
	}
	
	/**
	 * Adds an item to the bandit stock or the item that the bandit offers 
	 * @param added the item  that the  bandit will offer as a repost or the item added to the bandit stock 
	 */
	public  void addItem(Item added){
		possible.add(added);
	}
	
	/**
	 * Access to the possible items that the bandit could offer 
	 * @return the  possible items that the bandit could propose
	 */
	
	public List<Item> getPossible(){
		return this.possible;
	}
	
	/**
	 * Makes the changes necessary when the character uses the bandit
	 * @param character the character who will use the bandit   
	 */
	public void use(Character character) {
		if(character.getGold()-cost>=0){
			character.setGold(character.getGold()-cost);
			Item item=(possible.get((int)(Math.random()*(possible.size()-1))));
			item.use(character);
			System.out.println(item.toString()+" has been added to inventory");
		}
	}

	/**
	 * Returns whether the bandit can be stocked , the bandit is never stocked
	 * @return false because the bandit can't be stock
	 */
	public boolean canBeStocked() {
		return false;
	}

	/**
	 * Changes the stock ,the stock is never changed when the item is a bandit because it's not stocked 
	 * @param bool a boolean which is always false in this case 
	 */
	
	public void setStock(boolean bool) {
		stock=false;
	}
	
	public String toString(){
		return "Bandit cost "+cost ;
	}
	
}
