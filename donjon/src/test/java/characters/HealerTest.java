package characters;

import static org.junit.Assert.*;

import org.junit.Test;

import fil.coo.TP2.Room;

public class HealerTest {


	@Test 
	public void CreateHealerTest() {
	Healer h = new Healer("newHealer");
	assertEquals("newHealer",h.getName());
	assertNotNull(h);
	}
	
	@Test 
	public void ripostTest(){
	Room room = new Room("left");
	Player p = new Player("newPlayer");
	Monster m =new Monster("newMonster");
	Healer h = new Healer("newHealer");
	room.addMonster(m);
	h.ripost(p, room);
	assertEquals(2,p.getLife());
	assertEquals(2,m.getLife());
	}
	
}
