package actions;

import static org.junit.Assert.*;
import org.junit.Test;
import characters.Player;
import fil.coo.TP2.Room;


public class StateTest  {
	
	@Test
	public void isPossibleTest () {
	Room room = new Room("newRoom");
	Player player = new Player("newPlayer");
	State state = new State();	
	assertEquals(true,state.isPossible(room, player));
	}
}
	
