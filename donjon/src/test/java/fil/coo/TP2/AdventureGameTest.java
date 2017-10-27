package fil.coo.TP2;

import static org.junit.Assert.*;

import org.junit.Test;

import characters.Player;

public class AdventureGameTest {

	@Test
	public void createAdventureGameTest(){
		Room room = new Room("middle");
		Player player = new Player("newPlayer");
		AdventureGame game = new AdventureGame(room,player);
		assertNotNull(game);
	}
	
	@Test
	public void currentRoomTest() {
	Room room = new Room("middle");	
	Player player = new Player("newPlayer");
	AdventureGame ad = new AdventureGame(room,player);
	assertEquals(room,ad.currentRoom());
	}
	@Test 
	public void getPlayerTest () {
	Room room = new Room("middle");		
	Player player = new Player("newPlayer");
	AdventureGame ad = new AdventureGame(room,player);
    assertEquals(player,ad.getPlayer()); 
	}

	
	@Test
	public void isFinishedTest() {
	Room room = new Room("middle");
	Player player = new Player("newPlayer");
	AdventureGame ad = new AdventureGame(room,player);
	assertTrue (ad.isFinished());
	
	}
	
	@Test
	public void playerMoveToTest() {
	Room room = new Room("left");
	Room room1 = new Room("right");
	Player player = new Player("newPlayer");
	AdventureGame  ad = new AdventureGame(room,player);
	ad.playerMoveTo(room1);
	assertEquals(room1,ad.currentRoom());
	}
	
	
	

}
