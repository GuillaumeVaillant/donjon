package items;

import static org.junit.Assert.*;

import org.junit.Test;

import characters.Player;

public class ElixirOfStrengthTest {

	@Test
	public void CreateElixirOfStrengthWithoutStockTest () {
	ElixirOfStrength elixir = new ElixirOfStrength(21);
	assertEquals(21,elixir.getPuissance());
	assertNotNull(elixir);
	}
	
	@Test 
	public void CreateElixirOfStrengthWithStock () {
	ElixirOfStrength elixir = new ElixirOfStrength(22,true);
	assertEquals(22,elixir.getPuissance());
	assertEquals(true,elixir.getStock());
	assertNotNull(elixir);
	}
	
	@Test 
	public void getPuissanceTest () {
	ElixirOfStrength elixir = new ElixirOfStrength(50);
	assertEquals(50,elixir.getPuissance());
	}
	
	@Test 
	public void getStockTest () {
	ElixirOfStrength elixir = new ElixirOfStrength(42,true);
	assertEquals(true,elixir.getStock());
	}
	
	@Test 
	public void useTest () {
	Player player = new Player("newPlayer");
	ElixirOfStrength elixir = new ElixirOfStrength(22);
	elixir.use(player);
	assertEquals(23,player.getStrength());
	}
	
	@Test 
	public void CanBeStockedTest () {
	ElixirOfStrength elixir = new ElixirOfStrength(21,true);
	ElixirOfStrength elixir1 = new ElixirOfStrength(21,false);
	assertTrue(elixir.canBeStocked());
	assertFalse(elixir1.canBeStocked());
	}
	
	@Test 
	public void setStockTest () {
	ElixirOfStrength elixir = new ElixirOfStrength(22,false);
	elixir.setStock(true);
	assertTrue(elixir.canBeStocked());
	}

}
