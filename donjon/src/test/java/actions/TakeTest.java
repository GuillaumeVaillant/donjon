package actions;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Test;
import characters.Player;
import fil.coo.TP2.AdventureGame;
import fil.coo.TP2.Room;
import items.Bourse;
import items.ElixirOfLife;

public class TakeTest  {
	
	
	@Test
	public void isPossibleTest () {
	Room room = new Room("left");
	Player player = new Player ("newPlayer");
    Take take = new Take () ;
    Bourse bourse = new Bourse(22);
    room.addItem(bourse);
    assertTrue(take.isPossible(room, player));
    room.delItem(bourse);
    assertFalse(take.isPossible(room, player));
	}
	
	@Test 
	public void useTest() {
	Room room = new Room("left");
	Player player = new Player ("newPlayer");
	player.setLife(1);
	Take take = new Take () ;
	AdventureGame ad = new AdventureGame(room,player);
	ElixirOfLife elixir = new ElixirOfLife(21);
	ElixirOfLife elixir1 = new ElixirOfLife(21,false);
	room.addItem(elixir);
	ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
	System.setIn(in);
	take.use(ad);
	assertTrue(room.getItems().isEmpty());
	assertTrue(player.getItems().contains(elixir));
	room.addItem(elixir1);
	in = new ByteArrayInputStream("1".getBytes());
	System.setIn(in);
	take.use(ad);
	assertTrue(room.getItems().isEmpty());
	assertFalse(player.getItems().contains(elixir1));
	assertEquals(22,player.getLife());
	}
	
}