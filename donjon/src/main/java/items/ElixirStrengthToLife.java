package items;

import fil.coo.TP2.Character;
import fil.coo.TP2.Item;

public class ElixirStrengthToLife implements Item {
	
	//Attributes 
	
	protected int puissance=0;
	protected boolean stock=true;
	
	//Constructor
	
	/**
	 * Builds an elixirStrengthToLife without a stock 
	 * @param puissance the amount of LifePoints the character will gain by using the elixirStrengthToLife and the
	 * amount of StrengthPoints he will loose
	 */
	
	public ElixirStrengthToLife(int puissance){
		this.puissance=puissance;
	}
	
	/**
	 * Builds an elixirStrengthToLife with a stock
	 * @param puissance the amount of LifePoints the character will gain by using the elixirStrengthToLife and the
	 * amount of StrengthPoints he will loose
	 * @param stock the stock of items the character has
	 */
	
	public ElixirStrengthToLife(int puissance, boolean stock){
		this.puissance=puissance;
		this.stock=stock;
	}

	//Methods
	
	/**
	 * Returns the number of LifePoints the character will be able to gain by using the ElixirStrengthToLife and the amount of strengthPoints he will loose
	 * @return the number of Life points to gain and the strength points to loose 
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
	 * Makes the changes necessary when the character uses the ElixirStrenghtToLife
	 * @param character the character who will use the ElixirStrengthToLife
	 */
	
	public void use(Character character) {
		character.setLife(character.getLife()+puissance);
		character.setStrength(character.getStrength()-puissance);
	}
	/**
	 * Returns whether the elixirStrengthTLife can be stocked or not 
	 * @return true if the elixirStrengthToLife can be stocked and false if not 
	 */
	
	public boolean canBeStocked() {
		return stock;
	}

	/**
     * Makes the changes necessary on whether the elixirStrengthToLife can be stocked or not 
     * @param bool the boolean which says if the elixirStrengthToLife can be stocked or not 
     */
	public void setStock(boolean bool) {
		stock=bool;
	}
	public String toString(){
		return "Elixir change "+puissance+" strength to Life ";
	}
}
