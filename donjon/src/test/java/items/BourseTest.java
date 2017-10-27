package items;

import static org.junit.Assert.*;

import org.junit.Test;

import characters.Player;

public class BourseTest {

	@Test
	public void CreateBourseWithoutStockTest() {
	Bourse bourse = new Bourse(20);
	assertEquals(20,bourse.getPuissance());
	assertNotNull(bourse);
	
	}
	
	@Test 
	public void CreateBourseWithStockTest() {
	Bourse bourse = new Bourse(20,false);
	assertEquals(false,bourse.getStock());
	assertNotNull(bourse);
	}
	
	@Test 
	public void getPuissanceTest () {
	Bourse bourse = new Bourse (20);
	assertEquals(20,bourse.getPuissance());
	}
	
	@Test 
	public void getStockTest () {
	Bourse bourse = new Bourse (30,false);
	assertEquals(false,bourse.getStock());
	}

	@Test 
	public void useTest() {
	Player p = new Player("newPlayer");
	Bourse bourse = new Bourse (30);
	bourse.use(p);
	assertEquals(30,p.getGold());
	}
	
	@Test 
	public void canBeStockTest (){
	Bourse bourse = new Bourse(50,false);
	assertEquals(false,bourse.canBeStocked());
	}
	
	@Test 
	public void setStockTest () {
	Bourse bourse = new Bourse(50,false);
	bourse.setStock(true);
	assertTrue(bourse.getStock());
	}
	
}
