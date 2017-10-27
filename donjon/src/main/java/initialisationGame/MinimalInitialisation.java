package initialisationGame;

import characters.Healer;
import characters.Monster;
import characters.Player;
import exceptions.AlreadyHasANeighborsException;
import fil.coo.TP2.InitialisationGame;
import fil.coo.TP2.Room;
import items.Bandit;
import items.Bourse;
import items.ElixirOfLife;
import items.ElixirOfStrength;
import items.ElixirStrengthToLife;

public class MinimalInitialisation implements InitialisationGame {

	public Room startingRoom() {
		Room start= new Room("Starting room");
		Bandit bandit=new Bandit(5);
		bandit.addItem(new Bourse(20));
		bandit.addItem(new ElixirOfLife(20));
		bandit.addItem(new ElixirOfStrength(20));
		bandit.addItem(new ElixirStrengthToLife(10));
		start.addItem(bandit);
		start.addItem(new Bourse(20));
		start.addItem(new ElixirOfLife(20));
		start.addItem(new ElixirOfStrength(20));
		start.addItem(new ElixirStrengthToLife(10));
		Monster monster=new Monster("monster");
		monster.setGold(50);
		monster.setLife(9);
		monster.setStrength(10);
		monster.addItem(new ElixirOfLife(10));
		monster.addItem(new ElixirOfLife(10,false));
		start.addMonster(monster);
		Healer healer= new Healer("healer");
		healer.setLife(9);
		start.addMonster(healer);
		Room end=new Room("Final room");
		end.setIsExit(true);
		try {
			start.addNeighborsRoom("Final room", end);
		} catch (AlreadyHasANeighborsException e) {
			e.printStackTrace();
		}
		return start;
	}

	public Player startingPlayer() {
		Player player=new Player("You");
		player.setGold(10);
		player.setLife(25);
		player.setStrength(8);
		return player;
	}

}
