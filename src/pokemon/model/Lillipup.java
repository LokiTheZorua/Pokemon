package pokemon.model;

public class Lillipup extends Pokemon implements Normal
{

	public Lillipup()
	{
		super(506, "Lillipup");
	}
	
	public Lillipup(String name)
	{
		super(506, name);
	}
	
	public Lillipup(int number, String name)
	{
		super(number, name);
	}
	
	public void fakeTears()
	{
		System.out.println("The opposing pokemon's attack failed");
	}
	public int tackle()
	{
		int tackleDamage = 30;
		
		return tackleDamage;
	}
	
	public String helpingHand()
	{
		return "there is no pokemon to use helping hand on";
	}
}
