package characters;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import actions.Take;
import characters.Player;
import fil.coo.TP2.AdventureGame;
import fil.coo.TP2.Room;
import items.ElixirOfLife;


public class PlayerTest  {
	
@Test
public void createPlayerTest() {
Player player = new Player("newPlayer");
assertNotNull(player);
}

@Test
public void isBlockedTest() {

Room room = new Room("middle");
Room room1 = new Room("left");
Player player = new Player("newPlayer");
Monster monster = new Monster("newMonster");
room.addMonster(monster);
assertFalse(player.isBlocked(room));
assertTrue(player.isBlocked(room1));

}
@Test
public void proposeActionTest() {
Room room = new Room("left");
Player player = new Player("newPlayer");
player.setLife(1);
AdventureGame ad = new AdventureGame(room,player);
Take take = new Take();
ElixirOfLife elixir = new ElixirOfLife(21);
room.addItem(elixir);
ByteArrayInputStream in = new ByteArrayInputStream(take.toString().getBytes());
System.setIn(in);
in = new ByteArrayInputStream("1".getBytes());
System.setIn(in);
player.proposeAction(ad);
assertFalse(player.getItems().contains(elixir));
}

}