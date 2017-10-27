package actions;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import characters.Monster;
import characters.Player;
import fil.coo.TP2.Action;
import fil.coo.TP2.AdventureGame;
import fil.coo.TP2.Room;

public class AttackTest  {
	
	@Test
	public void isPosibleTest () {
	Room room = new Room("middle");
	Room room1 = new Room("left");
	Player player = new Player("newPlayer");
	Action attack = new Attack();
	Monster monster = new Monster("newMonster");
	room.addMonster(monster);
	assertTrue(attack.isPossible(room, player));
	assertFalse(attack.isPossible(room1, player));
	}
	
	
	
	@Test
	public void useTest() {
	Monster monster = new Monster("newMonster");
	monster.setLife(2);
	monster.setStrength(1);
	Player player = new Player("newPlayer");
	player.setStrength(1);
	player.setLife(2);
	Attack attack = new Attack();
	Room room = new Room("left");
	room.addMonster(monster);
	AdventureGame ad = new AdventureGame(room,player);
	ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
	System.setIn(in);
	attack.use(ad);
	assertEquals(1,monster.getLife());
	assertEquals(1,player.getLife());
	in = new ByteArrayInputStream("1".getBytes());
	System.setIn(in);
	attack.use(ad);
	assertTrue(monster.isDead());
	}

}
