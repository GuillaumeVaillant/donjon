package items;

import static org.junit.Assert.*;

import org.junit.Test;

import characters.Player;

public class ElixirOfLifeTest {

	@Test
	public void CreateElixirOfLifeWithoutStockTest () {
	ElixirOfLife elixir = new ElixirOfLife(20);
	assertEquals(20,elixir.getPuissance());
	assertNotNull(elixir);
	}
	
	@Test 
	public void CreateElixirOfLifeWithStock () {
	ElixirOfLife elixir = new ElixirOfLife(20,true);
	assertEquals(true,elixir.getStock());
	assertEquals(20,elixir.getPuissance());
	assertNotNull(elixir);
	}
	
	@Test 
	public void getPuissanceTest () {
	ElixirOfLife elixir = new ElixirOfLife(50);
	assertEquals(50,elixir.getPuissance());
	}
	
	@Test 
	public void getStockTest () {
	ElixirOfLife elixir = new ElixirOfLife(42,true);
	assertEquals(true,elixir.getStock());
	}

	@Test 
	public void useTest () {
	Player player = new Player ("newPlayer");
	ElixirOfLife elixir = new ElixirOfLife(21);
	elixir.use(player);
	assertEquals(22,player.getLife());
	}
	
	@Test 
	public void CanBeStockedTest () {
	ElixirOfLife elixir = new ElixirOfLife(21,true);
	ElixirOfLife elixir1 = new ElixirOfLife(21,false);
	assertTrue(elixir.canBeStocked());
	assertFalse(elixir1.canBeStocked());
	}
	
	@Test 
	public void setStockTest () {
	ElixirOfLife elixir = new ElixirOfLife(22,false);
	elixir.setStock(true);
	assertTrue(elixir.canBeStocked());
	}
	
	
}
