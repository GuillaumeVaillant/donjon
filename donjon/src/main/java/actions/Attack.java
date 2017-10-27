package actions;

import items.Bourse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import characters.*;
import fil.coo.TP2.*;


public class Attack implements Action {

	//Methods 
/**
 * Returns true if the player can attack the monster and false if not 
 * @param room the room where the player is actually in 
 * @param player the player who execute or not the action to attack 
 * @return true if the action is possible or false if not 
 */
	
public boolean isPossible(Room room ,Player player){
	if(room.getMonsters().isEmpty()){
	return false ;
	}
	else {
	return true ;	
	}
}

/**
 * Execute the action to attack on the monster that the player chooses 
 * @param game the game where the actions are happening
 */
public void use(AdventureGame game) {
	
	System.out.println("Which monster do you want to attack ?");
	Map<String,Monster> correspondance=new HashMap<String,Monster>();
	int i=1;
	for (Monster monster : game.currentRoom().getMonsters()){
		System.out.println(Integer.toString(i)+" : " + monster.toString());
		correspondance.put(Integer.toString(i), monster);
		i++;
	}

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String choice=scan.nextLine();
		if(correspondance.containsKey(choice))
		{
			toAttack(correspondance.get(choice),game.getPlayer());
			if(correspondance.get(choice).isDead()){
				System.out.println(correspondance.get(choice).toString()+" is dead");
				for (Item item : correspondance.get(choice).getItems() ){
					game.currentRoom().addItem(item);
				}
				if(correspondance.get(choice).getGold()>0){
					game.currentRoom().addItem(new Bourse(correspondance.get(choice).getGold()));
				}
				game.currentRoom().delMonster(correspondance.get(choice));
			}
			else
			{
			    correspondance.get(choice).ripost(game.getPlayer(),game.currentRoom());
			}
		}
		else {
			System.out.println("unavailable choice Try again !");
		}	
}

/**
 * execute the attack and the consequences it has on the different character of the game 
 * @param monster the monster that will be attacked by the player 
 * @param player the player who will attack the monster
 */
protected void toAttack(Monster monster,Player player){
	System.out.println(monster.toString()+" loose "+player.getStrength()+" life points ");
	monster.setLife(monster.getLife()-player.getStrength()) ;
}

public String toString(){
	return "attack" ;
}
}