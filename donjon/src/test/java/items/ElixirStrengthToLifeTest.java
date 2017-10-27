package items;

import static org.junit.Assert.*;

import org.junit.Test;

import characters.Player;

public class ElixirStrengthToLifeTest {

	@Test
	public void createElixirStrengthToLifeWithoutStock () {
	ElixirStrengthToLife elixir = new ElixirStrengthToLife(21);
	assertEquals(21,elixir.getPuissance());
	assertNotNull(elixir);
	}
	
	@Test 
	public void createElixirStrengthToLifeWithStock () {
	ElixirStrengthToLife elixir = new ElixirStrengthToLife(22,true);
	assertEquals(22,elixir.getPuissance());
	assertEquals(true,elixir.getStock());
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
	ElixirStrengthToLife elixir = new ElixirStrengthToLife(21);
	ElixirOfStrength elixir1 = new ElixirOfStrength(40);
	Player player = new Player("newPlayer");
	elixir1.use(player);
	elixir.use(player);
	assertEquals(20,player.getStrength());
	assertEquals(22,player.getLife());
	}
	
	@Test 
	public void CanBeStockedTest () {
	ElixirStrengthToLife elixir = new ElixirStrengthToLife(21,true);
	ElixirStrengthToLife elixir1 = new ElixirStrengthToLife(21,false);
	assertTrue(elixir.canBeStocked());
	assertFalse(elixir1.canBeStocked());
	}
	
	@Test 
	public void setStockTest () {
	ElixirStrengthToLife elixir = new ElixirStrengthToLife(22,false);
	elixir.setStock(true);
	assertTrue(elixir.canBeStocked());
	}

}
