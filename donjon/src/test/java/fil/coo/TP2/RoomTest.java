package fil.coo.TP2;

import static org.junit.Assert.*;

import org.junit.Test;

import characters.Monster;
import exceptions.AlreadyHasANeighborsException;
import items.*;


public class RoomTest {
	
	@Test 
	public void createRoomTest ()
	{
	Room room = new Room("left");
	assertEquals("left",room.getPosition());
	assertNotNull(room);
    }
	
	@Test 
	public void isExitTest()
	{
	Room room = new Room ("right");
	assertTrue(room.isExit()== false);
	}
	
	@Test
	public void SetIsExitTest()
	{
	Room room = new Room("in front");
	room.setIsExit(true);
	assertTrue(room.isExit());
	}
	@Test 
	public void getMonsterTest()
	{
	Monster monster1 = new Monster("monster1");
	Monster monster2 = new Monster("monster2");
	Monster monster3 = new Monster("monster3");
	Room room = new Room ("left");
	room.addMonster(monster1);
	room.addMonster(monster2);
	assertEquals(monster1,room.getMonsters().get(0));
	assertFalse(room.getMonsters().contains(monster3));
	
	}
	@Test
	public void getItemsTest() 
	{
	Item bourse = new Bourse (20);
	Item bourse2 = new Bourse (40);
	Room room = new Room("right");
	room.addItem(bourse);
	assertEquals(bourse,room.getItems().get(0));
	assertFalse(room.getItems().contains(bourse2));
	
	}
	@Test 
	public void getNeighborsRoomTest() throws AlreadyHasANeighborsException
	{
	Room room = new Room("middle");
	Room room1 = new Room("left");
	room.addNeighborsRoom("left", room1);
	assertTrue(room.getNeighborsRoom().containsKey("left"));
	assertFalse(room.getNeighborsRoom().containsKey("right"));
	
	}
	
	@Test 
	public void getPositionTest () 
	{
	Room room = new Room("middle");
	assertEquals("middle",room.getPosition());
	}
	
	@Test 
	public void addMonsterTest()
	{
	Monster monster1 = new Monster("monster1");
	Monster monster2 = new Monster("monster2");
	Monster monster3 = new Monster("monster3");
	Room room = new Room ("left");
	room.addMonster(monster1);
	room.addMonster(monster2);
	assertTrue(room.getMonsters().contains(monster1));
	assertFalse(room.getMonsters().contains(monster3));
		
	}
	
	@Test 
	public void addItemTest()
	{
	Item bourse = new Bourse (20);
	Item bourse2 = new Bourse (40);
	Room room = new Room("right");
	room.addItem(bourse);
	assertTrue(room.getItems().contains(bourse));
	assertFalse(room.getItems().contains(bourse2));	
	
	}
	
	@Test
	public void addNeighorsRoomTest() throws AlreadyHasANeighborsException
	{
	Room room = new Room("middle");
	Room room1 = new Room("left");
	Room room2 = new Room("left");
	room.addNeighborsRoom("left", room1);
	room.addNeighborsRoom("left", room2);
	assertTrue(room.getNeighborsRoom().containsKey("left"));
	assertFalse(room.getNeighborsRoom().containsKey("right"));
	}

	@Test 
	public void canAddNeighborsRoomTest() throws AlreadyHasANeighborsException
	{
	Room room = new Room("middle");
	Room room1 = new Room("left");
	Room room2 = new Room("left");
	Room room3 = new Room("right");
	room.addNeighborsRoom("left",room1);
	room.addNeighborsRoom("left", room2);
	assertTrue(room.canAddNeightborsRoom("right", room3));
	}
	@Test 
	public void delMonsterTest()
	{
	Room room = new Room("middle");
	Monster monster1 = new Monster("monster1");
	Monster monster2 = new Monster("monster2");
	room.addMonster(monster1);
	room.addMonster(monster2);
	room.delMonster(monster1);
	assertFalse(room.getMonsters().contains(monster1));
	assertTrue(room.getMonsters().contains(monster2));
	
	}
	
	@Test 
	public void delItemTest()
	{
	Room room = new Room("middle");
	Item bourse1 = new Bourse(50);
	Item bourse2 = new Bourse(30);
	room.addItem(bourse1);
	room.addItem(bourse2);
	room.delItem(bourse1);
	assertFalse(room.getItems().contains(bourse1));
	assertTrue(room.getItems().contains(bourse2));
	
	}
}
