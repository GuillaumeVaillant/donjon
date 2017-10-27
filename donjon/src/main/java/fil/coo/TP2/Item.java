package fil.coo.TP2;

public interface Item {
	public void use(Character character);
	public boolean canBeStocked();
	public void setStock(boolean bool);
}
