package items;

import fil.coo.TP2.Character;
import fil.coo.TP2.Item;

public class ElixirOfStrength implements Item {
	
	//Attributes 
	
	protected int puissance=0;
	protected boolean stock=true;
	
	//Constructor 
	
	/**
	 * Builds an ElixirOfStrength without a stock
	 * @param puissance the amount of StrengthPoints the character will gain b using the elixirOfStrength
	 */
	
	public ElixirOfStrength(int puissance){
		this.puissance=puissance;
	}
	/**
	 * Builds an ElixirOfStrength with a stock
	 * @param puissance the amount of StrengthPoints the character will gain b using the elixirOfStrength
	 * @param stock the stock of items the character has  
	 */
	public ElixirOfStrength(int puissance, boolean stock){
		this.puissance=puissance;
		this.stock=stock;
	}
	
	//Methods 
	
	/**
	 * Returns the number of StrengthPoints the character will be able to gain by using the ElixirOfStrength
	 * @return the number of strength points to gain
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
	 * Makes the changes necessary when the character uses the ElixirOfStrength
	 * @param character the character who will use the ElixirOfStregth
	 */
	public void use(Character character) {
		character.setStrength(character.getStrength()+puissance);	
	}
	
	/**
	 * Returns whether the elixirOfStrength can be stocked or not 
	 * @return true if the elixirOfStrength can be stocked and false if not 
	 */
	
	public boolean canBeStocked() {
		return stock;
	}

	/**
     * Makes the changes necessary on whether the elixirOfStrength can be stocked or not 
     * @param bool the boolean which says if the elixirOfStrength can be stocked or not 
     */
	
	public void setStock(boolean bool) {
		stock=bool;
	}
	public String toString(){
		return "Elixir Of Strength "+puissance ;
	}

}
