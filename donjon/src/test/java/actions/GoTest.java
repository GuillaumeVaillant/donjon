package actions;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import characters.Monster;
import characters.Player;
import exceptions.AlreadyHasANeighborsException;
import fil.coo.TP2.AdventureGame;
import fil.coo.TP2.Room;

public class GoTest {
	
@Test
public void isPossibleTest () throws AlreadyHasANeighborsException {
Monster monster = new Monster("newMonster");
Room room = new Room("middle");
Room room1 = new Room("left");
Room room2 = new Room("right");
Room room3 = new Room("back");
Player player = new Player("newPlayer");
Go go = new Go();
room2.addMonster(monster);
room.addNeighborsRoom("left", room1);
assertTrue(go.isPossible(room, player));
assertFalse(go.isPossible(room2, player));
assertFalse(go.isPossible(room3, player));

}

@Test
public void useTest () throws AlreadyHasANeighborsException  {
Room room = new Room("middle");
Room room1 = new Room("left");
Player player = new Player("newPlayer") ;
Go go = new Go ();
AdventureGame ad = new AdventureGame(room,player);
room.addNeighborsRoom("left", room1);
ByteArrayInputStream in = new ByteArrayInputStream("left".getBytes());
System.setIn(in);
go.use(ad);
assertEquals(room1,ad.currentRoom());

}
}


