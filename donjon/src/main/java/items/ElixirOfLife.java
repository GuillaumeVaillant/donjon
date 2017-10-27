package items;

import fil.coo.TP2.Character;
import fil.coo.TP2.Item;

public class ElixirOfLife implements Item {
	
	//Attributes 
	
	protected int puissance=0;
	protected boolean stock=true;
	
	
	// Constructor 
	
	/**
	 * Builds the elixirOfLife without the stock 
	 * @param puissance the amount of LifePoints the character will gain by using the elixir  
	 */
	
	public ElixirOfLife(int puissance){
		this.puissance=puissance;
	}
	
	/**
	 * Builds the elixirOfLife with the stock 
	 * @param puissance the amount of LifePoints the character will gain by using the elixir
	 * @param stock the stock of items the character has  
	 */
	
	public ElixirOfLife(int puissance, boolean stock){
		this.puissance=puissance;
		this.stock=stock;
	}
	
	//Methods 
	
	/**
	 * Returns the number of LifePoints the character  will be able to gain by using the elixirOfLife
	 * @return the number of LifePoints to gain
	 */
	
	public int getPuissance () {
		return this.puissance ;
	}
	
	/**
	 * Access to the stock of the player 
	 * @return the stock 
	 */
	
	public boolean getStock () {
		return this.stock ;
	}
	
	/**
	 * Makes the changes necessary when the character uses the elixirOfLife
	 * @param character the character who will use the elixirOfLife
	 */
	public void use(Character character) {
		character.setLife(character.getLife()+puissance);
		
	}

	/**
	 * Returns whether the elixirOfLife can be stocked or not 
	 * @return true if the elixirOfLife can be stocked and false if not 
	 */
	
	public boolean canBeStocked() {
		return stock;
	}

	/**
     * Makes the changes necessary on whether the elixirOfLife can be stocked or not 
     * @param bool the boolean which says if the elixirOfLife can be stocked or not 
     */
	
	public void setStock(boolean bool) {
		stock=bool;
	}
	public String toString(){
		return "Elixir Of Life "+puissance ;
	}
}
