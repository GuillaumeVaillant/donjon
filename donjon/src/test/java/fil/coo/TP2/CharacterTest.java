package fil.coo.TP2;

import static org.junit.Assert.*;

import org.junit.Test;

import characters.Monster;
import characters.Player;
import items.Bourse;


public class CharacterTest {

	@Test
	public void createCharacterTest() {
	Character c = new Player ("newCharacter");
	assertNotNull(c);
	
	}
	
	@Test
	public void getNameTest() {
	Character c = new Player("newCharacter");
	assertEquals("newCharacter",c.getName());
	}
	
	@Test 
	public void isDeadTest () {
	Character c = new Monster ("newMonster");
    Character c1 = new Player("newPlayer");
    c.setLife(c.getLife()-c1.getStrength());
	assertTrue(c.isDead());
	}

	@Test 
	public void setLifeTest () {
	Character c = new Monster ("newMonster");
	c.setLife(50);
	assertEquals(50,c.getLife());
	}
	
	@Test
	public void getLifeTest() {
	Character c = new Player("newPlayer");
	assertEquals(1,c.getLife());
	}
	
	@Test 
	public void setStrengthTest() {
	Character c = new Player("newPlayer");
	c.setStrength(20);
	assertEquals(20,c.getStrength());
	}
  
	@Test 
	public void getStrengthTest() {
	Character c = new Player("newPlayer");
	assertEquals(1,c.getStrength());
	}
	
	@Test 
	public void getGoldTest() {
	Character c = new Player("newPlayer");
	assertEquals(0,c.getGold());
	}
	
	@Test
	public void setGoldTest() {
	Character c = new Player("newPlayer");
	c.setGold(30);
	assertEquals(30,c.getGold());
	}
	
	@Test 
	public void addItemTest() {
	Character c = new Player("newPlayer");
	Item bourse = new Bourse(20);
	c.addItem(bourse);
	assertTrue(c.getItems().contains(bourse));
	}
	
	@Test 
	public void getItemsTest() {
	Character c = new Player("newPlayer");
	Item I = new Bourse(20);
	c.addItem(I);
	assertEquals(I,c.getItems().get(0));
	}
    
	@Test 
	public void delItemsTest () {
	Character c = new Player("newPlayer");
	Item I = new Bourse(20);
	Item I1 = new Bourse(50);
	c.addItem(I);
	c.addItem(I1);
	c.delItem(I);
	assertFalse(c.getItems().contains(I));
	assertTrue(c.getItems().contains(I1));
	}
	
	

}

