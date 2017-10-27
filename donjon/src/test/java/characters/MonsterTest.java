 
 
package characters;

import static org.junit.Assert.*;

import org.junit.Test;

import fil.coo.TP2.Room;

public class MonsterTest {


	@Test 
	public void CreateMonsterTest() {
	Monster m = new Monster("newMonster");
	assertEquals("newMonster",m.getName());
	assertNotNull(m);
	}
	
	@Test
	public void RipostTest() {
	Room room = new Room("left");	
	Monster m =new Monster("newMonster");
	Player p = new Player("newPlayer");
	m.ripost(p, room);
	assertEquals(0,p.getLife());
	}
	

}
