package actions;

import static org.junit.Assert.*;
import org.junit.Test;
import characters.Player;
import fil.coo.TP2.Room;


public class LookTest  {
	@Test
	public void isPossibleTest (){
	Room room = new Room("middle");
	Player player = new Player("p");
	Look  look = new Look();
	assertTrue(look.isPossible(room, player));
	}
	
}