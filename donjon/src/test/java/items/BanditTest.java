package items;

import static org.junit.Assert.*;

import org.junit.Test;

import characters.Player;
import fil.coo.TP2.Item;

public class BanditTest {

	@Test
	public void CreateBanditTest() {
	Bandit bandit = new Bandit (20);
	assertEquals(20,bandit.getCost());
	assertNotNull(bandit);
	}
	
	
	@Test 
	public void addItemTest () {
	Item bourse = new Bourse (30);
	Bandit bandit = new Bandit (20);
	bandit.addItem(bourse);
	assertTrue(bandit.getPossible().contains(bourse));
	}

	@Test 
	public void getCostTest() {
	Bandit bandit = new Bandit (50);
	assertEquals(50,bandit.getCost());
	}
	
	@Test 
	public void getPossibleTest() {
	Bandit bandit = new Bandit (25);
	Bourse bourse = new Bourse (22);
	Bourse bourse1 = new Bourse (21);
	bandit.addItem(bourse);
	assertEquals(bourse,bandit.getPossible().get(0));
	assertFalse(bandit.getPossible().contains(bourse1));
	}
	
	@Test
	public void useTest() {
	Player player = new Player ("newPlayer");
	Bourse bourse = new Bourse (50);
	Bourse bourse1 = new Bourse (20);
	Bandit bandit = new Bandit (10);
	player.addItem(bourse);
	bourse.use(player);
	bandit.addItem(bourse1);
	bandit.use(player);
	assertEquals(60,player.getGold());
	}
	
	
	@Test 
	public void CanBeStockedTest () {
	Bandit bandit = new Bandit(20);
	assertFalse(bandit.canBeStocked());
	}
	
	@Test 
	public void setStockTest () {
	Bandit bandit = new Bandit(30);
	bandit.setStock(true);
	assertFalse(bandit.canBeStocked());
		
	}
	
}
