package actions;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Test;
import characters.Player;
import fil.coo.TP2.AdventureGame;
import fil.coo.TP2.Room;
import items.ElixirOfLife;


public class ConsumesTest  {
	
	@Test
	
	public void isPossibleTest () {
	Room  room = new Room ("left") ;
	Player player = new Player("newPlayer");
	Player player1 = new Player("p");
	Consumes consume = new Consumes ();
	ElixirOfLife elixir = new ElixirOfLife(22);
	player.addItem(elixir);
	assertTrue(consume.isPossible(room, player));
	assertFalse(consume.isPossible(room,player1));
	}
	
	@Test
	public void useTest () {
	Room  room = new Room ("left") ;
	Player player = new Player("newPlayer");
	player.setLife(1);
	AdventureGame game = new AdventureGame(room,player);
	Consumes consume = new Consumes ();
	ElixirOfLife elixir = new ElixirOfLife(21);
	player.addItem(elixir);
	ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
	System.setIn(in);
	consume.use(game);
	assertEquals(22,player.getLife());
	
	}
}
