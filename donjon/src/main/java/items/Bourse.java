package items;

import fil.coo.TP2.Character;
import fil.coo.TP2.Item;

public class Bourse implements Item {
	//Attributes 
	
	private boolean stock=false;
	private int puissance=0;
	
	
	//Constructor 
	/**
	 * Builds a bourse without a stock
	 * @param puissance the number of GoldPoints to gain when the character uses a bourse
	 */
	
	public Bourse(int puissance){
		this.puissance=puissance;
	}
	/**
	 * Builds a bourse with a stock
	 * @param puissance the number of GoldPoints the character will gain if he uses a bourse
	 * @param stock the stock of items the character has  
	 */
	
	public Bourse(int puissance, boolean stock){
		this.puissance=puissance;
		this.stock=stock;
	}
	
	//Methods 
	
	/**
	 * Returns the number of GoldPoints the character  will be able to gain with the bourse
	 * @return the number of goldPoints to gain
	 */
	
    public int getPuissance () {
    	return this.puissance ;
    }
 
    /**
     * Makes the changes necessary when the player uses the bourse 
     * @param character the character  who will use the bourse
     */
    
	public void use(Character character) {
		character.setGold(character.getGold()+puissance);
	}

	/**
	 * Returns whether the bourse can be stocked or not 
	 * @return true if the bourse can be stocked and false if not 
	 */
	
	public boolean canBeStocked() {
		return stock;
	}
	/**
	 * Access to the stock of the player 
	 * @return the stock 
	 */
    public boolean getStock (){
    	return this.stock ;
    }
    /**
     * Makes the changes necessary on whether the bourse can be stocked or not 
     * @param bool the boolean which says if the bourse can be stocked or not 
     */
	public void setStock(boolean bool) {
		stock=bool;		
	}
	public String toString(){
		return "Bourse of "+puissance ;
	}

}
